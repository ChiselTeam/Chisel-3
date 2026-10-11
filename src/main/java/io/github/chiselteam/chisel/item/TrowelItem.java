package io.github.chiselteam.chisel.item;

import io.github.chiselteam.chisel.palette.Candidate;
import io.github.chiselteam.chisel.palette.PlayerPaletteManager;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.GlobalPos;
import net.minecraft.core.Holder;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.game.ClientboundSoundPacket;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.util.ParticleUtils;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.transfer.CombinedResourceHandler;
import net.neoforged.neoforge.transfer.RangedResourceHandler;
import net.neoforged.neoforge.transfer.ResourceHandler;
import net.neoforged.neoforge.transfer.item.ItemResource;
import net.neoforged.neoforge.transfer.item.PlayerInventoryWrapper;
import net.neoforged.neoforge.transfer.transaction.Transaction;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TrowelItem extends Item {
    public TrowelItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(@NonNull ItemStack itemStack, @NonNull TooltipContext context, @NonNull TooltipDisplay display, Consumer<Component> builder, @NonNull TooltipFlag tooltipFlag) {
        builder.accept(Component.translatable("chisel.trowel.desc"));
    }

    @Override
    public @NonNull InteractionResult onItemUseFirst(@NonNull ItemStack stack, UseOnContext context) {
        var player = context.getPlayer();
        if (player == null) return InteractionResult.PASS;
        if (player.isCrouching()) return onItemUseFirstWhileCrouching(stack, player, context);

        if (context.getLevel().isClientSide()) return InteractionResult.SUCCESS;
        var palette = PlayerPaletteManager.get(player).active();
        if (palette.isEmpty()) return placeFromHotbar(player, context);

        ResourceHandler<ItemResource> source = null;
        if (!player.getAbilities().instabuild) {
            var wrapper = PlayerInventoryWrapper.of(player);
            var inventory = new CombinedResourceHandler<>(wrapper.getMainSlots(), wrapper.getHandSlot(net.minecraft.world.InteractionHand.OFF_HAND));
            var connected = getConnectedInventory(stack, player, context.getLevel());
            source = connected == null ? inventory : new CombinedResourceHandler<>(inventory, connected);
        }
        var candidates = TrowelMaterials.candidates(palette.get().definition(), source);
        candidates.removeIf(candidate -> !candidate.material().getItem().isEnabled(context.getLevel().enabledFeatures()));
        if (candidates.isEmpty()) return fail(player, "chisel.trowel.no_materials");
        return placeCandidate(TrowelMaterials.choose(candidates, player.getRandom()), source, context);
    }

    private InteractionResult onItemUseFirstWhileCrouching(ItemStack stack, Player player, UseOnContext context) {
        var level = context.getLevel();
        var pos = context.getClickedPos();
        var entity = level.getBlockEntity(pos);
        var state = level.getBlockState(pos);
        var face = context.getClickedFace();

        if (entity == null) return InteractionResult.PASS;
        if (entity instanceof BaseContainerBlockEntity container && !container.canOpen(player)) return InteractionResult.FAIL;
        if (!level.mayInteract(player, pos)) return InteractionResult.FAIL;
        if (level.getCapability(Capabilities.Item.BLOCK, pos, state, entity, face) == null) return InteractionResult.PASS;

        if (!level.isClientSide()) {
            boolean sameBinding = pos.equals(getStoredInventory(stack)) && level.dimension().identifier().toString().equals(
                    stack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getStringOr("storedInventoryDimension", ""));
            if (sameBinding) resetTagData(stack);
            else saveInventory(stack, level, pos, face);
            player.sendOverlayMessage(Component.translatable(sameBinding ? "chisel.trowel.unbound" : "chisel.trowel.bound"));
        }
        if (level.isClientSide()) {
            ParticleUtils.spawnParticlesOnBlockFace(level, pos, ParticleTypes.HAPPY_VILLAGER, UniformInt.of(0, 10), face, () -> getRandomSpeedRanges(level.getRandom()), 0.55F);
            level.playLocalSound(player, SoundEvents.EXPERIENCE_ORB_PICKUP, SoundSource.BLOCKS, 1.0F, 1.0F);
        }
        return InteractionResult.SUCCESS;
    }

    // MARK: Palette Utilities

    private InteractionResult placeFromHotbar(Player player, UseOnContext context) {
        List<Candidate> candidates = new ArrayList<>();
        var source = RangedResourceHandler.of(PlayerInventoryWrapper.of(player), 0, 9);

        for (int c = 0; c < 9; c++) {
            var resource = source.getResource(c);
            if (resource.isEmpty() || !(resource.getItem() instanceof BlockItem)) continue;
            try (var transaction = Transaction.openRoot()) {
                if (player.getAbilities().instabuild || source.extract(c, resource, 1, transaction) == 1)
                    candidates.add(new Candidate(resource.toStack(1), 1, c));
            }
        }

        if (candidates.isEmpty()) return InteractionResult.FAIL;
        var candidate = TrowelMaterials.choose(candidates, player.getRandom());
        return placeCandidate(candidate, player.getAbilities().instabuild ? null : source, context);
    }

    private InteractionResult placeCandidate(Candidate candidate, @Nullable ResourceHandler<ItemResource> source, UseOnContext context) {
        var player = context.getPlayer();
        if (player == null) return InteractionResult.FAIL;
        var material = candidate.material().copyWithCount(1);

        try (var transaction = Transaction.openRoot()) {
            if (source != null && source.extract(candidate.sourceSlot(), ItemResource.of(material), 1, transaction) != 1)
                return fail(player, "chisel.trowel.no_materials");
            var hit = new BlockHitResult(context.getClickLocation(), context.getClickedFace(), context.getClickedPos(), context.isInside());
            var placement = new UseOnContext(context.getLevel(), player, context.getHand(), material, hit);
            var placeContext = new BlockPlaceContext(placement);
            if (!context.getLevel().mayInteract(player, placeContext.getClickedPos()) || !player.mayUseItemAt(placeContext.getClickedPos(), context.getClickedFace(), material)) return InteractionResult.FAIL;

            var result = material.useOn(placement);
            if (result.consumesAction() && (source == null || material.isEmpty())) transaction.commit();
            if (result.consumesAction() && player instanceof ServerPlayer serverPlayer) {
                var pos = placeContext.getClickedPos();
                var state = context.getLevel().getBlockState(pos);
                var sound = state.getSoundType(context.getLevel(), pos, player);
                serverPlayer.connection.send(new ClientboundSoundPacket(
                        Holder.direct(sound.getPlaceSound()), SoundSource.BLOCKS,
                        pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5,
                        (sound.getVolume() + 1.0F) / 2.0F, sound.getPitch() * 0.8F,
                        context.getLevel().getRandom().nextLong()));
            }
            return result;
        }
    }

    private static InteractionResult fail(Player player, String key) {
        player.sendOverlayMessage(Component.translatable(key));
        return InteractionResult.FAIL;
    }

    private @Nullable ResourceHandler<ItemResource> getConnectedInventory(ItemStack stack, Player player, Level level) {
        var tag = stack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag();
        var pos = getStoredInventory(stack);
        var dimension = Identifier.tryParse(tag.getStringOr("storedInventoryDimension", ""));
        var server = level.getServer();
        if (pos == null || dimension == null || server == null) return null;
        var sourceLevel = server.getLevel(ResourceKey.create(Registries.DIMENSION, dimension));
        if (sourceLevel == null || !sourceLevel.hasChunkAt(pos) || !sourceLevel.mayInteract(player, pos)) return null;
        var entity = sourceLevel.getBlockEntity(pos);
        if (entity instanceof BaseContainerBlockEntity container && !container.canOpen(player)) return null;
        return sourceLevel.getCapability(Capabilities.Item.BLOCK, pos, getClickedFace(stack));
    }

    // MARK: Data Utilities

    public static @Nullable GlobalPos getLinkedInventory(ItemStack stack) {
        var tag = stack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag();
        var pos = tag.getLong("storedInventory").map(BlockPos::of).orElse(null);
        var dimension = Identifier.tryParse(tag.getStringOr("storedInventoryDimension", ""));
        if (pos == null || dimension == null) return null;
        return GlobalPos.of(ResourceKey.create(Registries.DIMENSION, dimension), pos);
    }

    private void saveInventory(ItemStack stack, Level level, BlockPos pos, Direction clickedFace) {
        var tag = stack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag();
        tag.putString("storedInventoryDimension", level.dimension().identifier().toString());
        tag.putLong("storedInventory", pos.asLong());
        tag.putInt("clickedFace", clickedFace.get3DDataValue());
        stack.set(DataComponents.CUSTOM_DATA, CustomData.of(tag));
    }

    private void resetTagData(ItemStack stack) {
        var tag = stack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag();
        tag.remove("storedInventory");
        tag.remove("storedInventoryDimension");
        tag.remove("clickedFace");
        stack.set(DataComponents.CUSTOM_DATA, CustomData.of(tag));
    }

    private @Nullable BlockPos getStoredInventory(ItemStack stack) {
        return stack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getLong("storedInventory").map(BlockPos::of).orElse(null);
    }

    private @Nullable Direction getClickedFace(ItemStack stack) {
        int face = stack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getIntOr("clickedFace", -1);
        if (face < 0 || face > 5) return null;
        return Direction.from3DDataValue(face);
    }

    private static Vec3 getRandomSpeedRanges(RandomSource random) {
        return new Vec3(Mth.nextDouble(random, -0.5, 0.5), Mth.nextDouble(random, -0.5, 0.5), Mth.nextDouble(random, -0.5, 0.5));
    }
}

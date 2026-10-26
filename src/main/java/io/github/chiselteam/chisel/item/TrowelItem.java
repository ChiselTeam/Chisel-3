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
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
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
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.items.wrapper.CombinedInvWrapper;
import net.neoforged.neoforge.items.wrapper.InvWrapper;
import net.neoforged.neoforge.items.wrapper.RangedWrapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class TrowelItem extends Item {
    public TrowelItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(@NotNull ItemStack itemStack, @NotNull TooltipContext context, List<Component> builder, @NotNull TooltipFlag tooltipFlag) {
        builder.add(Component.translatable("chisel.trowel.desc"));
    }

    @Override
    public @NotNull InteractionResult onItemUseFirst(@NotNull ItemStack stack, UseOnContext context) {
        var player = context.getPlayer();
        if (player == null) return InteractionResult.PASS;
        if (player.isCrouching()) return onItemUseFirstWhileCrouching(stack, player, context);

        if (context.getLevel().isClientSide) return InteractionResult.SUCCESS;
        var palette = PlayerPaletteManager.get(player).active();
        if (palette.isEmpty()) return placeFromHotbar(player, context);

        IItemHandler source = null;
        if (!player.getAbilities().instabuild) {
            var wrapper = new InvWrapper(player.getInventory());
            var inventory = new CombinedInvWrapper(new RangedWrapper(wrapper, 0, 36), new RangedWrapper(wrapper, 40, 41));
            var connected = getConnectedInventory(stack, player, context.getLevel());
            source = connected == null ? inventory : new io.github.chiselteam.chisel.util.CombinedItemHandler(inventory, connected);
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
        if (level.getCapability(Capabilities.ItemHandler.BLOCK, pos, state, entity, face) == null) return InteractionResult.PASS;

        if (!level.isClientSide) {
            boolean sameBinding = pos.equals(getStoredInventory(stack)) && level.dimension().location().toString().equals(
                    stack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("storedInventoryDimension"));
            if (sameBinding) resetTagData(stack);
            else saveInventory(stack, level, pos, face);
            player.displayClientMessage(Component.translatable(sameBinding ? "chisel.trowel.unbound" : "chisel.trowel.bound"), true);
        }
        if (level.isClientSide) {
            ParticleUtils.spawnParticlesOnBlockFace(level, pos, ParticleTypes.HAPPY_VILLAGER, UniformInt.of(0, 10), face, () -> getRandomSpeedRanges(level.getRandom()), 0.55F);
            level.playLocalSound(player, SoundEvents.EXPERIENCE_ORB_PICKUP, SoundSource.BLOCKS, 1.0F, 1.0F);
        }
        return InteractionResult.SUCCESS;
    }

    // MARK: Palette Utilities

    private InteractionResult placeFromHotbar(Player player, UseOnContext context) {
        List<Candidate> candidates = new ArrayList<>();
        var source = new RangedWrapper(new InvWrapper(player.getInventory()), 0, 9);

        for (int c = 0; c < 9; c++) {
            var resource = source.getStackInSlot(c);
            if (resource.isEmpty() || !(resource.getItem() instanceof BlockItem)) continue;
            {
                if (player.getAbilities().instabuild || source.extractItem(c, 1, true).getCount() == 1)
                    candidates.add(new Candidate(resource.copyWithCount(1), 1, c));
            }
        }

        if (candidates.isEmpty()) return InteractionResult.FAIL;
        var candidate = TrowelMaterials.choose(candidates, player.getRandom());
        return placeCandidate(candidate, player.getAbilities().instabuild ? null : source, context);
    }

    private InteractionResult placeCandidate(Candidate candidate, @Nullable IItemHandler source, UseOnContext context) {
        var player = context.getPlayer();
        if (player == null) return InteractionResult.FAIL;
        var material = candidate.material().copyWithCount(1);

        {
            if (source != null && !ItemStack.isSameItemSameComponents(source.extractItem(candidate.sourceSlot(), 1, true), material))
                return fail(player, "chisel.trowel.no_materials");
            var hit = new BlockHitResult(context.getClickLocation(), context.getClickedFace(), context.getClickedPos(), context.isInside());
            var placement = new UseOnContext(context.getLevel(), player, context.getHand(), material, hit);
            var placeContext = new BlockPlaceContext(placement);
            if (!context.getLevel().mayInteract(player, placeContext.getClickedPos()) || !player.mayUseItemAt(placeContext.getClickedPos(), context.getClickedFace(), material)) return InteractionResult.FAIL;

            var result = material.useOn(placement);
            if (result.consumesAction() && source != null && material.isEmpty()) source.extractItem(candidate.sourceSlot(), 1, false);
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
        player.displayClientMessage(Component.translatable(key), true);
        return InteractionResult.FAIL;
    }

    private @Nullable IItemHandler getConnectedInventory(ItemStack stack, Player player, Level level) {
        var tag = stack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag();
        var pos = getStoredInventory(stack);
        var dimension = ResourceLocation.tryParse(tag.getString("storedInventoryDimension"));
        var server = level.getServer();
        if (pos == null || dimension == null || server == null) return null;
        var sourceLevel = server.getLevel(ResourceKey.create(Registries.DIMENSION, dimension));
        if (sourceLevel == null || !sourceLevel.hasChunkAt(pos) || !sourceLevel.mayInteract(player, pos)) return null;
        var entity = sourceLevel.getBlockEntity(pos);
        if (entity instanceof BaseContainerBlockEntity container && !container.canOpen(player)) return null;
        return sourceLevel.getCapability(Capabilities.ItemHandler.BLOCK, pos, getClickedFace(stack));
    }

    // MARK: Data Utilities

    public static @Nullable GlobalPos getLinkedInventory(ItemStack stack) {
        var tag = stack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag();
        BlockPos pos = tag.contains("storedInventory") ? BlockPos.of(tag.getLong("storedInventory")) : null;
        var dimension = ResourceLocation.tryParse(tag.getString("storedInventoryDimension"));
        if (pos == null || dimension == null) return null;
        return GlobalPos.of(ResourceKey.create(Registries.DIMENSION, dimension), pos);
    }

    private void saveInventory(ItemStack stack, Level level, BlockPos pos, Direction clickedFace) {
        var tag = stack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag();
        tag.putString("storedInventoryDimension", level.dimension().location().toString());
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
        var tag = stack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag();
        return tag.contains("storedInventory") ? BlockPos.of(tag.getLong("storedInventory")) : null;
    }

    private @Nullable Direction getClickedFace(ItemStack stack) {
        var tag = stack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag();
        int face = tag.contains("clickedFace") ? tag.getInt("clickedFace") : -1;
        if (face < 0 || face > 5) return null;
        return Direction.from3DDataValue(face);
    }

    private static Vec3 getRandomSpeedRanges(RandomSource random) {
        return new Vec3(Mth.nextDouble(random, -0.5, 0.5), Mth.nextDouble(random, -0.5, 0.5), Mth.nextDouble(random, -0.5, 0.5));
    }
}

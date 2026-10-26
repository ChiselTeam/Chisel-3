package io.github.chiselteam.chisel.item;

import io.github.chiselteam.chisel.menu.ChiselMenu;
import io.github.chiselteam.chisel.registry.ChiselItemAbilities;
import io.netty.buffer.Unpooled;
import net.minecraft.ChatFormatting;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtOps;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.common.ItemAbility;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ChiselItem extends Item {

    public ChiselItem(Properties properties) {
        super(properties);
    }

    public static void hurtAndBreak(ItemStack chisel, int amount, Player player, InteractionHand hand) {
        ItemStack contained = getContainedItem(chisel);
        if (player.level() instanceof ServerLevel serverLevel) {
            chisel.hurtAndBreak(amount, serverLevel, player, brokenItem -> {
                player.onEquippedItemBroken(brokenItem, (hand == InteractionHand.MAIN_HAND ? net.minecraft.world.entity.EquipmentSlot.MAINHAND : net.minecraft.world.entity.EquipmentSlot.OFFHAND));
                if (!contained.isEmpty()) {
                    player.drop(contained, false);
                }
            });
        }
    }

    public static int getAvailableUses(ItemStack chisel, Player player) {
        if (chisel.isEmpty() || !chisel.canPerformAction(ChiselItemAbilities.CHISEL)) return 0;
        if (player.hasInfiniteMaterials() || !chisel.isDamageableItem()) return Integer.MAX_VALUE;
        return Math.max(0, chisel.getMaxDamage() - chisel.getDamageValue());
    }

    private static ItemStack getContainedItem(ItemStack chisel) {
        CustomData customData = chisel.get(DataComponents.CUSTOM_DATA);
        if (customData == null) {
            return ItemStack.EMPTY;
        }
        CompoundTag tag = customData.copyTag();
        if (!tag.contains("chiselItem")) {
            return ItemStack.EMPTY;
        }
        return ItemStack.CODEC.parse(NbtOps.INSTANCE, tag.get("chiselItem"))
                .result()
                .orElse(ItemStack.EMPTY);
    }

    @Override
    public boolean canPerformAction(@NotNull ItemStack stack, @NotNull ItemAbility itemAbility) {
        if(itemAbility == ChiselItemAbilities.CHISEL) return true;
        return super.canPerformAction(stack, itemAbility);
    }

    @Override
    public @NotNull net.minecraft.world.InteractionResultHolder<net.minecraft.world.item.ItemStack> use(Level level, @NotNull Player player, @NotNull InteractionHand hand) {
        if (!level.isClientSide) {
            player.openMenu(new SimpleMenuProvider(
                    (id, inv, ignored) -> new ChiselMenu(id, inv, new FriendlyByteBuf(Unpooled.buffer().writeBoolean(hand == InteractionHand.MAIN_HAND))),
                    Component.translatable("container.chisel")
            ));
        }
        return net.minecraft.world.InteractionResultHolder.sidedSuccess(player.getItemInHand(hand), level.isClientSide);
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, @NotNull List<Component> builder, @NotNull TooltipFlag flag) {
        builder.add(Component.translatable("item.chisel.chisel.desc1").withStyle(ChatFormatting.GRAY));
        builder.add(Component.translatable("item.chisel.chisel.desc2").withStyle(ChatFormatting.GRAY));
        builder.add(Component.translatable("item.chisel.chisel.desc3").withStyle(ChatFormatting.GRAY));
    }
}

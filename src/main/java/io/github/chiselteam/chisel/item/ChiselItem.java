package io.github.chiselteam.chisel.item;

import io.github.chiselteam.chisel.inventory.menu.ChiselMenu;
import io.github.chiselteam.chisel.registry.ChiselItemAbilities;
import io.netty.buffer.Unpooled;
import net.minecraft.ChatFormatting;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemInstance;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.common.ItemAbility;
import org.jspecify.annotations.NonNull;

import java.util.function.Consumer;

public class ChiselItem extends Item {

    public ChiselItem(Properties properties) {
        super(properties);
    }

    @Override
    public boolean canPerformAction(@NonNull ItemInstance stack, @NonNull ItemAbility itemAbility) {
        if(itemAbility == ChiselItemAbilities.CHISEL) return true;
        return super.canPerformAction(stack, itemAbility);
    }

    @Override
    public @NonNull InteractionResult use(Level level, @NonNull Player player, @NonNull InteractionHand hand) {
        if (!level.isClientSide()) {
            player.openMenu(new SimpleMenuProvider(
                    (id, inv, _) -> new ChiselMenu(id, inv, new FriendlyByteBuf(Unpooled.buffer().writeBoolean(hand == InteractionHand.MAIN_HAND))),
                    Component.translatable("container.chisel")
            ));
        }
        return InteractionResult.SUCCESS;
    }

    @Override
    public void appendHoverText(@NonNull ItemStack stack, @NonNull TooltipContext context, @NonNull TooltipDisplay display, @NonNull Consumer<Component> builder, @NonNull TooltipFlag flag) {
        builder.accept(Component.translatable("item.chisel.chisel.desc1").withStyle(ChatFormatting.GRAY));
        builder.accept(Component.translatable("item.chisel.chisel.desc2").withStyle(ChatFormatting.GRAY));
        builder.accept(Component.translatable("item.chisel.chisel.desc3").withStyle(ChatFormatting.GRAY));
    }
}

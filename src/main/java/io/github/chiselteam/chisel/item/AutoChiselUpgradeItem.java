package io.github.chiselteam.chisel.item;

import io.github.chiselteam.chisel.block.entity.AutoChiselBlockEntity;
import io.github.chiselteam.chisel.integration.InventoryAccess;
import io.github.chiselteam.chisel.registry.ChiselItems;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import org.jspecify.annotations.NonNull;

public class AutoChiselUpgradeItem extends Item {
    public AutoChiselUpgradeItem(Properties properties) {
        super(properties);
    }

    @Override
    public @NonNull InteractionResult useOn(UseOnContext context) {
        var player = context.getPlayer();
        var level = context.getLevel();
        var pos = context.getClickedPos();
        if (player == null || !player.isShiftKeyDown()
                || !(level.getBlockEntity(pos) instanceof AutoChiselBlockEntity autoChisel)) return InteractionResult.PASS;
        if (!InventoryAccess.canAccess(player, level, pos)) return InteractionResult.FAIL;

        ItemStack held = context.getItemInHand();
        int slot;
        if (held.is(ChiselItems.UPGRADE_STACK)) slot = AutoChiselBlockEntity.STACK_UPGRADE_SLOT;
        else if (held.is(ChiselItems.UPGRADE_AUTOMATION)) slot = AutoChiselBlockEntity.AUTOMATION_UPGRADE_SLOT;
        else if (held.is(ChiselItems.UPGRADE_REVERSION)) slot = AutoChiselBlockEntity.REVERSION_UPGRADE_SLOT;
        else if (held.is(ChiselItems.UPGRADE_SPEED)) slot = AutoChiselBlockEntity.SPEED_UPGRADE_SLOT;
        else return InteractionResult.PASS;

        ItemStack installed = autoChisel.getItem(slot);
        if (!installed.isEmpty() && !ItemStack.isSameItemSameComponents(installed, held)) return InteractionResult.FAIL;
        if (installed.getCount() >= autoChisel.getSlotLimit(slot, held)) return InteractionResult.FAIL;
        if (!level.isClientSide()) {
            autoChisel.setItem(slot, held.copyWithCount(installed.getCount() + 1));
            if (!player.isCreative()) held.shrink(1);
        }
        return InteractionResult.SUCCESS;
    }
}

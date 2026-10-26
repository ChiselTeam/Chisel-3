package io.github.chiselteam.chisel.client.entity.state;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
public class AutoChiselBlockEntityRenderState {
    public Level level;
    public ItemStack block = ItemStack.EMPTY;
    public ItemStack chisel = ItemStack.EMPTY;
    public ItemStack[] upgrades = {ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY};
}

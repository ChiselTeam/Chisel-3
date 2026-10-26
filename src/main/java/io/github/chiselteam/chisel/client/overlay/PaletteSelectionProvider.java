package io.github.chiselteam.chisel.client.overlay;

import io.github.chiselteam.chisel.network.SelectPalettePacket;
import io.github.chiselteam.chisel.palette.PlayerPaletteManager;
import io.github.chiselteam.chisel.registry.ChiselItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.network.PacketDistributor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public final class PaletteSelectionProvider implements SelectionProvider<PaletteSelectionProvider.Choice> {
    public record Choice(Optional<UUID> id, SelectionOverlayEntry entry) {
    }

    @Override
    public boolean supports(ItemStack stack) {
        return stack.is(ChiselItems.TROWEL.get());
    }

    @Override
    public List<Choice> choices(Player player) {
        var choices = new ArrayList<Choice>();
        choices.add(new Choice(Optional.empty(), new SelectionOverlayEntry(Component.translatable("chisel.palette.hotbar"), new ItemStack(ChiselItems.TROWEL.get()))));
        for (var palette : PlayerPaletteManager.get(player).palettes()) {
            var definition = palette.definition();
            var icon = BuiltInRegistries.ITEM.getOptional(definition.icon()).map(ItemStack::new).orElse(ItemStack.EMPTY);
            choices.add(new Choice(Optional.of(palette.id()), new SelectionOverlayEntry(Component.literal(definition.name()), icon)));
        }
        return List.copyOf(choices);
    }

    @Override
    public SelectionOverlayEntry entry(Choice choice) {
        return choice.entry();
    }

    @Override
    public int selectedIndex(Player player, ItemStack stack, List<Choice> choices) {
        var active = PlayerPaletteManager.get(player).activeId();
        for (int i = 0; i < choices.size(); i++) {
            if (choices.get(i).id().equals(active)) return i;
        }
        return 0;
    }

    @Override
    public boolean isValid(Player player, ItemStack stack, List<Choice> choices) {
        if (!supports(stack)) return false;
        var ids = PlayerPaletteManager.get(player).palettes().stream().map(p -> Optional.of(p.id())).toList();
        return choices.subList(1, choices.size()).stream().map(Choice::id).toList().equals(ids);
    }

    @Override
    public void commit(Player player, InteractionHand hand, Choice choice) {
        PacketDistributor.sendToServer(new SelectPalettePacket(choice.id()));
    }
}

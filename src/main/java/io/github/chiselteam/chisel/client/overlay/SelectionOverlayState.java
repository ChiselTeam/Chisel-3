package io.github.chiselteam.chisel.client.overlay;

import java.util.List;

public record SelectionOverlayState(List<SelectionOverlayEntry> entries, int selectedIndex, float animationProgress, int animationDirection) {
    public SelectionOverlayState {
        entries = List.copyOf(entries);
    }
}

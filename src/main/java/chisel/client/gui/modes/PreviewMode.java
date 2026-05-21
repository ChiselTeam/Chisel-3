package chisel.client.gui.modes;

import net.minecraft.network.chat.Component;

public interface PreviewMode {
    float scale();
    float centerX();
    float centerY();
    int[][] positions();

    default Component getDescription() {
        String name = getClass().getSimpleName().replace("Preview", "").toLowerCase();
        return Component.translatable("chisel.preview." + name);
    }
}

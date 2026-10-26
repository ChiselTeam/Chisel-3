package io.github.chiselteam.chisel.client.gui.palette;

final class PalettePreviewCamera {
    static final float DEFAULT_PITCH = 0.45F;
    static final float DEFAULT_YAW = -0.45F;

    private PalettePreviewCamera() {
    }

    static float fitScale(int width, int height, int depth, float pitch, float yaw, int viewportWidth, int viewportHeight) {
        float sinYaw = Math.abs((float) Math.sin(yaw));
        float cosYaw = Math.abs((float) Math.cos(yaw));
        float sinPitch = Math.abs((float) Math.sin(pitch));
        float cosPitch = Math.abs((float) Math.cos(pitch));
        float projectedWidth = cosYaw * width + sinYaw * depth;
        float projectedHeight = sinPitch * sinYaw * width + cosPitch * height + sinPitch * cosYaw * depth;
        return Math.min(viewportWidth / (projectedWidth + 1), viewportHeight / (projectedHeight + 1));
    }
}

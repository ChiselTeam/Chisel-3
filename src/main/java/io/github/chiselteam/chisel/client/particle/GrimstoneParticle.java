package io.github.chiselteam.chisel.client.particle;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.particle.TextureSheetParticle;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.core.particles.SimpleParticleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class GrimstoneParticle extends TextureSheetParticle {

    private static final float FADE_TIME = 20.0F;

    public GrimstoneParticle(ClientLevel level, double x, double y, double z, TextureAtlasSprite sprite) {
        super(level, x, y, z);
        setSprite(sprite);
        setLifetime(Math.max((int) (Math.random() * 10.0D) + 80, 1));
    }

    @Override
    public float getQuadSize(float partialTick) {
        return 0.75F * (float) Math.sin((age + partialTick) / 180.0f);
    }

    @Override
    public void tick() {
        super.tick();
        if (age < FADE_TIME) {
            alpha = age / FADE_TIME;
        } else if (age + FADE_TIME >= lifetime) {
            alpha = (lifetime - age) / FADE_TIME;
        } else {
            alpha = 1.0f;
        }
    }

    @Override
    public @NotNull net.minecraft.client.particle.ParticleRenderType getRenderType() {
        return net.minecraft.client.particle.ParticleRenderType.PARTICLE_SHEET_TRANSLUCENT;
    }

    public static class Provider implements ParticleProvider<SimpleParticleType> {

        private final SpriteSet sprite;

        public Provider(SpriteSet sprite) {
            this.sprite = sprite;
        }

        @Override
        public @Nullable Particle createParticle(@NotNull SimpleParticleType type, @NotNull ClientLevel level, double x, double y, double z, double xVel, double yVel, double zVel) {
            return new GrimstoneParticle(level, x, y, z, sprite.get(level.random));
        }
    }
}

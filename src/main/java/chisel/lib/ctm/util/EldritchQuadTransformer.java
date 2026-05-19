package chisel.lib.ctm.util;

import net.minecraft.client.model.geom.builders.UVPair;
import net.minecraft.client.resources.model.geometry.BakedQuad;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.Mth;
import org.joml.Vector3f;
import org.joml.Vector3fc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Subdivides each {@link BakedQuad} into a 2x2 grid (4 sub-quads) and perturbs the
 * <em>interior</em> UV coordinates using a Gaussian random offset. The PRNG is seeded
 * deterministically from the world block position and quad facing, so the visual
 * effect is stable for a given block at a given location.
 *
 * <p>This is a port of the legacy chisel {@code TextureEldritch} effect from the
 * pre-flattening rendering pipeline, adapted to the current
 * {@code BakedQuad}/{@code Vector3fc}/packed-UV record-based API.
 *
 * <p>Only UVs strictly inside the original quad's bounding rectangle are nudged; UVs
 * that lie on a min/max edge are left alone, which keeps the seams between adjacent
 * blocks visually continuous.
 */
public final class EldritchQuadTransformer {

    /** Standard deviation of the Gaussian UV offset, expressed as a fraction of the sprite's UV range. */
    private static final float OFFSET_STDDEV = 0.08f;

    /** Floating-point tolerance used to detect "interior" UVs (in normalized sprite-UV space, ~1/16 of a 16-pixel sprite). */
    private static final float EDGE_EPSILON = 1.0e-4f;

    private EldritchQuadTransformer() {}

    /**
     * Transforms a list of quads, returning a new list whose contents are 4x subdivided
     * versions of the input with their interior UVs perturbed.
     *
     * @param quads  the input quads (not modified)
     * @param pos    world position used for deterministic seeding (may be {@link BlockPos#ZERO} in item contexts)
     * @return a new list containing up to {@code 4 * quads.size()} new quads
     */
    public static List<BakedQuad> transform(List<BakedQuad> quads, BlockPos pos) {
        if (quads.isEmpty()) {
            return quads;
        }
        List<BakedQuad> out = new ArrayList<>(quads.size() * 4);
        Random rand = new Random();
        for (BakedQuad quad : quads) {
            transformOne(quad, pos, rand, out);
        }
        return out;
    }

    private static void transformOne(BakedQuad quad, BlockPos pos, Random rand, List<BakedQuad> out) {
        Direction facing = quad.direction();
        rand.setSeed(Mth.getSeed(pos) + facing.ordinal());

        // Per-quad Gaussian offset, applied to all interior UVs of this quad's subdivisions.
        float offU = (float) rand.nextGaussian() * OFFSET_STDDEV;
        float offV = (float) rand.nextGaussian() * OFFSET_STDDEV;

        // Unpack the four corners (positions + UVs).
        Vector3fc p0 = quad.position0(), p1 = quad.position1(), p2 = quad.position2(), p3 = quad.position3();
        long uv0 = quad.packedUV0(), uv1 = quad.packedUV1(), uv2 = quad.packedUV2(), uv3 = quad.packedUV3();

        float u0 = UVPair.unpackU(uv0), v0 = UVPair.unpackV(uv0);
        float u1 = UVPair.unpackU(uv1), v1 = UVPair.unpackV(uv1);
        float u2 = UVPair.unpackU(uv2), v2 = UVPair.unpackV(uv2);
        float u3 = UVPair.unpackU(uv3), v3 = UVPair.unpackV(uv3);

        float minU = Math.min(Math.min(u0, u1), Math.min(u2, u3));
        float maxU = Math.max(Math.max(u0, u1), Math.max(u2, u3));
        float minV = Math.min(Math.min(v0, v1), Math.min(v2, v3));
        float maxV = Math.max(Math.max(v0, v1), Math.max(v2, v3));

        // Midpoint positions (for spatial subdivision).
        Vector3f m01 = midpoint(p0, p1);
        Vector3f m12 = midpoint(p1, p2);
        Vector3f m23 = midpoint(p2, p3);
        Vector3f m30 = midpoint(p3, p0);
        Vector3f center = midpoint4(p0, p1, p2, p3);

        // Midpoint UVs (interpolated from corner UVs, then optionally perturbed if interior).
        float um01 = (u0 + u1) * 0.5f, vm01 = (v0 + v1) * 0.5f;
        float um12 = (u1 + u2) * 0.5f, vm12 = (v1 + v2) * 0.5f;
        float um23 = (u2 + u3) * 0.5f, vm23 = (v2 + v3) * 0.5f;
        float um30 = (u3 + u0) * 0.5f, vm30 = (v3 + v0) * 0.5f;
        float umc = (u0 + u1 + u2 + u3) * 0.25f, vmc = (v0 + v1 + v2 + v3) * 0.25f;

        // Perturb only the interior UVs.
        float[] mu01 = perturbIfInterior(um01, vm01, minU, maxU, minV, maxV, offU, offV);
        float[] mu12 = perturbIfInterior(um12, vm12, minU, maxU, minV, maxV, offU, offV);
        float[] mu23 = perturbIfInterior(um23, vm23, minU, maxU, minV, maxV, offU, offV);
        float[] mu30 = perturbIfInterior(um30, vm30, minU, maxU, minV, maxV, offU, offV);
        float[] muc  = perturbIfInterior(umc,  vmc,  minU, maxU, minV, maxV, offU, offV);

        long pUv01 = UVPair.pack(mu01[0], mu01[1]);
        long pUv12 = UVPair.pack(mu12[0], mu12[1]);
        long pUv23 = UVPair.pack(mu23[0], mu23[1]);
        long pUv30 = UVPair.pack(mu30[0], mu30[1]);
        long pUvC  = UVPair.pack(muc[0],  muc[1]);

        // Emit the 4 sub-quads, each (corner, edge-mid, center, edge-mid) — same winding as the parent.
        out.add(rebuild(quad, p0, m01, center, m30, uv0, pUv01, pUvC, pUv30));
        out.add(rebuild(quad, m01, p1, m12, center, pUv01, uv1, pUv12, pUvC));
        out.add(rebuild(quad, center, m12, p2, m23, pUvC, pUv12, uv2, pUv23));
        out.add(rebuild(quad, m30, center, m23, p3, pUv30, pUvC, pUv23, uv3));
    }

    private static float[] perturbIfInterior(float u, float v, float minU, float maxU, float minV, float maxV, float offU, float offV) {
        boolean onEdgeU = approxEquals(u, minU) || approxEquals(u, maxU);
        boolean onEdgeV = approxEquals(v, minV) || approxEquals(v, maxV);
        if (onEdgeU || onEdgeV) {
            return new float[] { u, v };
        }
        float du = maxU - minU;
        float dv = maxV - minV;
        // Convert offset (normalized to the UV range) into raw sprite UV space.
        float newU = clamp(u + offU * du, minU, maxU);
        float newV = clamp(v + offV * dv, minV, maxV);
        return new float[] { newU, newV };
    }

    private static boolean approxEquals(float a, float b) {
        return Math.abs(a - b) <= EDGE_EPSILON;
    }

    private static float clamp(float x, float lo, float hi) {
        return x < lo ? lo : (x > hi ? hi : x);
    }

    private static Vector3f midpoint(Vector3fc a, Vector3fc b) {
        return new Vector3f((a.x() + b.x()) * 0.5f, (a.y() + b.y()) * 0.5f, (a.z() + b.z()) * 0.5f);
    }

    private static Vector3f midpoint4(Vector3fc a, Vector3fc b, Vector3fc c, Vector3fc d) {
        return new Vector3f(
                (a.x() + b.x() + c.x() + d.x()) * 0.25f,
                (a.y() + b.y() + c.y() + d.y()) * 0.25f,
                (a.z() + b.z() + c.z() + d.z()) * 0.25f
        );
    }

    private static BakedQuad rebuild(BakedQuad source, Vector3fc p0, Vector3fc p1, Vector3fc p2, Vector3fc p3,
                                     long uv0, long uv1, long uv2, long uv3) {
        return new BakedQuad(p0, p1, p2, p3, uv0, uv1, uv2, uv3, source.direction(), source.materialInfo(),
                source.bakedNormals(), source.bakedColors());
    }
}

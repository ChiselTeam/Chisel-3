package io.github.chiselteam.chisel.datagen.guide;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.state.BlockState;

import java.util.LinkedHashMap;
import java.util.Map;

final class GettingStartedExamples {
    private GettingStartedExamples() {
    }

    static void shellComparison(HandbookGuideBuilder.StructureBuilder output) {
        var scene = new Scene();
        shell(scene, -5, 4, false, false, false);
        shell(scene, 5, 8, false, false, false);
        scene.write(output);
    }

    static void workshop(HandbookGuideBuilder.StructureBuilder output, boolean finished, boolean roof) {
        var scene = new Scene();
        shell(scene, 0, 8, finished, roof, finished);
        scene.write(output);
    }

    private static void shell(Scene scene, int ox, int back, boolean materials, boolean roof, boolean detail) {
        var wall = materials ? Blocks.OAK_PLANKS : Blocks.STONE_BRICKS;
        var base = Blocks.STONE_BRICKS;
        scene.fill(ox - 3, 0, 0, ox + 3, 0, back, base);
        for (int y = 1; y <= 3; y++) {
            for (int z = 0; z <= back; z++) {
                for (int x = -3; x <= 3; x++) {
                    if (Math.abs(x) != 3 && z != 0 && z != back) continue;
                    if (x == 0 && z == 0 && y <= 2) continue;
                    boolean window = y == 2 && ((z == 0 && Math.abs(x) == 2)
                            || (Math.abs(x) == 3 && z == 3));
                    if (!window) scene.block(ox + x, y, z, wall);
                    else if (materials) scene.block(ox + x, y, z, Blocks.GLASS);
                }
            }
        }
        if (roof) {
            for (int x = -4; x <= 4; x++) {
                int roofY = 4 + Math.max(0, 3 - Math.abs(x));
                scene.fill(ox + x, roofY, -1, ox + x, roofY, back + 1,
                        materials ? Blocks.SPRUCE_PLANKS : Blocks.DEEPSLATE_BRICKS);
                if (Math.abs(x) < 3) {
                    for (int y = 4; y < roofY; y++) {
                        scene.block(ox + x, y, 0, wall);
                        scene.block(ox + x, y, back, wall);
                    }
                }
            }
        }
        if (detail) {
            scene.fill(ox - 1, 1, -1, ox - 1, 2, -1, Blocks.SPRUCE_PLANKS);
            scene.fill(ox + 1, 1, -1, ox + 1, 2, -1, Blocks.SPRUCE_PLANKS);
            scene.fill(ox - 1, 3, -1, ox + 1, 3, -1, Blocks.SPRUCE_PLANKS);
            scene.block(ox - 2, 0, -1, Blocks.STONE_BRICKS);
            scene.block(ox - 2, 1, -1, Blocks.LANTERN);
            scene.block(ox - 2, 1, back - 2, Blocks.CRAFTING_TABLE);
            scene.block(ox + 2, 1, back - 2, Blocks.BARREL);
            scene.block(ox + 3, 1, 5, Blocks.STRIPPED_OAK_LOG);
            scene.block(ox + 3, 1, 6, Blocks.STRIPPED_OAK_LOG);
        }
    }

    static void paletteComparison(HandbookGuideBuilder.StructureBuilder output) {
        var scene = new Scene();
        window(scene, -4, 0, false);
        window(scene, 4, 0, true);
        scene.write(output);
    }

    static void depthComparison(HandbookGuideBuilder.StructureBuilder output) {
        var scene = new Scene();
        window(scene, -6, 0, false);
        window(scene, 0, 1, false);
        window(scene, 6, 2, false);
        scene.write(output);
    }

    static void window(HandbookGuideBuilder.StructureBuilder output, int ox, int depth, boolean modern) {
        var scene = new Scene();
        window(scene, ox, depth, modern);
        scene.write(output);
    }

    private static void window(Scene scene, int ox, int depth, boolean modern) {
        var main = modern ? Blocks.SMOOTH_QUARTZ : Blocks.OAK_PLANKS;
        var support = modern ? Blocks.POLISHED_DEEPSLATE : Blocks.STONE_BRICKS;
        var accent = modern ? Blocks.CYAN_CONCRETE : Blocks.SPRUCE_PLANKS;
        scene.fill(ox - 2, 0, 1, ox + 2, 4, 1, main);
        scene.fill(ox - 2, 0, 1, ox + 2, 0, 1, support);
        scene.fill(ox - 2, 4, 1, ox + 2, 4, 1, accent);
        for (int y = 2; y <= 3; y++) {
            scene.remove(ox, y, 1);
            scene.block(ox, y, depth == 0 ? 1 : 2, Blocks.GLASS);
        }
        if (depth == 2) {
            scene.fill(ox - 1, 1, 0, ox - 1, 4, 0, accent);
            scene.fill(ox + 1, 1, 0, ox + 1, 4, 0, accent);
            scene.block(ox, 1, 0, accent);
            scene.block(ox, 4, 0, accent);
        }
    }

    static void textureComparison(HandbookGuideBuilder.StructureBuilder output) {
        var scene = new Scene();
        texture(scene, -6, 0);
        texture(scene, 0, 1);
        texture(scene, 6, 2);
        scene.write(output);
    }

    static void texturePatch(HandbookGuideBuilder.StructureBuilder output) {
        var scene = new Scene();
        texture(scene, 0, 2);
        scene.write(output);
    }

    private static void texture(Scene scene, int ox, int mode) {
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++) {
                boolean patch = mode == 1 ? ((y * 5 + x) * 7) % 25 < 6 : mode == 2 && x < 2 && y < 3;
                scene.block(ox + x - 2, y, 0, patch ? Blocks.COBBLESTONE : Blocks.STONE_BRICKS);
            }
        }
    }

    static void gradient(HandbookGuideBuilder.StructureBuilder output) {
        var scene = new Scene();
        Block[] rows = {Blocks.DEEPSLATE, Blocks.POLISHED_DEEPSLATE, Blocks.STONE, Blocks.ANDESITE, Blocks.SMOOTH_STONE};
        for (int y = 0; y < rows.length; y++) scene.fill(-2, y, 0, 2, y, 0, rows[y]);
        scene.write(output);
    }

    static void detailComparison(HandbookGuideBuilder.StructureBuilder output) {
        var scene = new Scene();
        entry(scene, -4, true, true);
        entry(scene, 4, true, false);
        scene.write(output);
    }

    static void entry(HandbookGuideBuilder.StructureBuilder output, int ox, boolean fixture, boolean clutter) {
        var scene = new Scene();
        entry(scene, ox, fixture, clutter);
        scene.write(output);
    }

    private static void entry(Scene scene, int ox, boolean fixture, boolean clutter) {
        scene.fill(ox - 2, 0, 0, ox + 2, 0, 2, Blocks.STONE_BRICKS);
        scene.fill(ox - 2, 1, 2, ox + 2, 4, 2, Blocks.OAK_PLANKS);
        scene.remove(ox, 1, 2);
        scene.remove(ox, 2, 2);
        scene.fill(ox - 1, 1, 1, ox - 1, 2, 1, Blocks.SPRUCE_PLANKS);
        scene.fill(ox + 1, 1, 1, ox + 1, 2, 1, Blocks.SPRUCE_PLANKS);
        scene.fill(ox - 1, 3, 1, ox + 1, 3, 1, Blocks.SPRUCE_PLANKS);
        if (fixture) scene.block(ox - 2, 1, 1, Blocks.LANTERN);
        if (clutter) {
            scene.block(ox, 1, 0, Blocks.BARREL);
            scene.block(ox + 2, 1, 1, Blocks.LANTERN);
            scene.fill(ox - 2, 4, 1, ox + 2, 4, 1, Blocks.GOLD_BLOCK);
        }
    }

    private static final class Scene {
        private final Map<BlockPos, BlockState> cells = new LinkedHashMap<>();

        void block(int x, int y, int z, Block block) {
            cells.put(new BlockPos(x, y, z), block.defaultBlockState());
        }

        void remove(int x, int y, int z) {
            cells.remove(new BlockPos(x, y, z));
        }

        void fill(int x1, int y1, int z1, int x2, int y2, int z2, Block block) {
            for (int x = x1; x <= x2; x++)
                for (int y = y1; y <= y2; y++)
                    for (int z = z1; z <= z2; z++) block(x, y, z, block);
        }

        void write(HandbookGuideBuilder.StructureBuilder output) {
            cells.forEach((pos, state) -> output.block(pos.getX(), pos.getY(), -pos.getZ(), state.mirror(Mirror.LEFT_RIGHT)));
        }
    }
}

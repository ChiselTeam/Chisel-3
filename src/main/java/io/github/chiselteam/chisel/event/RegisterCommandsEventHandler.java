package io.github.chiselteam.chisel.event;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.content.ChiselFamilies;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.loading.FMLEnvironment;
import net.neoforged.neoforge.event.RegisterCommandsEvent;

import java.util.ArrayList;
import java.util.List;

@EventBusSubscriber(modid = Chisel.MODID)
public class RegisterCommandsEventHandler {

    @SubscribeEvent
    public static void registerCommands(RegisterCommandsEvent event) {
        if (FMLEnvironment.isProduction()) {
            return;
        }

        event.getDispatcher().register(
                Commands.literal("chisel")
                        .requires(CommandSourceStack::isPlayer)
                        .executes(command -> {
                            List<Block> blocks = new ArrayList<>();
                            ChiselFamilies.getFamilies().forEach(family -> family.getFamily().getVariants()
                                    .forEach(variant -> blocks.add(variant.getBlock())));
                            return placeVariants(command.getSource(), blocks);
                        })
        );

        event.getDispatcher().register(
                Commands.literal("newFamily")
                        .requires(CommandSourceStack::isPlayer)
                        .executes(command -> {
                            List<Block> blocks = new ArrayList<>();
                            ChiselFamilies.AE2_CERTUS.getFamily().getVariants().forEach(variant -> blocks.add(variant.getBlock()));
                            ChiselFamilies.AE2_SKY_STONE.getFamily().getVariants().forEach(variant -> blocks.add(variant.getBlock()));
                            return placeVariants(command.getSource(), blocks);
                        })
        );
    }

    private static int placeVariants(CommandSourceStack source, List<Block> blocks) throws CommandSyntaxException {
        var level = source.getLevel();
        var player = source.getPlayerOrException();
        var pos = player.blockPosition();
        int blocksPerRow = (int) Math.ceil(Math.sqrt(blocks.size()));
        int x = 0, z = 0;

        for (var block : blocks) {
            var state = block.defaultBlockState();
            int baseX = pos.getX() + (x * 4);
            int baseZ = pos.getZ() + (z * 4);
            int baseY = pos.getY();

            for (int ox = 0; ox < 3; ox++) {
                for (int oy = 0; oy < 3; oy++) {
                    for (int oz = 0; oz < 3; oz++) {
                        level.setBlock(new BlockPos(baseX + ox, baseY + oy, baseZ + oz), state, Block.UPDATE_ALL);
                    }
                }
            }

            x++;
            if (x >= blocksPerRow) {
                x = 0;
                z++;
            }
        }

        source.sendSuccess(() -> Component.literal(String.format("Placed %s different variants", blocks.size())), true);
        return 1;
    }
}

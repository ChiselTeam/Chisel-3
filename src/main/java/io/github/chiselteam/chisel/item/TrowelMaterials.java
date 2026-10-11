package io.github.chiselteam.chisel.item;

import io.github.chiselteam.chisel.palette.Candidate;
import io.github.chiselteam.chisel.palette.PaletteDefinition;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.transfer.ResourceHandler;
import net.neoforged.neoforge.transfer.item.ItemResource;
import net.neoforged.neoforge.transfer.transaction.Transaction;
import org.jspecify.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class TrowelMaterials {
    static List<Candidate> candidates(PaletteDefinition palette, @Nullable ResourceHandler<ItemResource> source) {
        var candidates = new ArrayList<Candidate>();
        for (var entry : palette.entries()) {
            if (!entry.enabled()) continue;
            var block = BuiltInRegistries.BLOCK.getOptional(entry.block());
            if (block.isEmpty() || !(block.get().asItem() instanceof BlockItem item) || item.getBlock() != block.get()) continue;
            if (source == null) {
                candidates.add(new Candidate(new ItemStack(item), entry.weight(), -1));
                continue;
            }
            for (int slot = 0; slot < source.size(); slot++) {
                var resource = source.getResource(slot);
                if (resource.isEmpty() || resource.getItem() != item) continue;
                try (var transaction = Transaction.openRoot()) {
                    if (source.extract(slot, resource, 1, transaction) == 1) {
                        candidates.add(new Candidate(resource.toStack(1), entry.weight(), slot));
                        break;
                    }
                }
            }
        }
        return candidates;
    }

    static Candidate choose(List<Candidate> candidates, RandomSource random) {
        int totalWeight = candidates.stream().mapToInt(Candidate::weight).sum();
        int roll = random.nextInt(totalWeight);
        for (var candidate : candidates) {
            roll -= candidate.weight();
            if (roll < 0) return candidate;
        }
        throw new IllegalStateException("Invalid candidate weight");
    }
}

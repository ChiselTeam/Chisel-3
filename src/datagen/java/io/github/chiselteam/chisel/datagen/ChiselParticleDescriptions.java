package io.github.chiselteam.chisel.datagen;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import io.github.chiselteam.chisel.Chisel;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;

import java.util.concurrent.CompletableFuture;

public class ChiselParticleDescriptions implements DataProvider {
    private final PackOutput.PathProvider paths;
    public ChiselParticleDescriptions(PackOutput output) { paths=output.createPathProvider(PackOutput.Target.RESOURCE_PACK,"particles"); }
    @Override public CompletableFuture<?> run(CachedOutput cache) {
        return CompletableFuture.allOf(save(cache,"holystone"), save(cache,"grimstone"));
    }
    private CompletableFuture<?> save(CachedOutput cache,String name) {
        var json=new JsonObject();var textures=new JsonArray();textures.add("chisel:"+name+"_star");json.add("textures",textures);
        return DataProvider.saveStable(cache,json,paths.json(Chisel.prefix(name)));
    }
    @Override public String getName() { return "Chisel particles"; }
}

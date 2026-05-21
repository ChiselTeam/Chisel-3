package chisel.util;

import chisel.Chisel;
import com.google.common.collect.ImmutableList;
import com.google.gson.JsonObject;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.LanguageProvider;
import org.jspecify.annotations.NonNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public abstract class LangHelper extends LanguageProvider {
    private final PackOutput output;
    protected boolean generateUpsideDown = true;
    public final Map<String, String> upsideDown = new HashMap<>();

    public LangHelper(PackOutput output, String locale) {
        super(output, Chisel.MODID, locale);
        this.output = output;
    }

    @Override
    public void add(@NonNull String key, @NonNull String value) {
        super.add(key, value);
        List<LangFormatSplitter.Component> splitEnglish = LangFormatSplitter.split(value);
        if(generateUpsideDown) upsideDown.put(key, LangConversionHelper.convertComponents(splitEnglish));
    }

    public void addBlock(Supplier<? extends Block> key, String family, String desc) {
        addBlock(key, family);
        add("%s.desc".formatted(key.get().getDescriptionId()), desc);
    }

    protected void addContainer(String containerName, String name) {
        add("container.%s".formatted(containerName), name);
    }

    protected void addPreviewMode(String mode, String name) {
        add("chisel.preview.%s".formatted(mode), name);
    }

    protected void addChiselMode(String mode, String name) {
        add("chisel.mode.%s".formatted(mode), name);
    }

    @Override
    public @NonNull CompletableFuture<?> run(@NonNull CachedOutput cache) {
        CompletableFuture<?> languageGen = super.run(cache);
        ImmutableList.Builder<CompletableFuture<?>> builder = ImmutableList.builder();
        builder.add(languageGen);

        if(generateUpsideDown) {
            JsonObject udJson = new JsonObject();
            upsideDown.forEach(udJson::addProperty);
            builder.add(DataProvider.saveStable(cache, udJson, output.getOutputFolder(PackOutput.Target.RESOURCE_PACK).resolve(Chisel.MODID).resolve("lang").resolve("en_ud.json")));
        }

        return CompletableFuture.allOf(builder.build().toArray(CompletableFuture[]::new));
    }
}

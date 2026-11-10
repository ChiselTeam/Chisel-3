package io.github.chiselteam.chisel.content.compat;

import io.github.chiselteam.chisel.content.ChiselFamily;
import io.github.chiselteam.chisel.content.compat.allthemods.AtmAncientStoneFamily;
import io.github.chiselteam.chisel.content.compat.appliedenergistics.Ae2CertusFamily;
import io.github.chiselteam.chisel.content.compat.appliedenergistics.Ae2FluixFamily;
import io.github.chiselteam.chisel.content.compat.appliedenergistics.Ae2SkyStoneFamily;
import io.github.chiselteam.chisel.content.compat.dyenamics.DnConcreteFamily;
import io.github.chiselteam.chisel.content.compat.dyenamics.DnStainedGlassFamily;
import io.github.chiselteam.chisel.content.compat.dyenamics.DnOakFramedStainedGlassFamily;
import io.github.chiselteam.chisel.content.compat.dyenamics.DnSteelFramedStainedGlassFamily;
import io.github.chiselteam.chisel.content.compat.neovitae.NvRuneFamily;
import io.github.chiselteam.chisel.content.compat.thaumcraft.TCArcaneStoneFamily;
import io.github.chiselteam.chisel.content.compat.thaumcraft.TCTallowFamily;
import io.github.chiselteam.chisel.content.compat.thaumcraft.TCThaumiumFamily;
import io.github.chiselteam.chisel.content.family.stone.RoseQuartzFamily;

import java.util.List;

public class CompatFamilies {

    private static final List<CompatModule> MODULES = List.of(
            // new CompatModule("aether_ii", List.of()),
            new CompatModule("allthemodium", List.of(AtmAncientStoneFamily.FAMILY)),
            new CompatModule("ae2", List.of(Ae2CertusFamily.FAMILY, Ae2FluixFamily.FAMILY, Ae2SkyStoneFamily.FAMILY)),
            new CompatModule("create", List.of(RoseQuartzFamily.FAMILY)),
            new CompatModule("dyenamics", List.of(DnConcreteFamily.FAMILY, DnStainedGlassFamily.FAMILY, DnOakFramedStainedGlassFamily.FAMILY, DnSteelFramedStainedGlassFamily.FAMILY)),
            new CompatModule("forbidden_arcanus", List.of(TCArcaneStoneFamily.FAMILY)),
            new CompatModule("thaumcraft", List.of(TCArcaneStoneFamily.FAMILY, TCThaumiumFamily.FAMILY, TCTallowFamily.FAMILY)),
            // new CompatModule("mysticalagriculture", List.of()),
            new CompatModule("neovitae", List.of(NvRuneFamily.FAMILY)),
            new CompatModule("occultism", List.of(TCTallowFamily.FAMILY))
    );

    private CompatFamilies() {
    }

    public static List<ChiselFamily> families() {
        return MODULES.stream()
                .flatMap(module -> module.families().stream())
                .distinct()
                .toList();
    }

    public static List<ChiselFamily> visibleFamilies() {
        return MODULES.stream()
                .filter(CompatModule::isEnabled)
                .flatMap(module -> module.families().stream())
                .distinct()
                .toList();
    }

    public static List<ChiselFamily> hiddenFamilies() {
        var visible = visibleFamilies();
        return families().stream().filter(family -> !visible.contains(family)).toList();
    }

    public static List<CompatModule> modules() {
        return MODULES;
    }
}

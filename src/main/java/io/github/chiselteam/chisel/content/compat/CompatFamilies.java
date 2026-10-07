package io.github.chiselteam.chisel.content.compat;

import io.github.chiselteam.chisel.content.ChiselFamily;
import io.github.chiselteam.chisel.content.compat.allthemods.AtmAncientStoneFamily;
import io.github.chiselteam.chisel.content.compat.appliedenergistics.Ae2CertusFamily;
import io.github.chiselteam.chisel.content.compat.appliedenergistics.Ae2SkyStoneFamily;
import io.github.chiselteam.chisel.content.compat.forbiddenarcanus.FaArcaneDarkstoneFamily;
import io.github.chiselteam.chisel.content.compat.neovitae.NvRuneFamily;
import io.github.chiselteam.chisel.content.compat.occultism.OcTallowFamily;

import java.util.List;

public class CompatFamilies {

    private static final List<CompatModule> MODULES = List.of(
            new CompatModule("aether_ii", List.of()),
            new CompatModule("allthemodium", List.of(AtmAncientStoneFamily.FAMILY)),
            new CompatModule("ae2", List.of(Ae2CertusFamily.FAMILY, Ae2SkyStoneFamily.FAMILY)),
            new CompatModule("forbidden_arcanus", List.of(FaArcaneDarkstoneFamily.FAMILY)),
            new CompatModule("mysticalagriculture", List.of()),
            new CompatModule("neovitae", List.of(NvRuneFamily.FAMILY)),
            new CompatModule("occultism", List.of(OcTallowFamily.FAMILY))
    );

    private CompatFamilies() {
    }

    public static List<ChiselFamily> families() {
        return MODULES.stream()
                .filter(CompatModule::isEnabled)
                .flatMap(module -> module.families().stream())
                .toList();
    }

    public static List<CompatModule> modules() {
        return MODULES;
    }
}

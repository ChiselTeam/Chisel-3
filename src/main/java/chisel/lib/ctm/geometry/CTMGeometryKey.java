package chisel.lib.ctm.geometry;

sealed interface CTMGeometryKey permits ARCTMKey, DirectionalCTMKey, MultiblockCTMKey, StandardCTMKey {
}
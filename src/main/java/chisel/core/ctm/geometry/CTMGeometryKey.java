package chisel.core.ctm.geometry;

sealed interface CTMGeometryKey permits ARCTMKey, DirectionalCTMKey, MultiblockCTMKey, StandardCTMKey {
}
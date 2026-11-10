# Changelog

All notable changes to this project will be documented in this file.

## [26.2.0.1]

### Added

- Initial release for Minecraft 26.2 and NeoForge 26.2.0.93.
- Linked AE2 terminal storage for the Trowel, using the compatible AE2 26.2 API and refunding reserved materials when placement fails.
- Player build, item-use, world-interaction, and locked-container permission checks for block-changing tools, projectiles, Builder's Guide edits, connected-texture offsets, and Auto Chisel access.
- Sneak-right-click installation of Auto Chisel upgrades and selection highlighting in Chisel screens.
- Custom ghost skin, armor, armor trim, and enchanted glint rendering for supported player appearances, adapted to the 26.2 rendering pipeline.
- Builder's Handbook crafting recipe and chisel tag, AE2 Fluix and new metal variants, and Create-gated rose quartz recipes.

### Changed

- Requires CTMLib 26.2.0.3 or newer for connected-block offsets.
- Connected-texture offsets apply to a connected block group instead of an entire chunk, with a bounded traversal and a translated limit message.
- Auto Chisel automation respects per-slot limits and accepts a chisel from the top when its chisel slot is empty.
- Updated JEI and Jade for 26.2 and migrated block previews and tool overlays to the feature rendering system.
- Refreshed quartz, sandstone, red sandstone, wood, gilded blackstone, ore, metal, concrete, brick, waterstone, lavastone, magma, and jack-o'-lantern textures and variants, with regenerated resources.
- FTB Chunks integration is not included because compatible 26.2 dependencies are unavailable. If an unsupported FTB Chunks installation is present, protected editing and linked-inventory actions fail closed rather than bypassing claims.

### Fixed

- Preserve ghost glint shader imports and apply the ghost appearance to all three supported players.
- Prevent linked-storage material loss or duplication when Trowel placement fails.
- Cancel client-side mining of chiselable blocks while allowing normal mining of unrelated blocks.
- Correct stained-glass circle and crying-obsidian textures and remove the unintended dirt tag.

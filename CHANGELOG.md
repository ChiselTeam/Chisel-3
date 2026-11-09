# Changelog

All notable changes to this project will be documented in this file.

## [Unreleased]

### Added

- Claim checks for block-changing tools, projectiles, connected-texture offsets, Builder's Guide edits, and Auto Chisel access, including optional FTB Chunks integration.
- Linked AE2 terminal storage for the Trowel, with permission checks and safe material refunds when placement fails.
- Sneak-right-click installation of Auto Chisel upgrades and selection highlighting in Chisel screens.
- Custom ghost skin, armor, armor trim, and enchanted glint rendering for supported player appearances, adapted to the 1.21.1 renderer.

### Changed

- Requires CTMLib 1.21.1.2 or newer for connected-block offsets.
- Connected-texture offsets now apply to a connected block group rather than an entire chunk, with a bounded traversal and translated limit message.
- Auto Chisel automation respects per-slot limits and accepts a chisel from the top when its chisel slot is empty.
- Carried forward the refreshed block-family variants, textures, compatibility families, and Builder's Handbook content from the 26.1.2 line. Pale Oak and other unavailable vanilla materials remain excluded.

### Fixed

- Preserve ghost glint shader imports on the 1.21.1 GLSL pipeline.
- Prevent linked-storage material loss or duplication on failed Trowel placement.

## [1.21.1.1]

- Backported to Minecraft 1.21.1, NeoForge 21.1, and Java 21.
- Adapted connected textures, GUI previews, rendering, recipes, handbook synchronization, and inventory automation to the 1.21.1 APIs.
- Updated CTM, JEI, and Jade dependencies and regenerated resources for 1.21.1.
- Omitted resin, pale oak planks, and pale oak bookshelf variants, whose vanilla materials are unavailable in this version.
- Added regression coverage for sided automation, inventory persistence, and server data loading.

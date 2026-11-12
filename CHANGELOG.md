# Changelog

All notable changes to this project will be documented in this file.

## [26.3.0.2]

### Fixed

- Fixed Builder's Guide previews not updating when dimensions or shape change, including for newly connected players.
- Preserved Builder's Guide dye colors when saving and reloading worlds.

## [26.3.0.1]

- Updated to Minecraft 26.3 and NeoForge 26.3.0.99 using the [26.3 migration primer](https://docs.neoforged.net/primer/docs/26.3/).
- Updated CTM to 26.3.0.2, JEI to 31.17.0.93, and Jade to 26.3.5.
- Migrated key bindings, rendering, weathering interactions, synced configuration, and moss movement mixins to the 26.3 APIs.
- Migrated world generation, recipes, and loot tables to registry bootstraps and regenerated resources.
- Isolated data generation from development instance mods.
- Ported the latest Chisel block-edit protection checks, including connected offsets, projectiles, weathering, Builder's Guide, Trowel placement, and Auto Chisel access.
- Added optional AE2 terminal-backed Trowel storage with safe item refunds when placement fails, using AE2 26.3.1-alpha.
- Added connected-region CTM offsets with server synchronization and a clear connected-block limit message.
- Improved Auto Chisel upgrades, selection feedback, and inventory access checks, including both halves of double chests.
- Added translucent ghost player and equipment rendering, corrected ghost shader imports, and fixed ghost selection for all three supported contributors.
- Preserved client-side chisel click cancellation so creative blocks do not disappear locally and survival clicks do not start mining.
- Adapted ghost skin, armor, trim, and enchanted glint to the 26.3 render pipeline while preserving ordered translucent layers with improved transparency enabled.
- Updated the VIP item attachment position for the current player renderer.
- FTB Chunks integration is not included because no compatible 26.3 dependencies are published; protected actions fail closed if FTB Chunks is nevertheless installed.
- Included the Minecraft version and full changelog in release uploads.

# Automatic migration of other Chisel worlds

Replace the source Chisel implementation with this mod and open the world normally.
Missing blocks from Chisel Modern 1.4.1 and Chisel Reborn 2.0.1 are automatically
resolved to their mapped equivalents.
No command, source profile selection, or separate conversion step is needed.

NeoForge block and item registry aliases are installed during mod registration.
An alias applies only when its source ID is missing: if the original mod still
registers a block, that registration wins. Registry aliases also cover item stacks
inside other mods' inventories that use Minecraft's registry codecs.

Minecraft's loading pipeline runs a separate Chisel DataFixerUpper chain after
vanilla fixes. It handles block palettes, scheduled ticks, player inventories and
ender chests, entity inventories and held blocks, nested item components, saved
structure templates, and world-generation settings. Compatible block properties
are retained and obsolete properties are removed.

Chisel's DFU version is independent of Minecraft's `DataVersion`. A chunk loading
hook covers the case where Minecraft skips vanilla fixes because the chunk already
has the current data version. Migrated chunks are marked for saving, and cached
lighting and heightmaps are invalidated. Normal saves persist the canonical Chisel
IDs. Other chunks and dimensions migrate when they are loaded; the game does not
scan or rewrite the entire world at startup.

If a foreign entity/container schema is unknown to vanilla DFU, its payload is left
intact and registry aliases resolve mapped block/item IDs during normal decoding.
The migration does not rewrite IDs embedded in arbitrary text, commands, or datapacks.

## Mapping coverage

The catalogs in `src/generated/resources/data/chisel/migration/` enumerate all
blockstate assets in the reference jars. Each entry has a confirmed target or
`null` if no equivalent has been established. Missing IDs without a target are
reported in the log; they remain unsupported and cannot be recovered by an alias.
Machine internals and source-specific tool components need their own migrations.

Both source Chisel implementations use the `chisel` mod ID, so they must be replaced
rather than installed alongside this implementation. Keep unrelated required mods.

To regenerate the mapping catalogs during development:

```sh
./gradlew generateLegacyMappings
```

Reference jars default to `run/mods`; use `-PlegacyModsDir=/path/to/reference/jars`
for another directory. Those jars are inspected as archives, never loaded by the
generator. It uses explicit naming changes and unique decoded texture matches on
all six faces of cube models. Source SHA-256 hashes, targets, and allowed block
properties are recorded. Add reviewed naming rules to `LegacyMigrationGenerator`
and regenerate when adding counterparts for currently unsupported blocks.

## Migration coverage

| Source | Registered blocks | Supported | Unsupported |
| --- | ---: | ---: | ---: |
| Chisel Modern 1.4.1 | 2,880 | 2,315 | 565 |
| Chisel Reborn 2.0.1 | 1,293 | 1,121 | 172 |
| Total | 4,173 | 3,436 | 737 |

The [complete unsupported-block list](../unsupported-blocks.csv)
includes every ID, source version, display name, family, and failure reason.
The unsupported entries lack a configured mapping; this does not establish that
their counterpart is absent from this mod. The auto-chisel's existing ID resolves
directly, but its machine internals need a separate migration.

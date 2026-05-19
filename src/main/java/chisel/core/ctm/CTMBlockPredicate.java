package chisel.core.ctm;

import net.minecraft.world.level.block.state.BlockState;

/// Decides whether a neighboring block should be considered "connected" for CTM rendering.
///
/// Implementations are typically constructed by the consuming mod (e.g., matching
/// a specific `Block`) and passed into baked / unbaked CTM models. Keeping
/// this behind an interface lets the `chisel.lib.ctm` package stay free of
/// any consumer-specific block / variant concepts.
@FunctionalInterface
public interface CTMBlockPredicate {

    /** Matches nothing; useful as a safe default. */
    CTMBlockPredicate NEVER = state -> false;

    boolean matches(BlockState state);
}

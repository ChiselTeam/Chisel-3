package io.github.chiselteam.chisel.api.family.registration;

import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.ApiStatus;

/**
 * A read-only handle for a queued addon family registration.
 */
@ApiStatus.Experimental
public record ChiselFamilyRegistration(ResourceLocation familyId) {
}

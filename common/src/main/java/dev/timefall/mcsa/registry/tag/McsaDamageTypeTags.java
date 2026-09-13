package dev.timefall.mcsa.registry.tag;

import dev.timefall.mcsa.ModConstants;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

public interface McsaDamageTypeTags {
    TagKey<DamageType> ADAMANTINE_GUARD_RESISTANT_TO = of("adamantine_guard_resistant_to");

    private static TagKey<DamageType> of(String id) {
        return TagKey.of(RegistryKeys.DAMAGE_TYPE, ModConstants.ID(id));
    }
}

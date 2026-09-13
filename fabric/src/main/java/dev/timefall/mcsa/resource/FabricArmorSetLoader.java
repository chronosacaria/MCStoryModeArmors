package dev.timefall.mcsa.resource;

import dev.timefall.mcsa.ModConstants;
import net.fabricmc.fabric.api.resource.IdentifiableResourceReloadListener;
import net.minecraft.util.Identifier;

public final class FabricArmorSetLoader extends ArmorSetLoader implements IdentifiableResourceReloadListener {

    @Override
    public Identifier getFabricId() {
        return ModConstants.ID("armor_sets");
    }
}

package dev.timefall.mcsa;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(ModConstants.MOD_ID)
public class McsaNeoForge {

    public McsaNeoForge(IEventBus eventBus) {

        // This method is invoked by the NeoForge mod loader when it is ready
        // to load your mod. You can access NeoForge and Common code in this
        // project.

        // Use NeoForge to bootstrap the Common mod.
        ModConstants.LOGGER.info("Hello NeoForge world!");
        McsaCommon.initialize();

    }
}
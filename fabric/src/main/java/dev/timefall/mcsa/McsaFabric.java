package dev.timefall.mcsa;

import net.fabricmc.api.ModInitializer;

public class McsaFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {

        ModConstants.LOGGER.info("Hello Fabric world!");
        McsaCommon.initialize();
    }
}

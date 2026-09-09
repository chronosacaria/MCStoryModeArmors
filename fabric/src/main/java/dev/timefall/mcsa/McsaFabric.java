package dev.timefall.mcsa;

import net.fabricmc.api.ModInitializer;

public class McsaFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        McsaCommon.initialize();
    }
}

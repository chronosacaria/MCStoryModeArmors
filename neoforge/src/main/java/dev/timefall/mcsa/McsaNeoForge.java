package dev.timefall.mcsa;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(ModConstants.MOD_ID)
public class McsaNeoForge {

    public McsaNeoForge(IEventBus eventBus) {
        McsaCommon.initialize();

    }
}
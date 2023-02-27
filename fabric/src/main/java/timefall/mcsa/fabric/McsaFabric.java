package timefall.mcsa.fabric;

import net.fabricmc.api.ModInitializer;
import timefall.mcsa.Mcsa;
import timefall.mcsa.fabric.init.TradeRegistry;

public class McsaFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Mcsa.init();
        TradeRegistry.registerVillagerOffers();
    }
}

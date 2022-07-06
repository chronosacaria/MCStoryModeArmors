package timefall.mcsa.fabric;

import timefall.mcsa.Mcsa;
import net.fabricmc.api.ModInitializer;
import timefall.mcsa.fabric.init.ItemsInit;

public class McsaFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Mcsa.init();
        ItemsInit.registerBlockItems();
    }
}

package dev.timefall.mcsa;

import dev.timefall.mcsa.resource.ArmorSetLoader;
import dev.timefall.mcsa.resource.FabricArmorSetLoader;
import dev.timefall.mcsa.tests.ArmorSetJsonTest;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.minecraft.resource.ResourceType;

public class McsaFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {

        McsaCommon.initialize();

        ResourceManagerHelper.get(ResourceType.SERVER_DATA).registerReloadListener(new FabricArmorSetLoader());

        ServerLifecycleEvents.SERVER_STOPPED.register(server -> ArmorSetLoader.clear());

        // TESTS
        if (ConfigApiJava.platform().isDev()) {
            ServerLifecycleEvents.SERVER_STARTED.register(server ->
                    ArmorSetJsonTest.run(server.getResourceManager())
            );
        }
    }
}

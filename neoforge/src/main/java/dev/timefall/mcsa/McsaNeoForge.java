package dev.timefall.mcsa;

import dev.timefall.mcsa.resource.ArmorSetLoader;
import dev.timefall.mcsa.tests.ArmorSetJsonTest;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.AddReloadListenerEvent;
import net.neoforged.neoforge.event.server.ServerStartedEvent;
import net.neoforged.neoforge.event.server.ServerStoppedEvent;

@Mod(ModConstants.MOD_ID)
public class McsaNeoForge {

    public McsaNeoForge(IEventBus eventBus) {
        McsaCommon.initialize();

        NeoForge.EVENT_BUS.addListener((AddReloadListenerEvent event) -> event.addListener(new ArmorSetLoader()));
        NeoForge.EVENT_BUS.addListener((ServerStoppedEvent event) -> ArmorSetLoader.clear());

        // TESTS
        if (ConfigApiJava.platform().isDev()) {
            NeoForge.EVENT_BUS.addListener((ServerStartedEvent event) ->
                    ArmorSetJsonTest.run(event.getServer().getResourceManager())
            );
        }
    }
}
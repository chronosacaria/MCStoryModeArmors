package timefall.mcsa.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import timefall.mcsa.Mcsa;
import timefall.mcsa.forge.inits.ItemsInit;

@Mod(Mcsa.MOD_ID)
public class McsaForge {
    public McsaForge() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(Mcsa.MOD_ID, eventBus);

        Mcsa.init();
        ItemsInit.register(eventBus);
    }
}

package timefall.mcsa.forge.loot;

import net.minecraft.util.Identifier;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import timefall.mcsa.Mcsa;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = Mcsa.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>> event) {
        event.getRegistry().registerAll(
                new ArmorerChestLootModifier.Serializer().setRegistryName(
                        new Identifier(Mcsa.MOD_ID, "armor_in_armorer_chest")
                )
        );
    }
}

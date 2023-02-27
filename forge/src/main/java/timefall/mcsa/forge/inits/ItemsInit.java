package timefall.mcsa.forge.inits;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraftforge.eventbus.api.IEventBus;
import timefall.mcsa.Mcsa;
import timefall.mcsa.forge.items.blockitems.CarvedWhitePumpkinBlockItem;
import timefall.mcsa.init.BlocksInit;

@SuppressWarnings("unused")
public class ItemsInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Mcsa.MOD_ID, RegistryKeys.ITEM);

    public static final RegistrySupplier<CarvedWhitePumpkinBlockItem> CARVED_WHITE_PUMPKIN = ITEMS.register("carved_white_pumpkin",
            () -> new CarvedWhitePumpkinBlockItem(BlocksInit.CARVED_WHITE_PUMPKIN_BLOCK.get(),
                    new Item.Settings()));

    public static void register (IEventBus eventBus) {
        ITEMS.register();
    }
}

package timefall.mcsa.forge.init;

import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import timefall.mcsa.Mcsa;
import timefall.mcsa.forge.items.blockitems.CarvedWhitePumpkinBlockItem;
import timefall.mcsa.init.BlocksInit;

@SuppressWarnings("unused")
public class ItemsInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mcsa.MOD_ID);

    public static final RegistryObject<CarvedWhitePumpkinBlockItem> CARVED_WHITE_PUMPKIN = ITEMS.register("carved_white_pumpkin",
            () -> new CarvedWhitePumpkinBlockItem(BlocksInit.CARVED_WHITE_PUMPKIN_BLOCK.get(),
                    new Item.Settings().group(Mcsa.MCSA_TAB)));

    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

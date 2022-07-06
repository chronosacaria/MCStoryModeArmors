package timefall.mcsa.forge.init;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import timefall.mcsa.Mcsa;
import timefall.mcsa.forge.items.blockitems.CarvedWhitePumpkinBlockItem;
import timefall.mcsa.forge.items.blockitems.WhitePumpkinBlockItem;
import timefall.mcsa.init.BlocksInit;

public class ItemsInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mcsa.MOD_ID);

    public static final RegistryObject<BlockItem> WHITE_PUMPKIN = ITEMS.register("white_pumpkin",
            () -> new WhitePumpkinBlockItem(BlocksInit.WHITE_PUMPKIN_BLOCK.get(),
                    new Item.Settings().group(Mcsa.EXAMPLE_TAB)));
    public static final RegistryObject<BlockItem> CARVED_WHITE_PUMPKIN = ITEMS.register("carved_white_pumpkin",
            () -> new CarvedWhitePumpkinBlockItem(BlocksInit.CARVED_WHITE_PUMPKIN_BLOCK.get(),
                    new Item.Settings().group(Mcsa.EXAMPLE_TAB)));

    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

package timefall.mcsa.init;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import timefall.mcsa.Mcsa;

@SuppressWarnings({"UnstableApiUsage", "unused"})
public class BlockItemsInit {
    public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(Mcsa.MOD_ID, RegistryKeys.ITEM);

    public static final RegistrySupplier<BlockItem> WHITE_PUMPKIN_BLOCK =  BLOCK_ITEMS.register("white_pumpkin",
            () -> new BlockItem(BlocksInit.WHITE_PUMPKIN_BLOCK.get(), new Item.Settings().arch$tab(Mcsa.MCSA_TAB)));
    public static final RegistrySupplier<BlockItem> CARVED_WHITE_PUMPKIN_BLOCK = BLOCK_ITEMS.register("carved_white_pumpkin",
            () -> new BlockItem(BlocksInit.CARVED_WHITE_PUMPKIN_BLOCK.get(), new Item.Settings().arch$tab(Mcsa.MCSA_TAB)));

}

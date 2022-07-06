package timefall.mcsa.fabric.init;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import timefall.mcsa.Mcsa;
import timefall.mcsa.init.BlocksInit;

public class ItemsInit {
    public static void registerBlockItems() {
        Registry.register(Registry.ITEM, new Identifier(Mcsa.MOD_ID, "white_pumpkin"),
                new BlockItem(BlocksInit.WHITE_PUMPKIN_BLOCK.get(), new Item.Settings().group(Mcsa.EXAMPLE_TAB)));
        Registry.register(Registry.ITEM, new Identifier(Mcsa.MOD_ID, "carved_white_pumpkin"),
                new BlockItem(BlocksInit.CARVED_WHITE_PUMPKIN_BLOCK.get(), new Item.Settings().group(Mcsa.EXAMPLE_TAB)));
    }
}

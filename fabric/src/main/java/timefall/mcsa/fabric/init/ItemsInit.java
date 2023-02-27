package timefall.mcsa.fabric.init;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import timefall.mcsa.Mcsa;
import timefall.mcsa.init.BlocksInit;

public class ItemsInit {
    public static void registerBlockItems() {
        Registry.register(Registries.ITEM, new Identifier(Mcsa.MOD_ID, "white_pumpkin"),
                new BlockItem(BlocksInit.WHITE_PUMPKIN_BLOCK.get(), new Item.Settings()));
        ItemGroupEvents.modifyEntriesEvent(Mcsa.MCSA_TAB.get()).register(entries -> entries.add(BlocksInit.WHITE_PUMPKIN_BLOCK.get()));
        Registry.register(Registries.ITEM, new Identifier(Mcsa.MOD_ID, "carved_white_pumpkin"),
                new BlockItem(BlocksInit.CARVED_WHITE_PUMPKIN_BLOCK.get(), new Item.Settings()));
        ItemGroupEvents.modifyEntriesEvent(Mcsa.MCSA_TAB.get()).register(entries -> entries.add(BlocksInit.CARVED_WHITE_PUMPKIN_BLOCK.get()));
    }
}

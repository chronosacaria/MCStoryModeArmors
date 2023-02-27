package timefall.mcsa;

import dev.architectury.registry.CreativeTabRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import timefall.mcsa.init.ArmorsInit;
import timefall.mcsa.init.BlockItemsInit;
import timefall.mcsa.init.BlocksInit;
import timefall.mcsa.init.LootInit;

public class Mcsa {
    public static final String MOD_ID = "mcsa";

    // Registering a new creative tab
    public static final Identifier ITEM_GROUP_IDENTIFIER = new Identifier(MOD_ID, "group");
    public static final ItemGroup MCSA_TAB = CreativeTabRegistry.create(ITEM_GROUP_IDENTIFIER, () ->
            new ItemStack(BlocksInit.CARVED_WHITE_PUMPKIN_BLOCK.get()));

    public static void init() {
        System.out.println(McsaExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
        BlocksInit.BLOCKS.register();
        BlockItemsInit.BLOCK_ITEMS.register();
        ArmorsInit.ARMOR.register();
        LootInit.init();
    }

    public static Identifier idOf(String regName) {
        return new Identifier(MOD_ID, regName);
    }
}

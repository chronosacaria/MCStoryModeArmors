package timefall.mcsa;

import com.google.common.base.Suppliers;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.Registries;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import timefall.mcsa.init.ArmorsInit;
import timefall.mcsa.init.BlocksInit;
import timefall.mcsa.init.LootInit;

import java.util.function.Supplier;

public class Mcsa {
    public static final String MOD_ID = "mcsa";
    // We can use this if we don't want to use DeferredRegister
    public static final Supplier<Registries> REGISTRIES = Suppliers.memoize(() -> Registries.get(MOD_ID));

    public static final Registrar<Item> ITEM_REGISTRAR = REGISTRIES.get().get(Registry.ITEM_KEY);

    // Registering a new creative tab
    public static final Identifier ITEM_GROUP_IDENTIFIER = new Identifier(MOD_ID, "group");
    public static final ItemGroup EXAMPLE_TAB = CreativeTabRegistry.create(ITEM_GROUP_IDENTIFIER, () ->
            new ItemStack(BlocksInit.CARVED_WHITE_PUMPKIN_BLOCK.get()));

    public static void init() {
        System.out.println(McsaExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
        BlocksInit.BLOCKS.register();
        ArmorsInit.ARMOR.register();
        LootInit.init();
    }

    public static Identifier idOf(String regName) {
        return new Identifier(MOD_ID, regName);
    }
}

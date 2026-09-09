package dev.timefall.mcsa.registry;

import dev.timefall.mcsa.ModConstants;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import me.fzzyhmstrs.fzzy_config.util.platform.Registrar;
import me.fzzyhmstrs.fzzy_config.util.platform.RegistrySupplier;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;

public class ItemRegistry {
    private static final Registrar<Item> ITEM = ConfigApiJava.platform().createRegistrar(ModConstants.MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> ADAMANTIUM_IMPERVIUM_HELMET      = registerArmorItem("adamantium_impervium_helmet",     ArmorMaterialsRegistry.ADAMANTIUM_IMPERVIUM, ArmorItem.Type.HELMET,       40);
    public static final RegistrySupplier<Item> ADAMANTIUM_IMPERVIUM_CHESTPLATE  = registerArmorItem("adamantium_impervium_chestplate", ArmorMaterialsRegistry.ADAMANTIUM_IMPERVIUM, ArmorItem.Type.CHESTPLATE,   40);
    public static final RegistrySupplier<Item> ADAMANTIUM_IMPERVIUM_LEGGINGS    = registerArmorItem("adamantium_impervium_leggings",   ArmorMaterialsRegistry.ADAMANTIUM_IMPERVIUM, ArmorItem.Type.LEGGINGS,     40);
    public static final RegistrySupplier<Item> ADAMANTIUM_IMPERVIUM_BOOTS       = registerArmorItem("adamantium_impervium_boots",      ArmorMaterialsRegistry.ADAMANTIUM_IMPERVIUM, ArmorItem.Type.BOOTS,        40);

    public static final RegistrySupplier<Item> CHAMPION_PETRA_HELMET            = registerArmorItem("champion_petra_helmet",          ArmorMaterialsRegistry.CHAMPION_PETRA,       ArmorItem.Type.HELMET,       37);
    public static final RegistrySupplier<Item> CHAMPION_PETRA_CHESTPLATE        = registerArmorItem("champion_petra_chestplate",      ArmorMaterialsRegistry.CHAMPION_PETRA,       ArmorItem.Type.CHESTPLATE,   37);
    public static final RegistrySupplier<Item> CHAMPION_PETRA_LEGGINGS          = registerArmorItem("champion_petra_leggings",        ArmorMaterialsRegistry.CHAMPION_PETRA,       ArmorItem.Type.LEGGINGS,     37);
    public static final RegistrySupplier<Item> CHAMPION_PETRA_BOOTS             = registerArmorItem("champion_petra_boots",           ArmorMaterialsRegistry.CHAMPION_PETRA,       ArmorItem.Type.BOOTS,        37);

    protected static RegistrySupplier<Item> registerArmorItem(String id, RegistryEntry<ArmorMaterial> armorMaterial, ArmorItem.Type type, int durabilityMultiplier) {
        return ITEM.register(id, () -> new ArmorItem(armorMaterial, type, new Item.Settings().maxDamage(type.getMaxDamage(durabilityMultiplier))));
    }

    public static void register() {
        ITEM.init();
    }
}

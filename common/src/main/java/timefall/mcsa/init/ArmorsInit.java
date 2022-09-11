package timefall.mcsa.init;

import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import timefall.mcsa.Mcsa;
import timefall.mcsa.collections.ArmorCollection;
import timefall.mcsa.collections.ArmorCollectionHelmetOnly;
import timefall.mcsa.items.armor.ArmorSetItem;
import timefall.mcsa.items.armor.ArmorSets;

import java.util.EnumSet;

public class ArmorsInit {
    public static final DeferredRegister<Item> ARMOR = DeferredRegister.create(Mcsa.MOD_ID, Registry.ITEM_KEY);

    public static final ArmorCollection<ArmorSetItem> ADAMANTIUM_ARMOR =
            ArmorCollection.registerArmorCollection(ArmorSets.ADAMANTIUM, EnumSet.allOf(EquipmentSlot.class));
    public static final ArmorCollection<ArmorSetItem> CHAMPION_PETRA_ARMOR =
            ArmorCollection.registerArmorCollection(ArmorSets.CHAMPION_PETRA, EnumSet.allOf(EquipmentSlot.class));
    public static final ArmorCollection<ArmorSetItem> DRAGONSBANE =
            ArmorCollection.registerArmorCollection(ArmorSets.DRAGONSBANE, EnumSet.allOf(EquipmentSlot.class));
    public static final ArmorCollection<ArmorSetItem> ELLEGAARD_ARMOR =
            ArmorCollection.registerArmorCollection(ArmorSets.ELLEGAARD, EnumSet.allOf(EquipmentSlot.class));
    public static final ArmorCollection<ArmorSetItem> ENDER_DEFENDER =
            ArmorCollection.registerArmorCollection(ArmorSets.ENDER_DEFENDER, EnumSet.allOf(EquipmentSlot.class));
    public static final ArmorCollection<ArmorSetItem> ENDERMAN_SOREN_ARMOR =
            ArmorCollection.registerArmorCollection(ArmorSets.ENDERMAN_SOREN, EnumSet.allOf(EquipmentSlot.class));
    public static final ArmorCollection<ArmorSetItem> GABRIEL_ARMOR =
            ArmorCollection.registerArmorCollection(ArmorSets.GABRIEL, EnumSet.allOf(EquipmentSlot.class));
    public static final ArmorCollection<ArmorSetItem> GOLDEN_GOLIATH_ARMOR =
            ArmorCollection.registerArmorCollection(ArmorSets.GOLDEN_GOLIATH, EnumSet.allOf(EquipmentSlot.class));
    public static final ArmorCollection<ArmorSetItem> GOLDEN_GOLIATH_CIRCUITRY_ARMOR =
            ArmorCollection.registerArmorCollection(ArmorSets.GOLDEN_GOLIATH_CIRCUITRY, EnumSet.allOf(EquipmentSlot.class));
    public static final ArmorCollectionHelmetOnly<ArmorSetItem> HARPERS_HEADSET =
            ArmorCollectionHelmetOnly.registerArmorCollectionHelmetOnly(ArmorSets.HARPERS_HEADSET, EnumSet.of(EquipmentSlot.HEAD));
    public static final ArmorCollection<ArmorSetItem> IVOR_ARMOR =
            ArmorCollection.registerArmorCollection(ArmorSets.IVOR, EnumSet.allOf(EquipmentSlot.class));
    public static final ArmorCollection<ArmorSetItem> LUKAS_ARMOR =
            ArmorCollection.registerArmorCollection(ArmorSets.LUKAS, EnumSet.allOf(EquipmentSlot.class));
    public static final ArmorCollection<ArmorSetItem> MAGNUS_ARMOR =
            ArmorCollection.registerArmorCollection(ArmorSets.MAGNUS, EnumSet.allOf(EquipmentSlot.class));
    public static final ArmorCollection<ArmorSetItem> NINJA_IVOR_ARMOR =
            ArmorCollection.registerArmorCollection(ArmorSets.NINJA_IVOR_ARMOR, EnumSet.allOf(EquipmentSlot.class));
    public static final ArmorCollection<ArmorSetItem> OLIVIA_ARMOR =
            ArmorCollection.registerArmorCollection(ArmorSets.OLIVIA, EnumSet.allOf(EquipmentSlot.class));
    public static final ArmorCollection<ArmorSetItem> PETRA_ARMOR =
            ArmorCollection.registerArmorCollection(ArmorSets.PETRA, EnumSet.allOf(EquipmentSlot.class));
    public static final ArmorCollection<ArmorSetItem> PRISMARINE_SOLDIER_ARMOR =
            ArmorCollection.registerArmorCollection(ArmorSets.PRISMARINE, EnumSet.allOf(EquipmentSlot.class));
    public static final ArmorCollection<ArmorSetItem> REDSTONE_RIOT =
            ArmorCollection.registerArmorCollection(ArmorSets.REDSTONE_RIOT, EnumSet.allOf(EquipmentSlot.class));
    public static final ArmorCollection<ArmorSetItem> SHIELD_OF_INFINITY =
            ArmorCollection.registerArmorCollection(ArmorSets.SHIELD_OF_INFINITY, EnumSet.allOf(EquipmentSlot.class));
    public static final ArmorCollection<ArmorSetItem> SOREN_ARMOR =
            ArmorCollection.registerArmorCollection(ArmorSets.SOREN, EnumSet.allOf(EquipmentSlot.class));
    public static final ArmorCollection<ArmorSetItem> STAR_SHIELD =
            ArmorCollection.registerArmorCollection(ArmorSets.STAR_SHIELD, EnumSet.allOf(EquipmentSlot.class));
    public static final ArmorCollection<ArmorSetItem> SWORDBREAKER =
            ArmorCollection.registerArmorCollection(ArmorSets.SWORDBREAKER, EnumSet.allOf(EquipmentSlot.class));
    public static final ArmorCollection<ArmorSetItem> TIM_ARMOR =
            ArmorCollection.registerArmorCollection(ArmorSets.TIMS_ARMOR, EnumSet.allOf(EquipmentSlot.class));
}

package dev.timefall.mcsa.registry;

import dev.timefall.mcsa.ModConstants;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import me.fzzyhmstrs.fzzy_config.util.platform.Registrar;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;

public class ArmorMaterialRegistry {
    private static final Registrar<ArmorMaterial> ARMOR_MATERIAL = ConfigApiJava.platform().createRegistrar(ModConstants.MOD_ID, Registries.ARMOR_MATERIAL);


    public static final RegistryEntry<ArmorMaterial> CHAMPION               = registerArmorMaterial("champion",                 3, 6, 8, 3, 21, Items.DIAMOND,                           SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,  3.0F, 0.1F);
    public static final RegistryEntry<ArmorMaterial> LAB                    = registerArmorMaterial("lab",                      4, 9, 7, 4, 25, Items.NETHERITE_INGOT,                   SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,  3.0F, 0.3F);
    public static final RegistryEntry<ArmorMaterial> ORDER_OF_THE_STONE     = registerArmorMaterial("order_of_the_stone",       3, 6, 8, 3, 17, Items.DIAMOND,                           SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,  1.5F, 0.0F);
    public static final RegistryEntry<ArmorMaterial> PRISMARINE             = registerArmorMaterial("prismarine",               3, 6, 5, 3, 13, Items.PRISMARINE_SHARD,                  SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,  2.0F, 0.0F);
    public static final RegistryEntry<ArmorMaterial> ENDERMAN               = registerArmorMaterial("enderman",                 1, 2, 3, 1, 10, Items.ENDER_PEARL,      RegistryEntry.of(SoundEvents.ENTITY_ENDERMAN_AMBIENT),  0.0f, 0.0f);
    public static final RegistryEntry<ArmorMaterial> NINJA_ARMOR            = registerArmorMaterial("ninja",                    1, 2, 3, 1, 10, Items.BLACK_DYE,        RegistryEntry.of(SoundEvents.BLOCK_WOOL_HIT),           0.0f, 0.0f);
    public static final RegistryEntry<ArmorMaterial> WHITE_PUMPKIN          = registerArmorMaterial("white_pumpkin",            1, 2, 3, 2, 15, Items.WHITE_DYE,                         SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,  0.0f, 0.0f);

    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String id, int bootsDefence, int leggingsDefence, int chestplateDefence, int helmetDefence, int enchantability, Item repairIngredient, RegistryEntry<SoundEvent> soundEvent, float toughness, float knockbackResistance) {
        return ARMOR_MATERIAL.register(id, () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
            map.put(ArmorItem.Type.BOOTS, bootsDefence);
            map.put(ArmorItem.Type.LEGGINGS, leggingsDefence);
            map.put(ArmorItem.Type.CHESTPLATE, chestplateDefence);
            map.put(ArmorItem.Type.HELMET, helmetDefence);
        }), enchantability, soundEvent, () -> Ingredient.ofItems(repairIngredient), List.of(new ArmorMaterial.Layer(Identifier.of(ModConstants.MOD_ID, id))), toughness, knockbackResistance));
    }

    public static void register() {
        ARMOR_MATERIAL.init();
    }
}

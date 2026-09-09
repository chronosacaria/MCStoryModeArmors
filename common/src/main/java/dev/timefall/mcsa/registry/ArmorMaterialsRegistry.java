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

public class ArmorMaterialsRegistry {
    private static final Registrar<ArmorMaterial> ARMOR_MATERIAL = ConfigApiJava.platform().createRegistrar(ModConstants.MOD_ID, Registries.ARMOR_MATERIAL);

    public static final RegistryEntry<ArmorMaterial> ADAMANTIUM_IMPERVIUM = registerArmorMaterial(
            "adamantium_impervium",
            4, 9, 7, 4, 25,
            Items.DIAMOND, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            3.0f, 0.3f);

    public static final RegistryEntry<ArmorMaterial> CHAMPION_PETRA = registerArmorMaterial(
            "champion_petra",
            4, 9, 7, 4, 25,
            Items.DIAMOND, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            2.0f, 0.2f);


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

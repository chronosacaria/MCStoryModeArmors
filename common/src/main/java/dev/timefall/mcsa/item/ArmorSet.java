package dev.timefall.mcsa.item;

import com.google.gson.JsonElement;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;

public record ArmorSet(
        Item helmet,
        Item chestplate,
        Item leggings,
        Item boots
) {
    private static final Codec<Item> ITEM_TAG_CODEC = Registries.ITEM.getCodec();

    private static final Codec<ArmorSet> CODEC =
            RecordCodecBuilder.create(armorSetInstance -> armorSetInstance.group(
                    ITEM_TAG_CODEC.fieldOf("helmet").forGetter(ArmorSet::helmet),
                    ITEM_TAG_CODEC.fieldOf("chestplate").forGetter(ArmorSet::chestplate),
                    ITEM_TAG_CODEC.fieldOf("leggings").forGetter(ArmorSet::leggings),
                    ITEM_TAG_CODEC.fieldOf("boots").forGetter(ArmorSet::boots)
            ).apply(armorSetInstance, ArmorSet::new));

    public static DataResult<ArmorSet> decode(JsonElement json) {
        return CODEC.parse(JsonOps.INSTANCE, json);
    }

    public boolean isWearingInHeadSlot(LivingEntity livingEntity) {
        return !livingEntity.getEquippedStack(EquipmentSlot.HEAD).isEmpty() &&
                livingEntity.getEquippedStack(EquipmentSlot.HEAD).isOf(helmet);
    }

    public boolean isWearingInChestSlot(LivingEntity livingEntity) {
        return !livingEntity.getEquippedStack(EquipmentSlot.CHEST).isEmpty() &&
                livingEntity.getEquippedStack(EquipmentSlot.CHEST).isOf(chestplate);
    }

    public boolean isWearingInLegsSlot(LivingEntity livingEntity) {
        return !livingEntity.getEquippedStack(EquipmentSlot.LEGS).isEmpty()  &&
                livingEntity.getEquippedStack(EquipmentSlot.LEGS).isOf(leggings);
    }

    public boolean isWearingInFeetSlot(LivingEntity livingEntity) {
        return !livingEntity.getEquippedStack(EquipmentSlot.FEET).isEmpty()  &&
                livingEntity.getEquippedStack(EquipmentSlot.FEET).isOf(boots);
    }
}

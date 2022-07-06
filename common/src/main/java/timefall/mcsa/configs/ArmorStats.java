package timefall.mcsa.configs;

import net.minecraft.entity.EquipmentSlot;

import java.util.EnumMap;

public class ArmorStats {
    public EnumMap<EquipmentSlot, Integer> protection = new EnumMap<>(EquipmentSlot.class);
    public float toughness;
    public float knockbackRes;

    public ArmorStats setProtection(int head, int chest, int legs, int feet) {
        this.protection.put(EquipmentSlot.HEAD, head);
        this.protection.put(EquipmentSlot.CHEST, chest);
        this.protection.put(EquipmentSlot.LEGS, legs);
        this.protection.put(EquipmentSlot.FEET, feet);
        return this;
    }

    public ArmorStats setToughness(float toughness) {
        this.toughness = toughness;
        return this;
    }

    public ArmorStats setKnockbackRes(float knockbackRes) {
        this.knockbackRes = knockbackRes;
        return this;
    }
}

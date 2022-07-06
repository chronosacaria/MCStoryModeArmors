package timefall.mcsa.factories;

import net.minecraft.entity.EquipmentSlot;
import timefall.mcsa.items.armor.ArmorSetItem;
import timefall.mcsa.items.armor.ArmorSets;

@FunctionalInterface
public interface ArmorItemFactory<T extends ArmorSetItem> {
    ArmorItemFactory<ArmorSetItem> DEFAULT = ArmorSetItem::new;

    T create(ArmorSets set, EquipmentSlot equipmentSlot);
}

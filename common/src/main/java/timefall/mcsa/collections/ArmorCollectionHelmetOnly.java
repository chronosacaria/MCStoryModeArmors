package timefall.mcsa.collections;

import com.google.common.collect.ImmutableList;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.entity.EquipmentSlot;
import timefall.mcsa.factories.ArmorItemFactory;
import timefall.mcsa.init.ArmorsInit;
import timefall.mcsa.items.armor.ArmorSetItem;
import timefall.mcsa.items.armor.ArmorSets;

import java.util.EnumSet;
import java.util.List;

public class ArmorCollectionHelmetOnly <T extends ArmorSetItem> {

    private RegistrySupplier<T> helmet;

    public ArmorCollectionHelmetOnly(RegistrySupplier<T> helmet) {
        this.helmet = helmet;
    }

    public static ArmorCollectionHelmetOnly<ArmorSetItem> registerArmorCollectionHelmetOnly(ArmorSets sets, EnumSet<EquipmentSlot> equipmentSlots) {
        return registerArmorCollectionHelmetOnly(sets, ArmorItemFactory.DEFAULT);
    }

    public static <T extends ArmorSetItem> ArmorCollectionHelmetOnly<T> registerArmorCollectionHelmetOnly(ArmorSets sets, ArmorItemFactory<T> factory) {
        return new ArmorCollectionHelmetOnly<>(
                ArmorsInit.ARMOR.register(sets.getSetName() + "_helmet", () -> factory.create(sets, EquipmentSlot.HEAD))
        );
    }

    public T getHelmet() {
        return helmet.get();
    }

    public List<T> getArmorHelmetOnly() {
        return ImmutableList.of(getHelmet());
    }
}

package timefall.mcsa.collections;

import com.google.common.collect.ImmutableList;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.entity.EquipmentSlot;
import timefall.mcsa.configs.McsaConfig;
import timefall.mcsa.factories.ArmorItemFactory;
import timefall.mcsa.init.ArmorsInit;
import timefall.mcsa.items.armor.ArmorSetItem;
import timefall.mcsa.items.armor.ArmorSets;

import java.util.EnumSet;
import java.util.List;

public class ArmorCollection<T extends ArmorSetItem> {
    private final RegistrySupplier<T> helmet;
    private final RegistrySupplier<T> chestplate;
    private final RegistrySupplier<T> leggings;
    private final RegistrySupplier<T> boots;

    public ArmorCollection(RegistrySupplier<T> helmet, RegistrySupplier<T> chestplate, RegistrySupplier<T> leggings, RegistrySupplier<T> boots) {
        this.helmet = helmet;
        this.chestplate = chestplate;
        this.leggings = leggings;
        this.boots = boots;
    }

    public static ArmorCollection<ArmorSetItem> registerArmorCollection(ArmorSets sets, EnumSet<EquipmentSlot> equipmentSlots) {
        return registerArmorCollection(sets, ArmorItemFactory.DEFAULT);
    }

    public static <T extends ArmorSetItem> ArmorCollection<T> registerArmorCollection(ArmorSets sets, ArmorItemFactory<T> factory) {
        if (McsaConfig.config.ENABLE_ARMOR_SET.get(sets)) {
            return new ArmorCollection<>(
                    ArmorsInit.ARMOR.register(sets.getSetName() + "_helmet", () -> factory.create(sets, EquipmentSlot.HEAD)),
                    ArmorsInit.ARMOR.register(sets.getSetName() + "_chestplate", () -> factory.create(sets, EquipmentSlot.CHEST)),
                    ArmorsInit.ARMOR.register(sets.getSetName() + "_leggings", () -> factory.create(sets, EquipmentSlot.LEGS)),
                    ArmorsInit.ARMOR.register(sets.getSetName() + "_boots", () -> factory.create(sets, EquipmentSlot.FEET))
            );
        }
        return null;
    }

    public T getHelmet() {
        return helmet.get();
    }

    public T getChestplate() {
        return chestplate.get();
    }

    public T getLeggings() {
        return leggings.get();
    }

    public T getBoots() {
        return boots.get();
    }

    public List<T> getArmor() {
        return ImmutableList.of(getHelmet(), getChestplate(), getLeggings(), getBoots());
    }
}

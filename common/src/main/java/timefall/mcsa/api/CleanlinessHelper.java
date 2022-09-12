package timefall.mcsa.api;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import timefall.mcsa.collections.ArmorCollection;
import timefall.mcsa.configs.McsaConfig;
import timefall.mcsa.items.armor.ArmorSetItem;
import timefall.mcsa.items.armor.ArmorSets;

public class CleanlinessHelper {
    public static boolean hasArmorSet(LivingEntity livingEntity, ArmorCollection<ArmorSetItem> armorCollection, ArmorSets armorSet){
        if (McsaConfig.config.ARMOR_SETS_ENABLED.get(armorSet)) {
            ItemStack headStack = livingEntity.getEquippedStack(EquipmentSlot.HEAD);
            ItemStack chestStack = livingEntity.getEquippedStack(EquipmentSlot.CHEST);
            ItemStack legStack = livingEntity.getEquippedStack(EquipmentSlot.LEGS);
            ItemStack footStack = livingEntity.getEquippedStack(EquipmentSlot.FEET);

            return headStack.isOf(armorCollection.getHelmet())
                    && chestStack.isOf(armorCollection.getChestplate())
                    && legStack.isOf(armorCollection.getLeggings())
                    && footStack.isOf(armorCollection.getBoots());
        }
        return false;
    }

}

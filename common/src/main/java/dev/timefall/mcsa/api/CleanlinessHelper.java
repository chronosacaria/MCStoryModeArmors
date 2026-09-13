package dev.timefall.mcsa.api;

import dev.timefall.mcsa.resource.ArmorSetLoader;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.Locale;

public class CleanlinessHelper {
    public static void createLoreTTips(ItemStack stack, List<Text> tooltip) {
        String str = stack.getItem().getTranslationKey().toLowerCase(Locale.ROOT).substring(10);
        String translationKey = String.format("tooltip_info_item.mcsa.%s_", str);
        int i = 1;
        while (I18n.hasTranslation(translationKey + i)) {
            tooltip.add(Text.translatable(translationKey + i).formatted(Formatting.ITALIC));
            i++;
        }
    }

    public static boolean isWearingFullSet(LivingEntity livingEntity, Identifier setID) {
        return ArmorSetLoader.get(setID).map((set) ->
                set.isWearingInHeadSlot(livingEntity) &&
                set.isWearingInChestSlot(livingEntity) &&
                set.isWearingInLegsSlot(livingEntity) &&
                set.isWearingInFeetSlot(livingEntity)
        ).orElse(false);
    }
}

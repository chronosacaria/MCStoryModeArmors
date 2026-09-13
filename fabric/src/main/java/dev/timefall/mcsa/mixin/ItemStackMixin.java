package dev.timefall.mcsa.mixin;

import dev.timefall.mcsa.api.CleanlinessHelper;
import dev.timefall.mcsa.item.ArmorSets;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ItemStack.class)
public class ItemStackMixin {
    @Inject(
            method = "damage(ILnet/minecraft/entity/LivingEntity;Lnet/minecraft/entity/EquipmentSlot;)V",
            at = @At("HEAD"),
            cancellable = true
    )
    private void mcsa$cancelArmorDurabilityDamage(int amount, LivingEntity entity, EquipmentSlot slot, CallbackInfo ci) {
        if (entity.getWorld().isClient()) return;

        boolean isArmorSlot = switch(slot) {
            case HEAD, CHEST, LEGS, FEET -> true;
            default -> false;
        };

        if (!isArmorSlot) return;

        if (CleanlinessHelper.isWearingFullSet(entity, ArmorSets.ADAMANTIUM_IMPERVIUM) && entity.isSneaking()) {
            ci.cancel();
        }
    }
}

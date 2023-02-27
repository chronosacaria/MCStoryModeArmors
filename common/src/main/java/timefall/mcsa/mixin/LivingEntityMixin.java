package timefall.mcsa.mixin;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import timefall.mcsa.init.BlocksInit;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {
    @Inject(method = "getPreferredEquipmentSlot", at = @At("HEAD"), cancellable = true)
    private static void mcsa$getPreferredEquipmentSlot(ItemStack stack, CallbackInfoReturnable<EquipmentSlot> cir){
        if (stack.getItem() == BlocksInit.CARVED_WHITE_PUMPKIN_BLOCK.get().asItem()) {
            cir.setReturnValue(EquipmentSlot.HEAD);
        }
    }
}

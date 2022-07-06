package timefall.mcsa.mixin;

import net.minecraft.entity.mob.EndermanEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import timefall.mcsa.init.ArmorsInit;

@Mixin(EndermanEntity.class)
public class EndermanEntityMixin {
    @Inject(method = "isPlayerStaring", at = @At("HEAD"), cancellable = true)
    private void mcsa$isPlayerStaring(PlayerEntity playerEntity, CallbackInfoReturnable<Boolean> cir) {
        ItemStack helmetStack = playerEntity.getInventory().getArmorStack(3);
        ItemStack chestplateStack = playerEntity.getInventory().getArmorStack(2);
        ItemStack leggingsStack = playerEntity.getInventory().getArmorStack(1);
        ItemStack bootsStack = playerEntity.getInventory().getArmorStack(0);

        if (helmetStack.isOf(ArmorsInit.ENDERMAN_SOREN_ARMOR.getHelmet())
                && chestplateStack.isOf(ArmorsInit.ENDERMAN_SOREN_ARMOR.getChestplate())
                && leggingsStack.isOf(ArmorsInit.ENDERMAN_SOREN_ARMOR.getLeggings())
                && bootsStack.isOf(ArmorsInit.ENDERMAN_SOREN_ARMOR.getBoots())
                || helmetStack.isOf(ArmorsInit.ENDER_DEFENDER.getHelmet())
                && chestplateStack.isOf(ArmorsInit.ENDER_DEFENDER.getChestplate())
                && leggingsStack.isOf(ArmorsInit.ENDER_DEFENDER.getLeggings())
                && bootsStack.isOf(ArmorsInit.ENDER_DEFENDER.getBoots())) {
            cir.setReturnValue(false);
        }
    }
}

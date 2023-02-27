package timefall.mcsa.mixin;

import net.minecraft.entity.mob.EndermanEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import timefall.mcsa.api.CleanlinessHelper;
import timefall.mcsa.init.ArmorsInit;
import timefall.mcsa.init.BlocksInit;
import timefall.mcsa.items.armor.ArmorSets;

@Mixin(EndermanEntity.class)
public class EndermanEntityMixin {
    @Inject(method = "isPlayerStaring", at = @At("HEAD"), cancellable = true)
    private void mcsa$isPlayerStaring(PlayerEntity playerEntity, CallbackInfoReturnable<Boolean> cir) {
        ItemStack helmetStack = playerEntity.getInventory().getArmorStack(3);

        if (CleanlinessHelper.hasArmorSet(playerEntity, ArmorsInit.ENDERMAN_SOREN_ARMOR, ArmorSets.ENDERMAN_SOREN)
                || CleanlinessHelper.hasArmorSet(playerEntity, ArmorsInit.ENDER_DEFENDER, ArmorSets.ENDER_DEFENDER)
                || helmetStack.isOf(BlocksInit.CARVED_WHITE_PUMPKIN_BLOCK.get().asItem())) {
            cir.setReturnValue(false);
        }
    }
}

package timefall.mcsa.mixin;

import net.minecraft.entity.AreaEffectCloudEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.damage.DamageSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import timefall.mcsa.api.CleanlinessHelper;
import timefall.mcsa.init.ArmorsInit;
import timefall.mcsa.items.armor.ArmorSets;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {
    @Inject(method = "damage", at = @At("HEAD"), cancellable = true)
    public void mcsa$cancelBreathDamage(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {
        LivingEntity livingEntity = (LivingEntity) (Object) this;

        if (CleanlinessHelper.hasArmorSet(livingEntity, ArmorsInit.DRAGONSBANE, ArmorSets.DRAGONSBANE)) {
            if (source.getSource() instanceof AreaEffectCloudEntity areaEffectCloudEntity && areaEffectCloudEntity.getOwner() instanceof EnderDragonEntity) {
                cir.setReturnValue(false);
            }
        }
    }

    @ModifyVariable(method = "damage", at = @At(value = "HEAD"), argsOnly = true)
    public float mcsa$damageModifiers(float amount, DamageSource source) {
        LivingEntity livingEntity = (LivingEntity) (Object) this;

        if (CleanlinessHelper.hasArmorSet(livingEntity, ArmorsInit.MAGNUS_ARMOR, ArmorSets.MAGNUS)) {
            if (source.isExplosive()) {
                return amount / 2;
            }
        }
        return amount;
    }
}
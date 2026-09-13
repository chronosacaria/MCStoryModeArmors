package dev.timefall.mcsa.mixin;

import dev.timefall.mcsa.api.CleanlinessHelper;
import dev.timefall.mcsa.effect.ArmorEffects;
import dev.timefall.mcsa.item.ArmorSets;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {

    @Unique
    LivingEntity livingEntity = (LivingEntity) (Object) this;

    @Inject(
            method = "modifyAppliedDamage",
            at = @At("RETURN"),
            cancellable = true
    )
    private void mcsa$modifyAppliedDamage(DamageSource source, float amount, CallbackInfoReturnable<Float> cir) {
        // Returns the amount of damage that the entity would take if only
        // vanilla resistances were applied
        float damageAfterVanillaResistances = cir.getReturnValueF();

        // TODO: Add proper activation of ability rather than using `livingEntity.isSneaking()`
        if (CleanlinessHelper.isWearingFullSet(livingEntity, ArmorSets.ADAMANTIUM_IMPERVIUM) && livingEntity.isSneaking()) {
            cir.setReturnValue(ArmorEffects.getReducedDamage(source, damageAfterVanillaResistances));
        }
    }
}

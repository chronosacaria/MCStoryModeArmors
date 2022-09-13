package timefall.mcsa.mixin;

import net.minecraft.entity.AreaEffectCloudEntity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.EndermanEntity;
import net.minecraft.item.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
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

        if (CleanlinessHelper.hasArmorSet(livingEntity, ArmorsInit.ADAMANTIUM_ARMOR, ArmorSets.ADAMANTIUM)) {
            if (livingEntity.getAttacker() != null && livingEntity.getAttacker().getMainHandStack().getItem() instanceof ToolItem || source.isProjectile())
                return amount * 0.10f;
        }

        if (CleanlinessHelper.hasArmorSet(livingEntity, ArmorsInit.DRAGONSBANE, ArmorSets.DRAGONSBANE)) {
            if (livingEntity.getAttacking() instanceof EnderDragonEntity)
                return amount * 1.25f;
        }

        if (CleanlinessHelper.hasArmorSet(livingEntity, ArmorsInit.ENDER_DEFENDER, ArmorSets.ENDER_DEFENDER)) {
            if (livingEntity.getAttacking() instanceof EndermanEntity)
                return amount * 1.5f;
        }

        if (CleanlinessHelper.hasArmorSet(livingEntity, ArmorsInit.GOLDEN_GOLIATH_ARMOR, ArmorSets.GOLDEN_GOLIATH)) {
            if (livingEntity.getAttacking() != null && (livingEntity.getWorld().isDay() || livingEntity.getWorld().getMoonPhase() == 1)
                    && livingEntity.getWorld().isSkyVisible(livingEntity.getBlockPos())) {
                livingEntity.getAttacking().setOnFireFor(5);
                return amount * 2f;
            } else {
                return amount * 0.5f;
            }
        }

        if (CleanlinessHelper.hasArmorSet(livingEntity, ArmorsInit.MAGNUS_ARMOR, ArmorSets.MAGNUS)) {
            if (source.isExplosive())
                return amount / 2;
        }

        if (CleanlinessHelper.hasArmorSet(livingEntity, ArmorsInit.REDSTONE_RIOT, ArmorSets.REDSTONE_RIOT)) {
            if (livingEntity.getAttacker() != null && livingEntity.getAttacker().getMainHandStack().getItem() instanceof ToolItem || source.isProjectile())
                return amount * 0.25f;
        }

        if (CleanlinessHelper.hasArmorSet(livingEntity, ArmorsInit.SWORDBREAKER, ArmorSets.SWORDBREAKER)) {
            if (livingEntity.getAttacker() != null && livingEntity.getAttacker().getMainHandStack().getItem() instanceof SwordItem) {
                livingEntity.getAttacker().getMainHandStack().damage(50, livingEntity.getAttacker(), (entity) -> livingEntity.getAttacker().sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
                return amount * 0;
            }
            if (livingEntity.getAttacker() != null && livingEntity.getAttacker().getMainHandStack().getItem() instanceof AxeItem) {
                livingEntity.getAttacker().getMainHandStack().damage(1, livingEntity.getAttacker(), (entity) -> livingEntity.getAttacker().sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
                return amount * 1.25f;
            }
        }
        return amount;
    }
}
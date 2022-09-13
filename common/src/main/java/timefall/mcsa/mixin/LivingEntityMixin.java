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
        if (!(source.getAttacker() instanceof LivingEntity armoredEntity)) {
            return amount;
        }

        LivingEntity target = (LivingEntity) (Object) this;

        if (CleanlinessHelper.hasArmorSet(armoredEntity, ArmorsInit.ADAMANTIUM_ARMOR, ArmorSets.ADAMANTIUM)) {
            if (armoredEntity.getMainHandStack() != null
                    && armoredEntity.getMainHandStack().getItem() instanceof ToolItem || source.isProjectile())
                return amount * 0.10f;
        }

        if (CleanlinessHelper.hasArmorSet(armoredEntity, ArmorsInit.DRAGONSBANE, ArmorSets.DRAGONSBANE)) {
            if (target instanceof EnderDragonEntity)
                return amount * 1.25f;
        }

        if (CleanlinessHelper.hasArmorSet(armoredEntity, ArmorsInit.ENDER_DEFENDER, ArmorSets.ENDER_DEFENDER)) {
            if (target instanceof EndermanEntity)
                return amount * 1.5f;
        }

        if (CleanlinessHelper.hasArmorSet(armoredEntity, ArmorsInit.GOLDEN_GOLIATH_ARMOR, ArmorSets.GOLDEN_GOLIATH)) {
            // If it is day or the moon is full
            if (armoredEntity.getWorld().isDay() || armoredEntity.getWorld().getMoonPhase() == 1
                    // If the player can see the sky (i.e. is not in a cave or underground)
                && armoredEntity.getWorld().isSkyVisible(armoredEntity.getBlockPos())) {
                target.setOnFireFor(5);
                return amount * 2f;
            } else {
                return amount * 0.5f;
            }
        }

        if (CleanlinessHelper.hasArmorSet(armoredEntity, ArmorsInit.MAGNUS_ARMOR, ArmorSets.MAGNUS)) {
            if (source.isExplosive())
                return amount / 2;
        }

        if (CleanlinessHelper.hasArmorSet(armoredEntity, ArmorsInit.REDSTONE_RIOT, ArmorSets.REDSTONE_RIOT)) {
            if (armoredEntity.getAttacker() != null
                    && armoredEntity.getAttacker().getMainHandStack() != null
                    && armoredEntity.getAttacker().getMainHandStack().getItem() instanceof ToolItem || source.isProjectile())
                return amount * 0.25f;
        }

        if (CleanlinessHelper.hasArmorSet(armoredEntity, ArmorsInit.STAR_SHIELD, ArmorSets.STAR_SHIELD)) {
            if (armoredEntity.getAttacker() != null
                    && armoredEntity.getAttacker().getMainHandStack() != null
                    && (armoredEntity.getAttacker().getMainHandStack().isOf(Items.NETHERITE_AXE) || armoredEntity.getAttacker().getMainHandStack().isOf(Items.NETHERITE_SWORD))) {
                return amount * 0;
            }
        }

        if (CleanlinessHelper.hasArmorSet(armoredEntity, ArmorsInit.SWORDBREAKER, ArmorSets.SWORDBREAKER)) {
            if (armoredEntity.getAttacker() != null
                    && armoredEntity.getAttacker().getMainHandStack() != null
                    && armoredEntity.getAttacker().getMainHandStack().getItem() instanceof SwordItem) {
                armoredEntity.getAttacker().getMainHandStack().damage(50, armoredEntity.getAttacker(), (entity) -> armoredEntity.getAttacker().sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
                return amount * 0;
            }
            if (armoredEntity.getAttacker() != null
                    && armoredEntity.getAttacker().getMainHandStack() != null
                    && armoredEntity.getAttacker().getMainHandStack().getItem() instanceof AxeItem) {
                armoredEntity.getAttacker().getMainHandStack().damage(1, armoredEntity.getAttacker(), (entity) -> armoredEntity.getAttacker().sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
                return amount * 1.25f;
            }
        }
        return amount;
    }
}
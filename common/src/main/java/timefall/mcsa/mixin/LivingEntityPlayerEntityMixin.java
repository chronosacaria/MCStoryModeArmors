package timefall.mcsa.mixin;

import net.minecraft.entity.AreaEffectCloudEntity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.EndermanEntity;
import net.minecraft.entity.mob.Monster;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import timefall.mcsa.api.CleanlinessHelper;
import timefall.mcsa.configs.McsaConfig;
import timefall.mcsa.init.ArmorsInit;
import timefall.mcsa.items.armor.ArmorSets;

@Mixin({LivingEntity.class, PlayerEntity.class})
public class LivingEntityPlayerEntityMixin {

    @Inject(method = "damage", at = @At("HEAD"), cancellable = true)
    public void mcsa$damageReceivedInjections(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {

        if ((Object) this instanceof LivingEntity livingEntity) {
            if (McsaConfig.config.enableArmorEffectOfSet.get(ArmorSets.DRAGONSBANE)) {
                if (CleanlinessHelper.hasArmorSet(livingEntity, ArmorsInit.DRAGONSBANE, ArmorSets.DRAGONSBANE)) {
                    if (source.getSource() instanceof AreaEffectCloudEntity areaEffectCloudEntity && areaEffectCloudEntity.getOwner() instanceof EnderDragonEntity) {
                        cir.setReturnValue(false);
                    }
                }
            }

            if (McsaConfig.config.enableArmorEffectOfSet.get(ArmorSets.SHIELD_OF_INFINITY)) {
                if (CleanlinessHelper.hasArmorSet(livingEntity, ArmorsInit.SHIELD_OF_INFINITY, ArmorSets.SHIELD_OF_INFINITY)) {
                    if (livingEntity.getAttacker() != null
                            && (livingEntity.getAttacker().getMainHandStack().getItem() instanceof ToolItem
                            || source.getAttacker() instanceof LivingEntity)) {
                        cir.setReturnValue(false);
                    }
                }
            }

            if (McsaConfig.config.enableArmorEffectOfSet.get(ArmorSets.STAR_SHIELD)) {
                if (CleanlinessHelper.hasArmorSet(livingEntity, ArmorsInit.STAR_SHIELD, ArmorSets.STAR_SHIELD)) {
                    if (livingEntity.getAttacker() != null
                            && (!(livingEntity.getAttacker().getMainHandStack().isOf(Items.NETHERITE_AXE)
                            || livingEntity.getAttacker().getMainHandStack().isOf(Items.NETHERITE_SWORD)))) {
                        cir.setReturnValue(true);
                    }
                }
            }
        }
    }

    @ModifyVariable(method = "damage", at = @At(value = "HEAD"), argsOnly = true)
    public float mcsa$damageModifiers(float amount, DamageSource source) {
        if (!(source.getAttacker() instanceof LivingEntity attacker)) {
            return amount;
        }

        LivingEntity damagedEntity = (LivingEntity) (Object) this;

        if (McsaConfig.config.enableArmorEffectOfSet.get(ArmorSets.ADAMANTIUM)) {
            if (CleanlinessHelper.hasArmorSet(damagedEntity, ArmorsInit.ADAMANTIUM_ARMOR, ArmorSets.ADAMANTIUM)) {
                if (!source.isOutOfWorld()) {
                    return amount * 0.10f;
                }
            }
        }

        if (McsaConfig.config.enableArmorEffectOfSet.get(ArmorSets.DRAGONSBANE)) {
            if (CleanlinessHelper.hasArmorSet(attacker, ArmorsInit.DRAGONSBANE, ArmorSets.DRAGONSBANE)) {
                if (damagedEntity instanceof EnderDragonEntity)
                    return amount * 1.25f;
            }
        }

        if (McsaConfig.config.enableArmorEffectOfSet.get(ArmorSets.ENDER_DEFENDER)) {
            if (CleanlinessHelper.hasArmorSet(attacker, ArmorsInit.ENDER_DEFENDER, ArmorSets.ENDER_DEFENDER)) {
                if (damagedEntity instanceof EndermanEntity)
                    return amount * 1.5f;
            }
        }

        if (McsaConfig.config.enableArmorEffectOfSet.get(ArmorSets.GOLDEN_GOLIATH)) {
            if (CleanlinessHelper.hasArmorSet(attacker, ArmorsInit.GOLDEN_GOLIATH_ARMOR, ArmorSets.GOLDEN_GOLIATH)) {
                // If it is day or the moon is full
                if (attacker.getWorld().isDay() || attacker.getWorld().getMoonPhase() == 1
                        // If the player can see the sky (i.e. is not in a cave or underground)
                        && attacker.getWorld().isSkyVisible(attacker.getBlockPos())) {
                    damagedEntity.setOnFireFor(5);
                    return amount * 2f;
                } else {
                    return amount * 0.5f;
                }
            }
        }

        if (McsaConfig.config.enableArmorEffectOfSet.get(ArmorSets.MAGNUS)) {
            if (CleanlinessHelper.hasArmorSet(damagedEntity, ArmorsInit.MAGNUS_ARMOR, ArmorSets.MAGNUS)) {
                if (source.isExplosive())
                    return amount / 2;
            }
        }

        if (McsaConfig.config.enableArmorEffectOfSet.get(ArmorSets.REDSTONE_RIOT)) {
            if (CleanlinessHelper.hasArmorSet(damagedEntity, ArmorsInit.REDSTONE_RIOT, ArmorSets.REDSTONE_RIOT)) {
                if (attacker.getAttacker() != null
                        && (attacker.getAttacker().getMainHandStack().getItem() instanceof ToolItem
                        || source.isProjectile() || source.getSource() instanceof Monster))
                    return amount * 0.25f;
            }
        }

        if (McsaConfig.config.enableArmorEffectOfSet.get(ArmorSets.SWORDBREAKER)) {
            if (CleanlinessHelper.hasArmorSet(damagedEntity, ArmorsInit.SWORDBREAKER, ArmorSets.SWORDBREAKER)) {
                if (attacker.getMainHandStack() != null && attacker.getMainHandStack().getItem() instanceof SwordItem) {
                    attacker.getMainHandStack().damage(50, attacker,
                            (entity) -> attacker.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
                    return amount * 0;
                }
                if (attacker.getMainHandStack() != null && attacker.getMainHandStack().getItem() instanceof AxeItem) {
                    attacker.getMainHandStack().damage(1, attacker,
                            (entity) -> attacker.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
                    return amount * 1.25f;
                }
            }
        }
        return amount;
    }
}
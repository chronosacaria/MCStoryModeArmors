package dev.timefall.mcsa.item;

import com.google.common.collect.ImmutableMap;
import dev.timefall.mcsa.api.CleanlinessHelper;
import dev.timefall.mcsa.registry.ArmorMaterialsRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;
import java.util.Map;

public class McsaArmorItem extends ArmorItem {

    /**
     * Copyright (c) 2024 Kaupenjoe<br />
     * Licensed under the MIT License - see {@link <a href="https://github.com/Tutorials-By-Kaupenjoe/Fabric-Tutorial-1.21.X/blob/18-fullArmorEffect/LICENSE">LICENSE</a>} file for details
     * <br /><br />
     * You can find the original file {@link <a href="https://github.com/Tutorials-By-Kaupenjoe/Fabric-Tutorial-1.21.X/blame/18-fullArmorEffect/src/main/java/net/kaupenjoe/tutorialmod/item/custom/ModArmorItem.java">HERE</a>}
     */

    public static final Map<RegistryEntry<ArmorMaterial>, List<StatusEffectInstance>> ARMOR_MATERIAL_TO_STATUS_EFFECT_MAP =
            (new ImmutableMap.Builder<RegistryEntry<ArmorMaterial>, List<StatusEffectInstance>>())
            .put(ArmorMaterialsRegistry.ADAMANTIUM_IMPERVIUM,
                    List.of(new StatusEffectInstance(StatusEffects.HASTE, 400, 2, false, false))
            ).build();

    public McsaArmorItem(RegistryEntry<ArmorMaterial> armorMaterial, Type type, Settings settings) {
        super(armorMaterial, type, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (world.isClient()) return;
        if (!(entity instanceof PlayerEntity playerEntity)) return;
        if (!hasFullSuitOfArmorOn(playerEntity)) return;

        evaluateArmorEffects(playerEntity);

        super.inventoryTick(stack, world, entity, slot, selected);
    }

    private void evaluateArmorEffects(PlayerEntity playerEntity) {
        for(Map.Entry<RegistryEntry<ArmorMaterial>, List<StatusEffectInstance>> entry : ARMOR_MATERIAL_TO_STATUS_EFFECT_MAP.entrySet()) {
            RegistryEntry<ArmorMaterial> armorMaterial = entry.getKey();
            List<StatusEffectInstance> statusEffect = entry.getValue();

            if(!hasCorrectArmorOn(armorMaterial, playerEntity)) return;

            addStatusEffectForMaterial(playerEntity, armorMaterial, statusEffect);
        }
    }

    private void addStatusEffectForMaterial(PlayerEntity playerEntity, RegistryEntry<ArmorMaterial> armorMaterial, List<StatusEffectInstance> statusEffect) {
        boolean hasSetEffect = statusEffect.stream().allMatch(statusEffectInstance -> playerEntity.hasStatusEffect(statusEffectInstance.getEffectType()));
        if (hasSetEffect) return;

        for (StatusEffectInstance instance : statusEffect) {
            playerEntity.addStatusEffect(
                    new StatusEffectInstance(
                            instance.getEffectType(),
                            instance.getDuration(),
                            instance.getAmplifier(),
                            instance.isAmbient(),
                            instance.shouldShowParticles()
                    )
            );
        }
    }

    private boolean hasFullSuitOfArmorOn(PlayerEntity playerEntity) {
        ItemStack helmet = playerEntity.getEquippedStack(EquipmentSlot.HEAD);
        ItemStack chestplate = playerEntity.getEquippedStack(EquipmentSlot.CHEST);
        ItemStack leggings = playerEntity.getEquippedStack(EquipmentSlot.LEGS);
        ItemStack boots = playerEntity.getEquippedStack(EquipmentSlot.FEET);

        return !helmet.isEmpty() && !chestplate.isEmpty() && !leggings.isEmpty() && !boots.isEmpty();
    }

    private boolean hasCorrectArmorOn(RegistryEntry<ArmorMaterial> armorMaterial, PlayerEntity playerEntity) {
        for (ItemStack armorItemStack: playerEntity.getInventory().armor) {
            if (!(armorItemStack.getItem() instanceof ArmorItem)) return false;
        }

        ArmorItem helmet     = (ArmorItem) playerEntity.getEquippedStack(EquipmentSlot.HEAD).getItem();
        ArmorItem chestplate = (ArmorItem) playerEntity.getEquippedStack(EquipmentSlot.CHEST).getItem();
        ArmorItem leggings   = (ArmorItem) playerEntity.getEquippedStack(EquipmentSlot.LEGS).getItem();
        ArmorItem boots      = (ArmorItem) playerEntity.getEquippedStack(EquipmentSlot.FEET).getItem();

        return helmet.getMaterial() == armorMaterial &&
                chestplate.getMaterial() == armorMaterial &&
                leggings.getMaterial() == armorMaterial &&
                boots.getMaterial() == armorMaterial;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        CleanlinessHelper.createLoreTTips(stack, tooltip);
    }
}

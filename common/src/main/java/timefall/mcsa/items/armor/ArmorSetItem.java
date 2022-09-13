package timefall.mcsa.items.armor;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;
import timefall.mcsa.Mcsa;
import timefall.mcsa.configs.ArmorStats;
import timefall.mcsa.configs.McsaConfig;
import timefall.mcsa.init.BlocksInit;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class ArmorSetItem extends ArmorItem {

    private static final Map<ArmorSets, StatusEffectInstance> MATERIAL_TO_EFFECT_MAP =
            (new ImmutableMap.Builder<ArmorSets, StatusEffectInstance>())
                    .put(ArmorSets.MAGNUS,
                            new StatusEffectInstance(StatusEffects.WATER_BREATHING, 200, 0))
                    .put(ArmorSets.PRISMARINE,
                            new StatusEffectInstance(StatusEffects.WATER_BREATHING, 200, 0))
                    .build();

    private static final UUID[] ARMOR_MODIFIERS = new UUID[]{
            UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"),
            UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"),
            UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"),
            UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150")};

    protected final Multimap<EntityAttribute, EntityAttributeModifier> attributeModifiers;
    protected final ArmorSets set;

    public ArmorSetItem(ArmorSets set, EquipmentSlot slot) {
        super(set, slot, new Settings().group(Mcsa.EXAMPLE_TAB));
        this.set = set;

        int protection = set.getProtectionAmount(slot);
        float toughness = set.getToughness();

        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        UUID uuid = ARMOR_MODIFIERS[slot.getEntitySlotId()];
        builder.put(EntityAttributes.GENERIC_ARMOR, new EntityAttributeModifier(uuid, "Armor modifier",
                protection, EntityAttributeModifier.Operation.ADDITION));
        builder.put(EntityAttributes.GENERIC_ARMOR_TOUGHNESS, new EntityAttributeModifier(uuid, "Armor toughness",
                toughness, EntityAttributeModifier.Operation.ADDITION));
        if (this.knockbackResistance > 0) {
            builder.put(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, new EntityAttributeModifier(uuid, "Armor knockback resistance",
                    this.knockbackResistance, EntityAttributeModifier.Operation.ADDITION));
        }

        ArmorStats armorStats = McsaConfig.config.armorStats.get(set);
        this.attributeModifiers = builder.build();
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot){
        return slot == this.slot ? this.attributeModifiers : super.getAttributeModifiers(slot);
    }

    @Override
    public Rarity getRarity(ItemStack itemStack){
        return set.getRarity();
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient) {
            if (entity instanceof PlayerEntity playerEntity) {
                if (hasFullSetOfArmorOn(playerEntity)) {
                    checkArmorEffects(playerEntity);
                }
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }

    private void checkArmorEffects(PlayerEntity playerEntity) {
        for (Map.Entry<ArmorSets, StatusEffectInstance> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
            ArmorSets mapArmorSets = entry.getKey();
            StatusEffectInstance mapStatusEffect = entry.getValue();

            if (hasCorrectArmorOn(mapArmorSets, playerEntity)) {
                addStatusEffectForArmorSet(playerEntity, mapArmorSets, mapStatusEffect);
            }
        }
    }

    private void addStatusEffectForArmorSet(PlayerEntity playerEntity, ArmorSets mapArmorSets, StatusEffectInstance mapStatusEffect) {
        boolean hasPlayerEffect = playerEntity.hasStatusEffect(mapStatusEffect.getEffectType());

        if (hasCorrectArmorOn(mapArmorSets, playerEntity) && !hasPlayerEffect) {
            playerEntity.addStatusEffect(new StatusEffectInstance(mapStatusEffect.getEffectType(),
                    mapStatusEffect.getDuration(), mapStatusEffect.getAmplifier(), true, false));
        }
    }

    private boolean hasFullSetOfArmorOn(PlayerEntity playerEntity) {
        ItemStack bootsStack = playerEntity.getInventory().getArmorStack(0);
        ItemStack leggingsStack = playerEntity.getInventory().getArmorStack(1);
        ItemStack chestplateStack = playerEntity.getInventory().getArmorStack(2);
        ItemStack helmetStack = playerEntity.getInventory().getArmorStack(3);

        return !helmetStack.isEmpty() && !chestplateStack.isEmpty() && !leggingsStack.isEmpty() && !bootsStack.isEmpty();
    }

    private boolean hasCorrectArmorOn(ArmorSets armorSet, PlayerEntity playerEntity) {
        if (!(playerEntity.getEquippedStack(EquipmentSlot.HEAD).isOf(BlocksInit.CARVED_WHITE_PUMPKIN_BLOCK.get().asItem()))) {
            if(playerEntity.getInventory().getArmorStack(0).getItem() instanceof ArmorSetItem bootsStack) {
                if (playerEntity.getInventory().getArmorStack(1).getItem() instanceof ArmorSetItem leggingsStack) {
                    if (playerEntity.getInventory().getArmorStack(2).getItem() instanceof ArmorSetItem chestplateStack) {
                        if (playerEntity.getInventory().getArmorStack(3).getItem() instanceof ArmorSetItem helmetStack) {
                            return helmetStack.getMaterial() == armorSet && chestplateStack.getMaterial() == armorSet
                                    && leggingsStack.getMaterial() == armorSet && bootsStack.getMaterial() == armorSet;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        super.appendTooltip(itemStack, world, tooltip, tooltipContext);

        String setId = set.getSetName();

        String translationKey = String.format("item.mcsa.%s.tooltip_", setId);
        int i = 1;

        while (I18n.hasTranslation(translationKey + i)) {
            tooltip.add(Text.translatable(translationKey + i).formatted(Formatting.ITALIC));
            i++;
        }

        if (McsaConfig.config.enableArmorSetBonusTooltips) {
            translationKey = String.format("item.mcsa.%s.effect.tooltip_", setId);
            i = 1;

            while (I18n.hasTranslation(translationKey + i)) {
                tooltip.add(Text.translatable(translationKey + i).formatted(
                        switch (set) {
                            case GOLDEN_GOLIATH -> Formatting.GOLD;
                            case REDSTONE_RIOT -> Formatting.RED;
                            case ENDER_DEFENDER -> Formatting.AQUA;
                            case SWORDBREAKER, STAR_SHIELD -> Formatting.BLUE;
                            case SHIELD_OF_INFINITY -> Formatting.LIGHT_PURPLE;
                            case DRAGONSBANE -> Formatting.DARK_PURPLE;
                            case ADAMANTIUM -> Formatting.YELLOW;
                            default -> Formatting.GRAY;
                        }));
                i++;
            }
        }
    }

}

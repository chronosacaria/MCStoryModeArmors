package timefall.mcsa.items.armor;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Lazy;
import net.minecraft.util.Rarity;
import timefall.mcsa.configs.McsaConfig;

import java.util.function.Supplier;

import static net.minecraft.sound.SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;

public enum ArmorSets implements ArmorMaterial {
    ADAMANTIUM("adamantium", "adamantium_impervium",
            40,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> Ingredient.ofItems(Items.DIAMOND)),

    CHAMPION_PETRA("championpetra", "champion_petra",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> Ingredient.ofItems(Items.DIAMOND)),

    DRAGONSBANE("dragonsbane", "dragonsbane",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> Ingredient.ofItems(Items.DIAMOND)),

    ELLEGAARD("ellegaard", "ellegaard",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> Ingredient.ofItems(Items.DIAMOND)),

    ENDER_DEFENDER("ender", "ender_defender",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> Ingredient.ofItems(Items.DIAMOND)),

    ENDERMAN_SOREN("enderman", "enderman_soren",
            35,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> Ingredient.ofItems(Items.DIAMOND)),

    GABRIEL("gabriel", "gabriel",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> Ingredient.ofItems(Items.DIAMOND)),

    GOLDEN_GOLIATH("golden", "golden_goliath",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> Ingredient.ofItems(Items.DIAMOND)),

    GOLDEN_GOLIATH_CIRCUITRY("goldenu", "golden_goliath_circuitry",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> Ingredient.ofItems(Items.DIAMOND)),

    HARPERS_HEADSET("harper", "harpers_headset",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> Ingredient.ofItems(Items.DIAMOND)),

    IVOR("ivor", "ivor",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> Ingredient.ofItems(Items.DIAMOND)),

    LUKAS("lukas", "lukas",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> Ingredient.ofItems(Items.DIAMOND)),

    MAGNUS("magnus", "magnus",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> Ingredient.ofItems(Items.DIAMOND)),

    NINJA_IVOR_ARMOR("ninja", "ninja_ivor",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> Ingredient.ofItems(Items.DIAMOND)),

    OLIVIA("olivia", "olivia",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> Ingredient.ofItems(Items.DIAMOND)),

    PETRA("petra", "petra",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> Ingredient.ofItems(Items.DIAMOND)),

    PRISMARINE("prismarine", "prismarine_soldier",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> Ingredient.ofItems(Items.PRISMARINE_BRICKS)),

    REDSTONE_RIOT("riot", "redstone_riot",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> Ingredient.ofItems(Items.DIAMOND)),

    SHIELD_OF_INFINITY("infinity", "shield_of_infinity",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> Ingredient.ofItems(Items.DIAMOND)),

    SOREN("soren", "soren",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> Ingredient.ofItems(Items.DIAMOND)),

    STAR_SHIELD("star", "star_shield",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> Ingredient.ofItems(Items.DIAMOND)),

    SWORDBREAKER("swordbreaker", "swordbreaker",
            37,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> Ingredient.ofItems(Items.DIAMOND)),

    TIMS_ARMOR("tim", "tim",
            25,
            25,
            ITEM_ARMOR_EQUIP_DIAMOND,
            () -> Ingredient.ofItems(Items.DIAMOND));


    private static final int[] baseDurability = new int[]{12,14,15,10};
    private final String textureName;
    private final String setName;
    private final int durabilityMultiplier;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final Lazy<Ingredient> repairIngredient;

    ArmorSets(String textureName, String setName, int durabilityMultiplier, int enchantability,
              SoundEvent soundEvent, Supplier<Ingredient> repairIngredient){
        this.textureName = textureName;
        this.setName = setName;
        this.durabilityMultiplier = durabilityMultiplier;
        this.enchantability = enchantability;
        this.equipSound = soundEvent;
        this.repairIngredient = new Lazy<>(repairIngredient);
    }

    public String getSetName(){
        return setName;
    }

    public Rarity getRarity(){
        switch (this) {
            case ADAMANTIUM:
            case CHAMPION_PETRA:
            case DRAGONSBANE:
            case ELLEGAARD:
            case ENDER_DEFENDER:
            case ENDERMAN_SOREN:
            case GABRIEL:
            case GOLDEN_GOLIATH:
            case GOLDEN_GOLIATH_CIRCUITRY:
            case HARPERS_HEADSET:
            case IVOR:
            case LUKAS:
            case MAGNUS:
            case NINJA_IVOR_ARMOR:
            case OLIVIA:
            case PETRA:
            case PRISMARINE:
            case REDSTONE_RIOT:
            case SHIELD_OF_INFINITY:
            case SOREN:
            case STAR_SHIELD:
            case SWORDBREAKER:
            case TIMS_ARMOR:
                return Rarity.RARE;
            default:
                return Rarity.UNCOMMON;
        }
    }

    @Override
    public int getDurability(EquipmentSlot slot){
        return baseDurability[slot.getEntitySlotId()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return McsaConfig.config.armorStats.get(this).protection.get(slot);
    }

    @Override
    public int getEnchantability(){
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound(){
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient(){
        return this.repairIngredient.get();
    }

    @Environment(EnvType.CLIENT)
    @Override
    public String getName(){
        return this.textureName;
    }

    @Override
    public float getToughness(){
        return McsaConfig.config.armorStats.get(this).toughness;
    }

    @Override
    public float getKnockbackResistance(){
        return McsaConfig.config.armorStats.get(this).knockbackRes;
    }
}

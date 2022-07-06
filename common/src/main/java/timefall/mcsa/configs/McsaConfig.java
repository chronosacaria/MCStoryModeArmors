package timefall.mcsa.configs;


import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;
import net.minecraft.entity.EquipmentSlot;
import timefall.mcsa.Mcsa;
import timefall.mcsa.items.armor.ArmorSets;

import java.util.EnumMap;
import java.util.EnumSet;

@Config(name = Mcsa.MOD_ID)
public class McsaConfig implements ConfigData {
    public static final McsaConfig config;

    static {
        AutoConfig.register(McsaConfig.class, JanksonConfigSerializer::new);
        config = AutoConfig.getConfigHolder(McsaConfig.class).getConfig();
    }

    // config contents:
    public EnumMap<ArmorSets, ArmorStats> armorStats = new EnumMap<>(ArmorSets.class);

    @Comment("Character Armour Spawn Rate (Percentage where 1.0 = 100%)")
    public float characterArmourSpawnRate = 0.15F;

    public float getCharacterArmourSpawnRate(){
        return characterArmourSpawnRate;
    }

    @Comment("Stronghold Armour Spawn Rate (Percentage where 1.0 = 100%)")
    public float strongholdArmourSpawnRate = 0.1F;

    public float getStrongholdArmourSpawnRate(){
        return strongholdArmourSpawnRate;
    }

    @Comment("Temple Armour Spawn Rate (Percentage where 1.0 = 100%)")
    public float templeArmourSpawnRate = 0.1F;

    public float getTempleArmourSpawnRate(){
        return templeArmourSpawnRate;
    }

    @Comment("Armourer Hero of the Village Gift Rate (Percentage where 1.0 = 100%)")
    public float hovArmourSpawnRate = 0.15F;

    public float getHovArmourSpawnRate(){
        return hovArmourSpawnRate;
    }

    @Comment("Enable Villager Armour Trades")
    public boolean enableVillagerArmourTrades = false;

    // convenience methods:
    protected ArmorStats setProtection(int head, int chest, int legs, int feet, ArmorSets set) {
        return armorStats.get(set).setProtection(head, chest, legs, feet);
    }

    // set config defaults
    public McsaConfig() {
        for (ArmorSets armorSet : ArmorSets.values()) {
            armorStats.put(armorSet, new ArmorStats());
        }

        for (ArmorSets armorSet : ArmorSets.values()) {
            ArmorStats stats = new ArmorStats();
            stats.protection = new EnumMap<>(EquipmentSlot.class);
            for (EquipmentSlot slot : EnumSet.of(EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET)) {
                stats.protection.put(slot, 0);
            }

            this.armorStats.put(armorSet, stats);
        }

        setProtection(4, 9, 7, 4, ArmorSets.ADAMANTIUM).setToughness(3.0F).setKnockbackRes(0.3F);
        setProtection(4, 9, 7, 4, ArmorSets.CHAMPION_PETRA).setToughness(2.0F).setKnockbackRes(0.2F);
        setProtection(4, 9, 7, 4, ArmorSets.DRAGONSBANE).setToughness(2.0F).setKnockbackRes(0.5F);
        setProtection(3, 8, 6, 3, ArmorSets.ELLEGAARD).setToughness(2.0F);
        setProtection(4, 9, 7, 4, ArmorSets.ENDER_DEFENDER).setToughness(2.0F);
        setProtection(3, 8, 6, 3, ArmorSets.ENDERMAN_SOREN);
        setProtection(3, 8, 6, 3, ArmorSets.GABRIEL).setToughness(2.0F);
        setProtection(4, 9, 7, 4, ArmorSets.GOLDEN_GOLIATH).setToughness(2.0F);
        setProtection(4, 9, 7, 4, ArmorSets.GOLDEN_GOLIATH_CIRCUITRY).setToughness(2.0F);
        setProtection(4, 9, 7, 4, ArmorSets.HARPERS_HEADSET).setToughness(2.0F);
        setProtection(3, 8, 6, 3, ArmorSets.IVOR).setToughness(2.0F);
        setProtection(3, 8, 6, 3, ArmorSets.LUKAS).setToughness(2.0F);
        setProtection(3, 8, 6, 3, ArmorSets.MAGNUS).setToughness(2.0F);
        setProtection(3, 8, 6, 3, ArmorSets.NINJA_IVOR_ARMOUR).setToughness(1.0F);
        setProtection(3, 8, 6, 3, ArmorSets.OLIVIA).setToughness(2.0F);
        setProtection(3, 8, 6, 3, ArmorSets.PETRA).setToughness(2.0F);
        setProtection(3, 8, 6, 3, ArmorSets.PRISMARINE).setToughness(2.0F);
        setProtection(4, 9, 7, 4, ArmorSets.REDSTONE_RIOT).setToughness(3.0F).setKnockbackRes(0.2F);
        setProtection(4, 9, 7, 4, ArmorSets.SHIELD_OF_INFINITY).setToughness(3.0F).setKnockbackRes(0.2F);
        setProtection(3, 8, 6, 3, ArmorSets.SOREN).setToughness(2.0F);
        setProtection(4, 9, 7, 4, ArmorSets.STAR_SHIELD).setToughness(3.0F).setKnockbackRes(0.2F);
        setProtection(4, 9, 7, 4, ArmorSets.SWORDBREAKER).setToughness(2.0F).setKnockbackRes(0.5F);
        setProtection(3, 8, 6, 3, ArmorSets.TIMS_ARMOUR).setToughness(2.0F);
        //setProtection(1, 1, 1, 1, WHITE_PUMPKIN);
        }

    }

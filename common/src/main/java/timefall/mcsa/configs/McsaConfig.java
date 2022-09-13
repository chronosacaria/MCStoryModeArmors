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
import java.util.HashMap;

@Config(name = Mcsa.MOD_ID)
public class McsaConfig implements ConfigData {
    public static final McsaConfig config;

    static {
        AutoConfig.register(McsaConfig.class, JanksonConfigSerializer::new);
        config = AutoConfig.getConfigHolder(McsaConfig.class).getConfig();
    }

    // config contents:
    public EnumMap<ArmorSets, ArmorStats> armorStats = new EnumMap<>(ArmorSets.class);

    @Comment("Character Armor Spawn Rate")
    public int characterArmorSpawnRate = 15;

    public int getCharacterArmorSpawnRate(){
        return characterArmorSpawnRate;
    }

    @Comment("Stronghold Armor Spawn Rate")
    public int strongholdArmorSpawnRate = 10;

    public int getStrongholdArmorSpawnRate(){
        return strongholdArmorSpawnRate;
    }

    @Comment("Temple Armor Spawn Rate")
    public int templeArmorSpawnRate = 10;

    public int getTempleArmorSpawnRate(){
        return templeArmorSpawnRate;
    }

    @Comment("Armorer Hero of the Village Gift Rate")
    public int hovArmorSpawnRate = 15;

    public int getHovArmorSpawnRate(){
        return hovArmorSpawnRate;
    }

    @Comment("Enable Villager Armor Trades")
    public boolean enableVillagerArmorTrades = false;

    @Comment("Enable Armor Set Bonus Tooltips")
    public boolean enableArmorSetBonusTooltips = true;

    // convenience methods:
    protected ArmorStats setProtection(int head, int chest, int legs, int feet, ArmorSets set) {
        return armorStats.get(set).setProtection(head, chest, legs, feet);
    }

    public final HashMap<ArmorSets, Boolean> ARMOR_SETS_ENABLED = new HashMap<>();

    // set config defaults
    public McsaConfig() {
        for (ArmorSets armorSet : ArmorSets.values()) {
            ARMOR_SETS_ENABLED.put(armorSet, true);
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
        setProtection(3, 8, 6, 3, ArmorSets.NINJA_IVOR_ARMOR).setToughness(1.0F);
        setProtection(3, 8, 6, 3, ArmorSets.OLIVIA).setToughness(2.0F);
        setProtection(3, 8, 6, 3, ArmorSets.PETRA).setToughness(2.0F);
        setProtection(3, 8, 6, 3, ArmorSets.PRISMARINE).setToughness(2.0F);
        setProtection(4, 9, 7, 4, ArmorSets.REDSTONE_RIOT).setToughness(3.0F).setKnockbackRes(0.2F);
        setProtection(4, 9, 7, 4, ArmorSets.SHIELD_OF_INFINITY).setToughness(3.0F).setKnockbackRes(0.2F);
        setProtection(3, 8, 6, 3, ArmorSets.SOREN).setToughness(2.0F);
        setProtection(4, 9, 7, 4, ArmorSets.STAR_SHIELD).setToughness(3.0F).setKnockbackRes(0.2F);
        setProtection(4, 9, 7, 4, ArmorSets.SWORDBREAKER).setToughness(2.0F).setKnockbackRes(0.5F);
        setProtection(3, 8, 6, 3, ArmorSets.TIMS_ARMOR).setToughness(2.0F);
        }
    }

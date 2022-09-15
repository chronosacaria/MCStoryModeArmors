package timefall.mcsa.init;

import dev.architectury.event.events.common.LootEvent;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;
import timefall.mcsa.collections.ArmorCollection;
import timefall.mcsa.collections.ArmorCollectionHelmetOnly;
import timefall.mcsa.configs.McsaConfig;
import timefall.mcsa.items.armor.ArmorSetItem;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

public class LootInit {

    public static final Collection<Identifier> VILLAGER_ARMORER_LOOT_TABLE = Collections.singletonList(
            LootTables.VILLAGE_ARMORER_CHEST);

    public static final Collection<Identifier> STRONGHOLD_LOOT_TABLES = Set.of(LootTables.STRONGHOLD_CORRIDOR_CHEST,
            LootTables.STRONGHOLD_CROSSING_CHEST, LootTables.STRONGHOLD_LIBRARY_CHEST);

    public static final Collection<Identifier> TEMPLE_LOOT_TABLES = Set.of(LootTables.JUNGLE_TEMPLE_CHEST,
            LootTables.DESERT_PYRAMID_CHEST);

    public static final Collection<Identifier> ARMORER_GIFT_LOOT_TABLE = Collections.singletonList(
            LootTables.HERO_OF_THE_VILLAGE_ARMORER_GIFT_GAMEPLAY);

    public static void init() {
        LootEvent.MODIFY_LOOT_TABLE.register((lootTables, id, context, builtin) -> {
        LootPool.Builder builder = LootPool.builder();

        builder.rolls(ConstantLootNumberProvider.create(1));
        builder.conditionally(RandomChanceLootCondition.builder(0.10f));

            if (VILLAGER_ARMORER_LOOT_TABLE.contains(id)) {
                addArmorSet(builder, ArmorsInit.ELLEGAARD_ARMOR, McsaConfig.config.getCharacterArmorSpawnRate());
                addArmorSet(builder, ArmorsInit.GABRIEL_ARMOR, McsaConfig.config.getCharacterArmorSpawnRate());
                addArmorSet(builder, ArmorsInit.IVOR_ARMOR, McsaConfig.config.getCharacterArmorSpawnRate());
                addArmorSet(builder, ArmorsInit.LUKAS_ARMOR, McsaConfig.config.getCharacterArmorSpawnRate());
                addArmorSet(builder, ArmorsInit.MAGNUS_ARMOR, McsaConfig.config.getCharacterArmorSpawnRate());
                addArmorSet(builder, ArmorsInit.OLIVIA_ARMOR, McsaConfig.config.getCharacterArmorSpawnRate());
                addArmorSet(builder, ArmorsInit.PETRA_ARMOR, McsaConfig.config.getCharacterArmorSpawnRate());
                addArmorSet(builder, ArmorsInit.SOREN_ARMOR, McsaConfig.config.getCharacterArmorSpawnRate());
                addArmorSet(builder, ArmorsInit.HARPERS_HEADSET, McsaConfig.config.getCharacterArmorSpawnRate());
                addArmorSet(builder, ArmorsInit.TIM_ARMOR, McsaConfig.config.getCharacterArmorSpawnRate());
            } else if (STRONGHOLD_LOOT_TABLES.contains(id)) {
                addArmorSet(builder, ArmorsInit.DRAGONSBANE, McsaConfig.config.getStrongholdArmorSpawnRate());
                addArmorSet(builder, ArmorsInit.ENDER_DEFENDER, McsaConfig.config.getStrongholdArmorSpawnRate());
                addArmorSet(builder, ArmorsInit.GOLDEN_GOLIATH_ARMOR, McsaConfig.config.getStrongholdArmorSpawnRate());
                addArmorSet(builder, ArmorsInit.GOLDEN_GOLIATH_CIRCUITRY_ARMOR, McsaConfig.config.getStrongholdArmorSpawnRate());
                addArmorSet(builder, ArmorsInit.REDSTONE_RIOT, McsaConfig.config.getStrongholdArmorSpawnRate());
                addArmorSet(builder, ArmorsInit.PRISMARINE_SOLDIER_ARMOR, McsaConfig.config.getStrongholdArmorSpawnRate());
            } else if (TEMPLE_LOOT_TABLES.contains(id)) {
                addArmorSet(builder, ArmorsInit.SHIELD_OF_INFINITY, McsaConfig.config.getTempleArmorSpawnRate());
                addArmorSet(builder, ArmorsInit.STAR_SHIELD, McsaConfig.config.getTempleArmorSpawnRate());
                addArmorSet(builder, ArmorsInit.SWORDBREAKER, McsaConfig.config.getTempleArmorSpawnRate());
            } else if (ARMORER_GIFT_LOOT_TABLE.contains(id)) {
                addArmorSet(builder, ArmorsInit.ADAMANTIUM_ARMOR, McsaConfig.config.getHovArmorSpawnRate());
                addArmorSet(builder, ArmorsInit.CHAMPION_PETRA_ARMOR, McsaConfig.config.getHovArmorSpawnRate());
                addArmorSet(builder, ArmorsInit.NINJA_IVOR_ARMOR, McsaConfig.config.getHovArmorSpawnRate());
            }
            context.addPool(builder.build());
        });
    }

    public static void addArmorSet(LootPool.Builder poolBuilder, ArmorCollection<ArmorSetItem> armorCollection, int p) {
        armorCollection.getArmor().forEach(armorSetItem -> poolBuilder.with(ItemEntry.builder(armorSetItem).weight(p)));
    }

    public static void addArmorSet(LootPool.Builder poolBuilder, ArmorCollectionHelmetOnly<ArmorSetItem> armorCollection, int p) {
        armorCollection.getArmorHelmetOnly().forEach(armorSetItem -> poolBuilder.with(ItemEntry.builder(armorSetItem).weight(p)));
    }
}
package dev.timefall.mcsa.registry;

import dev.timefall.mcsa.ModConstants;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import me.fzzyhmstrs.fzzy_config.util.platform.Registrar;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;

public class ItemGroupRegistry {
    private static final Registrar<ItemGroup> ITEM_GROUP = ConfigApiJava.platform().createRegistrar(ModConstants.MOD_ID, Registries.ITEM_GROUP);

    public static void register() {
        ITEM_GROUP.init();

        ITEM_GROUP.register("story_mode_armor_lab_armor", () -> ItemGroup.create(null, -1)
                .displayName(Text.translatable("itemGroup.mcsa.story_mode_armor_lab_armor"))
                .icon(() -> new ItemStack(ItemRegistry.ADAMANTIUM_IMPERVIUM_CHESTPLATE.get()))
                .entries((displayContext, entries) -> {
                    entries.add(ItemRegistry.ADAMANTIUM_IMPERVIUM_HELMET.get());
                    entries.add(ItemRegistry.ADAMANTIUM_IMPERVIUM_CHESTPLATE.get());
                    entries.add(ItemRegistry.ADAMANTIUM_IMPERVIUM_LEGGINGS.get());
                    entries.add(ItemRegistry.ADAMANTIUM_IMPERVIUM_BOOTS.get());

                    entries.add(ItemRegistry.DRAGONSBANE_HELMET.get());
                    entries.add(ItemRegistry.DRAGONSBANE_CHESTPLATE.get());
                    entries.add(ItemRegistry.DRAGONSBANE_LEGGINGS.get());
                    entries.add(ItemRegistry.DRAGONSBANE_BOOTS.get());

                    entries.add(ItemRegistry.ENDER_DEFENDER_HELMET.get());
                    entries.add(ItemRegistry.ENDER_DEFENDER_CHESTPLATE.get());
                    entries.add(ItemRegistry.ENDER_DEFENDER_LEGGINGS.get());
                    entries.add(ItemRegistry.ENDER_DEFENDER_BOOTS.get());

                    entries.add(ItemRegistry.GOLDEN_GOLIATH_HELMET.get());
                    entries.add(ItemRegistry.GOLDEN_GOLIATH_CHESTPLATE.get());
                    entries.add(ItemRegistry.GOLDEN_GOLIATH_LEGGINGS.get());
                    entries.add(ItemRegistry.GOLDEN_GOLIATH_BOOTS.get());

                    entries.add(ItemRegistry.GOLDEN_GOLIATH_CIRCUITRY_HELMET.get());
                    entries.add(ItemRegistry.GOLDEN_GOLIATH_CIRCUITRY_CHESTPLATE.get());
                    entries.add(ItemRegistry.GOLDEN_GOLIATH_CIRCUITRY_LEGGINGS.get());
                    entries.add(ItemRegistry.GOLDEN_GOLIATH_CIRCUITRY_BOOTS.get());

                    entries.add(ItemRegistry.REDSTONE_RIOT_HELMET.get());
                    entries.add(ItemRegistry.REDSTONE_RIOT_CHESTPLATE.get());
                    entries.add(ItemRegistry.REDSTONE_RIOT_LEGGINGS.get());
                    entries.add(ItemRegistry.REDSTONE_RIOT_BOOTS.get());

                    entries.add(ItemRegistry.SHIELD_OF_INFINITY_HELMET.get());
                    entries.add(ItemRegistry.SHIELD_OF_INFINITY_CHESTPLATE.get());
                    entries.add(ItemRegistry.SHIELD_OF_INFINITY_LEGGINGS.get());
                    entries.add(ItemRegistry.SHIELD_OF_INFINITY_BOOTS.get());

                    entries.add(ItemRegistry.STAR_SHIELD_HELMET.get());
                    entries.add(ItemRegistry.STAR_SHIELD_CHESTPLATE.get());
                    entries.add(ItemRegistry.STAR_SHIELD_LEGGINGS.get());
                    entries.add(ItemRegistry.STAR_SHIELD_BOOTS.get());

                    entries.add(ItemRegistry.SWORDBREAKER_HELMET.get());
                    entries.add(ItemRegistry.SWORDBREAKER_CHESTPLATE.get());
                    entries.add(ItemRegistry.SWORDBREAKER_LEGGINGS.get());
                    entries.add(ItemRegistry.SWORDBREAKER_BOOTS.get());
                })
                .build());

        ITEM_GROUP.register("story_mode_armor_challenge_armor", () -> ItemGroup.create(null, -1)
                .displayName(Text.translatable("itemGroup.mcsa.story_mode_armor_challenge_armor"))
                .icon(() -> new ItemStack(ItemRegistry.GOLDEN_APPLE_CHESTPLATE.get()))
                .entries((displayContext, entries) -> {
                    entries.add(ItemRegistry.ARMOR_NUMBER_7_HELMET.get());
                    entries.add(ItemRegistry.ARMOR_NUMBER_7_CHESTPLATE.get());
                    entries.add(ItemRegistry.ARMOR_NUMBER_7_LEGGINGS.get());
                    entries.add(ItemRegistry.ARMOR_NUMBER_7_BOOTS.get());

                    entries.add(ItemRegistry.DENTED_DANGER_HELMET.get());
                    entries.add(ItemRegistry.DENTED_DANGER_CHESTPLATE.get());
                    entries.add(ItemRegistry.DENTED_DANGER_LEGGINGS.get());
                    entries.add(ItemRegistry.DENTED_DANGER_BOOTS.get());

                    entries.add(ItemRegistry.FEELIN_CUTE_HELMET.get());
                    entries.add(ItemRegistry.FEELIN_CUTE_CHESTPLATE.get());
                    entries.add(ItemRegistry.FEELIN_CUTE_LEGGINGS.get());
                    entries.add(ItemRegistry.FEELIN_CUTE_BOOTS.get());

                    entries.add(ItemRegistry.GOLDEN_APPLE_HELMET.get());
                    entries.add(ItemRegistry.GOLDEN_APPLE_CHESTPLATE.get());
                    entries.add(ItemRegistry.GOLDEN_APPLE_LEGGINGS.get());
                    entries.add(ItemRegistry.GOLDEN_APPLE_BOOTS.get());

                    entries.add(ItemRegistry.GOOFBALL_GLORY_HELMET.get());
                    entries.add(ItemRegistry.GOOFBALL_GLORY_CHESTPLATE.get());
                    entries.add(ItemRegistry.GOOFBALL_GLORY_LEGGINGS.get());
                    entries.add(ItemRegistry.GOOFBALL_GLORY_BOOTS.get());

                    entries.add(ItemRegistry.LLAMA_BROWNISH_HELMET.get());
                    entries.add(ItemRegistry.LLAMA_BROWNISH_CHESTPLATE.get());
                    entries.add(ItemRegistry.LLAMA_BROWNISH_LEGGINGS.get());
                    entries.add(ItemRegistry.LLAMA_BROWNISH_BOOTS.get());

                    entries.add(ItemRegistry.PLEASE_DONT_HIT_ME_HELMET.get());
                    entries.add(ItemRegistry.PLEASE_DONT_HIT_ME_CHESTPLATE.get());
                    entries.add(ItemRegistry.PLEASE_DONT_HIT_ME_LEGGINGS.get());
                    entries.add(ItemRegistry.PLEASE_DONT_HIT_ME_BOOTS.get());

                    entries.add(ItemRegistry.STRAPS_N_STRAPS_HELMET.get());
                    entries.add(ItemRegistry.STRAPS_N_STRAPS_CHESTPLATE.get());
                    entries.add(ItemRegistry.STRAPS_N_STRAPS_LEGGINGS.get());
                    entries.add(ItemRegistry.STRAPS_N_STRAPS_BOOTS.get());

                    entries.add(ItemRegistry.TOOTH_CHIPPER_HELMET.get());
                    entries.add(ItemRegistry.TOOTH_CHIPPER_CHESTPLATE.get());
                    entries.add(ItemRegistry.TOOTH_CHIPPER_LEGGINGS.get());
                    entries.add(ItemRegistry.TOOTH_CHIPPER_BOOTS.get());
                })
                .build());

        ITEM_GROUP.register("story_mode_armor_champion_armor", () -> ItemGroup.create(null, -1)
                .displayName(Text.translatable("itemGroup.mcsa.story_mode_armor_champion_armor"))
                .icon(() -> new ItemStack(ItemRegistry.CHAMPION_PETRA_CHESTPLATE.get()))
                .entries((displayContext, entries) -> {

                    entries.add(ItemRegistry.ADMIN_FRED_HELMET.get());
                    entries.add(ItemRegistry.ADMIN_FRED_CHESTPLATE.get());
                    entries.add(ItemRegistry.ADMIN_FRED_LEGGINGS.get());
                    entries.add(ItemRegistry.ADMIN_FRED_BOOTS.get());

                    entries.add(ItemRegistry.ADMIN_ROMEO_HELMET.get());
                    entries.add(ItemRegistry.ADMIN_ROMEO_CHESTPLATE.get());
                    entries.add(ItemRegistry.ADMIN_ROMEO_LEGGINGS.get());
                    entries.add(ItemRegistry.ADMIN_ROMEO_BOOTS.get());

                    entries.add(ItemRegistry.ADMIN_XARA_HELMET.get());
                    entries.add(ItemRegistry.ADMIN_XARA_CHESTPLATE.get());
                    entries.add(ItemRegistry.ADMIN_XARA_LEGGINGS.get());
                    entries.add(ItemRegistry.ADMIN_XARA_BOOTS.get());

                    entries.add(ItemRegistry.CHAMPION_JACK_HELMET.get());
                    entries.add(ItemRegistry.CHAMPION_JACK_CHESTPLATE.get());
                    entries.add(ItemRegistry.CHAMPION_JACK_LEGGINGS.get());
                    entries.add(ItemRegistry.CHAMPION_JACK_BOOTS.get());

                    entries.add(ItemRegistry.CHAMPION_PETRA_HELMET.get());
                    entries.add(ItemRegistry.CHAMPION_PETRA_CHESTPLATE.get());
                    entries.add(ItemRegistry.CHAMPION_PETRA_LEGGINGS.get());
                    entries.add(ItemRegistry.CHAMPION_PETRA_BOOTS.get());

                    entries.add(ItemRegistry.TIM_HELMET.get());
                    entries.add(ItemRegistry.TIM_CHESTPLATE.get());
                    entries.add(ItemRegistry.TIM_LEGGINGS.get());
                    entries.add(ItemRegistry.TIM_BOOTS.get());
                })
                .build());

        ITEM_GROUP.register("story_mode_armor_order_of_the_stone_armor", () -> ItemGroup.create(null, -1)
                .displayName(Text.translatable("itemGroup.mcsa.story_mode_armor_order_of_the_stone_armor"))
                .icon(() -> new ItemStack(ItemRegistry.LUKAS_CHESTPLATE.get()))
                .entries((displayContext, entries) -> {

                    entries.add(ItemRegistry.ELLEGAARD_HELMET.get());
                    entries.add(ItemRegistry.ELLEGAARD_CHESTPLATE.get());
                    entries.add(ItemRegistry.ELLEGAARD_LEGGINGS.get());
                    entries.add(ItemRegistry.ELLEGAARD_BOOTS.get());

                    entries.add(ItemRegistry.GABRIEL_HELMET.get());
                    entries.add(ItemRegistry.GABRIEL_CHESTPLATE.get());
                    entries.add(ItemRegistry.GABRIEL_LEGGINGS.get());
                    entries.add(ItemRegistry.GABRIEL_BOOTS.get());

                    entries.add(ItemRegistry.IVOR_HELMET.get());
                    entries.add(ItemRegistry.IVOR_CHESTPLATE.get());
                    entries.add(ItemRegistry.IVOR_LEGGINGS.get());
                    entries.add(ItemRegistry.IVOR_BOOTS.get());

                    entries.add(ItemRegistry.NINJA_HELMET.get());
                    entries.add(ItemRegistry.NINJA_CHESTPLATE.get());
                    entries.add(ItemRegistry.NINJA_LEGGINGS.get());
                    entries.add(ItemRegistry.NINJA_BOOTS.get());

                    entries.add(ItemRegistry.MAGNUS_HELMET.get());
                    entries.add(ItemRegistry.MAGNUS_CHESTPLATE.get());
                    entries.add(ItemRegistry.MAGNUS_LEGGINGS.get());
                    entries.add(ItemRegistry.MAGNUS_BOOTS.get());

                    entries.add(ItemRegistry.SOREN_HELMET.get());
                    entries.add(ItemRegistry.SOREN_CHESTPLATE.get());
                    entries.add(ItemRegistry.SOREN_LEGGINGS.get());
                    entries.add(ItemRegistry.SOREN_BOOTS.get());

                    entries.add(ItemRegistry.ENDERMAN_HELMET.get());
                    entries.add(ItemRegistry.ENDERMAN_CHESTPLATE.get());
                    entries.add(ItemRegistry.ENDERMAN_LEGGINGS.get());
                    entries.add(ItemRegistry.ENDERMAN_BOOTS.get());

                    entries.add(ItemRegistry.AXEL_HELMET.get());
                    entries.add(ItemRegistry.AXEL_CHESTPLATE.get());
                    entries.add(ItemRegistry.AXEL_LEGGINGS.get());
                    entries.add(ItemRegistry.AXEL_BOOTS.get());

                    entries.add(ItemRegistry.LUKAS_HELMET.get());
                    entries.add(ItemRegistry.LUKAS_CHESTPLATE.get());
                    entries.add(ItemRegistry.LUKAS_LEGGINGS.get());
                    entries.add(ItemRegistry.LUKAS_BOOTS.get());

                    entries.add(ItemRegistry.OLIVIA_HELMET.get());
                    entries.add(ItemRegistry.OLIVIA_CHESTPLATE.get());
                    entries.add(ItemRegistry.OLIVIA_LEGGINGS.get());
                    entries.add(ItemRegistry.OLIVIA_BOOTS.get());

                    entries.add(ItemRegistry.PETRA_HELMET.get());
                    entries.add(ItemRegistry.PETRA_CHESTPLATE.get());
                    entries.add(ItemRegistry.PETRA_LEGGINGS.get());
                    entries.add(ItemRegistry.PETRA_BOOTS.get());
                })
                .build());

        ITEM_GROUP.register("story_mode_armor_faction_armor", () -> ItemGroup.create(null, -1)
                .displayName(Text.translatable("itemGroup.mcsa.story_mode_armor_order_of_the_stone_armor"))
                .icon(() -> new ItemStack(ItemRegistry.LUKAS_CHESTPLATE.get()))
                .entries((displayContext, entries) -> {

                    // Blaze Rods
                    entries.add(ItemRegistry.AIDEN_HELMET.get());
                    entries.add(ItemRegistry.AIDEN_CHESTPLATE.get());
                    entries.add(ItemRegistry.AIDEN_LEGGINGS.get());
                    entries.add(ItemRegistry.AIDEN_BOOTS.get());

                    entries.add(ItemRegistry.GILL_HELMET.get());
                    entries.add(ItemRegistry.GILL_CHESTPLATE.get());
                    entries.add(ItemRegistry.GILL_LEGGINGS.get());
                    entries.add(ItemRegistry.GILL_BOOTS.get());

                    entries.add(ItemRegistry.MAYA_HELMET.get());
                    entries.add(ItemRegistry.MAYA_CHESTPLATE.get());
                    entries.add(ItemRegistry.MAYA_LEGGINGS.get());
                    entries.add(ItemRegistry.MAYA_BOOTS.get());

                    // Fireworks Union
                    entries.add(ItemRegistry.FIREWORKS_UNION_HELMET.get());
                    entries.add(ItemRegistry.FIREWORKS_UNION_CHESTPLATE.get());
                    entries.add(ItemRegistry.FIREWORKS_UNION_LEGGINGS.get());
                    entries.add(ItemRegistry.FIREWORKS_UNION_BOOTS.get());

                    // Gladiators
                    entries.add(ItemRegistry.GLADIATOR_CAPITAL_T_HELMET.get());
                    entries.add(ItemRegistry.GLADIATOR_CAPITAL_T_CHESTPLATE.get());
                    entries.add(ItemRegistry.GLADIATOR_CAPITAL_T_LEGGINGS.get());
                    entries.add(ItemRegistry.GLADIATOR_CAPITAL_T_BOOTS.get());

                    entries.add(ItemRegistry.GLADIATOR_CLUTCH_HELMET.get());
                    entries.add(ItemRegistry.GLADIATOR_CLUTCH_CHESTPLATE.get());
                    entries.add(ItemRegistry.GLADIATOR_CLUTCH_LEGGINGS.get());
                    entries.add(ItemRegistry.GLADIATOR_CLUTCH_BOOTS.get());

                    entries.add(ItemRegistry.GLADIATOR_FACEMEAT_HELMET.get());
                    entries.add(ItemRegistry.GLADIATOR_FACEMEAT_CHESTPLATE.get());
                    entries.add(ItemRegistry.GLADIATOR_FACEMEAT_LEGGINGS.get());
                    entries.add(ItemRegistry.GLADIATOR_FACEMEAT_BOOTS.get());

                    entries.add(ItemRegistry.GLADIATOR_HEADPUNCH_HELMET.get());
                    entries.add(ItemRegistry.GLADIATOR_HEADPUNCH_CHESTPLATE.get());
                    entries.add(ItemRegistry.GLADIATOR_HEADPUNCH_LEGGINGS.get());
                    entries.add(ItemRegistry.GLADIATOR_HEADPUNCH_BOOTS.get());

                    entries.add(ItemRegistry.GLADIATOR_MEATFACE_HELMET.get());
                    entries.add(ItemRegistry.GLADIATOR_MEATFACE_CHESTPLATE.get());
                    entries.add(ItemRegistry.GLADIATOR_MEATFACE_LEGGINGS.get());
                    entries.add(ItemRegistry.GLADIATOR_MEATFACE_BOOTS.get());

                    entries.add(ItemRegistry.GLADIATOR_SHINSTOMPER_HELMET.get());
                    entries.add(ItemRegistry.GLADIATOR_SHINSTOMPER_CHESTPLATE.get());
                    entries.add(ItemRegistry.GLADIATOR_SHINSTOMPER_LEGGINGS.get());
                    entries.add(ItemRegistry.GLADIATOR_SHINSTOMPER_BOOTS.get());

                    entries.add(ItemRegistry.GLADIATOR_SLAB_HELMET.get());
                    entries.add(ItemRegistry.GLADIATOR_SLAB_CHESTPLATE.get());
                    entries.add(ItemRegistry.GLADIATOR_SLAB_LEGGINGS.get());
                    entries.add(ItemRegistry.GLADIATOR_SLAB_BOOTS.get());

                    // The Institute
                    entries.add(ItemRegistry.INSTITUTE_ASSOCIATE_HELMET.get());
                    entries.add(ItemRegistry.INSTITUTE_ASSOCIATE_CHESTPLATE.get());
                    entries.add(ItemRegistry.INSTITUTE_ASSOCIATE_LEGGINGS.get());
                    entries.add(ItemRegistry.INSTITUTE_ASSOCIATE_BOOTS.get());

                    entries.add(ItemRegistry.INSTITUTE_GUARD_HELMET.get());
                    entries.add(ItemRegistry.INSTITUTE_GUARD_CHESTPLATE.get());
                    entries.add(ItemRegistry.INSTITUTE_GUARD_LEGGINGS.get());
                    entries.add(ItemRegistry.INSTITUTE_GUARD_BOOTS.get());

                    entries.add(ItemRegistry.INSTITUTE_PRISONER_HELMET.get());
                    entries.add(ItemRegistry.INSTITUTE_PRISONER_CHESTPLATE.get());
                    entries.add(ItemRegistry.INSTITUTE_PRISONER_LEGGINGS.get());
                    entries.add(ItemRegistry.INSTITUTE_PRISONER_BOOTS.get());

                    entries.add(ItemRegistry.INSTITUTE_WARDEN_HELMET.get());
                    entries.add(ItemRegistry.INSTITUTE_WARDEN_CHESTPLATE.get());
                    entries.add(ItemRegistry.INSTITUTE_WARDEN_LEGGINGS.get());
                    entries.add(ItemRegistry.INSTITUTE_WARDEN_BOOTS.get());

                    // Jack's Group
                    entries.add(ItemRegistry.JACK_HELMET.get());
                    entries.add(ItemRegistry.JACK_CHESTPLATE.get());
                    entries.add(ItemRegistry.JACK_LEGGINGS.get());
                    entries.add(ItemRegistry.JACK_BOOTS.get());

                    entries.add(ItemRegistry.NURM_HELMET.get());
                    entries.add(ItemRegistry.NURM_CHESTPLATE.get());
                    entries.add(ItemRegistry.NURM_LEGGINGS.get());
                    entries.add(ItemRegistry.NURM_BOOTS.get());

                    entries.add(ItemRegistry.VOS_HELMET.get());
                    entries.add(ItemRegistry.VOS_CHESTPLATE.get());
                    entries.add(ItemRegistry.VOS_LEGGINGS.get());
                    entries.add(ItemRegistry.VOS_BOOTS.get());

                    // Old Builders
                    entries.add(ItemRegistry.HARPER_HELMET.get());
                    entries.add(ItemRegistry.HARPER_CHESTPLATE.get());
                    entries.add(ItemRegistry.HARPER_LEGGINGS.get());
                    entries.add(ItemRegistry.HARPER_BOOTS.get());

                    entries.add(ItemRegistry.TRANSMIGRATIONAL_HEADSET.get());

                    // Prismarine Foes
                    entries.add(ItemRegistry.PRISMARINE_SOLDIER_HELMET.get());
                    entries.add(ItemRegistry.PRISMARINE_SOLDIER_CHESTPLATE.get());
                    entries.add(ItemRegistry.PRISMARINE_SOLDIER_LEGGINGS.get());
                    entries.add(ItemRegistry.PRISMARINE_SOLDIER_BOOTS.get());

                    // Sky City
                    entries.add(ItemRegistry.FOUNDER_HELMET.get());
                    entries.add(ItemRegistry.FOUNDER_CHESTPLATE.get());
                    entries.add(ItemRegistry.FOUNDER_LEGGINGS.get());
                    entries.add(ItemRegistry.FOUNDER_BOOTS.get());

                    entries.add(ItemRegistry.REGINALD_HELMET.get());
                    entries.add(ItemRegistry.REGINALD_CHESTPLATE.get());
                    entries.add(ItemRegistry.REGINALD_LEGGINGS.get());
                    entries.add(ItemRegistry.REGINALD_BOOTS.get());

                    entries.add(ItemRegistry.SKY_CITY_GUARD_HELMET.get());
                    entries.add(ItemRegistry.SKY_CITY_GUARD_CHESTPLATE.get());
                    entries.add(ItemRegistry.SKY_CITY_GUARD_LEGGINGS.get());
                    entries.add(ItemRegistry.SKY_CITY_GUARD_BOOTS.get());

                    // White Pumpkin
                    entries.add(ItemRegistry.WHITE_PUMPKIN_HELMET.get());
                    entries.add(ItemRegistry.WHITE_PUMPKIN_CHESTPLATE.get());
                    entries.add(ItemRegistry.WHITE_PUMPKIN_LEGGINGS.get());
                    entries.add(ItemRegistry.WHITE_PUMPKIN_BOOTS.get());
                })
                .build());
    }
}

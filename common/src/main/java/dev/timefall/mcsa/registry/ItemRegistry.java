package dev.timefall.mcsa.registry;

import dev.timefall.mcsa.ModConstants;
import dev.timefall.mcsa.item.McsaArmorItem;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import me.fzzyhmstrs.fzzy_config.util.platform.Registrar;
import me.fzzyhmstrs.fzzy_config.util.platform.RegistrySupplier;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;

public class ItemRegistry {
    private static final Registrar<Item> ITEM = ConfigApiJava.platform().createRegistrar(ModConstants.MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> ADAMANTIUM_IMPERVIUM_HELMET          = registerArmorItem("adamantium_impervium_helmet",          ArmorMaterialsRegistry.LAB,                     ArmorItem.Type.HELMET,      40);
    public static final RegistrySupplier<Item> ADAMANTIUM_IMPERVIUM_CHESTPLATE      = registerArmorItem("adamantium_impervium_chestplate",      ArmorMaterialsRegistry.LAB,                     ArmorItem.Type.CHESTPLATE,  40);
    public static final RegistrySupplier<Item> ADAMANTIUM_IMPERVIUM_LEGGINGS        = registerArmorItem("adamantium_impervium_leggings",        ArmorMaterialsRegistry.LAB,                     ArmorItem.Type.LEGGINGS,    40);
    public static final RegistrySupplier<Item> ADAMANTIUM_IMPERVIUM_BOOTS           = registerArmorItem("adamantium_impervium_boots",           ArmorMaterialsRegistry.LAB,                     ArmorItem.Type.BOOTS,       40);

    public static final RegistrySupplier<Item> ADMIN_FRED_HELMET                    = registerArmorItem("admin_fred_helmet",                    ArmorMaterialsRegistry.CHAMPION,                ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> ADMIN_FRED_CHESTPLATE                = registerArmorItem("admin_fred_chestplate",                ArmorMaterialsRegistry.CHAMPION,                ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> ADMIN_FRED_LEGGINGS                  = registerArmorItem("admin_fred_leggings",                  ArmorMaterialsRegistry.CHAMPION,                ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> ADMIN_FRED_BOOTS                     = registerArmorItem("admin_fred_boots",                     ArmorMaterialsRegistry.CHAMPION,                ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> ADMIN_ROMEO_HELMET                   = registerArmorItem("admin_romeo_helmet",                   ArmorMaterialsRegistry.CHAMPION,                ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> ADMIN_ROMEO_CHESTPLATE               = registerArmorItem("admin_romeo_chestplate",               ArmorMaterialsRegistry.CHAMPION,                ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> ADMIN_ROMEO_LEGGINGS                 = registerArmorItem("admin_romeo_leggings",                 ArmorMaterialsRegistry.CHAMPION,                ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> ADMIN_ROMEO_BOOTS                    = registerArmorItem("admin_romeo_boots",                    ArmorMaterialsRegistry.CHAMPION,                ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> ADMIN_XARA_HELMET                    = registerArmorItem("admin_xara_helmet",                    ArmorMaterialsRegistry.CHAMPION,                ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> ADMIN_XARA_CHESTPLATE                = registerArmorItem("admin_xara_chestplate",                ArmorMaterialsRegistry.CHAMPION,                ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> ADMIN_XARA_LEGGINGS                  = registerArmorItem("admin_xara_leggings",                  ArmorMaterialsRegistry.CHAMPION,                ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> ADMIN_XARA_BOOTS                     = registerArmorItem("admin_xara_boots",                     ArmorMaterialsRegistry.CHAMPION,                ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> AIDEN_HELMET                         = registerArmorItem("aiden_helmet",                         ArmorMaterials.LEATHER,                         ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> AIDEN_CHESTPLATE                     = registerArmorItem("aiden_chestplate",                     ArmorMaterials.LEATHER,                         ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> AIDEN_LEGGINGS                       = registerArmorItem("aiden_leggings",                       ArmorMaterials.LEATHER,                         ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> AIDEN_BOOTS                          = registerArmorItem("aiden_boots",                          ArmorMaterials.LEATHER,                         ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> ARMOR_NUMBER_7_HELMET                = registerArmorItem("armor_number_7_helmet",                ArmorMaterials.LEATHER,                         ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> ARMOR_NUMBER_7_CHESTPLATE            = registerArmorItem("armor_number_7_chestplate",            ArmorMaterials.LEATHER,                         ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> ARMOR_NUMBER_7_LEGGINGS              = registerArmorItem("armor_number_7_leggings",              ArmorMaterials.LEATHER,                         ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> ARMOR_NUMBER_7_BOOTS                 = registerArmorItem("armor_number_7_boots",                 ArmorMaterials.LEATHER,                         ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> AXEL_HELMET                          = registerArmorItem("axel_helmet",                          ArmorMaterialsRegistry.ORDER_OF_THE_STONE,      ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> AXEL_CHESTPLATE                      = registerArmorItem("axel_chestplate",                      ArmorMaterialsRegistry.ORDER_OF_THE_STONE,      ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> AXEL_LEGGINGS                        = registerArmorItem("axel_leggings",                        ArmorMaterialsRegistry.ORDER_OF_THE_STONE,      ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> AXEL_BOOTS                           = registerArmorItem("axel_boots",                           ArmorMaterialsRegistry.ORDER_OF_THE_STONE,      ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> CHAMPION_JACK_HELMET                 = registerArmorItem("champion_jack_helmet",                 ArmorMaterialsRegistry.CHAMPION,                ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> CHAMPION_JACK_CHESTPLATE             = registerArmorItem("champion_jack_chestplate",             ArmorMaterialsRegistry.CHAMPION,                ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> CHAMPION_JACK_LEGGINGS               = registerArmorItem("champion_jack_leggings",               ArmorMaterialsRegistry.CHAMPION,                ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> CHAMPION_JACK_BOOTS                  = registerArmorItem("champion_jack_boots",                  ArmorMaterialsRegistry.CHAMPION,                ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> CHAMPION_PETRA_HELMET                = registerArmorItem("champion_petra_helmet",                ArmorMaterialsRegistry.CHAMPION,                ArmorItem.Type.HELMET,      37);
    public static final RegistrySupplier<Item> CHAMPION_PETRA_CHESTPLATE            = registerArmorItem("champion_petra_chestplate",            ArmorMaterialsRegistry.CHAMPION,                ArmorItem.Type.CHESTPLATE,  37);
    public static final RegistrySupplier<Item> CHAMPION_PETRA_LEGGINGS              = registerArmorItem("champion_petra_leggings",              ArmorMaterialsRegistry.CHAMPION,                ArmorItem.Type.LEGGINGS,    37);
    public static final RegistrySupplier<Item> CHAMPION_PETRA_BOOTS                 = registerArmorItem("champion_petra_boots",                 ArmorMaterialsRegistry.CHAMPION,                ArmorItem.Type.BOOTS,       37);

    public static final RegistrySupplier<Item> DENTED_DANGER_HELMET                 = registerArmorItem("dented_danger_helmet",                 ArmorMaterials.LEATHER,                         ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> DENTED_DANGER_CHESTPLATE             = registerArmorItem("dented_danger_chestplate",             ArmorMaterials.LEATHER,                         ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> DENTED_DANGER_LEGGINGS               = registerArmorItem("dented_danger_leggings",               ArmorMaterials.LEATHER,                         ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> DENTED_DANGER_BOOTS                  = registerArmorItem("dented_danger_boots",                  ArmorMaterials.LEATHER,                         ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> DRAGONSBANE_HELMET                   = registerArmorItem("dragonsbane_helmet",                   ArmorMaterialsRegistry.LAB,                     ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> DRAGONSBANE_CHESTPLATE               = registerArmorItem("dragonsbane_chestplate",               ArmorMaterialsRegistry.LAB,                     ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> DRAGONSBANE_LEGGINGS                 = registerArmorItem("dragonsbane_leggings",                 ArmorMaterialsRegistry.LAB,                     ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> DRAGONSBANE_BOOTS                    = registerArmorItem("dragonsbane_boots",                    ArmorMaterialsRegistry.LAB,                     ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> ELLEGAARD_HELMET                     = registerArmorItem("ellegaard_helmet",                     ArmorMaterialsRegistry.ORDER_OF_THE_STONE,      ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> ELLEGAARD_CHESTPLATE                 = registerArmorItem("ellegaard_chestplate",                 ArmorMaterialsRegistry.ORDER_OF_THE_STONE,      ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> ELLEGAARD_LEGGINGS                   = registerArmorItem("ellegaard_leggings",                   ArmorMaterialsRegistry.ORDER_OF_THE_STONE,      ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> ELLEGAARD_BOOTS                      = registerArmorItem("ellegaard_boots",                      ArmorMaterialsRegistry.ORDER_OF_THE_STONE,      ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> ENDER_DEFENDER_HELMET                = registerArmorItem("ender_defender_helmet",                ArmorMaterialsRegistry.LAB,                     ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> ENDER_DEFENDER_CHESTPLATE            = registerArmorItem("ender_defender_chestplate",            ArmorMaterialsRegistry.LAB,                     ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> ENDER_DEFENDER_LEGGINGS              = registerArmorItem("ender_defender_leggings",              ArmorMaterialsRegistry.LAB,                     ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> ENDER_DEFENDER_BOOTS                 = registerArmorItem("ender_defender_boots",                 ArmorMaterialsRegistry.LAB,                     ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> ENDERMAN_HELMET                      = registerArmorItem("enderman_helmet",                      ArmorMaterialsRegistry.ENDERMAN,                ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> ENDERMAN_CHESTPLATE                  = registerArmorItem("enderman_chestplate",                  ArmorMaterialsRegistry.ENDERMAN,                ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> ENDERMAN_LEGGINGS                    = registerArmorItem("enderman_leggings",                    ArmorMaterialsRegistry.ENDERMAN,                ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> ENDERMAN_BOOTS                       = registerArmorItem("enderman_boots",                       ArmorMaterialsRegistry.ENDERMAN,                ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> FEELIN_CUTE_HELMET                   = registerArmorItem("feelin_cute_helmet",                   ArmorMaterials.LEATHER,                         ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> FEELIN_CUTE_CHESTPLATE               = registerArmorItem("feelin_cute_chestplate",               ArmorMaterials.LEATHER,                         ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> FEELIN_CUTE_LEGGINGS                 = registerArmorItem("feelin_cute_leggings",                 ArmorMaterials.LEATHER,                         ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> FEELIN_CUTE_BOOTS                    = registerArmorItem("feelin_cute_boots",                    ArmorMaterials.LEATHER,                         ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> FIREWORKS_UNION_HELMET               = registerArmorItem("fireworks_union_helmet",               ArmorMaterials.LEATHER,                         ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> FIREWORKS_UNION_CHESTPLATE           = registerArmorItem("fireworks_union_chestplate",           ArmorMaterials.LEATHER,                         ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> FIREWORKS_UNION_LEGGINGS             = registerArmorItem("fireworks_union_leggings",             ArmorMaterials.LEATHER,                         ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> FIREWORKS_UNION_BOOTS                = registerArmorItem("fireworks_union_boots",                ArmorMaterials.LEATHER,                         ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> FOUNDER_HELMET                       = registerArmorItem("founder_helmet",                       ArmorMaterials.LEATHER,                         ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> FOUNDER_CHESTPLATE                   = registerArmorItem("founder_chestplate",                   ArmorMaterials.LEATHER,                         ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> FOUNDER_LEGGINGS                     = registerArmorItem("founder_leggings",                     ArmorMaterials.LEATHER,                         ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> FOUNDER_BOOTS                        = registerArmorItem("founder_boots",                        ArmorMaterials.LEATHER,                         ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> GABRIEL_HELMET                       = registerArmorItem("gabriel_helmet",                       ArmorMaterialsRegistry.ORDER_OF_THE_STONE,      ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> GABRIEL_CHESTPLATE                   = registerArmorItem("gabriel_chestplate",                   ArmorMaterialsRegistry.ORDER_OF_THE_STONE,      ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> GABRIEL_LEGGINGS                     = registerArmorItem("gabriel_leggings",                     ArmorMaterialsRegistry.ORDER_OF_THE_STONE,      ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> GABRIEL_BOOTS                        = registerArmorItem("gabriel_boots",                        ArmorMaterialsRegistry.ORDER_OF_THE_STONE,      ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> GILL_HELMET                          = registerArmorItem("gill_helmet",                          ArmorMaterials.LEATHER,                         ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> GILL_CHESTPLATE                      = registerArmorItem("gill_chestplate",                      ArmorMaterials.LEATHER,                         ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> GILL_LEGGINGS                        = registerArmorItem("gill_leggings",                        ArmorMaterials.LEATHER,                         ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> GILL_BOOTS                           = registerArmorItem("gill_boots",                           ArmorMaterials.LEATHER,                         ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> GLADIATOR_CAPITAL_T_HELMET           = registerArmorItem("gladiator_capital_t_helmet",           ArmorMaterials.IRON,                            ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> GLADIATOR_CAPITAL_T_CHESTPLATE       = registerArmorItem("gladiator_capital_t_chestplate",       ArmorMaterials.IRON,                            ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> GLADIATOR_CAPITAL_T_LEGGINGS         = registerArmorItem("gladiator_capital_t_leggings",         ArmorMaterials.IRON,                            ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> GLADIATOR_CAPITAL_T_BOOTS            = registerArmorItem("gladiator_capital_t_boots",            ArmorMaterials.IRON,                            ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> GLADIATOR_CLUTCH_HELMET              = registerArmorItem("gladiator_clutch_helmet",              ArmorMaterials.IRON,                            ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> GLADIATOR_CLUTCH_CHESTPLATE          = registerArmorItem("gladiator_clutch_chestplate",          ArmorMaterials.IRON,                            ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> GLADIATOR_CLUTCH_LEGGINGS            = registerArmorItem("gladiator_clutch_leggings",            ArmorMaterials.IRON,                            ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> GLADIATOR_CLUTCH_BOOTS               = registerArmorItem("gladiator_clutch_boots",               ArmorMaterials.IRON,                            ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> GLADIATOR_FACEMEAT_HELMET            = registerArmorItem("gladiator_facemeat_helmet",            ArmorMaterials.IRON,                            ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> GLADIATOR_FACEMEAT_CHESTPLATE        = registerArmorItem("gladiator_facemeat_chestplate",        ArmorMaterials.IRON,                            ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> GLADIATOR_FACEMEAT_LEGGINGS          = registerArmorItem("gladiator_facemeat_leggings",          ArmorMaterials.IRON,                            ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> GLADIATOR_FACEMEAT_BOOTS             = registerArmorItem("gladiator_facemeat_boots",             ArmorMaterials.IRON,                            ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> GLADIATOR_HEADPUNCH_HELMET           = registerArmorItem("gladiator_headpunch_helmet",           ArmorMaterials.IRON,                            ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> GLADIATOR_HEADPUNCH_CHESTPLATE       = registerArmorItem("gladiator_headpunch_chestplate",       ArmorMaterials.IRON,                            ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> GLADIATOR_HEADPUNCH_LEGGINGS         = registerArmorItem("gladiator_headpunch_leggings",         ArmorMaterials.IRON,                            ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> GLADIATOR_HEADPUNCH_BOOTS            = registerArmorItem("gladiator_headpunch_boots",            ArmorMaterials.IRON,                            ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> GLADIATOR_MEATFACE_HELMET            = registerArmorItem("gladiator_meatface_helmet",            ArmorMaterials.IRON,                            ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> GLADIATOR_MEATFACE_CHESTPLATE        = registerArmorItem("gladiator_meatface_chestplate",        ArmorMaterials.IRON,                            ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> GLADIATOR_MEATFACE_LEGGINGS          = registerArmorItem("gladiator_meatface_leggings",          ArmorMaterials.IRON,                            ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> GLADIATOR_MEATFACE_BOOTS             = registerArmorItem("gladiator_meatface_boots",             ArmorMaterials.IRON,                            ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> GLADIATOR_SHINSTOMPER_HELMET         = registerArmorItem("gladiator_shinstomper_helmet",         ArmorMaterials.IRON,                            ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> GLADIATOR_SHINSTOMPER_CHESTPLATE     = registerArmorItem("gladiator_shinstomper_chestplate",     ArmorMaterials.IRON,                            ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> GLADIATOR_SHINSTOMPER_LEGGINGS       = registerArmorItem("gladiator_shinstomper_leggings",       ArmorMaterials.IRON,                            ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> GLADIATOR_SHINSTOMPER_BOOTS          = registerArmorItem("gladiator_shinstomper_boots",          ArmorMaterials.IRON,                            ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> GLADIATOR_SLAB_HELMET                = registerArmorItem("gladiator_slab_helmet",                ArmorMaterials.IRON,                            ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> GLADIATOR_SLAB_CHESTPLATE            = registerArmorItem("gladiator_slab_chestplate",            ArmorMaterials.IRON,                            ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> GLADIATOR_SLAB_LEGGINGS              = registerArmorItem("gladiator_slab_leggings",              ArmorMaterials.IRON,                            ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> GLADIATOR_SLAB_BOOTS                 = registerArmorItem("gladiator_slab_boots",                 ArmorMaterials.IRON,                            ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> GOLDEN_APPLE_HELMET                  = registerArmorItem("golden_apple_helmet",                  ArmorMaterials.IRON,                            ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> GOLDEN_APPLE_CHESTPLATE              = registerArmorItem("golden_apple_chestplate",              ArmorMaterials.IRON,                            ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> GOLDEN_APPLE_LEGGINGS                = registerArmorItem("golden_apple_leggings",                ArmorMaterials.IRON,                            ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> GOLDEN_APPLE_BOOTS                   = registerArmorItem("golden_apple_boots",                   ArmorMaterials.IRON,                            ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> GOLDEN_GOLIATH_HELMET                = registerArmorItem("golden_goliath_helmet",                ArmorMaterialsRegistry.LAB,                     ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> GOLDEN_GOLIATH_CHESTPLATE            = registerArmorItem("golden_goliath_chestplate",            ArmorMaterialsRegistry.LAB,                     ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> GOLDEN_GOLIATH_LEGGINGS              = registerArmorItem("golden_goliath_leggings",              ArmorMaterialsRegistry.LAB,                     ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> GOLDEN_GOLIATH_BOOTS                 = registerArmorItem("golden_goliath_boots",                 ArmorMaterialsRegistry.LAB,                     ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> GOLDEN_GOLIATH_CIRCUITRY_HELMET      = registerArmorItem("golden_goliath_circuitry_helmet",      ArmorMaterialsRegistry.LAB,                     ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> GOLDEN_GOLIATH_CIRCUITRY_CHESTPLATE  = registerArmorItem("golden_goliath_circuitry_chestplate",  ArmorMaterialsRegistry.LAB,                     ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> GOLDEN_GOLIATH_CIRCUITRY_LEGGINGS    = registerArmorItem("golden_goliath_circuitry_leggings",    ArmorMaterialsRegistry.LAB,                     ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> GOLDEN_GOLIATH_CIRCUITRY_BOOTS       = registerArmorItem("golden_goliath_circuitry_boots",       ArmorMaterialsRegistry.LAB,                     ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> GOOFBALL_GLORY_HELMET                = registerArmorItem("goofball_glory_helmet",                ArmorMaterials.LEATHER,                         ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> GOOFBALL_GLORY_CHESTPLATE            = registerArmorItem("goofball_glory_chestplate",            ArmorMaterials.LEATHER,                         ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> GOOFBALL_GLORY_LEGGINGS              = registerArmorItem("goofball_glory_leggings",              ArmorMaterials.LEATHER,                         ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> GOOFBALL_GLORY_BOOTS                 = registerArmorItem("goofball_glory_boots",                 ArmorMaterials.LEATHER,                         ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> HARPER_HELMET                        = registerArmorItem("harper_helmet",                        ArmorMaterials.LEATHER,                         ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> HARPER_CHESTPLATE                    = registerArmorItem("harper_chestplate",                    ArmorMaterials.LEATHER,                         ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> HARPER_LEGGINGS                      = registerArmorItem("harper_leggings",                      ArmorMaterials.LEATHER,                         ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> HARPER_BOOTS                         = registerArmorItem("harper_boots",                         ArmorMaterials.LEATHER,                         ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> INSTITUTE_ASSOCIATE_HELMET           = registerArmorItem("institute_associate_helmet",           ArmorMaterials.LEATHER,                         ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> INSTITUTE_ASSOCIATE_CHESTPLATE       = registerArmorItem("institute_associate_chestplate",       ArmorMaterials.LEATHER,                         ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> INSTITUTE_ASSOCIATE_LEGGINGS         = registerArmorItem("institute_associate_leggings",         ArmorMaterials.LEATHER,                         ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> INSTITUTE_ASSOCIATE_BOOTS            = registerArmorItem("institute_associate_boots",            ArmorMaterials.LEATHER,                         ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> INSTITUTE_GUARD_HELMET               = registerArmorItem("institute_guard_helmet",               ArmorMaterials.LEATHER,                         ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> INSTITUTE_GUARD_CHESTPLATE           = registerArmorItem("institute_guard_chestplate",           ArmorMaterials.LEATHER,                         ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> INSTITUTE_GUARD_LEGGINGS             = registerArmorItem("institute_guard_leggings",             ArmorMaterials.LEATHER,                         ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> INSTITUTE_GUARD_BOOTS                = registerArmorItem("institute_guard_boots",                ArmorMaterials.LEATHER,                         ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> INSTITUTE_PRISONER_HELMET            = registerArmorItem("institute_prisoner_helmet",            ArmorMaterials.LEATHER,                         ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> INSTITUTE_PRISONER_CHESTPLATE        = registerArmorItem("institute_prisoner_chestplate",        ArmorMaterials.LEATHER,                         ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> INSTITUTE_PRISONER_LEGGINGS          = registerArmorItem("institute_prisoner_leggings",          ArmorMaterials.LEATHER,                         ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> INSTITUTE_PRISONER_BOOTS             = registerArmorItem("institute_prisoner_boots",             ArmorMaterials.LEATHER,                         ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> INSTITUTE_WARDEN_HELMET              = registerArmorItem("institute_warden_helmet",              ArmorMaterials.LEATHER,                         ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> INSTITUTE_WARDEN_CHESTPLATE          = registerArmorItem("institute_warden_chestplate",          ArmorMaterials.LEATHER,                         ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> INSTITUTE_WARDEN_LEGGINGS            = registerArmorItem("institute_warden_leggings",            ArmorMaterials.LEATHER,                         ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> INSTITUTE_WARDEN_BOOTS               = registerArmorItem("institute_warden_boots",               ArmorMaterials.LEATHER,                         ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> IVOR_HELMET                          = registerArmorItem("ivor_helmet",                          ArmorMaterialsRegistry.ORDER_OF_THE_STONE,      ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> IVOR_CHESTPLATE                      = registerArmorItem("ivor_chestplate",                      ArmorMaterialsRegistry.ORDER_OF_THE_STONE,      ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> IVOR_LEGGINGS                        = registerArmorItem("ivor_leggings",                        ArmorMaterialsRegistry.ORDER_OF_THE_STONE,      ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> IVOR_BOOTS                           = registerArmorItem("ivor_boots",                           ArmorMaterialsRegistry.ORDER_OF_THE_STONE,      ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> JACK_HELMET                          = registerArmorItem("jack_helmet",                          ArmorMaterials.LEATHER,                         ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> JACK_CHESTPLATE                      = registerArmorItem("jack_chestplate",                      ArmorMaterials.LEATHER,                         ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> JACK_LEGGINGS                        = registerArmorItem("jack_leggings",                        ArmorMaterials.LEATHER,                         ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> JACK_BOOTS                           = registerArmorItem("jack_boots",                           ArmorMaterials.LEATHER,                         ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> LLAMA_BROWNISH_HELMET                = registerArmorItem("llama_brownish_helmet",                ArmorMaterials.LEATHER,                         ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> LLAMA_BROWNISH_CHESTPLATE            = registerArmorItem("llama_brownish_chestplate",            ArmorMaterials.LEATHER,                         ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> LLAMA_BROWNISH_LEGGINGS              = registerArmorItem("llama_brownish_leggings",              ArmorMaterials.LEATHER,                         ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> LLAMA_BROWNISH_BOOTS                 = registerArmorItem("llama_brownish_boots",                 ArmorMaterials.LEATHER,                         ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> LUKAS_HELMET                         = registerArmorItem("lukas_helmet",                         ArmorMaterialsRegistry.ORDER_OF_THE_STONE,      ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> LUKAS_CHESTPLATE                     = registerArmorItem("lukas_chestplate",                     ArmorMaterialsRegistry.ORDER_OF_THE_STONE,      ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> LUKAS_LEGGINGS                       = registerArmorItem("lukas_leggings",                       ArmorMaterialsRegistry.ORDER_OF_THE_STONE,      ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> LUKAS_BOOTS                          = registerArmorItem("lukas_boots",                          ArmorMaterialsRegistry.ORDER_OF_THE_STONE,      ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> MAGNUS_HELMET                        = registerArmorItem("magnus_helmet",                        ArmorMaterialsRegistry.ORDER_OF_THE_STONE,      ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> MAGNUS_CHESTPLATE                    = registerArmorItem("magnus_chestplate",                    ArmorMaterialsRegistry.ORDER_OF_THE_STONE,      ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> MAGNUS_LEGGINGS                      = registerArmorItem("magnus_leggings",                      ArmorMaterialsRegistry.ORDER_OF_THE_STONE,      ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> MAGNUS_BOOTS                         = registerArmorItem("magnus_boots",                         ArmorMaterialsRegistry.ORDER_OF_THE_STONE,      ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> MAYA_HELMET                          = registerArmorItem("maya_helmet",                          ArmorMaterials.LEATHER,                         ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> MAYA_CHESTPLATE                      = registerArmorItem("maya_chestplate",                      ArmorMaterials.LEATHER,                         ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> MAYA_LEGGINGS                        = registerArmorItem("maya_leggings",                        ArmorMaterials.LEATHER,                         ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> MAYA_BOOTS                           = registerArmorItem("maya_boots",                           ArmorMaterials.LEATHER,                         ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> NINJA_HELMET                         = registerArmorItem("ninja_helmet",                         ArmorMaterialsRegistry.NINJA_ARMOR,             ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> NINJA_CHESTPLATE                     = registerArmorItem("ninja_chestplate",                     ArmorMaterialsRegistry.NINJA_ARMOR,             ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> NINJA_LEGGINGS                       = registerArmorItem("ninja_leggings",                       ArmorMaterialsRegistry.NINJA_ARMOR,             ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> NINJA_BOOTS                          = registerArmorItem("ninja_boots",                          ArmorMaterialsRegistry.NINJA_ARMOR,             ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> NURM_HELMET                          = registerArmorItem("nurm_helmet",                          ArmorMaterials.LEATHER,                         ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> NURM_CHESTPLATE                      = registerArmorItem("nurm_chestplate",                      ArmorMaterials.LEATHER,                         ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> NURM_LEGGINGS                        = registerArmorItem("nurm_leggings",                        ArmorMaterials.LEATHER,                         ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> NURM_BOOTS                           = registerArmorItem("nurm_boots",                           ArmorMaterials.LEATHER,                         ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> OLIVIA_HELMET                        = registerArmorItem("olivia_helmet",                        ArmorMaterialsRegistry.ORDER_OF_THE_STONE,      ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> OLIVIA_CHESTPLATE                    = registerArmorItem("olivia_chestplate",                    ArmorMaterialsRegistry.ORDER_OF_THE_STONE,      ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> OLIVIA_LEGGINGS                      = registerArmorItem("olivia_leggings",                      ArmorMaterialsRegistry.ORDER_OF_THE_STONE,      ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> OLIVIA_BOOTS                         = registerArmorItem("olivia_boots",                         ArmorMaterialsRegistry.ORDER_OF_THE_STONE,      ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> PETRA_HELMET                         = registerArmorItem("petra_helmet",                         ArmorMaterialsRegistry.ORDER_OF_THE_STONE,      ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> PETRA_CHESTPLATE                     = registerArmorItem("petra_chestplate",                     ArmorMaterialsRegistry.ORDER_OF_THE_STONE,      ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> PETRA_LEGGINGS                       = registerArmorItem("petra_leggings",                       ArmorMaterialsRegistry.ORDER_OF_THE_STONE,      ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> PETRA_BOOTS                          = registerArmorItem("petra_boots",                          ArmorMaterialsRegistry.ORDER_OF_THE_STONE,      ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> PLEASE_DONT_HIT_ME_HELMET            = registerArmorItem("please_dont_hit_me_helmet",            ArmorMaterials.LEATHER,                         ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> PLEASE_DONT_HIT_ME_CHESTPLATE        = registerArmorItem("please_dont_hit_me_chestplate",        ArmorMaterials.LEATHER,                         ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> PLEASE_DONT_HIT_ME_LEGGINGS          = registerArmorItem("please_dont_hit_me_leggings",          ArmorMaterials.LEATHER,                         ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> PLEASE_DONT_HIT_ME_BOOTS             = registerArmorItem("please_dont_hit_me_boots",             ArmorMaterials.LEATHER,                         ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> PRISMARINE_SOLDIER_HELMET            = registerArmorItem("prismarine_soldier_helmet",            ArmorMaterialsRegistry.PRISMARINE,              ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> PRISMARINE_SOLDIER_CHESTPLATE        = registerArmorItem("prismarine_soldier_chestplate",        ArmorMaterialsRegistry.PRISMARINE,              ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> PRISMARINE_SOLDIER_LEGGINGS          = registerArmorItem("prismarine_soldier_leggings",          ArmorMaterialsRegistry.PRISMARINE,              ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> PRISMARINE_SOLDIER_BOOTS             = registerArmorItem("prismarine_soldier_boots",             ArmorMaterialsRegistry.PRISMARINE,              ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> REDSTONE_RIOT_HELMET                 = registerArmorItem("redstone_riot_helmet",                 ArmorMaterialsRegistry.LAB,                     ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> REDSTONE_RIOT_CHESTPLATE             = registerArmorItem("redstone_riot_chestplate",             ArmorMaterialsRegistry.LAB,                     ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> REDSTONE_RIOT_LEGGINGS               = registerArmorItem("redstone_riot_leggings",               ArmorMaterialsRegistry.LAB,                     ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> REDSTONE_RIOT_BOOTS                  = registerArmorItem("redstone_riot_boots",                  ArmorMaterialsRegistry.LAB,                     ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> REGINALD_HELMET                      = registerArmorItem("reginald_helmet",                      ArmorMaterials.LEATHER,                         ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> REGINALD_CHESTPLATE                  = registerArmorItem("reginald_chestplate",                  ArmorMaterials.LEATHER,                         ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> REGINALD_LEGGINGS                    = registerArmorItem("reginald_leggings",                    ArmorMaterials.LEATHER,                         ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> REGINALD_BOOTS                       = registerArmorItem("reginald_boots",                       ArmorMaterials.LEATHER,                         ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> SHIELD_OF_INFINITY_HELMET            = registerArmorItem("shield_of_infinity_helmet",            ArmorMaterialsRegistry.LAB,                     ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> SHIELD_OF_INFINITY_CHESTPLATE        = registerArmorItem("shield_of_infinity_chestplate",        ArmorMaterialsRegistry.LAB,                     ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> SHIELD_OF_INFINITY_LEGGINGS          = registerArmorItem("shield_of_infinity_leggings",          ArmorMaterialsRegistry.LAB,                     ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> SHIELD_OF_INFINITY_BOOTS             = registerArmorItem("shield_of_infinity_boots",             ArmorMaterialsRegistry.LAB,                     ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> SKY_CITY_GUARD_HELMET                = registerArmorItem("sky_city_guard_helmet",                ArmorMaterials.LEATHER,                         ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> SKY_CITY_GUARD_CHESTPLATE            = registerArmorItem("sky_city_guard_chestplate",            ArmorMaterials.LEATHER,                         ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> SKY_CITY_GUARD_LEGGINGS              = registerArmorItem("sky_city_guard_leggings",              ArmorMaterials.LEATHER,                         ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> SKY_CITY_GUARD_BOOTS                 = registerArmorItem("sky_city_guard_boots",                 ArmorMaterials.LEATHER,                         ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> SOREN_HELMET                         = registerArmorItem("soren_helmet",                         ArmorMaterialsRegistry.ORDER_OF_THE_STONE,      ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> SOREN_CHESTPLATE                     = registerArmorItem("soren_chestplate",                     ArmorMaterialsRegistry.ORDER_OF_THE_STONE,      ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> SOREN_LEGGINGS                       = registerArmorItem("soren_leggings",                       ArmorMaterialsRegistry.ORDER_OF_THE_STONE,      ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> SOREN_BOOTS                          = registerArmorItem("soren_boots",                          ArmorMaterialsRegistry.ORDER_OF_THE_STONE,      ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> STAR_SHIELD_HELMET                   = registerArmorItem("star_shield_helmet",                   ArmorMaterialsRegistry.LAB,                     ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> STAR_SHIELD_CHESTPLATE               = registerArmorItem("star_shield_chestplate",               ArmorMaterialsRegistry.LAB,                     ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> STAR_SHIELD_LEGGINGS                 = registerArmorItem("star_shield_leggings",                 ArmorMaterialsRegistry.LAB,                     ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> STAR_SHIELD_BOOTS                    = registerArmorItem("star_shield_boots",                    ArmorMaterialsRegistry.LAB,                     ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> STRAPS_N_STRAPS_HELMET               = registerArmorItem("straps_n_straps_helmet",               ArmorMaterials.LEATHER,                         ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> STRAPS_N_STRAPS_CHESTPLATE           = registerArmorItem("straps_n_straps_chestplate",           ArmorMaterials.LEATHER,                         ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> STRAPS_N_STRAPS_LEGGINGS             = registerArmorItem("straps_n_straps_leggings",             ArmorMaterials.LEATHER,                         ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> STRAPS_N_STRAPS_BOOTS                = registerArmorItem("straps_n_straps_boots",                ArmorMaterials.LEATHER,                         ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> SWORDBREAKER_HELMET                  = registerArmorItem("swordbreaker_helmet",                  ArmorMaterialsRegistry.LAB,                     ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> SWORDBREAKER_CHESTPLATE              = registerArmorItem("swordbreaker_chestplate",              ArmorMaterialsRegistry.LAB,                     ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> SWORDBREAKER_LEGGINGS                = registerArmorItem("swordbreaker_leggings",                ArmorMaterialsRegistry.LAB,                     ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> SWORDBREAKER_BOOTS                   = registerArmorItem("swordbreaker_boots",                   ArmorMaterialsRegistry.LAB,                     ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> TIM_HELMET                           = registerArmorItem("tim_helmet",                           ArmorMaterials.NETHERITE,                       ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> TIM_CHESTPLATE                       = registerArmorItem("tim_chestplate",                       ArmorMaterials.NETHERITE,                       ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> TIM_LEGGINGS                         = registerArmorItem("tim_leggings",                         ArmorMaterials.NETHERITE,                       ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> TIM_BOOTS                            = registerArmorItem("tim_boots",                            ArmorMaterials.NETHERITE,                       ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> TOOTH_CHIPPER_HELMET                 = registerArmorItem("tooth_chipper_helmet",                 ArmorMaterials.LEATHER,                         ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> TOOTH_CHIPPER_CHESTPLATE             = registerArmorItem("tooth_chipper_chestplate",             ArmorMaterials.LEATHER,                         ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> TOOTH_CHIPPER_LEGGINGS               = registerArmorItem("tooth_chipper_leggings",               ArmorMaterials.LEATHER,                         ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> TOOTH_CHIPPER_BOOTS                  = registerArmorItem("tooth_chipper_boots",                  ArmorMaterials.LEATHER,                         ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> TRANSMIGRATIONAL_HEADSET             = registerArmorItem("transmigrational_headset",             ArmorMaterials.DIAMOND,                         ArmorItem.Type.HELMET,      0);

    public static final RegistrySupplier<Item> VOS_HELMET                           = registerArmorItem("vos_helmet",                           ArmorMaterials.LEATHER,                         ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> VOS_CHESTPLATE                       = registerArmorItem("vos_chestplate",                       ArmorMaterials.LEATHER,                         ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> VOS_LEGGINGS                         = registerArmorItem("vos_leggings",                         ArmorMaterials.LEATHER,                         ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> VOS_BOOTS                            = registerArmorItem("vos_boots",                            ArmorMaterials.LEATHER,                         ArmorItem.Type.BOOTS,       0);

    public static final RegistrySupplier<Item> WHITE_PUMPKIN_HELMET                 = registerArmorItem("white_pumpkin_helmet",                 ArmorMaterialsRegistry.WHITE_PUMPKIN,           ArmorItem.Type.HELMET,      0);
    public static final RegistrySupplier<Item> WHITE_PUMPKIN_CHESTPLATE             = registerArmorItem("white_pumpkin_chestplate",             ArmorMaterialsRegistry.WHITE_PUMPKIN,           ArmorItem.Type.CHESTPLATE,  0);
    public static final RegistrySupplier<Item> WHITE_PUMPKIN_LEGGINGS               = registerArmorItem("white_pumpkin_leggings",               ArmorMaterialsRegistry.WHITE_PUMPKIN,           ArmorItem.Type.LEGGINGS,    0);
    public static final RegistrySupplier<Item> WHITE_PUMPKIN_BOOTS                  = registerArmorItem("white_pumpkin_boots",                  ArmorMaterialsRegistry.WHITE_PUMPKIN,           ArmorItem.Type.BOOTS,       0);

    protected static RegistrySupplier<Item> registerArmorItem(String id, RegistryEntry<ArmorMaterial> armorMaterial, McsaArmorItem.Type type, int durabilityMultiplier) {
        return ITEM.register(id, () -> new McsaArmorItem(armorMaterial, type, new Item.Settings().maxDamage(type.getMaxDamage(durabilityMultiplier))));
    }

    public static void register() {
        ITEM.init();
    }
}

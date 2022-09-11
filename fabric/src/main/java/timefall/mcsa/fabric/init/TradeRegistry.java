package timefall.mcsa.fabric.init;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import timefall.mcsa.configs.McsaConfig;
import timefall.mcsa.init.ArmorsInit;

public class TradeRegistry {
    public static void registerVillagerOffers() {
        if (McsaConfig.config.enableVillagerArmorTrades) {
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add((trader, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsInit.ELLEGAARD_ARMOR.getHelmet(), 1),
                            1, 30, 0.2f
                    ))
            );
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add((trader, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsInit.ELLEGAARD_ARMOR.getChestplate(), 1),
                            1, 30, 0.2f
                    ))
            );
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add((trader, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsInit.ELLEGAARD_ARMOR.getLeggings(), 1),
                            1, 30, 0.2f
                    ))
            );
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add((trader, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsInit.ELLEGAARD_ARMOR.getBoots(), 1),
                            1, 30, 0.2f
                    ))
            );

            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add((trader, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsInit.GABRIEL_ARMOR.getHelmet(), 1),
                            1, 30, 0.2f
                    ))
            );
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add((trader, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsInit.GABRIEL_ARMOR.getChestplate(), 1),
                            1, 30, 0.2f
                    ))
            );
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add((trader, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsInit.GABRIEL_ARMOR.getLeggings(), 1),
                            1, 30, 0.2f
                    ))
            );
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add((trader, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsInit.GABRIEL_ARMOR.getBoots(), 1),
                            1, 30, 0.2f
                    ))
            );

            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add((trader, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsInit.IVOR_ARMOR.getHelmet(), 1),
                            1, 30, 0.2f
                    ))
            );
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add((trader, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsInit.IVOR_ARMOR.getChestplate(), 1),
                            1, 30, 0.2f
                    ))
            );
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add((trader, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsInit.IVOR_ARMOR.getLeggings(), 1),
                            1, 30, 0.2f
                    ))
            );
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add((trader, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsInit.IVOR_ARMOR.getBoots(), 1),
                            1, 30, 0.2f
                    ))
            );

            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add((trader, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsInit.LUKAS_ARMOR.getHelmet(), 1),
                            1, 30, 0.2f
                    ))
            );
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add((trader, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsInit.LUKAS_ARMOR.getChestplate(), 1),
                            1, 30, 0.2f
                    ))
            );
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add((trader, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsInit.LUKAS_ARMOR.getLeggings(), 1),
                            1, 30, 0.2f
                    ))
            );
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add((trader, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsInit.LUKAS_ARMOR.getBoots(), 1),
                            1, 30, 0.2f
                    ))
            );

            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add((trader, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsInit.MAGNUS_ARMOR.getHelmet(), 1),
                            1, 30, 0.2f
                    ))
            );
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add((trader, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsInit.MAGNUS_ARMOR.getChestplate(), 1),
                            1, 30, 0.2f
                    ))
            );
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add((trader, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsInit.MAGNUS_ARMOR.getLeggings(), 1),
                            1, 30, 0.2f
                    ))
            );
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add((trader, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsInit.MAGNUS_ARMOR.getBoots(), 1),
                            1, 30, 0.2f
                    ))
            );

            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add((trader, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsInit.OLIVIA_ARMOR.getHelmet(), 1),
                            1, 30, 0.2f
                    ))
            );
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add((trader, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsInit.OLIVIA_ARMOR.getChestplate(), 1),
                            1, 30, 0.2f
                    ))
            );
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add((trader, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsInit.OLIVIA_ARMOR.getLeggings(), 1),
                            1, 30, 0.2f
                    ))
            );
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add((trader, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsInit.OLIVIA_ARMOR.getBoots(), 1),
                            1, 30, 0.2f
                    ))
            );

            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add((trader, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsInit.PETRA_ARMOR.getHelmet(), 1),
                            1, 30, 0.2f
                    ))
            );
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add((trader, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsInit.PETRA_ARMOR.getChestplate(), 1),
                            1, 30, 0.2f
                    ))
            );
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add((trader, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsInit.PETRA_ARMOR.getLeggings(), 1),
                            1, 30, 0.2f
                    ))
            );
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add((trader, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsInit.PETRA_ARMOR.getBoots(), 1),
                            1, 30, 0.2f
                    ))
            );

            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add((trader, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsInit.SOREN_ARMOR.getHelmet(), 1),
                            1, 30, 0.2f
                    ))
            );
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add((trader, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsInit.SOREN_ARMOR.getChestplate(), 1),
                            1, 30, 0.2f
                    ))
            );
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add((trader, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsInit.SOREN_ARMOR.getLeggings(), 1),
                            1, 30, 0.2f
                    ))
            );
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                    factories -> factories.add((trader, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ArmorsInit.SOREN_ARMOR.getBoots(), 1),
                            1, 30, 0.2f
                    ))
            );
        }
    }
}
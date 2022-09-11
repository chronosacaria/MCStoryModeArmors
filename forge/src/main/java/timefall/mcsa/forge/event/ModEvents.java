package timefall.mcsa.forge.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOffers;
import net.minecraft.village.VillagerProfession;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import timefall.mcsa.Mcsa;
import timefall.mcsa.configs.McsaConfig;
import timefall.mcsa.init.ArmorsInit;

import java.util.List;

@Mod.EventBusSubscriber(modid = Mcsa.MOD_ID)
public class ModEvents {
    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if (McsaConfig.config.enableVillagerArmorTrades) {
            if (event.getType() == VillagerProfession.ARMORER) {
                Int2ObjectMap<List<TradeOffers.Factory>> trades = event.getTrades();
                int villagerLevel = 5;

                trades.get(villagerLevel).add((trader, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 64),
                                new ItemStack(ArmorsInit.ELLEGAARD_ARMOR.getHelmet(), 1),
                                1, 30, 0.2f
                ));
                trades.get(villagerLevel).add((trader, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 64),
                                new ItemStack(ArmorsInit.ELLEGAARD_ARMOR.getChestplate(), 1),
                                1, 30, 0.2f
                ));
                trades.get(villagerLevel).add((trader, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 64),
                                new ItemStack(ArmorsInit.ELLEGAARD_ARMOR.getLeggings(), 1),
                                1, 30, 0.2f
                ));
                trades.get(villagerLevel).add((trader, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 64),
                                new ItemStack(ArmorsInit.ELLEGAARD_ARMOR.getBoots(), 1),
                                1, 30, 0.2f
                ));

                trades.get(villagerLevel).add((trader, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 64),
                                new ItemStack(ArmorsInit.GABRIEL_ARMOR.getHelmet(), 1),
                                1, 30, 0.2f
                ));
                trades.get(villagerLevel).add((trader, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 64),
                                new ItemStack(ArmorsInit.GABRIEL_ARMOR.getChestplate(), 1),
                                1, 30, 0.2f
                ));
                trades.get(villagerLevel).add((trader, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 64),
                                new ItemStack(ArmorsInit.GABRIEL_ARMOR.getLeggings(), 1),
                                1, 30, 0.2f
                ));
                trades.get(villagerLevel).add((trader, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 64),
                                new ItemStack(ArmorsInit.GABRIEL_ARMOR.getBoots(), 1),
                                1, 30, 0.2f
                ));

                trades.get(villagerLevel).add((trader, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 64),
                                new ItemStack(ArmorsInit.IVOR_ARMOR.getHelmet(), 1),
                                1, 30, 0.2f
                ));
                trades.get(villagerLevel).add((trader, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 64),
                                new ItemStack(ArmorsInit.IVOR_ARMOR.getChestplate(), 1),
                                1, 30, 0.2f
                ));
                trades.get(villagerLevel).add((trader, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 64),
                                new ItemStack(ArmorsInit.IVOR_ARMOR.getLeggings(), 1),
                                1, 30, 0.2f
                ));
                trades.get(villagerLevel).add((trader, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 64),
                                new ItemStack(ArmorsInit.IVOR_ARMOR.getBoots(), 1),
                                1, 30, 0.2f
                ));

                trades.get(villagerLevel).add((trader, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 64),
                                new ItemStack(ArmorsInit.LUKAS_ARMOR.getHelmet(), 1),
                                1, 30, 0.2f
                ));
                trades.get(villagerLevel).add((trader, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 64),
                                new ItemStack(ArmorsInit.LUKAS_ARMOR.getChestplate(), 1),
                                1, 30, 0.2f
                ));
                trades.get(villagerLevel).add((trader, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 64),
                                new ItemStack(ArmorsInit.LUKAS_ARMOR.getLeggings(), 1),
                                1, 30, 0.2f
                ));
                trades.get(villagerLevel).add((trader, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 64),
                                new ItemStack(ArmorsInit.LUKAS_ARMOR.getBoots(), 1),
                                1, 30, 0.2f
                ));

                trades.get(villagerLevel).add((trader, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 64),
                                new ItemStack(ArmorsInit.MAGNUS_ARMOR.getHelmet(), 1),
                                1, 30, 0.2f
                ));
                trades.get(villagerLevel).add((trader, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 64),
                                new ItemStack(ArmorsInit.MAGNUS_ARMOR.getChestplate(), 1),
                                1, 30, 0.2f
                ));
                trades.get(villagerLevel).add((trader, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 64),
                                new ItemStack(ArmorsInit.MAGNUS_ARMOR.getLeggings(), 1),
                                1, 30, 0.2f
                ));
                trades.get(villagerLevel).add((trader, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 64),
                                new ItemStack(ArmorsInit.MAGNUS_ARMOR.getBoots(), 1),
                                1, 30, 0.2f
                ));

                trades.get(villagerLevel).add((trader, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 64),
                                new ItemStack(ArmorsInit.OLIVIA_ARMOR.getHelmet(), 1),
                                1, 30, 0.2f
                ));
                trades.get(villagerLevel).add((trader, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 64),
                                new ItemStack(ArmorsInit.OLIVIA_ARMOR.getChestplate(), 1),
                                1, 30, 0.2f
                ));
                trades.get(villagerLevel).add((trader, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 64),
                                new ItemStack(ArmorsInit.OLIVIA_ARMOR.getLeggings(), 1),
                                1, 30, 0.2f
                ));
                trades.get(villagerLevel).add((trader, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 64),
                                new ItemStack(ArmorsInit.OLIVIA_ARMOR.getBoots(), 1),
                                1, 30, 0.2f
                ));

                trades.get(villagerLevel).add((trader, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 64),
                                new ItemStack(ArmorsInit.PETRA_ARMOR.getHelmet(), 1),
                                1, 30, 0.2f
                ));
                trades.get(villagerLevel).add((trader, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 64),
                                new ItemStack(ArmorsInit.PETRA_ARMOR.getChestplate(), 1),
                                1, 30, 0.2f
                ));
                trades.get(villagerLevel).add((trader, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 64),
                                new ItemStack(ArmorsInit.PETRA_ARMOR.getLeggings(), 1),
                                1, 30, 0.2f
                ));
                trades.get(villagerLevel).add((trader, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 64),
                                new ItemStack(ArmorsInit.PETRA_ARMOR.getBoots(), 1),
                                1, 30, 0.2f
                ));

                trades.get(villagerLevel).add((trader, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 64),
                                new ItemStack(ArmorsInit.SOREN_ARMOR.getHelmet(), 1),
                                1, 30, 0.2f
                ));
                trades.get(villagerLevel).add((trader, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 64),
                                new ItemStack(ArmorsInit.SOREN_ARMOR.getChestplate(), 1),
                                1, 30, 0.2f
                ));
                trades.get(villagerLevel).add((trader, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 64),
                                new ItemStack(ArmorsInit.SOREN_ARMOR.getLeggings(), 1),
                                1, 30, 0.2f
                ));
                trades.get(villagerLevel).add((trader, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 64),
                                new ItemStack(ArmorsInit.SOREN_ARMOR.getBoots(), 1),
                                1, 30, 0.2f
                ));
                
            }
        }
    }
}

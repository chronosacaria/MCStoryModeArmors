package dev.timefall.mcsa;

import dev.timefall.mcsa.api.EnvUtils;
import dev.timefall.mcsa.registry.ArmorMaterialsRegistry;
import dev.timefall.mcsa.registry.ItemGroupRegistry;
import dev.timefall.mcsa.registry.ItemRegistry;

public class McsaCommon {

    public static void initialize() {
        ArmorMaterialsRegistry.register();
        if (EnvUtils.IS_DEV)
            ModConstants.LOGGER.info(ModConstants.MOD_NAME + " (MCSA) Armor Materials initialized");

        ItemRegistry.register();
        if (EnvUtils.IS_DEV)
            ModConstants.LOGGER.info(ModConstants.MOD_NAME + " (MCSA) Items initialized");

        ItemGroupRegistry.register();
        if (EnvUtils.IS_DEV)
            ModConstants.LOGGER.info(ModConstants.MOD_NAME + " (MCSA) Item Groups initialized");
    }
}
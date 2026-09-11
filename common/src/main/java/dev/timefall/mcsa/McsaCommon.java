package dev.timefall.mcsa;

import dev.timefall.mcsa.registry.ArmorMaterialsRegistry;
import dev.timefall.mcsa.registry.ItemGroupRegistry;
import dev.timefall.mcsa.registry.ItemRegistry;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;

public class McsaCommon {

    public static void initialize() {
        ArmorMaterialsRegistry.register();
        if (ConfigApiJava.platform().isDev())
            ModConstants.LOGGER.info(ModConstants.MOD_NAME + " (MCSA) Armor Materials initialized");

        ItemRegistry.register();
        if (ConfigApiJava.platform().isDev())
            ModConstants.LOGGER.info(ModConstants.MOD_NAME + " (MCSA) Items initialized");

        ItemGroupRegistry.register();
        if (ConfigApiJava.platform().isDev())
            ModConstants.LOGGER.info(ModConstants.MOD_NAME + " (MCSA) Item Groups initialized");
    }
}
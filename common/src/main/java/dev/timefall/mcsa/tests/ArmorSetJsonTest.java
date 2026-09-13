package dev.timefall.mcsa.tests;

import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.mojang.serialization.DataResult;
import dev.timefall.mcsa.ModConstants;
import dev.timefall.mcsa.item.ArmorSet;
import net.minecraft.registry.Registries;
import net.minecraft.resource.Resource;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;

import java.io.IOException;
import java.io.Reader;
import java.util.Map;

public class ArmorSetJsonTest {

    private ArmorSetJsonTest() {

    }

    public static void run(ResourceManager resourceManager) {
        Map<Identifier, Resource> resourcesMap = resourceManager.findResources(
                "armor_sets",
                id ->id.getPath().endsWith(".json")
        );

        if (resourcesMap.isEmpty())
            ModConstants.LOGGER.info("No armor set JSON files found under data/mcsa/armor_sets/");

        ModConstants.LOGGER.info("Found {} armor set JSON files", resourcesMap.size());

        resourcesMap.forEach((resourceId, resource) -> {
            try (Reader reader = resource.getReader()){
                JsonElement json = JsonParser.parseReader(reader);
                DataResult<ArmorSet> result = ArmorSet.decode(json);

                result.error().ifPresent(error -> ModConstants.LOGGER.error(
                        "Failed to decode armor set {}: {}",
                        resourceId,
                        error
                ));

                result.result().ifPresent(armorSet -> ModConstants.LOGGER.info(
                        "Decoded {}:\n helmet = {} \n chestplate = {} \n leggings = {} \n boots = {}",
                        resourceId,
                        Registries.ITEM.getId(armorSet.helmet()),
                        Registries.ITEM.getId(armorSet.chestplate()),
                        Registries.ITEM.getId(armorSet.leggings()),
                        Registries.ITEM.getId(armorSet.boots())
                ));
            } catch (IOException | JsonParseException exception) {
                ModConstants.LOGGER.error(
                        "Failed to read armor set JSON {}",
                        resourceId,
                        exception
                );
            }
        });
    }

}

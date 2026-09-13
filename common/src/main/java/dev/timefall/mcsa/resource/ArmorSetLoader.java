package dev.timefall.mcsa.resource;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.mojang.serialization.DataResult;
import dev.timefall.mcsa.ModConstants;
import dev.timefall.mcsa.item.ArmorSet;
import net.minecraft.resource.JsonDataLoader;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.profiler.Profiler;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ArmorSetLoader extends JsonDataLoader {

    private static volatile Map<Identifier, ArmorSet> armorSets = Map.of();

    public ArmorSetLoader() {
        super(new Gson(), "armor_sets");
    }

    @Override
    protected void apply(Map<Identifier, JsonElement> prepared, ResourceManager manager, Profiler profiler) {
        Map<Identifier, ArmorSet> loadedArmorSets = new HashMap<>();

        prepared.forEach((identifier, jsonElement) -> {
            DataResult<ArmorSet> result = ArmorSet.decode(jsonElement);

            result.error().ifPresent(error -> ModConstants.LOGGER.error(
                    "Failed to decode armor set {}: {}",
                    identifier,
                    error.message()
            ));

            result.result().ifPresent(armorSet -> loadedArmorSets.put(identifier, armorSet));
        });

        armorSets = Map.copyOf(loadedArmorSets);

        ModConstants.LOGGER.info("Loaded {} armor sets", armorSets.size());
    }

    public static Optional<ArmorSet> get(Identifier identifier) {
        return Optional.ofNullable(armorSets.get(identifier));
    }

    public static void clear() {
        armorSets = Map.of();
    }
}

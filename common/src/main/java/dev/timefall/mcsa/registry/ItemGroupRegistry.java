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

        ITEM_GROUP.register("story_mode_armor", () -> ItemGroup.create(null, -1)
                .displayName(Text.translatable("itemGroup.mcsa.story_mode_armor"))
                .icon(() -> new ItemStack(ItemRegistry.ADAMANTIUM_IMPERVIUM_CHESTPLATE.get()))
                .entries((displayContext, entries) -> {
                    entries.add(ItemRegistry.ADAMANTIUM_IMPERVIUM_HELMET.get());
                    entries.add(ItemRegistry.ADAMANTIUM_IMPERVIUM_CHESTPLATE.get());
                    entries.add(ItemRegistry.ADAMANTIUM_IMPERVIUM_LEGGINGS.get());
                    entries.add(ItemRegistry.ADAMANTIUM_IMPERVIUM_BOOTS.get());

                    entries.add(ItemRegistry.CHAMPION_PETRA_HELMET.get());
                    entries.add(ItemRegistry.CHAMPION_PETRA_CHESTPLATE.get());
                    entries.add(ItemRegistry.CHAMPION_PETRA_LEGGINGS.get());
                    entries.add(ItemRegistry.CHAMPION_PETRA_BOOTS.get());
                })
                .build());
    }
}

package timefall.mcsa.forge.loot;

import com.google.gson.JsonObject;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.context.LootContext;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;
import timefall.mcsa.Mcsa;

import java.util.List;

public class ArmorerChestLootModifier extends LootModifier {
    private final Item addition;

    protected ArmorerChestLootModifier(LootCondition[] conditionsIn, Item addition) {
        super(conditionsIn);
        this.addition = addition;
    }

    @NotNull
    @Override
    protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext ctx) {
        generatedLoot.add(new ItemStack(addition, 1));
        return generatedLoot;
    }

    public static class Serializer extends GlobalLootModifierSerializer<ArmorerChestLootModifier> {

        @Override
        public ArmorerChestLootModifier read(Identifier name, JsonObject object, LootCondition[] conditionsIn) {
            //Item addition = ForgeRegistries.ITEMS.getValue(
            //        new Identifier(JsonHelper.getString(object, "addition"))
            //);
            Item addition = Mcsa.REGISTRIES.get().get(Registry.ITEM_KEY).get(
                    new Identifier(JsonHelper.getString(object, "addition")));
            return new ArmorerChestLootModifier(conditionsIn, addition);
        }

        @Override
        public JsonObject write(ArmorerChestLootModifier instance) {
            JsonObject json = makeConditions(instance.conditions);
            json.addProperty("addition", Mcsa.ITEM_REGISTRAR.getKey(instance.addition).toString());
            return json;
        }
    }
}

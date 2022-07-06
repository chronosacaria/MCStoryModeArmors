package timefall.mcsa.forge.items.blockitems;

import net.minecraft.block.Block;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.EndermanEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.extensions.IForgeItem;

import javax.annotation.Nullable;

public class CarvedWhitePumpkinBlockItem extends BlockItem implements IForgeItem {
    public CarvedWhitePumpkinBlockItem(Block block, Settings settings) {
        super(block, settings);
    }

    @Nullable
    @Override
    public EquipmentSlot getEquipmentSlot(ItemStack itemStack){
        return EquipmentSlot.HEAD;
    }

    @Override
    public boolean isEnderMask(ItemStack stack, PlayerEntity player, EndermanEntity endermanEntity) {
        return true;
    }

    @Override
    public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
        if (!world.isClient()) {
            ItemStack headStack = player.getEquippedStack(EquipmentSlot.HEAD);
            StatusEffectInstance nightVision = new StatusEffectInstance(StatusEffects.NIGHT_VISION, 300, 0, true, false);
            if (headStack.getItem() == this) {
                player.addStatusEffect(nightVision);
            }
        }
    }


}

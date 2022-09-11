package timefall.mcsa.init;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.registry.Registry;
import timefall.mcsa.Mcsa;
import timefall.mcsa.blocks.CarvedWhitePumpkinBlock;
import timefall.mcsa.blocks.WhitePumpkinBlock;

public class BlocksInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Mcsa.MOD_ID, Registry.BLOCK_KEY);

    public static final RegistrySupplier<WhitePumpkinBlock> WHITE_PUMPKIN_BLOCK =  BLOCKS.register("white_pumpkin",
            () -> new WhitePumpkinBlock(AbstractBlock.Settings.of(Material.GOURD).strength(1.0F).sounds(BlockSoundGroup.WOOD)));
    public static final RegistrySupplier<CarvedWhitePumpkinBlock> CARVED_WHITE_PUMPKIN_BLOCK = BLOCKS.register("carved_white_pumpkin",
            () -> new CarvedWhitePumpkinBlock(AbstractBlock.Settings.of(Material.GOURD).strength(1.0F).sounds(BlockSoundGroup.WOOD).luminance((value -> 15))));
}

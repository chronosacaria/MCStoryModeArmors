package timefall.mcsa.blocks;

import net.minecraft.block.CarvedPumpkinBlock;
import net.minecraft.item.Wearable;
import net.minecraft.util.math.Direction;

public class CarvedWhitePumpkinBlock extends CarvedPumpkinBlock implements Wearable {

    public CarvedWhitePumpkinBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH));
    }
}

package timefall.mcsa.forge;

import net.minecraftforge.fml.loading.FMLPaths;
import timefall.mcsa.McsaExpectPlatform;

import java.nio.file.Path;

public class McsaExpectPlatformImpl {
    /**
     * This is our actual method to {@link McsaExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}

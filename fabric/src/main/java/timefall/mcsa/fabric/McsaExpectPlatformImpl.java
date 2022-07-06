package timefall.mcsa.fabric;

import timefall.mcsa.McsaExpectPlatform;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class McsaExpectPlatformImpl {
    /**
     * This is our actual method to {@link McsaExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
}

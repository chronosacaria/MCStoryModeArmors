package timefall.mcsa.fabric;

import net.fabricmc.loader.api.FabricLoader;
import timefall.mcsa.McsaExpectPlatform;

import java.nio.file.Path;

public class McsaExpectPlatformImpl {
    /**
     * This is our actual method to {@link McsaExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
}

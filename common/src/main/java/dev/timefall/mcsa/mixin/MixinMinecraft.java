package dev.timefall.mcsa.mixin;

import dev.timefall.mcsa.ModConstants;
import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
public class MixinMinecraft {
    
    @Inject(at = @At("TAIL"), method = "<init>")
    private void init(CallbackInfo info) {
        
        ModConstants.LOGGER.info("This line is printed by an example mod common mixin!");
        ModConstants.LOGGER.info("MC Version: {}", MinecraftClient.getInstance().getVersionType());
    }
}
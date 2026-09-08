package dev.timefall.mcsa.mixin;

import dev.timefall.mcsa.ModConstants;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class MixinTitleScreen {
    
    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info) {
        
        ModConstants.LOGGER.info("This line is printed by an example mod mixin from Fabric!");
        ModConstants.LOGGER.info("MC Version: {}", MinecraftClient.getInstance().getVersionType());
    }
}
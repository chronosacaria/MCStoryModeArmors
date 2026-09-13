package dev.timefall.mcsa;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModConstants {

	public static final String MOD_ID = "mcsa";
	public static final String MOD_NAME = "MC Story Mode Armors";
	public static Identifier ID(String path) {
		return Identifier.of(MOD_ID, path);
	}
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);
}
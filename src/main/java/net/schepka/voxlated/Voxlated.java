package net.schepka.voxlated;

import net.fabricmc.api.ModInitializer;

import net.schepka.voxlated.item.ModItemGroups;
import net.schepka.voxlated.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Voxlated implements ModInitializer {
	public static final String MOD_ID = "voxlated";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
	}
}
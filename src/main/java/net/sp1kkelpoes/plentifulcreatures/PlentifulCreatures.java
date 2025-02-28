package net.sp1kkelpoes.plentifulcreatures;

import net.fabricmc.api.ModInitializer;

import net.sp1kkelpoes.plentifulcreatures.item.ModItemGroups;
import net.sp1kkelpoes.plentifulcreatures.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlentifulCreatures implements ModInitializer {
	public static final String MOD_ID = "plentifulcreatures";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}
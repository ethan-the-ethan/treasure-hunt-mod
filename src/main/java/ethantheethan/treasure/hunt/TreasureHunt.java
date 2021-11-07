package ethantheethan.treasure.hunt;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TreasureHunt implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger("treasurehunt");

	public static final Item PIECE_ONE = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item PIECE_TWO = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item PIECE_THREE = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item PIECE_FOUR = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item PIECE_FIVE = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item PIECE_SIX = new Item(new Item.Settings().group(ItemGroup.MISC));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");

		Registry.register(Registry.ITEM, new Identifier("treasurehunt", "piece_one"), PIECE_ONE);
		Registry.register(Registry.ITEM, new Identifier("treasurehunt", "piece_two"), PIECE_TWO);
		Registry.register(Registry.ITEM, new Identifier("treasurehunt", "piece_three"), PIECE_THREE);
		Registry.register(Registry.ITEM, new Identifier("treasurehunt", "piece_four"), PIECE_FOUR);
		Registry.register(Registry.ITEM, new Identifier("treasurehunt", "piece_five"), PIECE_FIVE);
		Registry.register(Registry.ITEM, new Identifier("treasurehunt", "piece_six"), PIECE_SIX);	
	}
}

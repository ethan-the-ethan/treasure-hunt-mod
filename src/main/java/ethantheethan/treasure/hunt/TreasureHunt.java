package ethantheethan.treasure.hunt;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TreasureHunt implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger("treasurehunt");

	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(
		new Identifier("treasurehunt", "treasurehunt"))
		.icon(() -> new ItemStack(TreasureHunt.PIECE_ONE))
		.build();

	public static class PieceOne extends Item {
		public PieceOne(Settings settings) {
			super(settings);
		}
		@Override
		public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
			// formatted red text
			tooltip.add( new TranslatableText("item.treasurehunt.piece_one.tooltip").formatted(Formatting.RED) );
		}
	}

	public static class PieceTwo extends Item {
		public PieceTwo(Settings settings) {
			super(settings);
		}
		@Override
		public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
			// formatted red text
			tooltip.add( new TranslatableText("item.treasurehunt.piece_two.tooltip").formatted(Formatting.GOLD) );
		}
	}

	public static class PieceThree extends Item {
		public PieceThree(Settings settings) {
			super(settings);
		}
		@Override
		public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
			// formatted red text
			tooltip.add( new TranslatableText("item.treasurehunt.piece_three.tooltip").formatted(Formatting.YELLOW) );
		}
	}

	public static class PieceFour extends Item {
		public PieceFour(Settings settings) {
			super(settings);
		}
		@Override
		public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
			// formatted red text
			tooltip.add( new TranslatableText("item.treasurehunt.piece_four.tooltip").formatted(Formatting.GREEN) );
		}
	}

	public static class PieceFive extends Item {
		public PieceFive(Settings settings) {
			super(settings);
		}
		@Override
		public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
			// formatted red text
			tooltip.add( new TranslatableText("item.treasurehunt.piece_five.tooltip").formatted(Formatting.BLUE) );
		}
	}

	public static class PieceSix extends Item {
		public PieceSix(Settings settings) {
			super(settings);
		}
		@Override
		public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
			// formatted red text
			tooltip.add( new TranslatableText("item.treasurehunt.piece_six.tooltip").formatted(Formatting.LIGHT_PURPLE).formatted(Formatting.OBFUSCATED));
		}
	}

	public static class ColourWheel extends Item {
		public ColourWheel(Settings settings) {
			super(settings);
		}
		@Override
		public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
			tooltip.add( new TranslatableText("item.treasurehunt.colour_wheel.tooltip").formatted(Formatting.AQUA));
		}
	}

	public static class EmptyColourWheel extends Item {
		public EmptyColourWheel(Settings settings) {
			super(settings);
		}
		@Override
		public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
			tooltip.add(new TranslatableText("item.treasurehunt.empty_colour_wheel.tooltip").formatted(Formatting.GRAY).formatted(Formatting.ITALIC));
		}
	}

	public static final PieceOne PIECE_ONE = new PieceOne(new FabricItemSettings().group(TreasureHunt.ITEM_GROUP).maxCount(1).rarity(Rarity.UNCOMMON));
	public static final PieceTwo PIECE_TWO = new PieceTwo(new FabricItemSettings().group(TreasureHunt.ITEM_GROUP).maxCount(1).rarity(Rarity.UNCOMMON));
	public static final PieceThree PIECE_THREE = new PieceThree(new FabricItemSettings().group(TreasureHunt.ITEM_GROUP).maxCount(1).rarity(Rarity.UNCOMMON));
	public static final PieceFour PIECE_FOUR = new PieceFour(new FabricItemSettings().group(TreasureHunt.ITEM_GROUP).maxCount(1).rarity(Rarity.UNCOMMON));
	public static final PieceFive PIECE_FIVE = new PieceFive(new FabricItemSettings().group(TreasureHunt.ITEM_GROUP).maxCount(1).rarity(Rarity.UNCOMMON));
	public static final PieceSix PIECE_SIX = new PieceSix(new FabricItemSettings().group(TreasureHunt.ITEM_GROUP).maxCount(1).rarity(Rarity.UNCOMMON));
	public static final ColourWheel COLOUR_WHEEL = new ColourWheel(new FabricItemSettings().group(TreasureHunt.ITEM_GROUP).maxCount(1).rarity(Rarity.EPIC));
	public static final EmptyColourWheel EMPTY_COLOUR_WHEEL = new EmptyColourWheel(new FabricItemSettings().group(TreasureHunt.ITEM_GROUP).maxCount(1).rarity(Rarity.RARE));
	
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Starting Treasure Hunt Mod...");
		Registry.register(Registry.ITEM, new Identifier("treasurehunt", "piece_one"), PIECE_ONE);
		Registry.register(Registry.ITEM, new Identifier("treasurehunt", "piece_two"), PIECE_TWO);
		Registry.register(Registry.ITEM, new Identifier("treasurehunt", "piece_three"), PIECE_THREE);
		Registry.register(Registry.ITEM, new Identifier("treasurehunt", "piece_four"), PIECE_FOUR);
		Registry.register(Registry.ITEM, new Identifier("treasurehunt", "piece_five"), PIECE_FIVE);
		Registry.register(Registry.ITEM, new Identifier("treasurehunt", "piece_six"), PIECE_SIX);
		Registry.register(Registry.ITEM, new Identifier("treasurehunt", "colour_wheel"), COLOUR_WHEEL);
		Registry.register(Registry.ITEM, new Identifier("treasurehunt", "empty_colour_wheel"), EMPTY_COLOUR_WHEEL);
	}
}

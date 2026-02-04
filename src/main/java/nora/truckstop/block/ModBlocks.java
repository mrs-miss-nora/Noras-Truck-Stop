package nora.truckstop.block;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import nora.truckstop.NorasTruckStop;
import nora.truckstop.block.custom.HorizontalPlaceableBlock;

public class ModBlocks {

    public static final Block OCHRE_BRICKS = registerBlock("ochre_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.BRICKS)));
    public static final Block OCHRE_BRICK_STAIRS = registerBlock("ochre_brick_stairs",
            new StairsBlock(OCHRE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BRICKS)));
    public static final Block OCHRE_BRICK_SLAB = registerBlock("ochre_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BRICKS)));
    public static final Block OCHRE_BRICK_WALL = registerBlock("ochre_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BRICKS)));

    public static final Block EBONY_BRICKS = registerBlock("ebony_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.BRICKS)));
    public static final Block EBONY_BRICK_STAIRS = registerBlock("ebony_brick_stairs",
            new StairsBlock(EBONY_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BRICKS)));
    public static final Block EBONY_BRICK_SLAB = registerBlock("ebony_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BRICKS)));
    public static final Block EBONY_BRICK_WALL = registerBlock("ebony_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BRICKS)));

    public static final Block PEARL_BRICKS = registerBlock("pearl_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.BRICKS)));
    public static final Block PEARL_BRICK_STAIRS = registerBlock("pearl_brick_stairs",
            new StairsBlock(PEARL_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BRICKS)));
    public static final Block PEARL_BRICK_SLAB = registerBlock("pearl_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BRICKS)));
    public static final Block PEARL_BRICK_WALL = registerBlock("pearl_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BRICKS)));

    public static final Block CLAY_SHINGLES = registerBlock("clay_shingles",
            new Block(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS).sounds(BlockSoundGroup.DECORATED_POT)));
    public static final Block CLAY_SHINGLE_STAIRS = registerBlock("clay_shingle_stairs",
            new StairsBlock(CLAY_SHINGLES.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MUD_BRICKS).sounds(BlockSoundGroup.DECORATED_POT)));
    public static final Block CLAY_SHINGLE_SLAB = registerBlock("clay_shingle_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS).sounds(BlockSoundGroup.DECORATED_POT)));

    public static final Block OCHRE_SHINGLES = registerBlock("ochre_shingles",
            new Block(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS).sounds(BlockSoundGroup.DECORATED_POT)));
    public static final Block OCHRE_SHINGLE_STAIRS = registerBlock("ochre_shingle_stairs",
            new StairsBlock(OCHRE_SHINGLES.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MUD_BRICKS).sounds(BlockSoundGroup.DECORATED_POT)));
    public static final Block OCHRE_SHINGLE_SLAB = registerBlock("ochre_shingle_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS).sounds(BlockSoundGroup.DECORATED_POT)));

    public static final Block EBONY_SHINGLES = registerBlock("ebony_shingles",
            new Block(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS).sounds(BlockSoundGroup.DECORATED_POT)));
    public static final Block EBONY_SHINGLE_STAIRS = registerBlock("ebony_shingle_stairs",
            new StairsBlock(EBONY_SHINGLES.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MUD_BRICKS).sounds(BlockSoundGroup.DECORATED_POT)));
    public static final Block EBONY_SHINGLE_SLAB = registerBlock("ebony_shingle_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS).sounds(BlockSoundGroup.DECORATED_POT)));

    public static final Block PEARL_SHINGLES = registerBlock("pearl_shingles",
            new Block(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS).sounds(BlockSoundGroup.DECORATED_POT)));
    public static final Block PEARL_SHINGLE_STAIRS = registerBlock("pearl_shingle_stairs",
            new StairsBlock(PEARL_SHINGLES.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MUD_BRICKS).sounds(BlockSoundGroup.DECORATED_POT)));
    public static final Block PEARL_SHINGLE_SLAB = registerBlock("pearl_shingle_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS).sounds(BlockSoundGroup.DECORATED_POT)));

    public static final Block LAPIS_SHINGLES = registerBlock("lapis_shingles",
            new Block(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS).sounds(BlockSoundGroup.DECORATED_POT)));
    public static final Block LAPIS_SHINGLE_STAIRS = registerBlock("lapis_shingle_stairs",
            new StairsBlock(LAPIS_SHINGLES.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MUD_BRICKS).sounds(BlockSoundGroup.DECORATED_POT)));
    public static final Block LAPIS_SHINGLE_SLAB = registerBlock("lapis_shingle_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS).sounds(BlockSoundGroup.DECORATED_POT)));

    public static final Block MINT_SHINGLES = registerBlock("mint_shingles",
            new Block(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS).sounds(BlockSoundGroup.DECORATED_POT)));
    public static final Block MINT_SHINGLE_STAIRS = registerBlock("mint_shingle_stairs",
            new StairsBlock(MINT_SHINGLES.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MUD_BRICKS).sounds(BlockSoundGroup.DECORATED_POT)));
    public static final Block MINT_SHINGLE_SLAB = registerBlock("mint_shingle_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS).sounds(BlockSoundGroup.DECORATED_POT)));

    public static final Block PRISMARINE_SHINGLES = registerBlock("prismarine_shingles",
            new Block(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS).sounds(BlockSoundGroup.DECORATED_POT)));
    public static final Block PRISMARINE_SHINGLE_STAIRS = registerBlock("prismarine_shingle_stairs",
            new StairsBlock(PRISMARINE_SHINGLES.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MUD_BRICKS).sounds(BlockSoundGroup.DECORATED_POT)));
    public static final Block PRISMARINE_SHINGLE_SLAB = registerBlock("prismarine_shingle_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS).sounds(BlockSoundGroup.DECORATED_POT)));

    public static final Block SHULKER_SHINGLES = registerBlock("shulker_shingles",
            new Block(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS).sounds(BlockSoundGroup.DECORATED_POT)));
    public static final Block SHULKER_SHINGLE_STAIRS = registerBlock("shulker_shingle_stairs",
            new StairsBlock(SHULKER_SHINGLES.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MUD_BRICKS).sounds(BlockSoundGroup.DECORATED_POT)));
    public static final Block SHULKER_SHINGLE_SLAB = registerBlock("shulker_shingle_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS).sounds(BlockSoundGroup.DECORATED_POT)));

    public static final Block SLATE_SHINGLES = registerBlock("slate_shingles",
            new Block(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS).sounds(BlockSoundGroup.DECORATED_POT)));
    public static final Block SLATE_SHINGLE_STAIRS = registerBlock("slate_shingle_stairs",
            new StairsBlock(SLATE_SHINGLES.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MUD_BRICKS).sounds(BlockSoundGroup.DECORATED_POT)));
    public static final Block SLATE_SHINGLE_SLAB = registerBlock("slate_shingle_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS).sounds(BlockSoundGroup.DECORATED_POT)));

    public static final Block EVERGREEN_SHINGLES = registerBlock("evergreen_shingles",
            new Block(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS).sounds(BlockSoundGroup.DECORATED_POT)));
    public static final Block EVERGREEN_SHINGLE_STAIRS = registerBlock("evergreen_shingle_stairs",
            new StairsBlock(EVERGREEN_SHINGLES.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MUD_BRICKS).sounds(BlockSoundGroup.DECORATED_POT)));
    public static final Block EVERGREEN_SHINGLE_SLAB = registerBlock("evergreen_shingle_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS).sounds(BlockSoundGroup.DECORATED_POT)));

    public static final Block CHERRY_SHINGLES = registerBlock("cherry_shingles",
            new Block(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS).sounds(BlockSoundGroup.DECORATED_POT)));
    public static final Block CHERRY_SHINGLE_STAIRS = registerBlock("cherry_shingle_stairs",
            new StairsBlock(CHERRY_SHINGLES.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MUD_BRICKS).sounds(BlockSoundGroup.DECORATED_POT)));
    public static final Block CHERRY_SHINGLE_SLAB = registerBlock("cherry_shingle_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS).sounds(BlockSoundGroup.DECORATED_POT)));

    public static final Block VELVET_CUSHIONS = registerBlock("velvet_cushions",
            new Block(AbstractBlock.Settings.copy(Blocks.RED_WOOL)));
    public static final Block VELVET_CUSHION_STAIRS = registerBlock("velvet_cushion_stairs",
            new StairsBlock(VELVET_CUSHIONS.getDefaultState(),AbstractBlock.Settings.copy(Blocks.RED_WOOL)));
    public static final Block VELVET_CUSHION_SLAB = registerBlock("velvet_cushion_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.RED_WOOL)));

    public static final Block LEMON_VELVET_CUSHIONS = registerBlock("lemon_velvet_cushions",
            new Block(AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL)));
    public static final Block LEMON_VELVET_CUSHION_STAIRS = registerBlock("lemon_velvet_cushion_stairs",
            new StairsBlock(LEMON_VELVET_CUSHIONS.getDefaultState(),AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL)));
    public static final Block LEMON_VELVET_CUSHION_SLAB = registerBlock("lemon_velvet_cushion_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL)));

    public static final Block ARCADE_CARPET = registerBlock("arcade_carpet",
            new Block(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL)));

    public static final Block BEIGE_CORRUGATED_METAL_BLOCK = registerBlock("beige_corrugated_metal_block",
            new Block(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block BEIGE_CORRUGATED_METAL_STAIRS = registerBlock("beige_corrugated_metal_stairs",
            new StairsBlock(BEIGE_CORRUGATED_METAL_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block BEIGE_CORRUGATED_METAL_SLAB = registerBlock("beige_corrugated_metal_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block BEIGE_CORRUGATED_METAL_WALL = registerBlock("beige_corrugated_metal_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block BEIGE_CORRUGATED_METAL_WINDOW = registerBlock("beige_corrugated_metal_window",
            new Block(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK).nonOpaque()));
    public static final Block DECORATED_BEIGE_CORRUGATED_METAL_BLOCK = registerBlock("decorated_beige_corrugated_metal_block",
            new Block(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block DECORATED_BEIGE_CORRUGATED_METAL_STAIRS = registerBlock("decorated_beige_corrugated_metal_stairs",
            new StairsBlock(DECORATED_BEIGE_CORRUGATED_METAL_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block DECORATED_BEIGE_CORRUGATED_METAL_SLAB = registerBlock("decorated_beige_corrugated_metal_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block DECORATED_BEIGE_CORRUGATED_METAL_WALL = registerBlock("decorated_beige_corrugated_metal_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block BEIGE_CORRUGATED_METAL_DOOR = registerBlock("beige_corrugated_metal_door",
            new DoorBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK).nonOpaque()));
    public static final Block BEIGE_CORRUGATED_METAL_TRAPDOOR = registerBlock("beige_corrugated_metal_trapdoor",
            new TrapdoorBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK).nonOpaque()));

    public static final Block WHITE_CORRUGATED_METAL_BLOCK = registerBlock("white_corrugated_metal_block",
            new Block(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block WHITE_CORRUGATED_METAL_STAIRS = registerBlock("white_corrugated_metal_stairs",
            new StairsBlock(WHITE_CORRUGATED_METAL_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block WHITE_CORRUGATED_METAL_SLAB = registerBlock("white_corrugated_metal_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block WHITE_CORRUGATED_METAL_WALL = registerBlock("white_corrugated_metal_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block WHITE_CORRUGATED_METAL_WINDOW = registerBlock("white_corrugated_metal_window",
            new Block(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK).nonOpaque()));
    public static final Block DECORATED_WHITE_CORRUGATED_METAL_BLOCK = registerBlock("decorated_white_corrugated_metal_block",
            new Block(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block DECORATED_WHITE_CORRUGATED_METAL_STAIRS = registerBlock("decorated_white_corrugated_metal_stairs",
            new StairsBlock(DECORATED_WHITE_CORRUGATED_METAL_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block DECORATED_WHITE_CORRUGATED_METAL_SLAB = registerBlock("decorated_white_corrugated_metal_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block DECORATED_WHITE_CORRUGATED_METAL_WALL = registerBlock("decorated_white_corrugated_metal_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block WHITE_CORRUGATED_METAL_DOOR = registerBlock("white_corrugated_metal_door",
            new DoorBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK).nonOpaque()));
    public static final Block WHITE_CORRUGATED_METAL_TRAPDOOR = registerBlock("white_corrugated_metal_trapdoor",
            new TrapdoorBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK).nonOpaque()));

    public static final Block VINYL_WOOD = registerBlock("vinyl_wood",
            new Block(AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD)));
    public static final Block VINYL_WOOD_STAIRS = registerBlock("vinyl_wood_stairs",
            new StairsBlock(VINYL_WOOD.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD)));
    public static final Block VINYL_WOOD_SLAB = registerBlock("vinyl_wood_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD)));
    public static final Block VINYL_WOOD_WALL = registerBlock("vinyl_wood_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD)));
    public static final Block SMALL_VINYL_WOOD_PANELING = registerBlock("small_vinyl_wood_paneling",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD)));
    public static final Block LARGE_VINYL_WOOD_PANELING = registerBlock("large_vinyl_wood_paneling",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD)));

    public static final Block CARDBOARD_BOX = registerBlock("cardboard_box",
            new HorizontalPlaceableBlock(AbstractBlock.Settings.copy(Blocks.CRAFTING_TABLE).sounds(BlockSoundGroup.SCAFFOLDING).strength(1f)));

    public static final Block GARAGE_PANEL = registerBlock("garage_panel",
            new Block(AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK).strength(3f)));
    public static final Block GARAGE_PANEL_WALL = registerBlock("garage_panel_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK).strength(3f)));
    public static final Block GARAGE_WINDOW = registerBlock("garage_window",
            new Block(AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK).nonOpaque().strength(3f)));
    public static final Block GARAGE_WINDOW_WALL = registerBlock("garage_window_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK).strength(3f)));

    public static final Block BARE_DRYWALL = registerBlock("bare_drywall",
            new Block(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block BARE_DRYWALL_STAIRS = registerBlock("bare_drywall_stairs",
            new StairsBlock(BARE_DRYWALL.getDefaultState(), AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block BARE_DRYWALL_SLAB = registerBlock("bare_drywall_slab",
            new SlabBlock(AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block BARE_DRYWALL_WALL = registerBlock("bare_drywall_wall",
            new WallBlock(AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block WHITE_DRYWALL = registerBlock("white_drywall",
            new Block(AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block WHITE_DRYWALL_STAIRS = registerBlock("white_drywall_stairs",
            new StairsBlock(BARE_DRYWALL.getDefaultState(), AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block WHITE_DRYWALL_SLAB = registerBlock("white_drywall_slab",
            new SlabBlock(AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block WHITE_DRYWALL_WALL = registerBlock("white_drywall_wall",
            new WallBlock(AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block BROWN_DRYWALL = registerBlock("brown_drywall",
            new Block(AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block BROWN_DRYWALL_STAIRS = registerBlock("brown_drywall_stairs",
            new StairsBlock(BARE_DRYWALL.getDefaultState(), AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block BROWN_DRYWALL_SLAB = registerBlock("brown_drywall_slab",
            new SlabBlock(AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block BROWN_DRYWALL_WALL = registerBlock("brown_drywall_wall",
            new WallBlock(AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block TAN_DRYWALL = registerBlock("tan_drywall",
            new Block(AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block TAN_DRYWALL_STAIRS = registerBlock("tan_drywall_stairs",
            new StairsBlock(BARE_DRYWALL.getDefaultState(), AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block TAN_DRYWALL_SLAB = registerBlock("tan_drywall_slab",
            new SlabBlock(AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block TAN_DRYWALL_WALL = registerBlock("tan_drywall_wall",
            new WallBlock(AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block RED_DRYWALL = registerBlock("red_drywall",
            new Block(AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block RED_DRYWALL_STAIRS = registerBlock("red_drywall_stairs",
            new StairsBlock(BARE_DRYWALL.getDefaultState(), AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block RED_DRYWALL_SLAB = registerBlock("red_drywall_slab",
            new SlabBlock(AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block RED_DRYWALL_WALL = registerBlock("red_drywall_wall",
            new WallBlock(AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block ORANGE_DRYWALL = registerBlock("orange_drywall",
            new Block(AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block ORANGE_DRYWALL_STAIRS = registerBlock("orange_drywall_stairs",
            new StairsBlock(BARE_DRYWALL.getDefaultState(), AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block ORANGE_DRYWALL_SLAB = registerBlock("orange_drywall_slab",
            new SlabBlock(AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block ORANGE_DRYWALL_WALL = registerBlock("orange_drywall_wall",
            new WallBlock(AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block YELLOW_DRYWALL = registerBlock("yellow_drywall",
            new Block(AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block YELLOW_DRYWALL_STAIRS = registerBlock("yellow_drywall_stairs",
            new StairsBlock(BARE_DRYWALL.getDefaultState(), AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block YELLOW_DRYWALL_SLAB = registerBlock("yellow_drywall_slab",
            new SlabBlock(AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block YELLOW_DRYWALL_WALL = registerBlock("yellow_drywall_wall",
            new WallBlock(AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block LIME_DRYWALL = registerBlock("lime_drywall",
            new Block(AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block LIME_DRYWALL_STAIRS = registerBlock("lime_drywall_stairs",
            new StairsBlock(BARE_DRYWALL.getDefaultState(), AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block LIME_DRYWALL_SLAB = registerBlock("lime_drywall_slab",
            new SlabBlock(AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block LIME_DRYWALL_WALL = registerBlock("lime_drywall_wall",
            new WallBlock(AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block TURQUOISE_DRYWALL = registerBlock("turquoise_drywall",
            new Block(AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block TURQUOISE_DRYWALL_STAIRS = registerBlock("turqouise_drywall_stairs",
            new StairsBlock(BARE_DRYWALL.getDefaultState(), AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block TURQUOISE_DRYWALL_SLAB = registerBlock("turqouise_drywall_slab",
            new SlabBlock(AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block TURQUOISE_DRYWALL_WALL = registerBlock("turqouise_drywall_wall",
            new WallBlock(AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block BLUE_DRYWALL = registerBlock("blue_drywall",
            new Block(AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block BLUE_DRYWALL_STAIRS = registerBlock("blue_drywall_stairs",
            new StairsBlock(BARE_DRYWALL.getDefaultState(), AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block BLUE_DRYWALL_SLAB = registerBlock("blue_drywall_slab",
            new SlabBlock(AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block BLUE_DRYWALL_WALL = registerBlock("blue_drywall_wall",
            new WallBlock(AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block INDIGO_DRYWALL = registerBlock("indigo_drywall",
            new Block(AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block INDIGO_DRYWALL_STAIRS = registerBlock("indigo_drywall_stairs",
            new StairsBlock(BARE_DRYWALL.getDefaultState(), AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block INDIGO_DRYWALL_SLAB = registerBlock("indigo_drywall_slab",
            new SlabBlock(AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block INDIGO_DRYWALL_WALL = registerBlock("indigo_drywall_wall",
            new WallBlock(AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block PURPLE_DRYWALL = registerBlock("purple_drywall",
            new Block(AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block PURPLE_DRYWALL_STAIRS = registerBlock("purple_drywall_stairs",
            new StairsBlock(BARE_DRYWALL.getDefaultState(), AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block PURPLE_DRYWALL_SLAB = registerBlock("purple_drywall_slab",
            new SlabBlock(AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block PURPLE_DRYWALL_WALL = registerBlock("purple_drywall_wall",
            new WallBlock(AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block MAGENTA_DRYWALL = registerBlock("magenta_drywall",
            new Block(AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block MAGENTA_DRYWALL_STAIRS = registerBlock("magenta_drywall_stairs",
            new StairsBlock(BARE_DRYWALL.getDefaultState(), AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block MAGENTA_DRYWALL_SLAB = registerBlock("magenta_drywall_slab",
            new SlabBlock(AbstractBlock.Settings.copy(BARE_DRYWALL)));
    public static final Block MAGENTA_DRYWALL_WALL = registerBlock("magenta_drywall_wall",
            new WallBlock(AbstractBlock.Settings.copy(BARE_DRYWALL)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(NorasTruckStop.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(NorasTruckStop.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static final RegistryKey<ItemGroup> BUILDING_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(NorasTruckStop.MOD_ID, "building_group"));
    public static final ItemGroup BUILDING_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModBlocks.LEMON_VELVET_CUSHION_STAIRS))
            .displayName(Text.translatable("itemgroup.truckstop"))
            .build();

    public static void init() {
        NorasTruckStop.LOGGER.info("Painting Vinyls for "+NorasTruckStop.MOD_ID);

        Registry.register(Registries.ITEM_GROUP, BUILDING_KEY, BUILDING_GROUP);
        ItemGroupEvents.modifyEntriesEvent(BUILDING_KEY).register(TS_BLOCKS -> {
            TS_BLOCKS.add(OCHRE_BRICKS);
            TS_BLOCKS.add(OCHRE_BRICK_STAIRS);
            TS_BLOCKS.add(OCHRE_BRICK_SLAB);
            TS_BLOCKS.add(OCHRE_BRICK_WALL);
            TS_BLOCKS.add(EBONY_BRICKS);
            TS_BLOCKS.add(EBONY_BRICK_STAIRS);
            TS_BLOCKS.add(EBONY_BRICK_SLAB);
            TS_BLOCKS.add(EBONY_BRICK_WALL);
            TS_BLOCKS.add(PEARL_BRICKS);
            TS_BLOCKS.add(PEARL_BRICK_STAIRS);
            TS_BLOCKS.add(PEARL_BRICK_SLAB);
            TS_BLOCKS.add(PEARL_BRICK_WALL);

            TS_BLOCKS.add(CLAY_SHINGLES);
            TS_BLOCKS.add(CLAY_SHINGLE_STAIRS);
            TS_BLOCKS.add(CLAY_SHINGLE_SLAB);
            TS_BLOCKS.add(OCHRE_SHINGLES);
            TS_BLOCKS.add(OCHRE_SHINGLE_STAIRS);
            TS_BLOCKS.add(OCHRE_SHINGLE_SLAB);
            TS_BLOCKS.add(EBONY_SHINGLES);
            TS_BLOCKS.add(EBONY_SHINGLE_STAIRS);
            TS_BLOCKS.add(EBONY_SHINGLE_SLAB);
            TS_BLOCKS.add(PEARL_SHINGLES);
            TS_BLOCKS.add(PEARL_SHINGLE_STAIRS);
            TS_BLOCKS.add(PEARL_SHINGLE_SLAB);
            TS_BLOCKS.add(LAPIS_SHINGLES);
            TS_BLOCKS.add(LAPIS_SHINGLE_STAIRS);
            TS_BLOCKS.add(LAPIS_SHINGLE_SLAB);
            TS_BLOCKS.add(MINT_SHINGLES);
            TS_BLOCKS.add(MINT_SHINGLE_STAIRS);
            TS_BLOCKS.add(MINT_SHINGLE_SLAB);
            TS_BLOCKS.add(PRISMARINE_SHINGLES);
            TS_BLOCKS.add(PRISMARINE_SHINGLE_STAIRS);
            TS_BLOCKS.add(PRISMARINE_SHINGLE_SLAB);
            TS_BLOCKS.add(SHULKER_SHINGLES);
            TS_BLOCKS.add(SHULKER_SHINGLE_STAIRS);
            TS_BLOCKS.add(SHULKER_SHINGLE_SLAB);
            TS_BLOCKS.add(SLATE_SHINGLES);
            TS_BLOCKS.add(SLATE_SHINGLE_STAIRS);
            TS_BLOCKS.add(SLATE_SHINGLE_SLAB);
            TS_BLOCKS.add(EVERGREEN_SHINGLES);
            TS_BLOCKS.add(EVERGREEN_SHINGLE_STAIRS);
            TS_BLOCKS.add(EVERGREEN_SHINGLE_SLAB);
            TS_BLOCKS.add(CHERRY_SHINGLES);
            TS_BLOCKS.add(CHERRY_SHINGLE_STAIRS);
            TS_BLOCKS.add(CHERRY_SHINGLE_SLAB);

            TS_BLOCKS.add(VELVET_CUSHIONS);
            TS_BLOCKS.add(VELVET_CUSHION_STAIRS);
            TS_BLOCKS.add(VELVET_CUSHION_SLAB);
            TS_BLOCKS.add(LEMON_VELVET_CUSHIONS);
            TS_BLOCKS.add(LEMON_VELVET_CUSHION_STAIRS);
            TS_BLOCKS.add(LEMON_VELVET_CUSHION_SLAB);

            TS_BLOCKS.add(ARCADE_CARPET);

            TS_BLOCKS.add(BEIGE_CORRUGATED_METAL_BLOCK);
            TS_BLOCKS.add(BEIGE_CORRUGATED_METAL_STAIRS);
            TS_BLOCKS.add(BEIGE_CORRUGATED_METAL_SLAB);
            TS_BLOCKS.add(BEIGE_CORRUGATED_METAL_WALL);
            TS_BLOCKS.add(BEIGE_CORRUGATED_METAL_WINDOW);
            TS_BLOCKS.add(BEIGE_CORRUGATED_METAL_DOOR);
            TS_BLOCKS.add(BEIGE_CORRUGATED_METAL_TRAPDOOR);
            TS_BLOCKS.add(DECORATED_BEIGE_CORRUGATED_METAL_BLOCK);
            TS_BLOCKS.add(DECORATED_BEIGE_CORRUGATED_METAL_STAIRS);
            TS_BLOCKS.add(DECORATED_BEIGE_CORRUGATED_METAL_SLAB);
            TS_BLOCKS.add(DECORATED_BEIGE_CORRUGATED_METAL_WALL);

            TS_BLOCKS.add(WHITE_CORRUGATED_METAL_BLOCK);
            TS_BLOCKS.add(WHITE_CORRUGATED_METAL_STAIRS);
            TS_BLOCKS.add(WHITE_CORRUGATED_METAL_SLAB);
            TS_BLOCKS.add(WHITE_CORRUGATED_METAL_WALL);
            TS_BLOCKS.add(WHITE_CORRUGATED_METAL_WINDOW);
            TS_BLOCKS.add(WHITE_CORRUGATED_METAL_DOOR);
            TS_BLOCKS.add(WHITE_CORRUGATED_METAL_TRAPDOOR);
            TS_BLOCKS.add(DECORATED_WHITE_CORRUGATED_METAL_BLOCK);
            TS_BLOCKS.add(DECORATED_WHITE_CORRUGATED_METAL_STAIRS);
            TS_BLOCKS.add(DECORATED_WHITE_CORRUGATED_METAL_SLAB);
            TS_BLOCKS.add(DECORATED_WHITE_CORRUGATED_METAL_WALL);

            TS_BLOCKS.add(VINYL_WOOD);
            TS_BLOCKS.add(VINYL_WOOD_STAIRS);
            TS_BLOCKS.add(VINYL_WOOD_SLAB);
            TS_BLOCKS.add(SMALL_VINYL_WOOD_PANELING);
            TS_BLOCKS.add(LARGE_VINYL_WOOD_PANELING);

            TS_BLOCKS.add(CARDBOARD_BOX);

            TS_BLOCKS.add(GARAGE_PANEL);
            TS_BLOCKS.add(GARAGE_PANEL_WALL);
            TS_BLOCKS.add(GARAGE_WINDOW);
            TS_BLOCKS.add(GARAGE_WINDOW_WALL);

            TS_BLOCKS.add(BARE_DRYWALL);
            TS_BLOCKS.add(BARE_DRYWALL_STAIRS);
            TS_BLOCKS.add(BARE_DRYWALL_SLAB);
            TS_BLOCKS.add(BARE_DRYWALL_WALL);
            TS_BLOCKS.add(WHITE_DRYWALL);
            TS_BLOCKS.add(WHITE_DRYWALL_STAIRS);
            TS_BLOCKS.add(WHITE_DRYWALL_SLAB);
            TS_BLOCKS.add(WHITE_DRYWALL_WALL);
            TS_BLOCKS.add(BROWN_DRYWALL);
            TS_BLOCKS.add(BROWN_DRYWALL_STAIRS);
            TS_BLOCKS.add(BROWN_DRYWALL_SLAB);
            TS_BLOCKS.add(BROWN_DRYWALL_WALL);
            TS_BLOCKS.add(TAN_DRYWALL);
            TS_BLOCKS.add(TAN_DRYWALL_STAIRS);
            TS_BLOCKS.add(TAN_DRYWALL_SLAB);
            TS_BLOCKS.add(TAN_DRYWALL_WALL);
            TS_BLOCKS.add(RED_DRYWALL);
            TS_BLOCKS.add(RED_DRYWALL_STAIRS);
            TS_BLOCKS.add(RED_DRYWALL_SLAB);
            TS_BLOCKS.add(RED_DRYWALL_WALL);
            TS_BLOCKS.add(ORANGE_DRYWALL);
            TS_BLOCKS.add(ORANGE_DRYWALL_STAIRS);
            TS_BLOCKS.add(ORANGE_DRYWALL_SLAB);
            TS_BLOCKS.add(ORANGE_DRYWALL_WALL);
            TS_BLOCKS.add(YELLOW_DRYWALL);
            TS_BLOCKS.add(YELLOW_DRYWALL_STAIRS);
            TS_BLOCKS.add(YELLOW_DRYWALL_SLAB);
            TS_BLOCKS.add(YELLOW_DRYWALL_WALL);
            TS_BLOCKS.add(LIME_DRYWALL);
            TS_BLOCKS.add(LIME_DRYWALL_STAIRS);
            TS_BLOCKS.add(LIME_DRYWALL_SLAB);
            TS_BLOCKS.add(LIME_DRYWALL_WALL);
            TS_BLOCKS.add(TURQUOISE_DRYWALL);
            TS_BLOCKS.add(TURQUOISE_DRYWALL_STAIRS);
            TS_BLOCKS.add(TURQUOISE_DRYWALL_SLAB);
            TS_BLOCKS.add(TURQUOISE_DRYWALL_WALL);
            TS_BLOCKS.add(BLUE_DRYWALL);
            TS_BLOCKS.add(BLUE_DRYWALL_STAIRS);
            TS_BLOCKS.add(BLUE_DRYWALL_SLAB);
            TS_BLOCKS.add(BLUE_DRYWALL_WALL);
            TS_BLOCKS.add(INDIGO_DRYWALL);
            TS_BLOCKS.add(INDIGO_DRYWALL_STAIRS);
            TS_BLOCKS.add(INDIGO_DRYWALL_SLAB);
            TS_BLOCKS.add(INDIGO_DRYWALL_WALL);
            TS_BLOCKS.add(PURPLE_DRYWALL);
            TS_BLOCKS.add(PURPLE_DRYWALL_STAIRS);
            TS_BLOCKS.add(PURPLE_DRYWALL_SLAB);
            TS_BLOCKS.add(PURPLE_DRYWALL_WALL);
            TS_BLOCKS.add(MAGENTA_DRYWALL);
            TS_BLOCKS.add(MAGENTA_DRYWALL_STAIRS);
            TS_BLOCKS.add(MAGENTA_DRYWALL_SLAB);
            TS_BLOCKS.add(MAGENTA_DRYWALL_WALL);
        });
    }
}

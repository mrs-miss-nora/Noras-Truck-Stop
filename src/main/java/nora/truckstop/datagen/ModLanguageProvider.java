package nora.truckstop.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import nora.truckstop.block.ModBlocks;

import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class ModLanguageProvider extends FabricLanguageProvider {
    public ModLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {

        // overwrite default bricks?
        translationBuilder.add(Blocks.BRICKS, "Clay Bricks");
        translationBuilder.add(Blocks.BRICK_STAIRS, "Clay Brick Stairs");
        translationBuilder.add(Blocks.BRICK_SLAB, "Clay Brick Slab");
        translationBuilder.add(Blocks.BRICK_WALL, "Clay Brick Wall");

        // all the blocks in nts
        translationBuilder.add(ModBlocks.BUILDING_KEY, "Nora's Truck Stop");

        translationBuilder.add(ModBlocks.OCHRE_BRICKS, "Ochre Bricks");
        translationBuilder.add(ModBlocks.OCHRE_BRICK_STAIRS, "Ochre Brick Stairs");
        translationBuilder.add(ModBlocks.OCHRE_BRICK_SLAB, "Ochre Brick Slab");
        translationBuilder.add(ModBlocks.OCHRE_BRICK_WALL, "Ochre Brick Wall");

        translationBuilder.add(ModBlocks.EBONY_BRICKS, "Ebony Bricks");
        translationBuilder.add(ModBlocks.EBONY_BRICK_STAIRS, "Ebony Brick Stairs");
        translationBuilder.add(ModBlocks.EBONY_BRICK_SLAB, "Ebony Brick Slab");
        translationBuilder.add(ModBlocks.EBONY_BRICK_WALL, "Ebony Brick Wall");

        translationBuilder.add(ModBlocks.PEARL_BRICKS, "Pearl Bricks");
        translationBuilder.add(ModBlocks.PEARL_BRICK_STAIRS, "Pearl Brick Stairs");
        translationBuilder.add(ModBlocks.PEARL_BRICK_SLAB, "Pearl Brick Slab");
        translationBuilder.add(ModBlocks.PEARL_BRICK_WALL, "Pearl Brick Wall");

        translationBuilder.add(ModBlocks.CLAY_SHINGLES, "Clay Shingles");
        translationBuilder.add(ModBlocks.CLAY_SHINGLE_STAIRS, "Clay Shingle Stairs");
        translationBuilder.add(ModBlocks.CLAY_SHINGLE_SLAB, "Clay Shingle Slab");
        translationBuilder.add(ModBlocks.OCHRE_SHINGLES, "Ochre Shingles");
        translationBuilder.add(ModBlocks.OCHRE_SHINGLE_STAIRS, "Ochre Shingle Stairs");
        translationBuilder.add(ModBlocks.OCHRE_SHINGLE_SLAB, "Ochre Shingle Slab");
        translationBuilder.add(ModBlocks.EBONY_SHINGLES, "Ebony Shingles");
        translationBuilder.add(ModBlocks.EBONY_SHINGLE_STAIRS, "Ebony Shingle Stairs");
        translationBuilder.add(ModBlocks.EBONY_SHINGLE_SLAB, "Ebony Shingle Slab");
        translationBuilder.add(ModBlocks.PEARL_SHINGLES, "Pearl Shingles");
        translationBuilder.add(ModBlocks.PEARL_SHINGLE_STAIRS, "Pearl Shingle Stairs");
        translationBuilder.add(ModBlocks.PEARL_SHINGLE_SLAB, "Pearl Shingle Slab");
        translationBuilder.add(ModBlocks.LAPIS_SHINGLES, "Lapis Shingles");
        translationBuilder.add(ModBlocks.LAPIS_SHINGLE_STAIRS, "Lapis Shingle Stairs");
        translationBuilder.add(ModBlocks.LAPIS_SHINGLE_SLAB, "Lapis Shingle Slab");
        translationBuilder.add(ModBlocks.MINT_SHINGLES, "Mint Shingles");
        translationBuilder.add(ModBlocks.MINT_SHINGLE_STAIRS, "Mint Shingle Stairs");
        translationBuilder.add(ModBlocks.MINT_SHINGLE_SLAB, "Mint Shingle Slab");
        translationBuilder.add(ModBlocks.PRISMARINE_SHINGLES, "Prismarine Shingles");
        translationBuilder.add(ModBlocks.PRISMARINE_SHINGLE_STAIRS, "Prismarine Shingle Stairs");
        translationBuilder.add(ModBlocks.PRISMARINE_SHINGLE_SLAB, "Prismarine Shingle Slab");
        translationBuilder.add(ModBlocks.SHULKER_SHINGLES, "Shulker Shingles");
        translationBuilder.add(ModBlocks.SHULKER_SHINGLE_STAIRS, "Shulker Shingle Stairs");
        translationBuilder.add(ModBlocks.SHULKER_SHINGLE_SLAB, "Shulker Shingle Slab");
        translationBuilder.add(ModBlocks.SLATE_SHINGLES, "Slate Shingles");
        translationBuilder.add(ModBlocks.SLATE_SHINGLE_STAIRS, "Slate Shingle Stairs");
        translationBuilder.add(ModBlocks.SLATE_SHINGLE_SLAB, "Slate Shingle Slab");
        translationBuilder.add(ModBlocks.EVERGREEN_SHINGLES, "Evergreen Shingles");
        translationBuilder.add(ModBlocks.EVERGREEN_SHINGLE_STAIRS, "Evergreen Shingle Stairs");
        translationBuilder.add(ModBlocks.EVERGREEN_SHINGLE_SLAB, "Evergreen Shingle Slab");
        translationBuilder.add(ModBlocks.CHERRY_SHINGLES, "Cherry Shingles");
        translationBuilder.add(ModBlocks.CHERRY_SHINGLE_STAIRS, "Cherry Shingle Stairs");
        translationBuilder.add(ModBlocks.CHERRY_SHINGLE_SLAB, "Cherry Shingle Slab");

        translationBuilder.add(ModBlocks.VELVET_CUSHIONS, "Velvet Cushions");
        translationBuilder.add(ModBlocks.VELVET_CUSHION_STAIRS, "Velvet Cushion Stairs");
        translationBuilder.add(ModBlocks.VELVET_CUSHION_SLAB, "Velvet Cushion Slab");

        translationBuilder.add(ModBlocks.LEMON_VELVET_CUSHIONS, "Lemon Velvet Cushions");
        translationBuilder.add(ModBlocks.LEMON_VELVET_CUSHION_STAIRS, "Lemon Velvet Cushion Stairs");
        translationBuilder.add(ModBlocks.LEMON_VELVET_CUSHION_SLAB, "Lemon Velvet Cushion Slab");

        translationBuilder.add(ModBlocks.ARCADE_CARPET, "Arcade Carpet");

        translationBuilder.add(ModBlocks.BEIGE_CORRUGATED_METAL_BLOCK, "Beige Corrugated Metal Block");
        translationBuilder.add(ModBlocks.BEIGE_CORRUGATED_METAL_STAIRS, "Beige Corrugated Metal Stairs");
        translationBuilder.add(ModBlocks.BEIGE_CORRUGATED_METAL_SLAB, "Beige Corrugated Metal Slab");
        translationBuilder.add(ModBlocks.BEIGE_CORRUGATED_METAL_WALL, "Beige Corrugated Metal Wall");
        translationBuilder.add(ModBlocks.BEIGE_CORRUGATED_METAL_WINDOW, "Beige Corrugated Metal Window");
        translationBuilder.add(ModBlocks.BEIGE_CORRUGATED_METAL_DOOR, "Beige Corrugated Metal Door");
        translationBuilder.add(ModBlocks.BEIGE_CORRUGATED_METAL_TRAPDOOR, "Beige Corrugated Metal Trapdoor");
        translationBuilder.add(ModBlocks.DECORATED_BEIGE_CORRUGATED_METAL_BLOCK, "Decorated Beige Corrugated Metal Block");
        translationBuilder.add(ModBlocks.DECORATED_BEIGE_CORRUGATED_METAL_STAIRS, "Decorated Beige Corrugated Metal Stairs");
        translationBuilder.add(ModBlocks.DECORATED_BEIGE_CORRUGATED_METAL_SLAB, "Decorated Beige Corrugated Metal Slab");
        translationBuilder.add(ModBlocks.DECORATED_BEIGE_CORRUGATED_METAL_WALL, "Decorated Beige Corrugated Metal Wall");

        translationBuilder.add(ModBlocks.WHITE_CORRUGATED_METAL_BLOCK, "White Corrugated Metal Block");
        translationBuilder.add(ModBlocks.WHITE_CORRUGATED_METAL_STAIRS, "White Corrugated Metal Stairs");
        translationBuilder.add(ModBlocks.WHITE_CORRUGATED_METAL_SLAB, "White Corrugated Metal Slab");
        translationBuilder.add(ModBlocks.WHITE_CORRUGATED_METAL_WALL, "White Corrugated Metal Wall");
        translationBuilder.add(ModBlocks.WHITE_CORRUGATED_METAL_WINDOW, "White Corrugated Metal Window");
        translationBuilder.add(ModBlocks.WHITE_CORRUGATED_METAL_DOOR, "White Corrugated Metal Door");
        translationBuilder.add(ModBlocks.WHITE_CORRUGATED_METAL_TRAPDOOR, "White Corrugated Metal Trapdoor");
        translationBuilder.add(ModBlocks.DECORATED_WHITE_CORRUGATED_METAL_BLOCK, "Decorated White Corrugated Metal Block");
        translationBuilder.add(ModBlocks.DECORATED_WHITE_CORRUGATED_METAL_STAIRS, "Decorated White Corrugated Metal Stairs");
        translationBuilder.add(ModBlocks.DECORATED_WHITE_CORRUGATED_METAL_SLAB, "Decorated White Corrugated Metal Slab");
        translationBuilder.add(ModBlocks.DECORATED_WHITE_CORRUGATED_METAL_WALL, "Decorated White Corrugated Metal Wall");

        translationBuilder.add(ModBlocks.VINYL_WOOD, "Vinyl Wood");
        translationBuilder.add(ModBlocks.VINYL_WOOD_STAIRS, "Vinyl Wood Stairs");
        translationBuilder.add(ModBlocks.VINYL_WOOD_SLAB, "Vinyl Wood Slab");
        translationBuilder.add(ModBlocks.SMALL_VINYL_WOOD_PANELING, "Small Vinyl Wood Paneling");
        translationBuilder.add(ModBlocks.LARGE_VINYL_WOOD_PANELING, "Large Vinyl Wood Paneling");

        translationBuilder.add(ModBlocks.CARDBOARD_BOX, "Cardboard Box");

        translationBuilder.add(ModBlocks.GARAGE_PANEL, "Garage Panel");
        translationBuilder.add(ModBlocks.GARAGE_PANEL_WALL, "Garage Panel Wall");
        translationBuilder.add(ModBlocks.GARAGE_WINDOW, "Garage Window");
        translationBuilder.add(ModBlocks.GARAGE_WINDOW_WALL, "Garage Window Wall");

        translationBuilder.add(ModBlocks.BARE_DRYWALL, "Bare Drywall");
        translationBuilder.add(ModBlocks.BARE_DRYWALL_STAIRS, "Bare Drywall Stairs");
        translationBuilder.add(ModBlocks.BARE_DRYWALL_SLAB, "Bare Drywall Slab");
        translationBuilder.add(ModBlocks.BARE_DRYWALL_WALL, "Bare Drywall Wall");
        translationBuilder.add(ModBlocks.WHITE_DRYWALL, "Bare Drywall");
        translationBuilder.add(ModBlocks.WHITE_DRYWALL_STAIRS, "Bare Drywall Stairs");
        translationBuilder.add(ModBlocks.WHITE_DRYWALL_SLAB, "Bare Drywall Slab");
        translationBuilder.add(ModBlocks.WHITE_DRYWALL_WALL, "Bare Drywall Wall");
        translationBuilder.add(ModBlocks.BROWN_DRYWALL, "Bare Drywall");
        translationBuilder.add(ModBlocks.BROWN_DRYWALL_STAIRS, "Bare Drywall Stairs");
        translationBuilder.add(ModBlocks.BROWN_DRYWALL_SLAB, "Bare Drywall Slab");
        translationBuilder.add(ModBlocks.BROWN_DRYWALL_WALL, "Bare Drywall Wall");
        translationBuilder.add(ModBlocks.TAN_DRYWALL, "Bare Drywall");
        translationBuilder.add(ModBlocks.TAN_DRYWALL_STAIRS, "Bare Drywall Stairs");
        translationBuilder.add(ModBlocks.TAN_DRYWALL_SLAB, "Bare Drywall Slab");
        translationBuilder.add(ModBlocks.TAN_DRYWALL_WALL, "Bare Drywall Wall");
        translationBuilder.add(ModBlocks.RED_DRYWALL, "Bare Drywall");
        translationBuilder.add(ModBlocks.RED_DRYWALL_STAIRS, "Bare Drywall Stairs");
        translationBuilder.add(ModBlocks.RED_DRYWALL_SLAB, "Bare Drywall Slab");
        translationBuilder.add(ModBlocks.RED_DRYWALL_WALL, "Bare Drywall Wall");
        translationBuilder.add(ModBlocks.ORANGE_DRYWALL, "Bare Drywall");
        translationBuilder.add(ModBlocks.ORANGE_DRYWALL_STAIRS, "Bare Drywall Stairs");
        translationBuilder.add(ModBlocks.ORANGE_DRYWALL_SLAB, "Bare Drywall Slab");
        translationBuilder.add(ModBlocks.ORANGE_DRYWALL_WALL, "Bare Drywall Wall");
        translationBuilder.add(ModBlocks.YELLOW_DRYWALL, "Bare Drywall");
        translationBuilder.add(ModBlocks.YELLOW_DRYWALL_STAIRS, "Bare Drywall Stairs");
        translationBuilder.add(ModBlocks.YELLOW_DRYWALL_SLAB, "Bare Drywall Slab");
        translationBuilder.add(ModBlocks.YELLOW_DRYWALL_WALL, "Bare Drywall Wall");
        translationBuilder.add(ModBlocks.LIME_DRYWALL, "Bare Drywall");
        translationBuilder.add(ModBlocks.LIME_DRYWALL_STAIRS, "Bare Drywall Stairs");
        translationBuilder.add(ModBlocks.LIME_DRYWALL_SLAB, "Bare Drywall Slab");
        translationBuilder.add(ModBlocks.LIME_DRYWALL_WALL, "Bare Drywall Wall");
        translationBuilder.add(ModBlocks.TURQUOISE_DRYWALL, "Bare Drywall");
        translationBuilder.add(ModBlocks.TURQUOISE_DRYWALL_STAIRS, "Bare Drywall Stairs");
        translationBuilder.add(ModBlocks.TURQUOISE_DRYWALL_SLAB, "Bare Drywall Slab");
        translationBuilder.add(ModBlocks.TURQUOISE_DRYWALL_WALL, "Bare Drywall Wall");
        translationBuilder.add(ModBlocks.BLUE_DRYWALL, "Bare Drywall");
        translationBuilder.add(ModBlocks.BLUE_DRYWALL_STAIRS, "Bare Drywall Stairs");
        translationBuilder.add(ModBlocks.BLUE_DRYWALL_SLAB, "Bare Drywall Slab");
        translationBuilder.add(ModBlocks.BLUE_DRYWALL_WALL, "Bare Drywall Wall");
        translationBuilder.add(ModBlocks.INDIGO_DRYWALL, "Bare Drywall");
        translationBuilder.add(ModBlocks.INDIGO_DRYWALL_STAIRS, "Bare Drywall Stairs");
        translationBuilder.add(ModBlocks.INDIGO_DRYWALL_SLAB, "Bare Drywall Slab");
        translationBuilder.add(ModBlocks.INDIGO_DRYWALL_WALL, "Bare Drywall Wall");
        translationBuilder.add(ModBlocks.PURPLE_DRYWALL, "Bare Drywall");
        translationBuilder.add(ModBlocks.PURPLE_DRYWALL_STAIRS, "Bare Drywall Stairs");
        translationBuilder.add(ModBlocks.PURPLE_DRYWALL_SLAB, "Bare Drywall Slab");
        translationBuilder.add(ModBlocks.PURPLE_DRYWALL_WALL, "Bare Drywall Wall");
        translationBuilder.add(ModBlocks.MAGENTA_DRYWALL, "Bare Drywall");
        translationBuilder.add(ModBlocks.MAGENTA_DRYWALL_STAIRS, "Bare Drywall Stairs");
        translationBuilder.add(ModBlocks.MAGENTA_DRYWALL_SLAB, "Bare Drywall Slab");
        translationBuilder.add(ModBlocks.MAGENTA_DRYWALL_WALL, "Bare Drywall Wall");
    }
}

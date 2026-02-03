package nora.truckstop.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import nora.truckstop.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.OCHRE_BRICKS);
        addDrop(ModBlocks.OCHRE_BRICK_STAIRS);
        addDrop(ModBlocks.OCHRE_BRICK_SLAB, slabDrops(ModBlocks.OCHRE_BRICK_SLAB));
        addDrop(ModBlocks.OCHRE_BRICK_WALL);
        addDrop(ModBlocks.EBONY_BRICKS);
        addDrop(ModBlocks.EBONY_BRICK_STAIRS);
        addDrop(ModBlocks.EBONY_BRICK_SLAB, slabDrops(ModBlocks.EBONY_BRICK_SLAB));
        addDrop(ModBlocks.EBONY_BRICK_WALL);
        addDrop(ModBlocks.PEARL_BRICKS);
        addDrop(ModBlocks.PEARL_BRICK_STAIRS);
        addDrop(ModBlocks.PEARL_BRICK_SLAB, slabDrops(ModBlocks.PEARL_BRICK_SLAB));
        addDrop(ModBlocks.PEARL_BRICK_WALL);

        addDrop(ModBlocks.CLAY_SHINGLES);
        addDrop(ModBlocks.CLAY_SHINGLE_STAIRS);
        addDrop(ModBlocks.CLAY_SHINGLE_SLAB, slabDrops(ModBlocks.CLAY_SHINGLE_SLAB));
        addDrop(ModBlocks.OCHRE_SHINGLES);
        addDrop(ModBlocks.OCHRE_SHINGLE_STAIRS);
        addDrop(ModBlocks.OCHRE_SHINGLE_SLAB, slabDrops(ModBlocks.OCHRE_SHINGLE_SLAB));
        addDrop(ModBlocks.EBONY_SHINGLES);
        addDrop(ModBlocks.EBONY_SHINGLE_STAIRS);
        addDrop(ModBlocks.EBONY_SHINGLE_SLAB, slabDrops(ModBlocks.EBONY_SHINGLE_SLAB));
        addDrop(ModBlocks.PEARL_SHINGLES);
        addDrop(ModBlocks.PEARL_SHINGLE_STAIRS);
        addDrop(ModBlocks.PEARL_SHINGLE_SLAB, slabDrops(ModBlocks.PEARL_SHINGLE_SLAB));
        addDrop(ModBlocks.LAPIS_SHINGLES);
        addDrop(ModBlocks.LAPIS_SHINGLE_STAIRS);
        addDrop(ModBlocks.LAPIS_SHINGLE_SLAB, slabDrops(ModBlocks.LAPIS_SHINGLE_SLAB));
        addDrop(ModBlocks.MINT_SHINGLES);
        addDrop(ModBlocks.MINT_SHINGLE_STAIRS);
        addDrop(ModBlocks.MINT_SHINGLE_SLAB, slabDrops(ModBlocks.MINT_SHINGLE_SLAB));
        addDrop(ModBlocks.PRISMARINE_SHINGLES);
        addDrop(ModBlocks.PRISMARINE_SHINGLE_STAIRS);
        addDrop(ModBlocks.PRISMARINE_SHINGLE_SLAB, slabDrops(ModBlocks.PRISMARINE_SHINGLE_SLAB));
        addDrop(ModBlocks.SHULKER_SHINGLES);
        addDrop(ModBlocks.SHULKER_SHINGLE_STAIRS);
        addDrop(ModBlocks.SHULKER_SHINGLE_SLAB, slabDrops(ModBlocks.SHULKER_SHINGLE_SLAB));
        addDrop(ModBlocks.SLATE_SHINGLES);
        addDrop(ModBlocks.SLATE_SHINGLE_STAIRS);
        addDrop(ModBlocks.SLATE_SHINGLE_SLAB, slabDrops(ModBlocks.SLATE_SHINGLE_SLAB));
        addDrop(ModBlocks.EVERGREEN_SHINGLES);
        addDrop(ModBlocks.EVERGREEN_SHINGLE_STAIRS);
        addDrop(ModBlocks.EVERGREEN_SHINGLE_SLAB, slabDrops(ModBlocks.EVERGREEN_SHINGLE_SLAB));
        addDrop(ModBlocks.CHERRY_SHINGLES);
        addDrop(ModBlocks.CHERRY_SHINGLE_STAIRS);
        addDrop(ModBlocks.CHERRY_SHINGLE_SLAB, slabDrops(ModBlocks.CHERRY_SHINGLE_SLAB));

        addDrop(ModBlocks.VELVET_CUSHIONS);
        addDrop(ModBlocks.VELVET_CUSHION_STAIRS);
        addDrop(ModBlocks.VELVET_CUSHION_SLAB, slabDrops(ModBlocks.VELVET_CUSHION_SLAB));

        addDrop(ModBlocks.LEMON_VELVET_CUSHIONS);
        addDrop(ModBlocks.LEMON_VELVET_CUSHION_STAIRS);
        addDrop(ModBlocks.LEMON_VELVET_CUSHION_SLAB, slabDrops(ModBlocks.LEMON_VELVET_CUSHION_SLAB));
        
        addDrop(ModBlocks.ARCADE_CARPET);
        
        addDrop(ModBlocks.BEIGE_CORRUGATED_METAL_BLOCK);
        addDrop(ModBlocks.BEIGE_CORRUGATED_METAL_STAIRS);
        addDrop(ModBlocks.BEIGE_CORRUGATED_METAL_SLAB, slabDrops(ModBlocks.BEIGE_CORRUGATED_METAL_SLAB));
        addDrop(ModBlocks.BEIGE_CORRUGATED_METAL_WALL);
        addDrop(ModBlocks.BEIGE_CORRUGATED_METAL_WINDOW);
        addDrop(ModBlocks.BEIGE_CORRUGATED_METAL_DOOR, doorDrops(ModBlocks.BEIGE_CORRUGATED_METAL_DOOR));
        addDrop(ModBlocks.BEIGE_CORRUGATED_METAL_TRAPDOOR);
        addDrop(ModBlocks.DECORATED_BEIGE_CORRUGATED_METAL_BLOCK);
        addDrop(ModBlocks.DECORATED_BEIGE_CORRUGATED_METAL_STAIRS);
        addDrop(ModBlocks.DECORATED_BEIGE_CORRUGATED_METAL_SLAB, slabDrops(ModBlocks.DECORATED_BEIGE_CORRUGATED_METAL_SLAB));
        addDrop(ModBlocks.DECORATED_BEIGE_CORRUGATED_METAL_WALL);

        addDrop(ModBlocks.WHITE_CORRUGATED_METAL_BLOCK);
        addDrop(ModBlocks.WHITE_CORRUGATED_METAL_STAIRS);
        addDrop(ModBlocks.WHITE_CORRUGATED_METAL_SLAB, slabDrops(ModBlocks.WHITE_CORRUGATED_METAL_SLAB));
        addDrop(ModBlocks.WHITE_CORRUGATED_METAL_WALL);
        addDrop(ModBlocks.WHITE_CORRUGATED_METAL_WINDOW);
        addDrop(ModBlocks.WHITE_CORRUGATED_METAL_DOOR, doorDrops(ModBlocks.WHITE_CORRUGATED_METAL_DOOR));
        addDrop(ModBlocks.WHITE_CORRUGATED_METAL_TRAPDOOR);
        addDrop(ModBlocks.DECORATED_WHITE_CORRUGATED_METAL_BLOCK);
        addDrop(ModBlocks.DECORATED_WHITE_CORRUGATED_METAL_STAIRS);
        addDrop(ModBlocks.DECORATED_WHITE_CORRUGATED_METAL_SLAB, slabDrops(ModBlocks.DECORATED_WHITE_CORRUGATED_METAL_SLAB));
        addDrop(ModBlocks.DECORATED_WHITE_CORRUGATED_METAL_WALL);
        
        addDrop(ModBlocks.VINYL_WOOD);
        addDrop(ModBlocks.VINYL_WOOD_STAIRS);
        addDrop(ModBlocks.VINYL_WOOD_SLAB, slabDrops(ModBlocks.VINYL_WOOD_SLAB));
        addDrop(ModBlocks.VINYL_WOOD_WALL);
        addDrop(ModBlocks.SMALL_VINYL_WOOD_PANELING);
        addDrop(ModBlocks.LARGE_VINYL_WOOD_PANELING);
        
        addDrop(ModBlocks.CARDBOARD_BOX);
        
        addDrop(ModBlocks.GARAGE_PANEL);
        addDrop(ModBlocks.GARAGE_PANEL_WALL);
        addDrop(ModBlocks.GARAGE_WINDOW);
        addDrop(ModBlocks.GARAGE_WINDOW_WALL);

        addDrop(ModBlocks.BARE_DRYWALL);
        addDrop(ModBlocks.BARE_DRYWALL_STAIRS);
        addDrop(ModBlocks.BARE_DRYWALL_SLAB, slabDrops(ModBlocks.BARE_DRYWALL_SLAB));
        addDrop(ModBlocks.BARE_DRYWALL_WALL);
        addDrop(ModBlocks.WHITE_DRYWALL);
        addDrop(ModBlocks.WHITE_DRYWALL_STAIRS);
        addDrop(ModBlocks.WHITE_DRYWALL_SLAB, slabDrops(ModBlocks.WHITE_DRYWALL_SLAB));
        addDrop(ModBlocks.WHITE_DRYWALL_WALL);
        addDrop(ModBlocks.BROWN_DRYWALL);
        addDrop(ModBlocks.BROWN_DRYWALL_STAIRS);
        addDrop(ModBlocks.BROWN_DRYWALL_SLAB, slabDrops(ModBlocks.BROWN_DRYWALL_SLAB));
        addDrop(ModBlocks.BROWN_DRYWALL_WALL);
        addDrop(ModBlocks.TAN_DRYWALL);
        addDrop(ModBlocks.TAN_DRYWALL_STAIRS);
        addDrop(ModBlocks.TAN_DRYWALL_SLAB, slabDrops(ModBlocks.TAN_DRYWALL_SLAB));
        addDrop(ModBlocks.TAN_DRYWALL_WALL);
        addDrop(ModBlocks.RED_DRYWALL);
        addDrop(ModBlocks.RED_DRYWALL_STAIRS);
        addDrop(ModBlocks.RED_DRYWALL_SLAB, slabDrops(ModBlocks.RED_DRYWALL_SLAB));
        addDrop(ModBlocks.RED_DRYWALL_WALL);
        addDrop(ModBlocks.ORANGE_DRYWALL);
        addDrop(ModBlocks.ORANGE_DRYWALL_STAIRS);
        addDrop(ModBlocks.ORANGE_DRYWALL_SLAB, slabDrops(ModBlocks.ORANGE_DRYWALL_SLAB));
        addDrop(ModBlocks.ORANGE_DRYWALL_WALL);
        addDrop(ModBlocks.YELLOW_DRYWALL);
        addDrop(ModBlocks.YELLOW_DRYWALL_STAIRS);
        addDrop(ModBlocks.YELLOW_DRYWALL_SLAB, slabDrops(ModBlocks.YELLOW_DRYWALL_SLAB));
        addDrop(ModBlocks.YELLOW_DRYWALL_WALL);
        addDrop(ModBlocks.LIME_DRYWALL);
        addDrop(ModBlocks.LIME_DRYWALL_STAIRS);
        addDrop(ModBlocks.LIME_DRYWALL_SLAB, slabDrops(ModBlocks.LIME_DRYWALL_SLAB));
        addDrop(ModBlocks.LIME_DRYWALL_WALL);
        addDrop(ModBlocks.TURQUOISE_DRYWALL);
        addDrop(ModBlocks.TURQUOISE_DRYWALL_STAIRS);
        addDrop(ModBlocks.TURQUOISE_DRYWALL_SLAB, slabDrops(ModBlocks.TURQUOISE_DRYWALL_SLAB));
        addDrop(ModBlocks.TURQUOISE_DRYWALL_WALL);
        addDrop(ModBlocks.BLUE_DRYWALL);
        addDrop(ModBlocks.BLUE_DRYWALL_STAIRS);
        addDrop(ModBlocks.BLUE_DRYWALL_SLAB, slabDrops(ModBlocks.BLUE_DRYWALL_SLAB));
        addDrop(ModBlocks.BLUE_DRYWALL_WALL);
        addDrop(ModBlocks.INDIGO_DRYWALL);
        addDrop(ModBlocks.INDIGO_DRYWALL_STAIRS);
        addDrop(ModBlocks.INDIGO_DRYWALL_SLAB, slabDrops(ModBlocks.INDIGO_DRYWALL_SLAB));
        addDrop(ModBlocks.INDIGO_DRYWALL_WALL);
        addDrop(ModBlocks.PURPLE_DRYWALL);
        addDrop(ModBlocks.PURPLE_DRYWALL_STAIRS);
        addDrop(ModBlocks.PURPLE_DRYWALL_SLAB, slabDrops(ModBlocks.PURPLE_DRYWALL_SLAB));
        addDrop(ModBlocks.PURPLE_DRYWALL_WALL);
        addDrop(ModBlocks.MAGENTA_DRYWALL);
        addDrop(ModBlocks.MAGENTA_DRYWALL_STAIRS);
        addDrop(ModBlocks.MAGENTA_DRYWALL_SLAB, slabDrops(ModBlocks.MAGENTA_DRYWALL_SLAB));
        addDrop(ModBlocks.MAGENTA_DRYWALL_WALL);
    }
}

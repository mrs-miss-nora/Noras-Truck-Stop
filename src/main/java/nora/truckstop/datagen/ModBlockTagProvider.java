package nora.truckstop.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import nora.truckstop.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.OCHRE_BRICK_STAIRS)
                .add(ModBlocks.OCHRE_BRICK_SLAB)
                .add(ModBlocks.OCHRE_BRICKS)
                .add(ModBlocks.OCHRE_BRICK_WALL)
                .add(ModBlocks.EBONY_BRICKS)
                .add(ModBlocks.EBONY_BRICK_STAIRS)
                .add(ModBlocks.EBONY_BRICK_SLAB)
                .add(ModBlocks.EBONY_BRICK_WALL)
                .add(ModBlocks.PEARL_BRICKS)
                .add(ModBlocks.PEARL_BRICK_STAIRS)
                .add(ModBlocks.PEARL_BRICK_SLAB)
                .add(ModBlocks.PEARL_BRICK_WALL)

                .add(ModBlocks.CLAY_SHINGLES)
                .add(ModBlocks.CLAY_SHINGLE_STAIRS)
                .add(ModBlocks.CLAY_SHINGLE_SLAB)
                .add(ModBlocks.OCHRE_SHINGLES)
                .add(ModBlocks.OCHRE_SHINGLE_STAIRS)
                .add(ModBlocks.OCHRE_SHINGLE_SLAB)
                .add(ModBlocks.EBONY_SHINGLES)
                .add(ModBlocks.EBONY_SHINGLE_STAIRS)
                .add(ModBlocks.EBONY_SHINGLE_SLAB)
                .add(ModBlocks.PEARL_SHINGLES)
                .add(ModBlocks.PEARL_SHINGLE_STAIRS)
                .add(ModBlocks.PEARL_SHINGLE_SLAB)
                .add(ModBlocks.LAPIS_SHINGLES)
                .add(ModBlocks.LAPIS_SHINGLE_STAIRS)
                .add(ModBlocks.LAPIS_SHINGLE_SLAB)
                .add(ModBlocks.MINT_SHINGLES)
                .add(ModBlocks.MINT_SHINGLE_STAIRS)
                .add(ModBlocks.MINT_SHINGLE_SLAB)
                .add(ModBlocks.PRISMARINE_SHINGLES)
                .add(ModBlocks.PRISMARINE_SHINGLE_STAIRS)
                .add(ModBlocks.PRISMARINE_SHINGLE_SLAB)
                .add(ModBlocks.SHULKER_SHINGLES)
                .add(ModBlocks.SHULKER_SHINGLE_STAIRS)
                .add(ModBlocks.SHULKER_SHINGLE_SLAB)
                .add(ModBlocks.SLATE_SHINGLES)
                .add(ModBlocks.SLATE_SHINGLE_STAIRS)
                .add(ModBlocks.SLATE_SHINGLE_SLAB)
                .add(ModBlocks.EVERGREEN_SHINGLES)
                .add(ModBlocks.EVERGREEN_SHINGLE_STAIRS)
                .add(ModBlocks.EVERGREEN_SHINGLE_SLAB)
                .add(ModBlocks.CHERRY_SHINGLES)
                .add(ModBlocks.CHERRY_SHINGLE_STAIRS)
                .add(ModBlocks.CHERRY_SHINGLE_SLAB)
        ;

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.OCHRE_BRICK_WALL)
                .add(ModBlocks.EBONY_BRICK_WALL)
                .add(ModBlocks.PEARL_BRICK_WALL)

                .add(ModBlocks.BEIGE_CORRUGATED_METAL_WALL)
                .add(ModBlocks.DECORATED_BEIGE_CORRUGATED_METAL_WALL)
                .add(ModBlocks.WHITE_CORRUGATED_METAL_WALL)
                .add(ModBlocks.DECORATED_WHITE_CORRUGATED_METAL_WALL)

                .add(ModBlocks.GARAGE_PANEL_WALL)
                .add(ModBlocks.GARAGE_WINDOW_WALL)

                .add(ModBlocks.BARE_DRYWALL_WALL)
                .add(ModBlocks.WHITE_DRYWALL_WALL)
                .add(ModBlocks.BROWN_DRYWALL_WALL)
                .add(ModBlocks.TAN_DRYWALL_WALL)
                .add(ModBlocks.RED_DRYWALL_WALL)
                .add(ModBlocks.ORANGE_DRYWALL_WALL)
                .add(ModBlocks.YELLOW_DRYWALL_WALL)
                .add(ModBlocks.LIME_DRYWALL_WALL)
                .add(ModBlocks.TURQUOISE_DRYWALL_WALL)
                .add(ModBlocks.BLUE_DRYWALL_WALL)
                .add(ModBlocks.INDIGO_DRYWALL_WALL)
                .add(ModBlocks.PURPLE_DRYWALL_WALL)
                .add(ModBlocks.MAGENTA_DRYWALL_WALL)
        ;

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(ModBlocks.OCHRE_BRICK_STAIRS)
                .add(ModBlocks.EBONY_BRICK_STAIRS)
                .add(ModBlocks.PEARL_BRICK_STAIRS)
                .add(ModBlocks.CLAY_SHINGLE_STAIRS)
                .add(ModBlocks.OCHRE_SHINGLE_STAIRS)
                .add(ModBlocks.EBONY_SHINGLE_STAIRS)
                .add(ModBlocks.PEARL_SHINGLE_STAIRS)
                .add(ModBlocks.LAPIS_SHINGLE_STAIRS)
                .add(ModBlocks.MINT_SHINGLE_STAIRS)
                .add(ModBlocks.PRISMARINE_SHINGLE_STAIRS)
                .add(ModBlocks.SHULKER_SHINGLE_STAIRS)
                .add(ModBlocks.SLATE_SHINGLE_STAIRS)
                .add(ModBlocks.EVERGREEN_SHINGLE_STAIRS)
                .add(ModBlocks.CHERRY_SHINGLE_STAIRS)

                .add(ModBlocks.VELVET_CUSHION_STAIRS)
                .add(ModBlocks.LEMON_VELVET_CUSHION_STAIRS)

                .add(ModBlocks.BEIGE_CORRUGATED_METAL_STAIRS)
                .add(ModBlocks.DECORATED_BEIGE_CORRUGATED_METAL_STAIRS)
                .add(ModBlocks.WHITE_CORRUGATED_METAL_STAIRS)
                .add(ModBlocks.DECORATED_WHITE_CORRUGATED_METAL_STAIRS)

                .add(ModBlocks.BARE_DRYWALL_STAIRS)
                .add(ModBlocks.WHITE_DRYWALL_STAIRS)
                .add(ModBlocks.BROWN_DRYWALL_STAIRS)
                .add(ModBlocks.TAN_DRYWALL_STAIRS)
                .add(ModBlocks.RED_DRYWALL_STAIRS)
                .add(ModBlocks.ORANGE_DRYWALL_STAIRS)
                .add(ModBlocks.YELLOW_DRYWALL_STAIRS)
                .add(ModBlocks.LIME_DRYWALL_STAIRS)
                .add(ModBlocks.TURQUOISE_DRYWALL_STAIRS)
                .add(ModBlocks.BLUE_DRYWALL_STAIRS)
                .add(ModBlocks.INDIGO_DRYWALL_STAIRS)
                .add(ModBlocks.PURPLE_DRYWALL_STAIRS)
                .add(ModBlocks.MAGENTA_DRYWALL_STAIRS)
        ;
    }
}

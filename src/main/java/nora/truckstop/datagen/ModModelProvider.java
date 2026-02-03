package nora.truckstop.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import nora.truckstop.block.ModBlocks;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool ochreBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.OCHRE_BRICKS);
        ochreBricksPool.stairs(ModBlocks.OCHRE_BRICK_STAIRS);
        ochreBricksPool.slab(ModBlocks.OCHRE_BRICK_SLAB);
        ochreBricksPool.wall(ModBlocks.OCHRE_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool ebonyBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.EBONY_BRICKS);
        ebonyBricksPool.stairs(ModBlocks.EBONY_BRICK_STAIRS);
        ebonyBricksPool.slab(ModBlocks.EBONY_BRICK_SLAB);
        ebonyBricksPool.wall(ModBlocks.EBONY_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool pearlBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PEARL_BRICKS);
        pearlBricksPool.stairs(ModBlocks.PEARL_BRICK_STAIRS);
        pearlBricksPool.slab(ModBlocks.PEARL_BRICK_SLAB);
        pearlBricksPool.wall(ModBlocks.PEARL_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool clayShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CLAY_SHINGLES);
        clayShinglesPool.stairs(ModBlocks.CLAY_SHINGLE_STAIRS);
        clayShinglesPool.slab(ModBlocks.CLAY_SHINGLE_SLAB);
        BlockStateModelGenerator.BlockTexturePool ochreShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.OCHRE_SHINGLES);
        ochreShinglesPool.stairs(ModBlocks.OCHRE_SHINGLE_STAIRS);
        ochreShinglesPool.slab(ModBlocks.OCHRE_SHINGLE_SLAB);
        BlockStateModelGenerator.BlockTexturePool ebonyShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.EBONY_SHINGLES);
        ebonyShinglesPool.stairs(ModBlocks.EBONY_SHINGLE_STAIRS);
        ebonyShinglesPool.slab(ModBlocks.EBONY_SHINGLE_SLAB);
        BlockStateModelGenerator.BlockTexturePool pearlShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PEARL_SHINGLES);
        pearlShinglesPool.stairs(ModBlocks.PEARL_SHINGLE_STAIRS);
        pearlShinglesPool.slab(ModBlocks.PEARL_SHINGLE_SLAB);
        BlockStateModelGenerator.BlockTexturePool lapisShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LAPIS_SHINGLES);
        lapisShinglesPool.stairs(ModBlocks.LAPIS_SHINGLE_STAIRS);
        lapisShinglesPool.slab(ModBlocks.LAPIS_SHINGLE_SLAB);
        BlockStateModelGenerator.BlockTexturePool mintShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MINT_SHINGLES);
        mintShinglesPool.stairs(ModBlocks.MINT_SHINGLE_STAIRS);
        mintShinglesPool.slab(ModBlocks.MINT_SHINGLE_SLAB);
        BlockStateModelGenerator.BlockTexturePool prismarineShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PRISMARINE_SHINGLES);
        prismarineShinglesPool.stairs(ModBlocks.PRISMARINE_SHINGLE_STAIRS);
        prismarineShinglesPool.slab(ModBlocks.PRISMARINE_SHINGLE_SLAB);
        BlockStateModelGenerator.BlockTexturePool shulkerShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SHULKER_SHINGLES);
        shulkerShinglesPool.stairs(ModBlocks.SHULKER_SHINGLE_STAIRS);
        shulkerShinglesPool.slab(ModBlocks.SHULKER_SHINGLE_SLAB);
        BlockStateModelGenerator.BlockTexturePool slateShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SLATE_SHINGLES);
        slateShinglesPool.stairs(ModBlocks.SLATE_SHINGLE_STAIRS);
        slateShinglesPool.slab(ModBlocks.SLATE_SHINGLE_SLAB);
        BlockStateModelGenerator.BlockTexturePool evergreenShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.EVERGREEN_SHINGLES);
        evergreenShinglesPool.stairs(ModBlocks.EVERGREEN_SHINGLE_STAIRS);
        evergreenShinglesPool.slab(ModBlocks.EVERGREEN_SHINGLE_SLAB);
        BlockStateModelGenerator.BlockTexturePool cherryShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHERRY_SHINGLES);
        cherryShinglesPool.stairs(ModBlocks.CHERRY_SHINGLE_STAIRS);
        cherryShinglesPool.slab(ModBlocks.CHERRY_SHINGLE_SLAB);

        BlockStateModelGenerator.BlockTexturePool beigeCorrugatedMetalPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BEIGE_CORRUGATED_METAL_BLOCK);
        beigeCorrugatedMetalPool.stairs(ModBlocks.BEIGE_CORRUGATED_METAL_STAIRS);
        beigeCorrugatedMetalPool.slab(ModBlocks.BEIGE_CORRUGATED_METAL_SLAB);
        beigeCorrugatedMetalPool.wall(ModBlocks.BEIGE_CORRUGATED_METAL_WALL);

        blockStateModelGenerator.registerDoor(ModBlocks.BEIGE_CORRUGATED_METAL_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.BEIGE_CORRUGATED_METAL_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool whiteCorrugatedMetalPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WHITE_CORRUGATED_METAL_BLOCK);
        whiteCorrugatedMetalPool.stairs(ModBlocks.WHITE_CORRUGATED_METAL_STAIRS);
        whiteCorrugatedMetalPool.slab(ModBlocks.WHITE_CORRUGATED_METAL_SLAB);
        whiteCorrugatedMetalPool.wall(ModBlocks.WHITE_CORRUGATED_METAL_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.WHITE_CORRUGATED_METAL_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.WHITE_CORRUGATED_METAL_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool velvetCushionsPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.VELVET_CUSHIONS);
        velvetCushionsPool.stairs(ModBlocks.VELVET_CUSHION_STAIRS);
        velvetCushionsPool.slab(ModBlocks.VELVET_CUSHION_SLAB);
        BlockStateModelGenerator.BlockTexturePool lemonVelvetCushionsPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LEMON_VELVET_CUSHIONS);
        lemonVelvetCushionsPool.stairs(ModBlocks.LEMON_VELVET_CUSHION_STAIRS);
        lemonVelvetCushionsPool.slab(ModBlocks.LEMON_VELVET_CUSHION_SLAB);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ARCADE_CARPET);

        BlockStateModelGenerator.BlockTexturePool vinylWoodPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.VINYL_WOOD);
        vinylWoodPool.stairs(ModBlocks.VINYL_WOOD_STAIRS);
        vinylWoodPool.slab(ModBlocks.VINYL_WOOD_SLAB);
        vinylWoodPool.wall(ModBlocks.VINYL_WOOD_WALL);
        blockStateModelGenerator.registerLog(ModBlocks.SMALL_VINYL_WOOD_PANELING).log(ModBlocks.SMALL_VINYL_WOOD_PANELING);
        blockStateModelGenerator.registerLog(ModBlocks.LARGE_VINYL_WOOD_PANELING).log(ModBlocks.LARGE_VINYL_WOOD_PANELING);

        BlockStateModelGenerator.BlockTexturePool garagePanelPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GARAGE_PANEL);
        garagePanelPool.wall(ModBlocks.GARAGE_PANEL_WALL);
        BlockStateModelGenerator.BlockTexturePool garageWindowPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GARAGE_WINDOW);
        garageWindowPool.wall(ModBlocks.GARAGE_WINDOW_WALL);

        BlockStateModelGenerator.BlockTexturePool bareDrywallPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BARE_DRYWALL);
        bareDrywallPool.stairs(ModBlocks.BARE_DRYWALL_STAIRS);
        bareDrywallPool.slab(ModBlocks.BARE_DRYWALL_SLAB);
        bareDrywallPool.wall(ModBlocks.BARE_DRYWALL_WALL);
        BlockStateModelGenerator.BlockTexturePool whiteDrywallPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WHITE_DRYWALL);
        whiteDrywallPool.stairs(ModBlocks.WHITE_DRYWALL_STAIRS);
        whiteDrywallPool.slab(ModBlocks.WHITE_DRYWALL_SLAB);
        whiteDrywallPool.wall(ModBlocks.WHITE_DRYWALL_WALL);
        BlockStateModelGenerator.BlockTexturePool brownDrywallPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BROWN_DRYWALL);
        brownDrywallPool.stairs(ModBlocks.BROWN_DRYWALL_STAIRS);
        brownDrywallPool.slab(ModBlocks.BROWN_DRYWALL_SLAB);
        brownDrywallPool.wall(ModBlocks.BROWN_DRYWALL_WALL);
        BlockStateModelGenerator.BlockTexturePool tanDrywallPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TAN_DRYWALL);
        tanDrywallPool.stairs(ModBlocks.TAN_DRYWALL_STAIRS);
        tanDrywallPool.slab(ModBlocks.TAN_DRYWALL_SLAB);
        tanDrywallPool.wall(ModBlocks.TAN_DRYWALL_WALL);
        BlockStateModelGenerator.BlockTexturePool redDrywallPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_DRYWALL);
        redDrywallPool.stairs(ModBlocks.RED_DRYWALL_STAIRS);
        redDrywallPool.slab(ModBlocks.RED_DRYWALL_SLAB);
        redDrywallPool.wall(ModBlocks.RED_DRYWALL_WALL);
        BlockStateModelGenerator.BlockTexturePool orangeDrywallPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORANGE_DRYWALL);
        orangeDrywallPool.stairs(ModBlocks.ORANGE_DRYWALL_STAIRS);
        orangeDrywallPool.slab(ModBlocks.ORANGE_DRYWALL_SLAB);
        orangeDrywallPool.wall(ModBlocks.ORANGE_DRYWALL_WALL);
        BlockStateModelGenerator.BlockTexturePool yellowDrywallPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.YELLOW_DRYWALL);
        yellowDrywallPool.stairs(ModBlocks.YELLOW_DRYWALL_STAIRS);
        yellowDrywallPool.slab(ModBlocks.YELLOW_DRYWALL_SLAB);
        yellowDrywallPool.wall(ModBlocks.YELLOW_DRYWALL_WALL);
        BlockStateModelGenerator.BlockTexturePool limeDrywallPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIME_DRYWALL);
        limeDrywallPool.stairs(ModBlocks.LIME_DRYWALL_STAIRS);
        limeDrywallPool.slab(ModBlocks.LIME_DRYWALL_SLAB);
        limeDrywallPool.wall(ModBlocks.LIME_DRYWALL_WALL);
        BlockStateModelGenerator.BlockTexturePool turquoiseDrywallPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TURQUOISE_DRYWALL);
        turquoiseDrywallPool.stairs(ModBlocks.TURQUOISE_DRYWALL_STAIRS);
        turquoiseDrywallPool.slab(ModBlocks.TURQUOISE_DRYWALL_SLAB);
        turquoiseDrywallPool.wall(ModBlocks.TURQUOISE_DRYWALL_WALL);
        BlockStateModelGenerator.BlockTexturePool blueDrywallPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLUE_DRYWALL);
        blueDrywallPool.stairs(ModBlocks.BLUE_DRYWALL_STAIRS);
        blueDrywallPool.slab(ModBlocks.BLUE_DRYWALL_SLAB);
        blueDrywallPool.wall(ModBlocks.BLUE_DRYWALL_WALL);
        BlockStateModelGenerator.BlockTexturePool indigoDrywallPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.INDIGO_DRYWALL);
        indigoDrywallPool.stairs(ModBlocks.INDIGO_DRYWALL_STAIRS);
        indigoDrywallPool.slab(ModBlocks.INDIGO_DRYWALL_SLAB);
        indigoDrywallPool.wall(ModBlocks.INDIGO_DRYWALL_WALL);
        BlockStateModelGenerator.BlockTexturePool purpleDrywallPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PURPLE_DRYWALL);
        purpleDrywallPool.stairs(ModBlocks.PURPLE_DRYWALL_STAIRS);
        purpleDrywallPool.slab(ModBlocks.PURPLE_DRYWALL_SLAB);
        purpleDrywallPool.wall(ModBlocks.PURPLE_DRYWALL_WALL);
        BlockStateModelGenerator.BlockTexturePool magentaDrywallPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGENTA_DRYWALL);
        magentaDrywallPool.stairs(ModBlocks.MAGENTA_DRYWALL_STAIRS);
        magentaDrywallPool.slab(ModBlocks.MAGENTA_DRYWALL_SLAB);
        magentaDrywallPool.wall(ModBlocks.MAGENTA_DRYWALL_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}

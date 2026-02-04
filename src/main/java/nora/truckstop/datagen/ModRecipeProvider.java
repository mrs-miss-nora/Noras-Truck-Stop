package nora.truckstop.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.ModelIds;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import nora.truckstop.block.ModBlocks;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        offer2x2CompactingRecipe(recipeExporter, RecipeCategory.DECORATIONS, Items.PAPER, ModBlocks.CARDBOARD_BOX);
        offer2x2CompactingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMALL_VINYL_WOOD_PANELING, ModBlocks.VINYL_WOOD);
        offer2x2CompactingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LARGE_VINYL_WOOD_PANELING, ModBlocks.SMALL_VINYL_WOOD_PANELING);

        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VINYL_WOOD_SLAB, ModBlocks.VINYL_WOOD);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OCHRE_BRICKS)
                .pattern("BBB")
                .pattern("BDB")
                .pattern("BBB")
                .input('B', Items.BRICKS)
                .input('D', Items.ORANGE_DYE)
                .criterion(hasItem(Items.BRICKS), conditionsFromItem(Items.BRICKS))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.EBONY_BRICKS)
                .pattern("BBB")
                .pattern("BDB")
                .pattern("BBB")
                .input('B', Items.BRICKS)
                .input('D', Items.BLACK_DYE)
                .criterion(hasItem(Items.BRICKS), conditionsFromItem(Items.BRICKS))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PEARL_BRICKS)
                .pattern("BBB")
                .pattern("BDB")
                .pattern("BBB")
                .input('B', Items.BRICKS)
                .input('D', Items.WHITE_DYE)
                .criterion(hasItem(Items.BRICKS), conditionsFromItem(Items.BRICKS))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VINYL_WOOD)
                .pattern("BBB")
                .pattern("BDB")
                .pattern("BBB")
                .input('B', Items.BROWN_DYE)
                .input('D', Items.HONEYCOMB)
                .criterion(hasItem(Items.HONEYCOMB), conditionsFromItem(Items.HONEYCOMB))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BARE_DRYWALL)
                .pattern("BBB")
                .pattern("BDB")
                .pattern("BBB")
                .input('B', Items.PAPER)
                .input('D', Items.CALCITE)
                .criterion(hasItem(Items.PAPER), conditionsFromItem(Items.PAPER))
                .offerTo(recipeExporter);

        recipeWithRing(recipeExporter, ModBlocks.BARE_DRYWALL.asItem(), Items.RED_DYE, ModBlocks.RED_DRYWALL.asItem());
        recipeWithRing(recipeExporter, ModBlocks.BARE_DRYWALL.asItem(), Items.CYAN_DYE, ModBlocks.TURQUOISE_DRYWALL.asItem());
        recipeWithRing(recipeExporter, ModBlocks.BARE_DRYWALL.asItem(), Items.LIME_DYE, ModBlocks.LIME_DRYWALL.asItem());
        recipeWithRing(recipeExporter, ModBlocks.BARE_DRYWALL.asItem(), Items.YELLOW_DYE, ModBlocks.YELLOW_DRYWALL.asItem());
        recipeWithRing(recipeExporter, ModBlocks.BARE_DRYWALL.asItem(), Items.LIGHT_BLUE_DYE, ModBlocks.BLUE_DRYWALL.asItem());
        recipeWithRing(recipeExporter, ModBlocks.BARE_DRYWALL.asItem(), Items.BLUE_DYE, ModBlocks.INDIGO_DRYWALL.asItem());
        recipeWithRing(recipeExporter, ModBlocks.BARE_DRYWALL.asItem(), Items.PURPLE_DYE, ModBlocks.PURPLE_DRYWALL.asItem());
        recipeWithRing(recipeExporter, ModBlocks.BARE_DRYWALL.asItem(), Items.MAGENTA_DYE, ModBlocks.MAGENTA_DRYWALL.asItem());
        recipeWithRing(recipeExporter, ModBlocks.BARE_DRYWALL.asItem(), Items.ORANGE_DYE, ModBlocks.ORANGE_DRYWALL.asItem());
        recipeWithRing(recipeExporter, ModBlocks.BARE_DRYWALL.asItem(), Items.LIGHT_GRAY_DYE, ModBlocks.TAN_DRYWALL.asItem());
        recipeWithRing(recipeExporter, ModBlocks.BARE_DRYWALL.asItem(), Items.BROWN_DYE, ModBlocks.BROWN_DRYWALL.asItem());
        recipeWithRing(recipeExporter, ModBlocks.BARE_DRYWALL.asItem(), Items.WHITE_DYE, ModBlocks.WHITE_DRYWALL.asItem());

        stairSlabWallCombo(recipeExporter, ModBlocks.RED_DRYWALL, ModBlocks.RED_DRYWALL_STAIRS, ModBlocks.RED_DRYWALL_SLAB, ModBlocks.RED_DRYWALL_WALL);
        stairSlabWallCombo(recipeExporter, ModBlocks.TURQUOISE_DRYWALL, ModBlocks.TURQUOISE_DRYWALL_STAIRS, ModBlocks.TURQUOISE_DRYWALL_SLAB, ModBlocks.TURQUOISE_DRYWALL_WALL);
        stairSlabWallCombo(recipeExporter, ModBlocks.LIME_DRYWALL, ModBlocks.LIME_DRYWALL_STAIRS, ModBlocks.LIME_DRYWALL_SLAB, ModBlocks.LIME_DRYWALL_WALL);
        stairSlabWallCombo(recipeExporter, ModBlocks.YELLOW_DRYWALL, ModBlocks.YELLOW_DRYWALL_STAIRS, ModBlocks.YELLOW_DRYWALL_SLAB, ModBlocks.YELLOW_DRYWALL_WALL);
        stairSlabWallCombo(recipeExporter, ModBlocks.BLUE_DRYWALL, ModBlocks.BLUE_DRYWALL_STAIRS, ModBlocks.BLUE_DRYWALL_SLAB, ModBlocks.BLUE_DRYWALL_WALL);
        stairSlabWallCombo(recipeExporter, ModBlocks.INDIGO_DRYWALL, ModBlocks.INDIGO_DRYWALL_STAIRS, ModBlocks.INDIGO_DRYWALL_SLAB, ModBlocks.INDIGO_DRYWALL_WALL);
        stairSlabWallCombo(recipeExporter, ModBlocks.PURPLE_DRYWALL, ModBlocks.PURPLE_DRYWALL_STAIRS, ModBlocks.PURPLE_DRYWALL_SLAB, ModBlocks.PURPLE_DRYWALL_WALL);
        stairSlabWallCombo(recipeExporter, ModBlocks.MAGENTA_DRYWALL, ModBlocks.MAGENTA_DRYWALL_STAIRS, ModBlocks.MAGENTA_DRYWALL_SLAB, ModBlocks.MAGENTA_DRYWALL_WALL);
        stairSlabWallCombo(recipeExporter, ModBlocks.ORANGE_DRYWALL, ModBlocks.ORANGE_DRYWALL_STAIRS, ModBlocks.ORANGE_DRYWALL_SLAB, ModBlocks.ORANGE_DRYWALL_WALL);
        stairSlabWallCombo(recipeExporter, ModBlocks.TAN_DRYWALL, ModBlocks.TAN_DRYWALL_STAIRS, ModBlocks.TAN_DRYWALL_SLAB, ModBlocks.TAN_DRYWALL_WALL);
        stairSlabWallCombo(recipeExporter, ModBlocks.BROWN_DRYWALL, ModBlocks.BROWN_DRYWALL_STAIRS, ModBlocks.BROWN_DRYWALL_SLAB, ModBlocks.BROWN_DRYWALL_WALL);
        stairSlabWallCombo(recipeExporter, ModBlocks.WHITE_DRYWALL, ModBlocks.WHITE_DRYWALL_STAIRS, ModBlocks.WHITE_DRYWALL_SLAB, ModBlocks.WHITE_DRYWALL_WALL);


        stairSlabWallCombo(recipeExporter, ModBlocks.OCHRE_BRICKS, ModBlocks.OCHRE_BRICK_STAIRS, ModBlocks.OCHRE_BRICK_SLAB, ModBlocks.OCHRE_BRICK_WALL);
        stairSlabWallCombo(recipeExporter, ModBlocks.EBONY_BRICKS, ModBlocks.EBONY_BRICK_STAIRS, ModBlocks.EBONY_BRICK_SLAB, ModBlocks.EBONY_BRICK_WALL);
        stairSlabWallCombo(recipeExporter, ModBlocks.PEARL_BRICKS, ModBlocks.PEARL_BRICK_STAIRS, ModBlocks.PEARL_BRICK_SLAB, ModBlocks.PEARL_BRICK_WALL);

        stairSlabCombo(recipeExporter, ModBlocks.CLAY_SHINGLES, ModBlocks.CLAY_SHINGLE_STAIRS, ModBlocks.CLAY_SHINGLE_SLAB);
        stairSlabCombo(recipeExporter, ModBlocks.OCHRE_SHINGLES, ModBlocks.OCHRE_SHINGLE_STAIRS, ModBlocks.OCHRE_SHINGLE_SLAB);
        stairSlabCombo(recipeExporter, ModBlocks.EBONY_SHINGLES, ModBlocks.EBONY_SHINGLE_STAIRS, ModBlocks.EBONY_SHINGLE_SLAB);
        stairSlabCombo(recipeExporter, ModBlocks.PEARL_SHINGLES, ModBlocks.PEARL_SHINGLE_STAIRS, ModBlocks.PEARL_SHINGLE_SLAB);
        stairSlabCombo(recipeExporter, ModBlocks.LAPIS_SHINGLES, ModBlocks.LAPIS_SHINGLE_STAIRS, ModBlocks.LAPIS_SHINGLE_SLAB);
        stairSlabCombo(recipeExporter, ModBlocks.MINT_SHINGLES, ModBlocks.MINT_SHINGLE_STAIRS, ModBlocks.MINT_SHINGLE_SLAB);
        stairSlabCombo(recipeExporter, ModBlocks.PRISMARINE_SHINGLES, ModBlocks.PRISMARINE_SHINGLE_STAIRS, ModBlocks.PRISMARINE_SHINGLE_SLAB);
        stairSlabCombo(recipeExporter, ModBlocks.SHULKER_SHINGLES, ModBlocks.SHULKER_SHINGLE_STAIRS, ModBlocks.SHULKER_SHINGLE_SLAB);
        stairSlabCombo(recipeExporter, ModBlocks.SLATE_SHINGLES, ModBlocks.SLATE_SHINGLE_STAIRS, ModBlocks.SLATE_SHINGLE_SLAB);
        stairSlabCombo(recipeExporter, ModBlocks.EVERGREEN_SHINGLES, ModBlocks.EVERGREEN_SHINGLE_STAIRS, ModBlocks.EVERGREEN_SHINGLE_SLAB);
        stairSlabCombo(recipeExporter, ModBlocks.CHERRY_SHINGLES, ModBlocks.CHERRY_SHINGLE_STAIRS, ModBlocks.CHERRY_SHINGLE_SLAB);
    }

    private static void stairSlabCombo(RecipeExporter recipeExp, Block main, Block stair, Block slab){
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, stair.asItem(),4)
                .pattern("B  ")
                .pattern("BB ")
                .pattern("BBB")
                .input('B', main.asItem())
                .criterion(hasItem(main.asItem()), conditionsFromItem(main.asItem()))
                .offerTo(recipeExp);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, slab.asItem(),6)
                .pattern("BBB")
                .input('B', main.asItem())
                .criterion(hasItem(main.asItem()), conditionsFromItem(main.asItem()))
                .offerTo(recipeExp);
    }

    private static void stairSlabWallCombo(RecipeExporter recipeExp, Block main, Block stair, Block slab, Block wall){
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, stair.asItem(),4)
                .pattern("B  ")
                .pattern("BB ")
                .pattern("BBB")
                .input('B', main.asItem())
                .criterion(hasItem(main.asItem()), conditionsFromItem(main.asItem()))
                .offerTo(recipeExp);

        offerStonecuttingRecipe(recipeExp, RecipeCategory.BUILDING_BLOCKS, stair.asItem(), main.asItem(), 1);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, wall.asItem(),6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', main.asItem())
                .criterion(hasItem(main.asItem()), conditionsFromItem(main.asItem()))
                .offerTo(recipeExp);

        offerStonecuttingRecipe(recipeExp, RecipeCategory.BUILDING_BLOCKS, wall.asItem(), main.asItem(), 1);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, slab.asItem(),6)
                .pattern("BBB")
                .input('B', main.asItem())
                .criterion(hasItem(main.asItem()), conditionsFromItem(main.asItem()))
                .offerTo(recipeExp);

        offerStonecuttingRecipe(recipeExp, RecipeCategory.BUILDING_BLOCKS, slab.asItem(), main.asItem(), 2);
    }

    private static void recipeWithRing(RecipeExporter recipeExp,Item ringItem, Item middleItem, Item resultItem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, resultItem)
                .pattern("BBB")
                .pattern("BDB")
                .pattern("BBB")
                .input('B', ringItem)
                .input('D', middleItem)
                .criterion(hasItem(ringItem), conditionsFromItem(ringItem))
                .offerTo(recipeExp);
    }
}

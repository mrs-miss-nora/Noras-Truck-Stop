package nora.truckstop.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.ModelIds;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
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
        offer2x2ConversionRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMALL_VINYL_WOOD_PANELING, ModBlocks.VINYL_WOOD, 4);
        offer2x2ConversionRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LARGE_VINYL_WOOD_PANELING, ModBlocks.SMALL_VINYL_WOOD_PANELING, 4);

        // Bricks

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OCHRE_BRICKS, 2)
                .pattern("BBB")
                .pattern("BDB")
                .pattern("BBB")
                .input('B', Items.BRICK)
                .input('D', Items.ORANGE_DYE)
                .criterion(hasItem(Items.BRICKS), conditionsFromItem(Items.BRICKS))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.EBONY_BRICKS, 2)
                .pattern("BBB")
                .pattern("BDB")
                .pattern("BBB")
                .input('B', Items.BRICK)
                .input('D', Items.BLACK_DYE)
                .criterion(hasItem(Items.BRICKS), conditionsFromItem(Items.BRICKS))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PEARL_BRICKS, 2)
                .pattern("BBB")
                .pattern("BDB")
                .pattern("BBB")
                .input('B', Items.BRICK)
                .input('D', Items.WHITE_DYE)
                .criterion(hasItem(Items.BRICKS), conditionsFromItem(Items.BRICKS))
                .offerTo(recipeExporter);

        stairSlabWallCombo(recipeExporter, ModBlocks.OCHRE_BRICKS, ModBlocks.OCHRE_BRICK_STAIRS, ModBlocks.OCHRE_BRICK_SLAB, ModBlocks.OCHRE_BRICK_WALL);
        stairSlabWallCombo(recipeExporter, ModBlocks.EBONY_BRICKS, ModBlocks.EBONY_BRICK_STAIRS, ModBlocks.EBONY_BRICK_SLAB, ModBlocks.EBONY_BRICK_WALL);
        stairSlabWallCombo(recipeExporter, ModBlocks.PEARL_BRICKS, ModBlocks.PEARL_BRICK_STAIRS, ModBlocks.PEARL_BRICK_SLAB, ModBlocks.PEARL_BRICK_WALL);

        // Drywall

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BARE_DRYWALL, 8)
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
        stairSlabWallCombo(recipeExporter, ModBlocks.BARE_DRYWALL, ModBlocks.BARE_DRYWALL_STAIRS, ModBlocks.BARE_DRYWALL_SLAB, ModBlocks.BARE_DRYWALL_WALL);

        // Garage Blocks

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GARAGE_PANEL, 4)
                .pattern("TT")
                .input('T', Items.IRON_TRAPDOOR)
                .criterion(hasItem(Items.IRON_TRAPDOOR), conditionsFromItem(Items.IRON_TRAPDOOR))
                .offerTo(recipeExporter);

        offerWallRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GARAGE_PANEL_WALL, ModBlocks.GARAGE_PANEL);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GARAGE_WINDOW)
                .input(ModBlocks.GARAGE_PANEL)
                .input(Blocks.GLASS)
                .criterion(hasItem(ModBlocks.GARAGE_PANEL), conditionsFromItem(ModBlocks.GARAGE_PANEL))
                .offerTo(recipeExporter);

        offerWallRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GARAGE_WINDOW_WALL, ModBlocks.GARAGE_WINDOW);

        // Metal Blocks

        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BEIGE_CORRUGATED_METAL_BLOCK, Items.IRON_BLOCK, 16);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CORRUGATED_METAL_BLOCK, Items.IRON_BLOCK, 16);
        stairSlabWallCombo(recipeExporter, ModBlocks.BEIGE_CORRUGATED_METAL_BLOCK, ModBlocks.BEIGE_CORRUGATED_METAL_STAIRS, ModBlocks.BEIGE_CORRUGATED_METAL_SLAB, ModBlocks.BEIGE_CORRUGATED_METAL_WALL);
        stairSlabWallCombo(recipeExporter, ModBlocks.WHITE_CORRUGATED_METAL_BLOCK, ModBlocks.WHITE_CORRUGATED_METAL_STAIRS, ModBlocks.WHITE_CORRUGATED_METAL_SLAB, ModBlocks.WHITE_CORRUGATED_METAL_WALL);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DECORATED_BEIGE_CORRUGATED_METAL_BLOCK)
                .input(ModBlocks.BEIGE_CORRUGATED_METAL_BLOCK)
                .input(Items.ORANGE_DYE)
                .input(Items.RED_DYE)
                .criterion(hasItem(ModBlocks.BEIGE_CORRUGATED_METAL_BLOCK), conditionsFromItem(ModBlocks.BEIGE_CORRUGATED_METAL_BLOCK))
                .offerTo(recipeExporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DECORATED_WHITE_CORRUGATED_METAL_BLOCK)
                .input(ModBlocks.WHITE_CORRUGATED_METAL_BLOCK)
                .input(Items.BLUE_DYE)
                .input(Items.PURPLE_DYE)
                .criterion(hasItem(ModBlocks.WHITE_CORRUGATED_METAL_BLOCK), conditionsFromItem(ModBlocks.WHITE_CORRUGATED_METAL_BLOCK))
                .offerTo(recipeExporter);
        stairSlabWallCombo(recipeExporter, ModBlocks.DECORATED_BEIGE_CORRUGATED_METAL_BLOCK, ModBlocks.DECORATED_BEIGE_CORRUGATED_METAL_STAIRS, ModBlocks.DECORATED_BEIGE_CORRUGATED_METAL_SLAB, ModBlocks.DECORATED_BEIGE_CORRUGATED_METAL_WALL);
        stairSlabWallCombo(recipeExporter, ModBlocks.DECORATED_WHITE_CORRUGATED_METAL_BLOCK, ModBlocks.DECORATED_WHITE_CORRUGATED_METAL_STAIRS, ModBlocks.DECORATED_WHITE_CORRUGATED_METAL_SLAB, ModBlocks.DECORATED_WHITE_CORRUGATED_METAL_WALL);
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.BEIGE_CORRUGATED_METAL_DOOR, 3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.BEIGE_CORRUGATED_METAL_BLOCK)
                .criterion(hasItem(ModBlocks.BEIGE_CORRUGATED_METAL_BLOCK),conditionsFromItem(ModBlocks.BEIGE_CORRUGATED_METAL_BLOCK))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.WHITE_CORRUGATED_METAL_DOOR, 3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.WHITE_CORRUGATED_METAL_BLOCK)
                .criterion(hasItem(ModBlocks.WHITE_CORRUGATED_METAL_BLOCK),conditionsFromItem(ModBlocks.WHITE_CORRUGATED_METAL_BLOCK))
                .offerTo(recipeExporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BEIGE_CORRUGATED_METAL_WINDOW)
                .input(ModBlocks.BEIGE_CORRUGATED_METAL_BLOCK)
                .input(Blocks.GLASS)
                .criterion(hasItem(ModBlocks.BEIGE_CORRUGATED_METAL_BLOCK), conditionsFromItem(ModBlocks.BEIGE_CORRUGATED_METAL_BLOCK))
                .offerTo(recipeExporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CORRUGATED_METAL_WINDOW)
                .input(ModBlocks.WHITE_CORRUGATED_METAL_BLOCK)
                .input(Blocks.GLASS)
                .criterion(hasItem(ModBlocks.WHITE_CORRUGATED_METAL_BLOCK), conditionsFromItem(ModBlocks.WHITE_CORRUGATED_METAL_BLOCK))
                .offerTo(recipeExporter);

        // Shingles

        recipeWithRing(recipeExporter, Items.BRICK, Items.HONEYCOMB, ModBlocks.CLAY_SHINGLES.asItem());

        recipeWithRing(recipeExporter, ModBlocks.CLAY_SHINGLES.asItem(), Items.ORANGE_DYE, ModBlocks.OCHRE_SHINGLES.asItem());
        recipeWithRing(recipeExporter, ModBlocks.CLAY_SHINGLES.asItem(), Items.BLACK_DYE, ModBlocks.EBONY_SHINGLES.asItem());
        recipeWithRing(recipeExporter, ModBlocks.CLAY_SHINGLES.asItem(), Items.WHITE_DYE, ModBlocks.PEARL_SHINGLES.asItem());
        recipeWithRing(recipeExporter, ModBlocks.CLAY_SHINGLES.asItem(), Items.BLUE_DYE, ModBlocks.LAPIS_SHINGLES.asItem());
        recipeWithRing(recipeExporter, ModBlocks.CLAY_SHINGLES.asItem(), Items.LIME_DYE, ModBlocks.MINT_SHINGLES.asItem());
        recipeWithRing(recipeExporter, ModBlocks.CLAY_SHINGLES.asItem(), Items.CYAN_DYE, ModBlocks.PRISMARINE_SHINGLES.asItem());
        recipeWithRing(recipeExporter, ModBlocks.CLAY_SHINGLES.asItem(), Items.PURPLE_DYE, ModBlocks.SHULKER_SHINGLES.asItem());
        recipeWithRing(recipeExporter, ModBlocks.CLAY_SHINGLES.asItem(), Items.GRAY_DYE, ModBlocks.SLATE_SHINGLES.asItem());
        recipeWithRing(recipeExporter, ModBlocks.CLAY_SHINGLES.asItem(), Items.GREEN_DYE, ModBlocks.EVERGREEN_SHINGLES.asItem());
        recipeWithRing(recipeExporter, ModBlocks.CLAY_SHINGLES.asItem(), Items.PINK_DYE, ModBlocks.CHERRY_SHINGLES.asItem());

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

        // Vinyl + Cushions + Box

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VINYL_WOOD)
                .pattern("BBB")
                .pattern("BDB")
                .pattern("BBB")
                .input('B', Items.BROWN_DYE)
                .input('D', Items.HONEYCOMB)
                .criterion(hasItem(Items.HONEYCOMB), conditionsFromItem(Items.HONEYCOMB))
                .offerTo(recipeExporter);

        offer2x2ConversionRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VELVET_CUSHIONS, Items.RED_WOOL, 4);
        offer2x2ConversionRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEMON_VELVET_CUSHIONS, Items.YELLOW_WOOL, 4);

        nonStoneStairSlabCombo(recipeExporter, ModBlocks.VINYL_WOOD, ModBlocks.VINYL_WOOD_STAIRS, ModBlocks.VINYL_WOOD_SLAB);
        nonStoneStairSlabCombo(recipeExporter, ModBlocks.VELVET_CUSHIONS, ModBlocks.VELVET_CUSHION_STAIRS, ModBlocks.VELVET_CUSHION_SLAB);
        nonStoneStairSlabCombo(recipeExporter, ModBlocks.LEMON_VELVET_CUSHIONS, ModBlocks.LEMON_VELVET_CUSHION_STAIRS, ModBlocks.LEMON_VELVET_CUSHION_SLAB);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ARCADE_CARPET)
                .input(Ingredient.fromTag(ItemTags.WOOL), 2)
                .criterion(hasItem(Items.WHITE_WOOL), conditionsFromItem(Items.WHITE_WOOL))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BARE_DRYWALL, 8)
                .pattern(" B ")
                .pattern("BDB")
                .pattern(" B ")
                .input('B', Items.PAPER)
                .input('D', Items.BROWN_DYE)
                .criterion(hasItem(Items.PAPER), conditionsFromItem(Items.PAPER))
                .offerTo(recipeExporter);
    }

    private static void stairSlabCombo(RecipeExporter recipeExp, Block main, Block stair, Block slab){
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, stair.asItem(),4)
                .pattern("B  ")
                .pattern("BB ")
                .pattern("BBB")
                .input('B', main.asItem())
                .criterion(hasItem(main.asItem()), conditionsFromItem(main.asItem()))
                .offerTo(recipeExp);

        offerStonecuttingRecipe(recipeExp, RecipeCategory.BUILDING_BLOCKS, stair.asItem(), main.asItem(), 1);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, slab.asItem(),6)
                .pattern("BBB")
                .input('B', main.asItem())
                .criterion(hasItem(main.asItem()), conditionsFromItem(main.asItem()))
                .offerTo(recipeExp);

        offerStonecuttingRecipe(recipeExp, RecipeCategory.BUILDING_BLOCKS, slab.asItem(), main.asItem(), 2);
    }

    private static void nonStoneStairSlabCombo(RecipeExporter recipeExp, Block main, Block stair, Block slab){
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

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, slab.asItem(),6)
                .pattern("BBB")
                .input('B', main.asItem())
                .criterion(hasItem(main.asItem()), conditionsFromItem(main.asItem()))
                .offerTo(recipeExp);

        offerStonecuttingRecipe(recipeExp, RecipeCategory.BUILDING_BLOCKS, slab.asItem(), main.asItem(), 2);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, wall.asItem(),6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', main.asItem())
                .criterion(hasItem(main.asItem()), conditionsFromItem(main.asItem()))
                .offerTo(recipeExp);

        offerStonecuttingRecipe(recipeExp, RecipeCategory.BUILDING_BLOCKS, wall.asItem(), main.asItem(), 1);
    }

    private static void recipeWithRing(RecipeExporter recipeExp,Item ringItem, Item middleItem, Item resultItem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, resultItem, 8)
                .pattern("BBB")
                .pattern("BDB")
                .pattern("BBB")
                .input('B', ringItem)
                .input('D', middleItem)
                .criterion(hasItem(ringItem), conditionsFromItem(ringItem))
                .offerTo(recipeExp);
    }
    public static void offer2x2ConversionRecipe(RecipeExporter exporter, RecipeCategory category, ItemConvertible output, ItemConvertible input, int count) {
        ShapedRecipeJsonBuilder.create(category, output, count)
                .input('#', input)
                .pattern("##")
                .pattern("##")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }
}

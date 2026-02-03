package nora.truckstop.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import nora.truckstop.block.ModBlocks;

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

        createStairsRecipe(ModBlocks.VINYL_WOOD_STAIRS, Ingredient.ofItems(ModBlocks.VINYL_WOOD));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VINYL_WOOD_STAIRS, Ingredient.ofItems(ModBlocks.VINYL_WOOD));

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


    }
}

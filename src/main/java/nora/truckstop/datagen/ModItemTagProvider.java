package nora.truckstop.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import nora.truckstop.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.DAMPENS_VIBRATIONS)
                .add(ModBlocks.VELVET_CUSHIONS.asItem())
                .add(ModBlocks.VELVET_CUSHION_STAIRS.asItem())
                .add(ModBlocks.VELVET_CUSHION_SLAB.asItem())
                .add(ModBlocks.LEMON_VELVET_CUSHIONS.asItem())
                .add(ModBlocks.LEMON_VELVET_CUSHION_STAIRS.asItem())
                .add(ModBlocks.LEMON_VELVET_CUSHION_SLAB.asItem())
                .add(ModBlocks.ARCADE_CARPET.asItem())
        ;
    }
}

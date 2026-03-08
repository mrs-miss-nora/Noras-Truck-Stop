package nora.truckstop;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import nora.truckstop.block.ModBlocks;

public class NorasTruckStopClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(),
                ModBlocks.BEIGE_CORRUGATED_METAL_DOOR,
                ModBlocks.BEIGE_CORRUGATED_METAL_TRAPDOOR,
                ModBlocks.BEIGE_CORRUGATED_METAL_WINDOW,
                ModBlocks.WHITE_CORRUGATED_METAL_DOOR,
                ModBlocks.WHITE_CORRUGATED_METAL_TRAPDOOR,
                ModBlocks.WHITE_CORRUGATED_METAL_WINDOW,
                ModBlocks.GARAGE_WINDOW,
                ModBlocks.GARAGE_WINDOW_WALL,
                ModBlocks.DISCO_FLOOR_1,
                ModBlocks.DISCO_FLOOR_2,
                ModBlocks.DISCO_FLOOR_3
        );
    }
}

package com.teamaurora.enhanced_mushrooms.client.fabric;

import com.teamaurora.enhanced_mushrooms.core.registry.EMBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

public class EMClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderType.cutoutMipped(),
                EMBlocks.BROWN_MUSHROOM_DOOR.get(),
                EMBlocks.BROWN_MUSHROOM_TRAPDOOR.get()
        );
    }
}

package com.teamaurora.enhanced_mushrooms.client.forge;

import com.teamaurora.enhanced_mushrooms.core.EnhancedMushrooms;
import com.teamaurora.enhanced_mushrooms.core.registry.EMBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(value = Dist.CLIENT, modid = EnhancedMushrooms.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EMClient {
    @SubscribeEvent
    public static void registerClient(final FMLClientSetupEvent event) {
        setupRenderLayer();
    }

    private static void setupRenderLayer() {
        ItemBlockRenderTypes.setRenderLayer(EMBlocks.BROWN_MUSHROOM_DOOR.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EMBlocks.BROWN_MUSHROOM_TRAPDOOR.get(), RenderType.cutoutMipped());
    }
}

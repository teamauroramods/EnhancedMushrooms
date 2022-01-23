package com.teamaurora.enhanced_mushrooms.client.forge;

import com.teamaurora.enhanced_mushrooms.core.EnhancedMushrooms;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(value = Dist.CLIENT, modid = EnhancedMushrooms.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EMClient {
    @SubscribeEvent
    public static void registerClient(final FMLClientSetupEvent event) {}
}
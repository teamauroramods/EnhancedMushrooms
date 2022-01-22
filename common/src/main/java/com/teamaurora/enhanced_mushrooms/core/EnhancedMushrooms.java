package com.teamaurora.enhanced_mushrooms.core;

import com.teamaurora.enhanced_mushrooms.core.registry.EMBlocks;
import com.teamaurora.enhanced_mushrooms.core.registry.EMItems;
import gg.moonflower.pollen.api.platform.Platform;
import gg.moonflower.pollen.api.registry.StrippingRegistry;

public class EnhancedMushrooms {
    //TODO: Add acesswidner
    public static final String MOD_ID = "enhanced_mushrooms";
    public static final Platform PLATFORM = Platform.builder(MOD_ID)
            .clientInit(EnhancedMushrooms::onClientInit)
            .clientPostInit(EnhancedMushrooms::onClientPostInit)
            .commonInit(EnhancedMushrooms::onCommonInit)
            .commonPostInit(EnhancedMushrooms::onCommonPostInit)
            .build();

    public static void onClientInit() {}

    public static void onClientPostInit(Platform.ModSetupContext ctx) {}

    public static void onCommonInit() {
        EMBlocks.BLOCKS.register(EnhancedMushrooms.PLATFORM);
        EMItems.ITEMS.register(EnhancedMushrooms.PLATFORM);

        StrippingRegistry.register(EMBlocks.RED_MUSHROOM_STEM.get(), EMBlocks.STRIPPED_RED_MUSHROOM_STEM.get());
        StrippingRegistry.register(EMBlocks.BROWN_MUSHROOM_STEM.get(), EMBlocks.STRIPPED_BROWN_MUSHROOM_STEM.get());
    }

    public static void onCommonPostInit(Platform.ModSetupContext ctx) {}
}
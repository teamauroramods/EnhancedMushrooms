package com.teamaurora.enhanced_mushrooms.core;

import gg.moonflower.pollen.api.platform.Platform;

public class EnhancedMushrooms {
    public static final String MOD_ID = "enhanced_mushrooms";
    public static final Platform PLATFORM = Platform.builder(MOD_ID)
            .clientInit(EnhancedMushrooms::onClientInit)
            .clientPostInit(EnhancedMushrooms::onClientPostInit)
            .commonInit(EnhancedMushrooms::onCommonInit)
            .commonPostInit(EnhancedMushrooms::onCommonPostInit)
            .build();

    public static void onClientInit() {
    }

    public static void onClientPostInit(Platform.ModSetupContext ctx) {
    }

    public static void onCommonInit() {
    }

    public static void onCommonPostInit(Platform.ModSetupContext ctx) {
    }
}

package com.teamaurora.enhanced_mushrooms.core.fabric;

import com.teamaurora.enhanced_mushrooms.core.EnhancedMushrooms;
import net.fabricmc.api.ModInitializer;

public class EnhancedMushroomsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        EnhancedMushrooms.PLATFORM.setup();
    }
}

package com.teamaurora.enhanced_mushrooms.core.forge;

import com.teamaurora.enhanced_mushrooms.core.EnhancedMushrooms;
import net.minecraftforge.fml.common.Mod;

@Mod(EnhancedMushrooms.MOD_ID)
public class StarterForge {
    public StarterForge() {
        EnhancedMushrooms.PLATFORM.setup();
    }
}
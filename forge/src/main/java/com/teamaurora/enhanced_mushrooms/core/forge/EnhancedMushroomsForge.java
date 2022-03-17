package com.teamaurora.enhanced_mushrooms.core.forge;

import com.teamaurora.enhanced_mushrooms.core.EnhancedMushrooms;
import net.minecraftforge.fml.common.Mod;

/**
 * @author Exoplanetary
 */
@Mod(EnhancedMushrooms.MOD_ID)
public class EnhancedMushroomsForge {
    public EnhancedMushroomsForge() {
        EnhancedMushrooms.PLATFORM.setup();
    }
}
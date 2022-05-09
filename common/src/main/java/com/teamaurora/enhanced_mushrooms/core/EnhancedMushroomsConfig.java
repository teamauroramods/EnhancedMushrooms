package com.teamaurora.enhanced_mushrooms.core;

import gg.moonflower.pollen.api.config.PollinatedConfigBuilder;
import gg.moonflower.pollen.api.config.PollinatedConfigBuilder.ConfigValue;


public class EnhancedMushroomsConfig {
    public static class Common {
        public final ConfigValue<Boolean> capsStrippable;

        protected Common(PollinatedConfigBuilder builder) {
            builder.push("Common");
            {
                this.capsStrippable = builder.comment("Whether vanilla mushroom blocks should be strippable with an axe.").define("Strippable Mushroom Blocks", true);
            }
            builder.pop();
        }
    }
}

package com.teamaurora.enhanced_mushrooms.core;

import com.teamaurora.enhanced_mushrooms.core.registry.EMBlockEntityTypes;
import com.teamaurora.enhanced_mushrooms.core.registry.EMBlocks;
import com.teamaurora.enhanced_mushrooms.core.registry.EMEntities;
import com.teamaurora.enhanced_mushrooms.core.registry.EMItems;
import gg.moonflower.pollen.api.platform.Platform;
import gg.moonflower.pollen.api.registry.StrippingRegistry;
import gg.moonflower.pollen.api.registry.client.RenderTypeRegistry;
import gg.moonflower.pollen.api.registry.resource.ResourceRegistry;
import gg.moonflower.pollen.api.util.PollinatedModContainer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;

/**
 * @author Steven, Exoplanetary
 */
public class EnhancedMushrooms {
    public static final String MOD_ID = "enhanced_mushrooms";
    public static final Platform PLATFORM = Platform.builder(MOD_ID)
            .clientInit(EnhancedMushrooms::onClientInit)
            .clientPostInit(EnhancedMushrooms::onClientPostInit)
            .commonInit(EnhancedMushrooms::onCommonInit)
            .commonPostInit(EnhancedMushrooms::onCommonPostInit)
            .build();

    public static void onClientInit() {
        PollinatedModContainer.get(MOD_ID).ifPresent(modContainer -> ResourceRegistry.registerBuiltinResourcePack(new ResourceLocation(EnhancedMushrooms.MOD_ID, "vanilla_overrides"), modContainer, false));
    }

    public static void onClientPostInit(Platform.ModSetupContext ctx) {
        ctx.enqueueWork(() -> {
            RenderTypeRegistry.register(EMBlocks.BROWN_MUSHROOM_DOOR.get(), RenderType.cutoutMipped());
            RenderTypeRegistry.register(EMBlocks.BROWN_MUSHROOM_TRAPDOOR.get(), RenderType.cutoutMipped());
            RenderTypeRegistry.register(EMBlocks.RED_MUSHROOM_DOOR.get(), RenderType.cutoutMipped());
            RenderTypeRegistry.register(EMBlocks.RED_MUSHROOM_TRAPDOOR.get(), RenderType.cutoutMipped());
        });
    }

    public static void onCommonInit() {
        EMBlocks.BLOCKS.register(PLATFORM);
        EMEntities.BOATS.register(PLATFORM);
        EMBlockEntityTypes.TILES.register(PLATFORM);
        EMItems.ITEMS.register(PLATFORM);
    }

    public static void onCommonPostInit(Platform.ModSetupContext ctx) {
        ctx.enqueueWork(() -> {
            StrippingRegistry.register(EMBlocks.RED_MUSHROOM_STEM.get(), EMBlocks.STRIPPED_RED_MUSHROOM_STEM.get());
            StrippingRegistry.register(EMBlocks.BROWN_MUSHROOM_STEM.get(), EMBlocks.STRIPPED_BROWN_MUSHROOM_STEM.get());
            StrippingRegistry.register(EMBlocks.RED_MUSHROOM_HYPHAE.get(), EMBlocks.STRIPPED_RED_MUSHROOM_HYPHAE.get());
            StrippingRegistry.register(EMBlocks.BROWN_MUSHROOM_HYPHAE.get(), EMBlocks.STRIPPED_BROWN_MUSHROOM_HYPHAE.get());
        });
    }

    public static TranslatableComponent generateTranslation(String key, Object... args) {
        return new TranslatableComponent(MOD_ID + "." + key, args);
    }
}
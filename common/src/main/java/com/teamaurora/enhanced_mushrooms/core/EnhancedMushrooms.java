package com.teamaurora.enhanced_mushrooms.core;

import com.teamaurora.enhanced_mushrooms.common.event.MushroomInteractionManager;
import com.teamaurora.enhanced_mushrooms.core.other.EMData;
import com.teamaurora.enhanced_mushrooms.core.registry.EMBlocks;
import com.teamaurora.enhanced_mushrooms.core.registry.EMEntities;
import com.teamaurora.enhanced_mushrooms.core.registry.EMItems;
import gg.moonflower.pollen.api.event.events.entity.player.PlayerInteractionEvents;
import gg.moonflower.pollen.api.platform.Platform;
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
            .clientInit(() -> EnhancedMushrooms::onClientInit)
            .clientPostInit(() -> EnhancedMushrooms::onClientPostInit)
            .commonInit(EnhancedMushrooms::onCommonInit)
            .commonPostInit(EnhancedMushrooms::onCommonPostInit)
            .build();

    public static void onClientInit() {
        PollinatedModContainer.get(MOD_ID).ifPresent(modContainer -> ResourceRegistry.registerBuiltinResourcePack(location("vanilla_overrides"), modContainer, false));
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
        EMBlocks.BLOCK_ENTITIES.register(PLATFORM);
        EMEntities.BOATS.register(PLATFORM);
        EMItems.ITEMS.register(PLATFORM);
        PlayerInteractionEvents.RIGHT_CLICK_BLOCK.register(MushroomInteractionManager::onRightClickBlock);
    }

    public static void onCommonPostInit(Platform.ModSetupContext ctx) {
        ctx.enqueueWork(EMData::init);
    }

    public static ResourceLocation location(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

    public static TranslatableComponent generateTranslation(String key, Object... args) {
        return new TranslatableComponent(MOD_ID + "." + key, args);
    }
}
package com.teamaurora.enhanced_mushrooms.core.registry;

import com.teamaurora.enhanced_mushrooms.core.EnhancedMushrooms;
import gg.moonflower.pollen.api.item.PollinatedBoatItem;
import gg.moonflower.pollen.api.registry.PollinatedRegistry;
import net.minecraft.core.Registry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

/**
 * @author Steven
 * @author Exoplanetary
 */
public class EMItems {
    public static final PollinatedRegistry<Item> ITEMS = PollinatedRegistry.create(Registry.ITEM, EnhancedMushrooms.MOD_ID);

    /* Boats */
    public static final Supplier<Item> BROWN_MUSHROOM_BOAT_ITEM = ITEMS.register("brown_mushroom_boat", () -> new PollinatedBoatItem(EMEntities.BROWN_MUSHROOM_BOAT, new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_TRANSPORTATION)));
    public static final Supplier<Item> RED_MUSHROOM_BOAT_ITEM = ITEMS.register("red_mushroom_boat", () -> new PollinatedBoatItem(EMEntities.RED_MUSHROOM_BOAT, new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_TRANSPORTATION)));
}
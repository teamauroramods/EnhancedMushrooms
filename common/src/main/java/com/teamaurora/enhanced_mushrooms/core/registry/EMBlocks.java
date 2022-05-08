package com.teamaurora.enhanced_mushrooms.core.registry;

import com.mojang.datafixers.util.Pair;
import com.teamaurora.enhanced_mushrooms.common.item.TabInsertBlockItem;
import com.teamaurora.enhanced_mushrooms.core.registry.util.Woodset;
import gg.moonflower.pollen.api.block.PollinatedStandingSignBlock;
import gg.moonflower.pollen.api.block.PollinatedWallSignBlock;
import gg.moonflower.pollen.api.platform.Platform;
import gg.moonflower.pollen.api.registry.PollinatedBlockRegistry;
import gg.moonflower.pollen.api.registry.PollinatedRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

import java.util.function.Supplier;

/**
 * @author Steven, Exoplanetary
 */
@SuppressWarnings("unused")
public class EMBlocks {
    public static final PollinatedBlockRegistry BLOCKS = PollinatedRegistry.createBlock(EMItems.ITEMS);

    /* Red Mushroom Wood Set */
    private static final Woodset RED_MUSHROOM = new Woodset(MaterialColor.WOOL, MaterialColor.SAND);

    public static final Supplier<Block> STRIPPED_RED_MUSHROOM_STEM = registerTabInsertBlock("stripped_red_mushroom_stem", RED_MUSHROOM::stripped_log,  new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Blocks.STRIPPED_WARPED_STEM);
    public static final Supplier<Block> STRIPPED_RED_MUSHROOM_HYPHAE = registerTabInsertBlock("stripped_red_mushroom_hyphae", RED_MUSHROOM::stripped_wood,  new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Blocks.STRIPPED_WARPED_HYPHAE);
    public static final Supplier<Block> RED_MUSHROOM_STEM = registerTabInsertBlock("red_mushroom_stem", RED_MUSHROOM::log,  new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Blocks.WARPED_STEM);
    public static final Supplier<Block> RED_MUSHROOM_HYPHAE = registerTabInsertBlock("red_mushroom_hyphae", RED_MUSHROOM::wood,  new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Blocks.WARPED_HYPHAE);

    public static final Supplier<Block> RED_MUSHROOM_PLANKS = registerTabInsertBlock("red_mushroom_planks", RED_MUSHROOM::planks,  new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Blocks.WARPED_PLANKS);
    public static final Supplier<Block> RED_MUSHROOM_SLAB = registerTabInsertBlock("red_mushroom_slab", RED_MUSHROOM::slab,  new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Blocks.WARPED_SLAB);
    public static final Supplier<Block> RED_MUSHROOM_STAIRS = registerTabInsertBlock("red_mushroom_stairs", () -> RED_MUSHROOM.stairs(RED_MUSHROOM_PLANKS), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Blocks.WARPED_STAIRS);
    public static final Supplier<Block> RED_MUSHROOM_PRESSURE_PLATE = registerTabInsertBlock("red_mushroom_pressure_plate", RED_MUSHROOM::pressurePlate, new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE), Blocks.WARPED_PRESSURE_PLATE);
    public static final Supplier<Block> RED_MUSHROOM_BUTTON = registerTabInsertBlock("red_mushroom_button", RED_MUSHROOM::button, new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE), Blocks.WARPED_BUTTON);
    public static final Supplier<Block> RED_MUSHROOM_FENCE = registerTabInsertBlock("red_mushroom_fence", RED_MUSHROOM::fence,new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS), Blocks.WARPED_FENCE);
    public static final Supplier<Block> RED_MUSHROOM_FENCE_GATE = registerTabInsertBlock("red_mushroom_fence_gate", RED_MUSHROOM::fenceGate, new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE), Blocks.WARPED_FENCE_GATE);
    public static final Supplier<Block> RED_MUSHROOM_DOOR = registerTabInsertBlock("red_mushroom_door", RED_MUSHROOM::door, new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE), Blocks.WARPED_DOOR);
    public static final Supplier<Block> RED_MUSHROOM_TRAPDOOR = registerTabInsertBlock("red_mushroom_trapdoor", RED_MUSHROOM::trapdoor, new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE), Blocks.WARPED_TRAPDOOR);
    public static final Supplier<Block> RED_MUSHROOM_CABINET = BLOCKS.registerWithItem("red_mushroom_cabinet", RED_MUSHROOM::cabinet, new Item.Properties().tab(Platform.isModLoaded("farmersdelight") ? CreativeModeTab.TAB_BUILDING_BLOCKS : null));

    public static final Pair<Supplier<PollinatedStandingSignBlock>, Supplier<PollinatedWallSignBlock>> RED_MUSHROOM_SIGN = BLOCKS.registerSign("red_mushroom", Material.WOOD, MaterialColor.SAND);

    /* Brown Mushroom Wood Set */
    private static final Woodset BROWN_MUSHROOM = new Woodset(MaterialColor.COLOR_ORANGE, MaterialColor.DIRT);

    public static final Supplier<Block> STRIPPED_BROWN_MUSHROOM_STEM = registerTabInsertBlock("stripped_brown_mushroom_stem", BROWN_MUSHROOM::stripped_log, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Blocks.STRIPPED_WARPED_STEM);
    public static final Supplier<Block> STRIPPED_BROWN_MUSHROOM_HYPHAE = registerTabInsertBlock("stripped_brown_mushroom_hyphae", BROWN_MUSHROOM::stripped_wood, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Blocks.STRIPPED_WARPED_HYPHAE);
    public static final Supplier<Block> BROWN_MUSHROOM_STEM = registerTabInsertBlock("brown_mushroom_stem", BROWN_MUSHROOM::log, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Blocks.WARPED_STEM);
    public static final Supplier<Block> BROWN_MUSHROOM_HYPHAE = registerTabInsertBlock("brown_mushroom_hyphae", BROWN_MUSHROOM::wood, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Blocks.WARPED_HYPHAE);

    public static final Supplier<Block> BROWN_MUSHROOM_PLANKS = registerTabInsertBlock("brown_mushroom_planks", BROWN_MUSHROOM::planks, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Blocks.WARPED_PLANKS);
    public static final Supplier<Block> BROWN_MUSHROOM_SLAB = registerTabInsertBlock("brown_mushroom_slab", BROWN_MUSHROOM::slab, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Blocks.WARPED_SLAB);
    public static final Supplier<Block> BROWN_MUSHROOM_STAIRS = registerTabInsertBlock("brown_mushroom_stairs", () -> BROWN_MUSHROOM.stairs(BROWN_MUSHROOM_PLANKS), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Blocks.WARPED_STAIRS);
    public static final Supplier<Block> BROWN_MUSHROOM_PRESSURE_PLATE = registerTabInsertBlock("brown_mushroom_pressure_plate", BROWN_MUSHROOM::pressurePlate, new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE), Blocks.WARPED_PRESSURE_PLATE);
    public static final Supplier<Block> BROWN_MUSHROOM_BUTTON = registerTabInsertBlock("brown_mushroom_button", BROWN_MUSHROOM::button, new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE), Blocks.WARPED_BUTTON);
    public static final Supplier<Block> BROWN_MUSHROOM_FENCE = registerTabInsertBlock("brown_mushroom_fence", BROWN_MUSHROOM::fence, new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS), Blocks.WARPED_FENCE);
    public static final Supplier<Block> BROWN_MUSHROOM_FENCE_GATE = registerTabInsertBlock("brown_mushroom_fence_gate", BROWN_MUSHROOM::fenceGate, new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE), Blocks.WARPED_FENCE_GATE);
    public static final Supplier<Block> BROWN_MUSHROOM_DOOR = registerTabInsertBlock("brown_mushroom_door", BROWN_MUSHROOM::door,new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE), Blocks.WARPED_DOOR);
    public static final Supplier<Block> BROWN_MUSHROOM_TRAPDOOR = registerTabInsertBlock("brown_mushroom_trapdoor", BROWN_MUSHROOM::trapdoor, new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE), Blocks.WARPED_TRAPDOOR);
    public static final Supplier<Block> BROWN_MUSHROOM_CABINET = BLOCKS.registerWithItem("brown_mushroom_cabinet", RED_MUSHROOM::cabinet, new Item.Properties().tab(Platform.isModLoaded("farmersdelight") ? CreativeModeTab.TAB_BUILDING_BLOCKS : null));

    public static final Pair<Supplier<PollinatedStandingSignBlock>, Supplier<PollinatedWallSignBlock>> BROWN_MUSHROOM_SIGN = BLOCKS.registerSign("brown_mushroom", Material.WOOD, MaterialColor.DIRT);

    // TODO Use item factories once Pollen adds their implementation of TabInsertBlockItem
    private static Supplier<Block> registerTabInsertBlock(String id, Supplier<Block> block, Item.Properties properties, Block insertAfter) {
        Supplier<Block> register = BLOCKS.register(id, block);
        EMItems.ITEMS.register(id, () -> new TabInsertBlockItem(insertAfter.asItem(), register.get(), properties));
        return register;
    }
}

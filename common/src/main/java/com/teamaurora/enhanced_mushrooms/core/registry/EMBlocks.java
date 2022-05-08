package com.teamaurora.enhanced_mushrooms.core.registry;

import com.mojang.datafixers.util.Pair;
import com.teamaurora.enhanced_mushrooms.common.blockentity.EMCabinetBlockEntity;
import com.teamaurora.enhanced_mushrooms.common.item.TabInsertBlockItem;
import com.teamaurora.enhanced_mushrooms.core.EnhancedMushrooms;
import com.teamaurora.enhanced_mushrooms.core.registry.util.Woodset;
import gg.moonflower.pollen.api.block.PollinatedStandingSignBlock;
import gg.moonflower.pollen.api.block.PollinatedWallSignBlock;
import gg.moonflower.pollen.api.platform.Platform;
import gg.moonflower.pollen.api.registry.PollinatedBlockRegistry;
import gg.moonflower.pollen.api.registry.PollinatedRegistry;
import net.minecraft.core.Registry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

import java.util.function.Supplier;

/**
 * @author Steven
 * @author Exoplanetary
 * @author ebo2022
 */
@SuppressWarnings("unused")
public class EMBlocks {
    public static final PollinatedBlockRegistry BLOCKS = PollinatedRegistry.createBlock(EMItems.ITEMS);
    public static final PollinatedRegistry<BlockEntityType<?>> BLOCK_ENTITIES = PollinatedRegistry.create(Registry.BLOCK_ENTITY_TYPE, EnhancedMushrooms.MOD_ID);

    // Red Mushroom Woodset
    private static final Woodset RED_MUSHROOM = new Woodset(MaterialColor.WOOL, MaterialColor.SAND);

    public static final Supplier<Block> STRIPPED_RED_MUSHROOM_STEM = BLOCKS.registerWithItem("stripped_red_mushroom_stem", RED_MUSHROOM::stripped_log, block -> new TabInsertBlockItem(Blocks.STRIPPED_WARPED_STEM.asItem(), block, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final Supplier<Block> STRIPPED_RED_MUSHROOM_HYPHAE = BLOCKS.registerWithItem("stripped_red_mushroom_hyphae", RED_MUSHROOM::stripped_wood, block -> new TabInsertBlockItem(Blocks.STRIPPED_WARPED_HYPHAE.asItem(), block, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final Supplier<Block> RED_MUSHROOM_STEM = BLOCKS.registerWithItem("red_mushroom_stem", RED_MUSHROOM::log, block -> new TabInsertBlockItem(Blocks.WARPED_STEM.asItem(), block, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final Supplier<Block> RED_MUSHROOM_HYPHAE = BLOCKS.registerWithItem("red_mushroom_hyphae", RED_MUSHROOM::wood, block -> new TabInsertBlockItem(Blocks.WARPED_HYPHAE.asItem(), block, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final Supplier<Block> RED_MUSHROOM_PLANKS = BLOCKS.registerWithItem("red_mushroom_planks", RED_MUSHROOM::planks, block -> new TabInsertBlockItem(Blocks.WARPED_PLANKS.asItem(), block, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final Supplier<Block> RED_MUSHROOM_SLAB = BLOCKS.registerWithItem("red_mushroom_slab", RED_MUSHROOM::slab, block -> new TabInsertBlockItem(Blocks.WARPED_SLAB.asItem(), block, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final Supplier<Block> RED_MUSHROOM_STAIRS = BLOCKS.registerWithItem("red_mushroom_stairs", () -> RED_MUSHROOM.stairs(RED_MUSHROOM_PLANKS), block -> new TabInsertBlockItem(Blocks.WARPED_STAIRS.asItem(), block, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final Supplier<Block> RED_MUSHROOM_PRESSURE_PLATE = BLOCKS.registerWithItem("red_mushroom_pressure_plate", RED_MUSHROOM::pressurePlate, block -> new TabInsertBlockItem(Blocks.WARPED_PRESSURE_PLATE.asItem(), block, new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final Supplier<Block> RED_MUSHROOM_BUTTON = BLOCKS.registerWithItem("red_mushroom_button", RED_MUSHROOM::button, block -> new TabInsertBlockItem(Blocks.WARPED_BUTTON.asItem(), block, new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final Supplier<Block> RED_MUSHROOM_FENCE = BLOCKS.registerWithItem("red_mushroom_fence", RED_MUSHROOM::fence, block -> new TabInsertBlockItem(Blocks.WARPED_FENCE.asItem(), block, new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final Supplier<Block> RED_MUSHROOM_FENCE_GATE = BLOCKS.registerWithItem("red_mushroom_fence_gate", RED_MUSHROOM::fenceGate, block -> new TabInsertBlockItem(Blocks.WARPED_FENCE_GATE.asItem(), block, new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final Supplier<Block> RED_MUSHROOM_DOOR = BLOCKS.registerWithItem("red_mushroom_door", RED_MUSHROOM::door, block -> new TabInsertBlockItem(Blocks.WARPED_DOOR.asItem(), block, new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final Supplier<Block> RED_MUSHROOM_TRAPDOOR = BLOCKS.registerWithItem("red_mushroom_trapdoor", RED_MUSHROOM::trapdoor, block -> new TabInsertBlockItem(Blocks.WARPED_TRAPDOOR.asItem(), block, new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final Supplier<Block> RED_MUSHROOM_CABINET = BLOCKS.registerWithItem("red_mushroom_cabinet", RED_MUSHROOM::cabinet, new Item.Properties().tab(Platform.isModLoaded("farmersdelight") ? CreativeModeTab.TAB_BUILDING_BLOCKS : null));

    public static final Pair<Supplier<PollinatedStandingSignBlock>, Supplier<PollinatedWallSignBlock>> RED_MUSHROOM_SIGN = BLOCKS.registerSign("red_mushroom", Material.WOOD, MaterialColor.SAND);

    // Brown Mushroom Woodset
    private static final Woodset BROWN_MUSHROOM = new Woodset(MaterialColor.COLOR_ORANGE, MaterialColor.DIRT);

    public static final Supplier<Block> STRIPPED_BROWN_MUSHROOM_STEM = BLOCKS.registerWithItem("stripped_brown_mushroom_stem", BROWN_MUSHROOM::stripped_log, block -> new TabInsertBlockItem(Blocks.STRIPPED_WARPED_STEM.asItem(), block, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final Supplier<Block> STRIPPED_BROWN_MUSHROOM_HYPHAE = BLOCKS.registerWithItem("stripped_brown_mushroom_hyphae", BROWN_MUSHROOM::stripped_wood, block -> new TabInsertBlockItem(Blocks.STRIPPED_WARPED_HYPHAE.asItem(), block, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final Supplier<Block> BROWN_MUSHROOM_STEM = BLOCKS.registerWithItem("brown_mushroom_stem", BROWN_MUSHROOM::log, block -> new TabInsertBlockItem(Blocks.WARPED_STEM.asItem(), block, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final Supplier<Block> BROWN_MUSHROOM_HYPHAE = BLOCKS.registerWithItem("brown_mushroom_hyphae", BROWN_MUSHROOM::wood, block -> new TabInsertBlockItem(Blocks.WARPED_HYPHAE.asItem(), block, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final Supplier<Block> BROWN_MUSHROOM_PLANKS = BLOCKS.registerWithItem("brown_mushroom_planks", BROWN_MUSHROOM::planks, block -> new TabInsertBlockItem(Blocks.WARPED_PLANKS.asItem(), block, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final Supplier<Block> BROWN_MUSHROOM_SLAB = BLOCKS.registerWithItem("brown_mushroom_slab", BROWN_MUSHROOM::slab, block -> new TabInsertBlockItem(Blocks.WARPED_SLAB.asItem(), block, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final Supplier<Block> BROWN_MUSHROOM_STAIRS = BLOCKS.registerWithItem("brown_mushroom_stairs", () -> BROWN_MUSHROOM.stairs(BROWN_MUSHROOM_PLANKS), block -> new TabInsertBlockItem(Blocks.WARPED_STAIRS.asItem(), block, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final Supplier<Block> BROWN_MUSHROOM_PRESSURE_PLATE = BLOCKS.registerWithItem("brown_mushroom_pressure_plate", BROWN_MUSHROOM::pressurePlate, block -> new TabInsertBlockItem(Blocks.WARPED_PRESSURE_PLATE.asItem(), block, new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final Supplier<Block> BROWN_MUSHROOM_BUTTON = BLOCKS.registerWithItem("brown_mushroom_button", BROWN_MUSHROOM::button, block -> new TabInsertBlockItem(Blocks.WARPED_BUTTON.asItem(), block, new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final Supplier<Block> BROWN_MUSHROOM_FENCE = BLOCKS.registerWithItem("brown_mushroom_fence", BROWN_MUSHROOM::fence, block -> new TabInsertBlockItem(Blocks.WARPED_FENCE.asItem(), block, new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final Supplier<Block> BROWN_MUSHROOM_FENCE_GATE = BLOCKS.registerWithItem("brown_mushroom_fence_gate", BROWN_MUSHROOM::fenceGate, block -> new TabInsertBlockItem(Blocks.WARPED_FENCE_GATE.asItem(), block, new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final Supplier<Block> BROWN_MUSHROOM_DOOR = BLOCKS.registerWithItem("brown_mushroom_door", BROWN_MUSHROOM::door, block -> new TabInsertBlockItem(Blocks.WARPED_DOOR.asItem(), block, new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final Supplier<Block> BROWN_MUSHROOM_TRAPDOOR = BLOCKS.registerWithItem("brown_mushroom_trapdoor", BROWN_MUSHROOM::trapdoor, block -> new TabInsertBlockItem(Blocks.WARPED_TRAPDOOR.asItem(), block, new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final Supplier<Block> BROWN_MUSHROOM_CABINET = BLOCKS.registerWithItem("brown_mushroom_cabinet", BROWN_MUSHROOM::cabinet, new Item.Properties().tab(Platform.isModLoaded("farmersdelight") ? CreativeModeTab.TAB_BUILDING_BLOCKS : null));

    public static final Pair<Supplier<PollinatedStandingSignBlock>, Supplier<PollinatedWallSignBlock>> BROWN_MUSHROOM_SIGN = BLOCKS.registerSign("brown_mushroom", Material.WOOD, MaterialColor.DIRT);

    // Cabinet Block Entity

    public static final Supplier<BlockEntityType<EMCabinetBlockEntity>> CABINET_BE = BLOCK_ENTITIES.register("cabinet", () -> BlockEntityType.Builder.of(EMCabinetBlockEntity::new, EMBlocks.BROWN_MUSHROOM_CABINET.get(), EMBlocks.RED_MUSHROOM_CABINET.get()).build(null));
}

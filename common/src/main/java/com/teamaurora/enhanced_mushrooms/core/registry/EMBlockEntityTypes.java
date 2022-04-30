package com.teamaurora.enhanced_mushrooms.core.registry;

import com.teamaurora.enhanced_mushrooms.common.block.entity.EMCabinetBlockEntity;
import com.teamaurora.enhanced_mushrooms.core.EnhancedMushrooms;
import gg.moonflower.pollen.api.registry.PollinatedRegistry;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.entity.BlockEntityType;

import java.util.function.Supplier;

public class EMBlockEntityTypes {
    public static final PollinatedRegistry<BlockEntityType<?>> TILES = PollinatedRegistry.create(Registry.BLOCK_ENTITY_TYPE, EnhancedMushrooms.MOD_ID);

    public static final Supplier<BlockEntityType<EMCabinetBlockEntity>> CABINET = TILES.register("cabinet", () -> BlockEntityType.Builder.of(EMCabinetBlockEntity::new, EMBlocks.BROWN_MUSHROOM_CABINET.get(), EMBlocks.RED_MUSHROOM_CABINET.get()).build(null));
}

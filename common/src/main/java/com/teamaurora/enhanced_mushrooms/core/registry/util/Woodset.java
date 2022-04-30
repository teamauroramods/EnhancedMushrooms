package com.teamaurora.enhanced_mushrooms.core.registry.util;

import com.teamaurora.enhanced_mushrooms.common.block.EMCabinetBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

import java.util.function.Supplier;

/**
 * @author Exoplanetary
 */
public record Woodset(MaterialColor logColor, MaterialColor woodColor) {
    private static Boolean never(BlockState arg, BlockGetter arg2, BlockPos arg3, EntityType<?> arg4) {
        return false;
    }

    private RotatedPillarBlock template_log(MaterialColor arg, MaterialColor arg2) {
        return new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, (arg3) -> arg3.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? arg : arg2).strength(2.0F).sound(SoundType.STEM));
    }

    private RotatedPillarBlock template_wood(MaterialColor arg) {
        return new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, arg).strength(2.0F).sound(SoundType.STEM));
    }

    public RotatedPillarBlock log() {
        return template_log(woodColor, logColor);
    }

    public RotatedPillarBlock wood() {
        return template_wood(logColor);
    }

    public RotatedPillarBlock stripped_log() {
        return template_log(woodColor, woodColor);
    }

    public RotatedPillarBlock stripped_wood() {
        return template_wood(woodColor);
    }

    public Block planks() {
        return new Block(BlockBehaviour.Properties.of(Material.WOOD, woodColor).strength(2.0F, 3.0F).sound(SoundType.WOOD));
    }

    public SlabBlock slab() {
        return new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD, woodColor).strength(2.0F, 3.0F).sound(SoundType.WOOD));
    }

    public StairBlock stairs(Supplier<Block> planks) {
        return new StairBlock(planks.get().defaultBlockState(), BlockBehaviour.Properties.copy(planks.get()));
    }

    public PressurePlateBlock pressurePlate() {
        return new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, woodColor).noCollission().strength(0.5F).sound(SoundType.WOOD));
    }

    public ButtonBlock button() {
        return new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD));
    }

    public FenceBlock fence() {
        return new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, woodColor).strength(2.0F, 3.0F).sound(SoundType.WOOD));
    }

    public FenceGateBlock fenceGate() {
        return new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD, woodColor).strength(2.0F, 3.0F).sound(SoundType.WOOD));
    }

    public DoorBlock door() {
        return new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, woodColor).strength(3.0F).sound(SoundType.WOOD).noOcclusion());
    }

    public TrapDoorBlock trapdoor() {
        return new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, woodColor).strength(3.0F).sound(SoundType.WOOD).noOcclusion().isValidSpawn(Woodset::never));
    }

    public EMCabinetBlock cabinet() {
        return new EMCabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL));
    }
}
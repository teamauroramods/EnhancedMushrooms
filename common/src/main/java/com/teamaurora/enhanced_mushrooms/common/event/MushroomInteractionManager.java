package com.teamaurora.enhanced_mushrooms.common.event;

import com.teamaurora.enhanced_mushrooms.core.EnhancedMushrooms;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.HugeMushroomBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class MushroomInteractionManager {
    public static InteractionResult onRightClickBlock(Player player, Level level, InteractionHand hand, BlockHitResult hitResult) {
        BlockPos pos = hitResult.getBlockPos();
        BlockState state = level.getBlockState(pos);
        if (state.getBlock() instanceof HugeMushroomBlock) {
            BlockState strippedState = state.setValue(HugeMushroomBlock.DOWN, false)
                    .setValue(HugeMushroomBlock.UP, false)
                    .setValue(HugeMushroomBlock.NORTH, false)
                    .setValue(HugeMushroomBlock.SOUTH, false)
                    .setValue(HugeMushroomBlock.EAST, false)
                    .setValue(HugeMushroomBlock.WEST, false);
            if (state != strippedState) {
                ItemStack stack = player.getItemInHand(hand);
                if (stack.getItem() instanceof AxeItem) {
                    if (!player.getAbilities().instabuild)
                        stack.hurt(1, level.getRandom(), player instanceof ServerPlayer ? (ServerPlayer) player : null);
                    level.setBlockAndUpdate(pos, strippedState);
                    level.playSound(player, pos, SoundEvents.AXE_STRIP, SoundSource.BLOCKS, 1.0F, 1.0F);
                    player.swing(hand);
                    return InteractionResult.sidedSuccess(level.isClientSide);
                }
            }
        }
        return InteractionResult.PASS;
    }
}

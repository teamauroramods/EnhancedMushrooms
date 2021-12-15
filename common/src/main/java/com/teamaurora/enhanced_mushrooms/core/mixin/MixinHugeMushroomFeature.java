package com.teamaurora.enhanced_mushrooms.core.mixin;

import com.teamaurora.enhanced_mushrooms.core.registry.EMBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.AbstractHugeMushroomFeature;
import net.minecraft.world.level.levelgen.feature.HugeBrownMushroomFeature;
import net.minecraft.world.level.levelgen.feature.HugeRedMushroomFeature;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.Random;

@Mixin(AbstractHugeMushroomFeature.class)
public class MixinHugeMushroomFeature {
    @Redirect(method = "placeTrunk", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;getState(Ljava/util/Random;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;"))
    public BlockState getGoodState(BlockStateProvider self, Random rand, BlockPos pos) {
        if (this.getClass().isAssignableFrom(HugeRedMushroomFeature.class)) {
            return EMBlocks.RED_MUSHROOM_STEM.get().defaultBlockState();
        }
        if (this.getClass().isAssignableFrom(HugeBrownMushroomFeature.class)) {
            return EMBlocks.BROWN_MUSHROOM_STEM.get().defaultBlockState();
        }
        return self.getState(rand, pos);
    }
}

package net.sanberdir_rezolv.llw.init.customblocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.AmethystBlock;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.PushReaction;
import net.sanberdir_rezolv.llw.init.InitBlocks;

public class BloomingPrimordialFire extends AmethystBlock {

    public static final int GROWTH_CHANCE = 5;
    private static final Direction[] DIRECTIONS = Direction.values();
    public BloomingPrimordialFire(BlockBehaviour.Properties p_152726_) {
        super(p_152726_);
    }
    public PushReaction getPistonPushReaction(BlockState p_152733_) {
        return PushReaction.DESTROY;
    }

    public void randomTick(BlockState p_220898_, ServerLevel p_220899_, BlockPos p_220900_, RandomSource p_220901_) {
        if (p_220901_.nextInt(5) == 0) {
            Direction direction = DIRECTIONS[p_220901_.nextInt(DIRECTIONS.length)];
            BlockPos blockpos = p_220900_.relative(direction);
            BlockState blockstate = p_220899_.getBlockState(blockpos);
            Block block = null;
            if (canClusterGrowAtState(blockstate)) {
                block = InitBlocks.SMALL_PRIMORDIAL_FIRE_BUD.get();
            } else if (blockstate.is(InitBlocks.SMALL_PRIMORDIAL_FIRE_BUD.get()) && blockstate.getValue(AmethystClusterBlock.FACING) == direction) {
                block = InitBlocks.MEDIUM_PRIMORDIAL_FIRE_BUD.get();
            } else if (blockstate.is(InitBlocks.MEDIUM_PRIMORDIAL_FIRE_BUD.get()) && blockstate.getValue(AmethystClusterBlock.FACING) == direction) {
                block = InitBlocks.LARGE_PRIMORDIAL_FIRE_BUD.get();
            } else if (blockstate.is(InitBlocks.LARGE_PRIMORDIAL_FIRE_BUD.get()) && blockstate.getValue(AmethystClusterBlock.FACING) == direction) {
                block = InitBlocks.PRIMORDIAL_FIRE_CLUSTER.get();
            }

            if (block != null) {
                BlockState blockstate1 = block.defaultBlockState().setValue(AmethystClusterBlock.FACING, direction).setValue(AmethystClusterBlock.WATERLOGGED, Boolean.valueOf(blockstate.getFluidState().getType() == Fluids.WATER));
                p_220899_.setBlockAndUpdate(blockpos, blockstate1);
            }

        }
    }

    public static boolean canClusterGrowAtState(BlockState p_152735_) {
        return p_152735_.isAir() || p_152735_.is(Blocks.WATER) && p_152735_.getFluidState().getAmount() == 8;
    }
}

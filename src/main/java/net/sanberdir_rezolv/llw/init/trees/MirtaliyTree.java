package net.sanberdir_rezolv.llw.init.trees;

import net.minecraft.core.Holder;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.sanberdir_rezolv.llw.world.gen.ModConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

public class MirtaliyTree extends AbstractTreeGrower {
    @Nullable
    @Override
    protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource p_222910_, boolean p_222911_) {
        return  ModConfiguredFeatures.MIRTALIY.getHolder().get();
    }
}

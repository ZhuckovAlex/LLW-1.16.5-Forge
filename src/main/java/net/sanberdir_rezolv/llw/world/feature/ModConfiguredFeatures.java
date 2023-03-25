package net.sanberdir_rezolv.llw.world.feature;

import com.google.common.base.Suppliers;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GeodeBlockSettings;
import net.minecraft.world.level.levelgen.GeodeCrackSettings;
import net.minecraft.world.level.levelgen.GeodeLayerSettings;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.sanberdir_rezolv.llw.LLW;
import net.sanberdir_rezolv.llw.init.InitBlocks;

import java.util.List;
import java.util.function.Supplier;

public class ModConfiguredFeatures {

    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, LLW.MODID);
// Деревья
    // Азуровое
    public static final RegistryObject<ConfiguredFeature<?, ?>> AZURE_HARD_BARK =
            CONFIGURED_FEATURES.register("azure_hard_bark", () ->
                    new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                            BlockStateProvider.simple(InitBlocks.AZURE_HARD_BARK_LOG.get()),
                            new StraightTrunkPlacer(5, 6, 3),
                            BlockStateProvider.simple(InitBlocks.AZURE_HARD_BARK_LEAVES.get()),
                            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                            new TwoLayersFeatureSize(1, 0, 2)).build()));
    // Брандросс
    public static final RegistryObject<ConfiguredFeature<?, ?>> BRANDRHOSS =
            CONFIGURED_FEATURES.register("brandrhoss", () ->
                    new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                            BlockStateProvider.simple(InitBlocks.BRANDRHOSS_LOG.get()),
                            new StraightTrunkPlacer(5, 6, 3),
                            BlockStateProvider.simple(InitBlocks.BRANDRHOSS_LEAVES.get()),
                            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                            new TwoLayersFeatureSize(1, 0, 2)).build()));
    // Тёмная берёза
    public static final RegistryObject<ConfiguredFeature<?, ?>> DARK_BIRCH =
            CONFIGURED_FEATURES.register("dark_birch", () ->
                    new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                            BlockStateProvider.simple(InitBlocks.DARK_BIRCH_LOG.get()),
                            new StraightTrunkPlacer(5, 6, 3),
                            BlockStateProvider.simple(InitBlocks.DARK_BIRCH_LEAVES.get()),
                            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                            new TwoLayersFeatureSize(1, 0, 2)).build()));
    // Эленгар
    public static final RegistryObject<ConfiguredFeature<?, ?>> ELENGAR =
            CONFIGURED_FEATURES.register("elengar", () ->
                    new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                            BlockStateProvider.simple(InitBlocks.ELENGAR_LOG.get()),
                            new StraightTrunkPlacer(5, 6, 3),
                            BlockStateProvider.simple(InitBlocks.ELENGAR_LEAVES.get()),
                            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                            new TwoLayersFeatureSize(1, 0, 2)).build()));

    // Мирталий
    public static final RegistryObject<ConfiguredFeature<?, ?>> MIRTALIY =
            CONFIGURED_FEATURES.register("mirtaliy", () ->
                    new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                            BlockStateProvider.simple(InitBlocks.MIRTALIY_LOG.get()),
                            new StraightTrunkPlacer(5, 6, 3),
                            BlockStateProvider.simple(InitBlocks.MIRTALIY_LEAVES.get()),
                            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                            new TwoLayersFeatureSize(1, 0, 2)).build()));

    // Руды
    public static final Supplier<List<OreConfiguration.TargetBlockState>> CINNABAR_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, InitBlocks.CINNABAR_ORE.get().defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> CINNABAR_ORE = CONFIGURED_FEATURES.register("cinnabar_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(CINNABAR_ORES.get(),3)));

    //Жеоды
    public static final RegistryObject<ConfiguredFeature<?, ?>> PRIMORDIAL_FIRE_GEODE = CONFIGURED_FEATURES.register("primordial_fire_geode",
            () -> new ConfiguredFeature<>(Feature.GEODE,
                    new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                            BlockStateProvider.simple(Blocks.OBSIDIAN),
                            BlockStateProvider.simple(InitBlocks.BLOOMING_ACCUMULATION_OF_PRIMORDIAL_FIRE.get()),
                            BlockStateProvider.simple(InitBlocks.ACCUMULATION_OF_PRIMORDIAL_FIRE.get()),
                            BlockStateProvider.simple(Blocks.POLISHED_BASALT),
                            List.of(InitBlocks.MOON_TEAR_OBSIDIAN_ORE.get().defaultBlockState()),
                            BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                            new GeodeLayerSettings(1.7D, 1.2D, 2.5D, 3.5D),
                            new GeodeCrackSettings(0.25D, 1.5D, 1), 0.06D, 0.1D,
                            true, UniformInt.of(2, 5),
                            UniformInt.of(1, 4), UniformInt.of(1, 2),
                            -18, 18, 0.075D, 1)));

    // Цветы
    public static final RegistryObject<ConfiguredFeature<?, ?>> SUNFLOWER = CONFIGURED_FEATURES.register("sunflower",
            () -> new ConfiguredFeature<>(Feature.FLOWER,
                    new RandomPatchConfiguration(3, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(InitBlocks.SUNFLOWER.get()))))));

    public static final RegistryObject<ConfiguredFeature<?, ?>> ICY_YAWN = CONFIGURED_FEATURES.register("icy_yawn",
            () -> new ConfiguredFeature<>(Feature.FLOWER,
                    new RandomPatchConfiguration(3, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(InitBlocks.ICY_YAWN.get()))))));

    public static final RegistryObject<ConfiguredFeature<?, ?>> SILVER_SAGE = CONFIGURED_FEATURES.register("silver_sage",
            () -> new ConfiguredFeature<>(Feature.FLOWER,
                    new RandomPatchConfiguration(3, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(InitBlocks.SILVER_SAGE.get()))))));


    public static final RegistryObject<ConfiguredFeature<?, ?>> BLACK_TOADSTOOL = CONFIGURED_FEATURES.register("black_toadstool",
            () -> new ConfiguredFeature<>(Feature.FLOWER,
                    new RandomPatchConfiguration(3, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(InitBlocks.BLACK_TOADSTOOL.get()))))));

    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }
}

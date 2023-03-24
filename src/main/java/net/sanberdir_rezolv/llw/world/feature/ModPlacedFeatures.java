package net.sanberdir_rezolv.llw.world.feature;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.sanberdir_rezolv.llw.LLW;

import java.util.List;
public class ModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, LLW.MODID);
    // Руды
    public static final RegistryObject<PlacedFeature> CINNABAR_ORE_PLACED = PLACED_FEATURES.register("cinnabar_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.CINNABAR_ORE.getHolder().get(),
                    commonOrePlacement(2, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.absolute(15), VerticalAnchor.absolute(85)))));

    // Цветы
    public static final RegistryObject<PlacedFeature> SUNFLOWER_PLACED = PLACED_FEATURES.register("sunflower_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.SUNFLOWER.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(5),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> ICY_YAWN_PLACED = PLACED_FEATURES.register("icy_yawn_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.ICY_YAWN.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(5),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> BLACK_TOADSTOOL_PLACED = PLACED_FEATURES.register("black_toadstool_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.BLACK_TOADSTOOL.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(5),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));

    // Жеоды
    public static final RegistryObject<PlacedFeature> PRIMORDIAL_FIRE_GEODE_PLACED = PLACED_FEATURES.register("primordial_fire_geode_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.PRIMORDIAL_FIRE_GEODE.getHolder().get(), List.of(
                    RarityFilter.onAverageOnceEvery(280), InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(50)),
                    BiomeFilter.biome())));

    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }

    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }
}

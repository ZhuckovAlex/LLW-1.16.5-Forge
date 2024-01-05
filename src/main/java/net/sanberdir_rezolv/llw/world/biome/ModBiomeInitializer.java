package net.sanberdir_rezolv.llw.world.biome;

import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.biome.OverworldBiomes;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sanberdir_rezolv.llw.LLW;

import java.util.function.Supplier;

public class ModBiomeInitializer {
    public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, LLW.MODID);

    static {
        createBiome("magic_forest", OverworldBiomes::theVoid);
    }

    public static ResourceKey<Biome> MAGIC_FOREST = registerBiome("magic_forest");


    public static ResourceKey<Biome> registerBiome(String biomeName) {
        return ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(LLW.MODID, biomeName));
    }


    public static RegistryObject<Biome> createBiome(String biomeName, Supplier<Biome> biome) {
        return BIOMES.register(biomeName, biome);
    }


    public static void registerBiomes() {
        BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(MAGIC_FOREST, 5));
    }


}

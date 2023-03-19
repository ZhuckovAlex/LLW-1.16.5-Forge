package net.sanberdir_rezolv.llw.init;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sanberdir_rezolv.llw.LLW;
import net.sanberdir_rezolv.llw.init.customblocks.*;
import net.sanberdir_rezolv.llw.init.trees.*;

import java.util.function.Supplier;

public class InitBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, LLW.MODID);

    // Добавление блока\предмета
    // Семена
    public static final RegistryObject<Block> PURE_FRUIT_SEEDS = registerBlockWithoutBlockItem("pure_fruit_seeds",
            () -> new PureFruitBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_RED)
                    .noCollission().randomTicks().sound(SoundType.NETHER_WART)));

    // Добавление блока
    // Деревья

    // Азуровове дерево
    public static final RegistryObject<Block> AZURE_HARD_BARK_LOG = registerBlock("azure_hard_bark_log",
            () -> new FlameBlockRotate(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> AZURE_HARD_BARK_WOOD = registerBlock("azure_hard_bark_wood",
            () -> new FlameBlockRotate(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> STRIPPED_AZURE_HARD_BARK_LOG = registerBlock("stripped_azure_hard_bark_log",
            () -> new FlameBlockRotate(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> STRIPPED_AZURE_HARD_BARK_WOOD = registerBlock("stripped_azure_hard_bark_wood",
            () -> new FlameBlockRotate(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.LLW_BLOCKS);

    // Брандросовое дерево
    public static final RegistryObject<Block> BRANDRHOSS_LOG = registerBlock("brandrhoss_log",
            () -> new FlameBlockRotate(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> BRANDRHOSS_WOOD = registerBlock("brandrhoss_wood",
            () -> new FlameBlockRotate(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> STRIPPED_BRANDRHOSS_LOG = registerBlock("stripped_brandrhoss_log",
            () -> new FlameBlockRotate(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> STRIPPED_BRANDRHOSS_WOOD = registerBlock("stripped_brandrhoss_wood",
            () -> new FlameBlockRotate(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.LLW_BLOCKS);


    // Мирталиевое дерево
    public static final RegistryObject<Block> MIRTALIY_LOG = registerBlock("mirtaliy_log",
            () -> new FlameBlockRotate(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> MIRTALIY_WOOD = registerBlock("mirtaliy_wood",
            () -> new FlameBlockRotate(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> STRIPPED_MIRTALIY_LOG = registerBlock("stripped_mirtaliy_log",
            () -> new FlameBlockRotate(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> STRIPPED_MIRTALIY_WOOD = registerBlock("stripped_mirtaliy_wood",
            () -> new FlameBlockRotate(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.LLW_BLOCKS);

    // Тёмная берёза
    public static final RegistryObject<Block> DARK_BIRCH_LOG = registerBlock("dark_birch_log",
            () -> new FlameBlockRotate(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> DARK_BIRCH_WOOD = registerBlock("dark_birch_wood",
            () -> new FlameBlockRotate(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> STRIPPED_DARK_BIRCH_LOG = registerBlock("stripped_dark_birch_log",
            () -> new FlameBlockRotate(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> STRIPPED_DARK_BIRCH_WOOD = registerBlock("stripped_dark_birch_wood",
            () -> new FlameBlockRotate(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.LLW_BLOCKS);

    // Эленгар
    public static final RegistryObject<Block> ELENGAR_LOG = registerBlock("elengar_log",
            () -> new FlameBlockRotate(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> ELENGAR_WOOD = registerBlock("elengar_wood",
            () -> new FlameBlockRotate(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> STRIPPED_ELENGAR_LOG = registerBlock("stripped_elengar_log",
            () -> new FlameBlockRotate(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> STRIPPED_ELENGAR_WOOD = registerBlock("stripped_elengar_wood",
            () -> new FlameBlockRotate(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.LLW_BLOCKS);

    // Эленгар священный
    public static final RegistryObject<Block> SACRED_ELENGAR_LOG = registerBlock("sacred_elengar_log",
            () -> new FlameBlockRotate(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.STEM)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> SACRED_ELENGAR_LOG_UP = registerBlock("sacred_elengar_log_up",
            () -> new FlameBlockRotate(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.STEM)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> SACRED_ELENGAR_WOOD = registerBlock("sacred_elengar_wood",
            () -> new FlameBlockRotate(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.STEM)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> SACRED_ELENGAR_LOG_RUNE1 = registerBlock("sacred_elengar_log_rune1",
            () -> new FlameBlockRotate(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.STEM)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> SACRED_ELENGAR_LOG_RUNE2 = registerBlock("sacred_elengar_log_rune2",
            () -> new FlameBlockRotate(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.STEM)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> SACRED_ELENGAR_LOG_RUNE3 = registerBlock("sacred_elengar_log_rune3",
            () -> new FlameBlockRotate(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.STEM)), ModCreativeModeTab.LLW_BLOCKS);

    // Саженцы и листва
    // Азуровове дерево
    public static final RegistryObject<Block> AZURE_HARD_BARK_SAPLING = registerBlockWithoutBlockItem("azure_hard_bark_sapling",
            () -> new FlameSaplings(new AzureTree(), BlockBehaviour.Properties.of(Material.PLANT).noCollission()
                    .randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> AZURE_HARD_BARK_LEAVES = registerBlockWithoutBlockItem("azure_hard_bark_leaves",
            () -> new FlameLeaves(BlockBehaviour.Properties.of(Material.LEAVES)
                    .strength(0.2f).randomTicks().sound(SoundType.GRASS).noOcclusion()));

    // Брандросовое дерево
    public static final RegistryObject<Block> BRANDRHOSS_SAPLING = registerBlockWithoutBlockItem("brandrhoss_sapling",
            () -> new FlameSaplings(new BrandrhossTree(), BlockBehaviour.Properties.of(Material.PLANT).noCollission()
                    .randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> BRANDRHOSS_LEAVES = registerBlockWithoutBlockItem("brandrhoss_leaves",
            () -> new FlameLeaves(BlockBehaviour.Properties.of(Material.LEAVES)
                    .strength(0.2f).randomTicks().sound(SoundType.GRASS).noOcclusion()));

    // Мирталиевое дерево
    public static final RegistryObject<Block> MIRTALIY_SAPLING = registerBlockWithoutBlockItem("mirtaliy_sapling",
            () -> new FlameSaplings(new MirtaliyTree(), BlockBehaviour.Properties.of(Material.PLANT).noCollission()
                    .randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> MIRTALIY_LEAVES = registerBlockWithoutBlockItem("mirtaliy_leaves",
            () -> new FlameLeaves(BlockBehaviour.Properties.of(Material.LEAVES)
                    .strength(0.2f).randomTicks().sound(SoundType.GRASS).noOcclusion()));

    // Тёмная берёза
    public static final RegistryObject<Block> DARK_BIRCH_SAPLING = registerBlockWithoutBlockItem("dark_birch_sapling",
            () -> new FlameSaplings(new DarkBirchTree(), BlockBehaviour.Properties.of(Material.PLANT).noCollission()
                    .randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> DARK_BIRCH_LEAVES = registerBlockWithoutBlockItem("dark_birch_leaves",
            () -> new FlameLeaves(BlockBehaviour.Properties.of(Material.LEAVES)
                    .strength(0.2f).randomTicks().sound(SoundType.GRASS).noOcclusion()));

    // Эленгар
    public static final RegistryObject<Block> ELENGAR_SAPLING = registerBlockWithoutBlockItem("elengar_sapling",
            () -> new FlameSaplings(new ElengarTree(), BlockBehaviour.Properties.of(Material.PLANT).noCollission()
                    .randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> ELENGAR_LEAVES = registerBlockWithoutBlockItem("elengar_leaves",
            () -> new FlameLeaves(BlockBehaviour.Properties.of(Material.LEAVES)
                    .strength(0.2f).randomTicks().sound(SoundType.GRASS).noOcclusion()));

    // Эленгар священный
    public static final RegistryObject<Block> SACRED_ELENGAR_LEAVES = registerBlock("sacred_elengar_leaves",
            () -> new FlameLeaves(BlockBehaviour.Properties.of(Material.LEAVES)
                    .strength(0.2f).randomTicks().sound(SoundType.GRASS).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);


    // Доски и составляющие
    // Азуровое дерево
    public static final RegistryObject<Block> AZURE_HARD_BARK_PLANKS = registerBlock("azure_hard_bark_planks",
            () -> new FlameBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)), ModCreativeModeTab.LLW_BLOCKS);

    public static final RegistryObject<Block> AZURE_HARD_BARK_STAIRS = registerBlock("azure_hard_bark_stairs",
            () -> new FlameStairsBlock(() -> InitBlocks.AZURE_HARD_BARK_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD).strength(2).sound(SoundType.WOOD)),
            ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> AZURE_HARD_BARK_FENCE = registerBlockWithoutBlockItem("azure_hard_bark_fence",
            () -> new FlameFenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> AZURE_HARD_BARK_FENCE_GATE = registerBlockWithoutBlockItem("azure_hard_bark_fence_gate",
            () -> new FlameGateFenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> AZURE_HARD_BARK_SLAB = registerBlock("azure_hard_bark_slab",
            () -> new FlameSlabBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> AZURE_HARD_BARK_BUTTON = registerBlock("azure_hard_bark_button",
            () -> new FlameButton(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(2).sound(SoundType.WOOD)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> AZURE_HARD_BARK_PRESSURE_PLATE = registerBlockWithoutBlockItem("azure_hard_bark_pressure_plate",
            () -> new FlamePressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> AZURE_HARD_BARK_DOOR = registerBlock("azure_hard_bark_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> AZURE_HARD_BARK_TRAPDOOR = registerBlock("azure_hard_bark_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);

    // Брандросовое дерево
    public static final RegistryObject<Block> BRANDRHOSS_PLANKS = registerBlock("brandrhoss_planks",
            () -> new FlameBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> BRANDRHOSS_STAIRS = registerBlock("brandrhoss_stairs",
            () -> new FlameStairsBlock(() -> InitBlocks.BRANDRHOSS_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD).strength(2).sound(SoundType.WOOD)),
            ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> BRANDRHOSS_FENCE = registerBlockWithoutBlockItem("brandrhoss_fence",
            () -> new FlameFenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BRANDRHOSS_FENCE_GATE = registerBlockWithoutBlockItem("brandrhoss_fence_gate",
            () -> new FlameGateFenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BRANDRHOSS_SLAB = registerBlock("brandrhoss_slab",
            () -> new FlameSlabBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> BRANDRHOSS_BUTTON = registerBlock("brandrhoss_button",
            () -> new FlameButton(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(2).sound(SoundType.WOOD)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> BRANDRHOSS_PRESSURE_PLATE = registerBlockWithoutBlockItem("brandrhoss_pressure_plate",
            () -> new FlamePressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BRANDRHOSS_DOOR = registerBlock("brandrhoss_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> BRANDRHOSS_TRAPDOOR = registerBlock("brandrhoss_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);

    // Лиана
    public static final RegistryObject<Block> LIANA_BLOCK_LOG = registerBlock("liana_block_log",
            () -> new FlameBlockRotate(BlockBehaviour.Properties.of(Material.NETHER_WOOD)
                    .strength(2).sound(SoundType.MANGROVE_ROOTS)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> LIANA_BLOCK_WOOD = registerBlock("liana_block_wood",
            () -> new FlameBlockRotate(BlockBehaviour.Properties.of(Material.NETHER_WOOD)
                    .strength(2).sound(SoundType.MANGROVE_ROOTS)), ModCreativeModeTab.LLW_BLOCKS);

    // Мирталиевое дерево
    public static final RegistryObject<Block> MIRTALIY_PLANKS = registerBlock("mirtaliy_planks",
            () -> new FlameBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> MIRTALIY_STAIRS = registerBlock("mirtaliy_stairs",
            () -> new FlameStairsBlock(() -> InitBlocks.MIRTALIY_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD).strength(2).sound(SoundType.WOOD)),
            ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> MIRTALIY_FENCE = registerBlockWithoutBlockItem("mirtaliy_fence",
            () -> new FlameFenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MIRTALIY_FENCE_GATE = registerBlockWithoutBlockItem("mirtaliy_fence_gate",
            () -> new FlameGateFenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MIRTALIY_SLAB = registerBlock("mirtaliy_slab",
            () -> new FlameSlabBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> MIRTALIY_BUTTON = registerBlock("mirtaliy_button",
            () -> new FlameButton(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(2).sound(SoundType.WOOD)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> MIRTALIY_PRESSURE_PLATE = registerBlockWithoutBlockItem("mirtaliy_pressure_plate",
            () -> new FlamePressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MIRTALIY_DOOR = registerBlock("mirtaliy_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> MIRTALIY_TRAPDOOR = registerBlock("mirtaliy_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);

    // Тёмная берёза
    public static final RegistryObject<Block> DARK_BIRCH_PLANKS = registerBlock("dark_birch_planks",
            () -> new FlameBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> DARK_BIRCH_STAIRS = registerBlock("dark_birch_stairs",
            () -> new FlameStairsBlock(() -> InitBlocks.DARK_BIRCH_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD).strength(2).sound(SoundType.WOOD)),
            ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> DARK_BIRCH_FENCE = registerBlockWithoutBlockItem("dark_birch_fence",
            () -> new FlameFenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> DARK_BIRCH_FENCE_GATE = registerBlockWithoutBlockItem("dark_birch_fence_gate",
            () -> new FlameGateFenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> DARK_BIRCH_SLAB = registerBlock("dark_birch_slab",
            () -> new FlameSlabBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> DARK_BIRCH_BUTTON = registerBlock("dark_birch_button",
            () -> new FlameButton(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(2).sound(SoundType.WOOD)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> DARK_BIRCH_PRESSURE_PLATE = registerBlockWithoutBlockItem("dark_birch_pressure_plate",
            () -> new FlamePressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> DARK_BIRCH_DOOR = registerBlock("dark_birch_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> DARK_BIRCH_TRAPDOOR = registerBlock("dark_birch_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);

    // Эленгар
    public static final RegistryObject<Block> ELENGAR_PLANKS = registerBlock("elengar_planks",
            () -> new FlameBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> ELENGAR_STAIRS = registerBlock("elengar_stairs",
            () -> new FlameStairsBlock(() -> InitBlocks.ELENGAR_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD).strength(2).sound(SoundType.WOOD)),
            ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> ELENGAR_FENCE = registerBlockWithoutBlockItem("elengar_fence",
            () -> new FlameFenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ELENGAR_FENCE_GATE = registerBlockWithoutBlockItem("elengar_fence_gate",
            () -> new FlameGateFenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ELENGAR_SLAB = registerBlock("elengar_slab",
            () -> new FlameSlabBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> ELENGAR_BUTTON = registerBlock("elengar_button",
            () -> new FlameButton(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(2).sound(SoundType.WOOD)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> ELENGAR_PRESSURE_PLATE = registerBlockWithoutBlockItem("elengar_pressure_plate",
            () -> new FlamePressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ELENGAR_DOOR = registerBlock("elengar_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> ELENGAR_TRAPDOOR = registerBlock("elengar_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);

    // Эленгар пропитанный киноварью
    public static final RegistryObject<Block> SOAKED_IN_CINNABAR_ELENGAR_PLANKS = registerBlock("soaked_in_cinnabar_elengar_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> SOAKED_IN_CINNABAR_ELENGAR_STAIRS = registerBlock("soaked_in_cinnabar_elengar_stairs",
            () -> new StairBlock(() -> InitBlocks.SOAKED_IN_CINNABAR_ELENGAR_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD).strength(2).sound(SoundType.WOOD)),
            ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> SOAKED_IN_CINNABAR_ELENGAR_FENCE = registerBlockWithoutBlockItem("soaked_in_cinnabar_elengar_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SOAKED_IN_CINNABAR_ELENGAR_FENCE_GATE = registerBlockWithoutBlockItem("soaked_in_cinnabar_elengar_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SOAKED_IN_CINNABAR_ELENGAR_SLAB = registerBlock("soaked_in_cinnabar_elengar_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> SOAKED_IN_CINNABAR_ELENGAR_BUTTON = registerBlock("soaked_in_cinnabar_elengar_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(2).sound(SoundType.WOOD)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> SOAKED_IN_CINNABAR_ELENGAR_PRESSURE_PLATE = registerBlockWithoutBlockItem("soaked_in_cinnabar_elengar_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SOAKED_IN_CINNABAR_ELENGAR_DOOR = registerBlock("soaked_in_cinnabar_elengar_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> SOAKED_IN_CINNABAR_ELENGAR_TRAPDOOR = registerBlock("soaked_in_cinnabar_elengar_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);

    // Эленгар пропитанный медью
    public static final RegistryObject<Block> SOAKED_WITH_COPPER_SEDIMENT_ELENGAR_PLANKS = registerBlock("soaked_with_copper_sediment_elengar_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> SOAKED_WITH_COPPER_SEDIMENT_ELENGAR_STAIRS = registerBlock("soaked_with_copper_sediment_elengar_stairs",
            () -> new StairBlock(() -> InitBlocks.SOAKED_WITH_COPPER_SEDIMENT_ELENGAR_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD).strength(2).sound(SoundType.WOOD)),
            ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> SOAKED_WITH_COPPER_SEDIMENT_ELENGAR_FENCE = registerBlockWithoutBlockItem("soaked_with_copper_sediment_elengar_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SOAKED_WITH_COPPER_SEDIMENT_ELENGAR_FENCE_GATE = registerBlockWithoutBlockItem("soaked_with_copper_sediment_elengar_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SOAKED_WITH_COPPER_SEDIMENT_ELENGAR_SLAB = registerBlock("soaked_with_copper_sediment_elengar_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> SOAKED_WITH_COPPER_SEDIMENT_ELENGAR_BUTTON = registerBlock("soaked_with_copper_sediment_elengar_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(2).sound(SoundType.WOOD)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> SOAKED_WITH_COPPER_SEDIMENT_ELENGAR_PRESSURE_PLATE = registerBlockWithoutBlockItem("soaked_with_copper_sediment_elengar_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SOAKED_WITH_COPPER_SEDIMENT_ELENGAR_DOOR = registerBlock("soaked_with_copper_sediment_elengar_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> SOAKED_WITH_COPPER_SEDIMENT_ELENGAR_TRAPDOOR = registerBlock("soaked_with_copper_sediment_elengar_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);

    // Камень
    public static final RegistryObject<Block> MOSSY_STONE = registerBlock("mossy_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).sound(SoundType.STONE).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> CRACKED_STONE = registerBlock("cracked_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).sound(SoundType.STONE).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);

    // Магический камень
    public static final RegistryObject<Block> MAGIC_STONE = registerBlock("magic_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).sound(SoundType.STONE).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> MAGIC_STONE_SLAB = registerBlock("magic_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).sound(SoundType.STONE).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> MAGIC_STONE_STAIRS = registerBlock("magic_stone_stairs",
            () -> new StairBlock(() -> InitBlocks.MAGIC_STONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).sound(SoundType.STONE).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> MAGIC_STONE_BRICKS = registerBlock("magic_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).sound(SoundType.STONE).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);
    // Дроп???
    public static final RegistryObject<Block> CHISELED_MAGIC_STONE_BRICKS = registerBlock("chiseled_magic_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).sound(SoundType.STONE).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> MAGIC_STONE_BRICKS_SLAB = registerBlock("magic_stone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).sound(SoundType.STONE).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> MAGIC_STONE_BRICKS_STAIRS = registerBlock("magic_stone_bricks_stairs",
            () -> new StairBlock(() -> InitBlocks.MAGIC_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).sound(SoundType.STONE).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> MOSSY_MAGIC_STONE_BRICKS = registerBlock("mossy_magic_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).sound(SoundType.STONE).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> STAIRS_MOSSY_MAGIC_STONE_BRICKS = registerBlock("stairs_mossy_magic_stone_bricks",
            () -> new StairBlock(() -> InitBlocks.MOSSY_MAGIC_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).sound(SoundType.STONE).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> SLAB_MOSSY_MAGIC_STONE_BRICKS = registerBlock("slab_mossy_magic_stone_bricks",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).sound(SoundType.STONE).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> CRACKED_MAGIC_STONE_BRICKS = registerBlock("cracked_magic_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).sound(SoundType.STONE).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> STAIRS_CRACKED_MAGIC_STONE_BRICKS = registerBlock("stairs_cracked_magic_stone_bricks",
            () -> new StairBlock(() -> InitBlocks.CRACKED_MAGIC_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).sound(SoundType.STONE).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> SLAB_CRACKED_MAGIC_STONE_BRICKS = registerBlock("slab_cracked_magic_stone_bricks",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).sound(SoundType.STONE).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);

    // Магическое стекло
    public static final RegistryObject<Block> MAGIC_GLASS = registerBlock("magic_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> MAGIC_GLASS_PANE = registerBlock("magic_glass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS_PANE)), ModCreativeModeTab.LLW_BLOCKS);

    // Рунный камень
    public static final RegistryObject<Block> RUNETG_1 = registerBlock("runetg_1",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).sound(SoundType.STONE).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> RUNETG_2 = registerBlock("runetg_2",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).sound(SoundType.STONE).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> RUNETG_3 = registerBlock("runetg_3",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).sound(SoundType.STONE).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> RUNETG_4 = registerBlock("runetg_4",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).sound(SoundType.STONE).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);

    // Мегалит
    public static final RegistryObject<Block> MOUNTAIN_MEGALIT = registerBlock("mountain_megalit",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).sound(SoundType.BASALT).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> MEGALIT_TALE = registerBlock("megalit_tale",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).sound(SoundType.BASALT).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> MEGALIT_BRICKS = registerBlock("megalit_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).sound(SoundType.BASALT).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);

    // Минералы
    // Родонит
    public static final RegistryObject<Block> RODONITE = registerBlock("rodonite",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).sound(SoundType.BONE_BLOCK).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);
    // Малахит
    public static final RegistryObject<Block> MALACHITE = registerBlock("malachite",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).sound(SoundType.BONE_BLOCK).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);

    // Лунная слеза
    public static final RegistryObject<Block> MOON_TEAR_OBSIDIAN_ORE = registerBlock("moon_tear_obsidian_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).sound(SoundType.BONE_BLOCK).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);
    public static final RegistryObject<Block> MOON_TEAR_BLOCK = registerBlock("moon_tear_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).sound(SoundType.BONE_BLOCK).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);

    // Цветы
    public static final RegistryObject<Block> SUNFLOWER = registerBlockWithoutBlockItem("sunflower",
            () -> new FlowerBlock(MobEffects.REGENERATION, 12,BlockBehaviour.Properties.of(Material.GRASS)
                    .noCollission().sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> BLACK_TOADSTOOL = registerBlockWithoutBlockItem("black_toadstool",
            () -> new FlowerBlock(MobEffects.POISON, 24,BlockBehaviour.Properties.of(Material.GRASS)
                    .noCollission().sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> SILVER_SAGE = registerBlockWithoutBlockItem("silver_sage",
            () -> new FlowerBlock(MobEffects.DIG_SPEED, 12,BlockBehaviour.Properties.of(Material.GRASS)
                    .noCollission().sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> ICY_YAWN = registerBlockWithoutBlockItem("icy_yawn",
            () -> new FlowerBlock(MobEffects.DIG_SLOWDOWN, 12,BlockBehaviour.Properties.of(Material.GRASS)
                    .noCollission().sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> SLEEPY_LEAF = registerBlockWithoutBlockItem("sleepy_leaf",
            () -> new FlowerBlock(MobEffects.SATURATION, 12,BlockBehaviour.Properties.of(Material.GRASS)
                    .noCollission().sound(SoundType.GRASS).noOcclusion()));

    // Руды
    public static final RegistryObject<Block> CINNABAR_ORE = registerBlock("cinnabar_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.6f).sound(SoundType.METAL).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);

    // Магические вещи
    // Фонарь
    public static final RegistryObject<Block> MAGIC_LANTERN = registerBlock("magic_lantern",
            () -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL).strength(3.5F).sound(SoundType.LANTERN).lightLevel((p_187433_) -> {
                return 15;
            }).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);

    // Тигель
    public static final RegistryObject<Block> CRUCIBLE = registerBlock("crucible",
            () -> new Crucible(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3).sound(SoundType.STONE).noOcclusion()), ModCreativeModeTab.LLW_BLOCKS);



    //Ниже идёт код регистрации не трогать!!!
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }


    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return InitItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
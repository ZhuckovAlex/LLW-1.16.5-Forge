package net.sanberdir_rezolv.llw.init;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sanberdir_rezolv.llw.LLW;
import net.sanberdir_rezolv.llw.init.customitems.BurnFences;
import net.sanberdir_rezolv.llw.init.customitems.BurnLeaves;
import net.sanberdir_rezolv.llw.init.customitems.BurnPressurePlates;
import net.sanberdir_rezolv.llw.init.customitems.BurnSapling;

public class InitItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LLW.MODID);

    // Добавление блока\предмета

    // Калитки
    // Азуровое дерево
    public static final RegistryObject<Item> AZURE_HARD_BARK_FENCE = ITEMS.register("azure_hard_bark_fence",
            () -> new BurnFences(InitBlocks.AZURE_HARD_BARK_FENCE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));
    public static final RegistryObject<Item> AZURE_HARD_BARK_FENCE_GATE = ITEMS.register("azure_hard_bark_fence_gate",
            () -> new BurnFences(InitBlocks.AZURE_HARD_BARK_FENCE_GATE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));

    // Брандросс
    public static final RegistryObject<Item> BRANDRHOSS_FENCE = ITEMS.register("brandrhoss_fence",
            () -> new BurnFences(InitBlocks.BRANDRHOSS_FENCE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));
    public static final RegistryObject<Item> BRANDRHOSS_FENCE_GATE = ITEMS.register("brandrhoss_fence_gate",
            () -> new BurnFences(InitBlocks.BRANDRHOSS_FENCE_GATE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));

    // Мирталий
    public static final RegistryObject<Item> MIRTALIY_FENCE = ITEMS.register("mirtaliy_fence",
            () -> new BurnFences(InitBlocks.MIRTALIY_FENCE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));
    public static final RegistryObject<Item> MIRTALIY_FENCE_GATE = ITEMS.register("mirtaliy_fence_gate",
            () -> new BurnFences(InitBlocks.MIRTALIY_FENCE_GATE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));

    // Тёмная берёза
    public static final RegistryObject<Item> DARK_BIRCH_FENCE = ITEMS.register("dark_birch_fence",
            () -> new BurnFences(InitBlocks.DARK_BIRCH_FENCE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));
    public static final RegistryObject<Item> DARK_BIRCH_FENCE_GATE = ITEMS.register("dark_birch_fence_gate",
            () -> new BurnFences(InitBlocks.DARK_BIRCH_FENCE_GATE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));

    // Эленгар
    public static final RegistryObject<Item> ELENGAR_FENCE = ITEMS.register("elengar_fence",
            () -> new BurnFences(InitBlocks.ELENGAR_FENCE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));
    public static final RegistryObject<Item> ELENGAR_FENCE_GATE = ITEMS.register("elengar_fence_gate",
            () -> new BurnFences(InitBlocks.ELENGAR_FENCE_GATE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));

    // Эленгар пропитанный киноварью
    public static final RegistryObject<Item> SOAKED_IN_CINNABAR_ELENGAR_FENCE = ITEMS.register("soaked_in_cinnabar_elengar_fence",
            () -> new BurnFences(InitBlocks.SOAKED_IN_CINNABAR_ELENGAR_FENCE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));
    public static final RegistryObject<Item> SOAKED_IN_CINNABAR_ELENGAR_FENCE_GATE = ITEMS.register("soaked_in_cinnabar_elengar_fence_gate",
            () -> new BurnFences(InitBlocks.SOAKED_IN_CINNABAR_ELENGAR_FENCE_GATE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));

    // Эленгар пропитанный медью
    public static final RegistryObject<Item> SOAKED_WITH_COPPER_SEDIMENT_ELENGAR_FENCE = ITEMS.register("soaked_with_copper_sediment_elengar_fence",
            () -> new BurnFences(InitBlocks.SOAKED_WITH_COPPER_SEDIMENT_ELENGAR_FENCE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));
    public static final RegistryObject<Item> SOAKED_WITH_COPPER_SEDIMENT_ELENGAR_FENCE_GATE = ITEMS.register("soaked_with_copper_sediment_elengar_fence_gate",
            () -> new BurnFences(InitBlocks.SOAKED_WITH_COPPER_SEDIMENT_ELENGAR_FENCE_GATE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));

    // Нажимные плиты
    // Эленгар
    public static final RegistryObject<Item> ELENGAR_PRESSURE_PLATE = ITEMS.register("elengar_pressure_plate",
            () -> new BurnPressurePlates(InitBlocks.ELENGAR_PRESSURE_PLATE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));

    // Эленгар пропитанный киноварью
    public static final RegistryObject<Item> SOAKED_IN_CINNABAR_ELENGAR_PRESSURE_PLATE = ITEMS.register("soaked_in_cinnabar_elengar_pressure_plate",
            () -> new BurnPressurePlates(InitBlocks.SOAKED_IN_CINNABAR_ELENGAR_PRESSURE_PLATE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));

    // Эленгар пропитанный медью
    public static final RegistryObject<Item> SOAKED_WITH_COPPER_SEDIMENT_ELENGAR_PRESSURE_PLATE = ITEMS.register("soaked_with_copper_sediment_elengar_pressure_plate",
            () -> new BurnPressurePlates(InitBlocks.SOAKED_WITH_COPPER_SEDIMENT_ELENGAR_PRESSURE_PLATE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));

    // Брандросс
    public static final RegistryObject<Item> BRANDRHOSS_PRESSURE_PLATE = ITEMS.register("brandrhoss_pressure_plate",
            () -> new BurnPressurePlates(InitBlocks.BRANDRHOSS_PRESSURE_PLATE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));

    // Азуровый
    public static final RegistryObject<Item> AZURE_HARD_BARK_PRESSURE_PLATE = ITEMS.register("azure_hard_bark_pressure_plate",
            () -> new BurnPressurePlates(InitBlocks.AZURE_HARD_BARK_PRESSURE_PLATE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));

    // Азуровый
    public static final RegistryObject<Item> DARK_BIRCH_PRESSURE_PLATE = ITEMS.register("dark_birch_pressure_plate",
            () -> new BurnPressurePlates(InitBlocks.DARK_BIRCH_PRESSURE_PLATE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));

    // Мирталий
    public static final RegistryObject<Item> MIRTALIY_PRESSURE_PLATE = ITEMS.register("mirtaliy_pressure_plate",
            () -> new BurnPressurePlates(InitBlocks.MIRTALIY_PRESSURE_PLATE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));

    // Деревья
    // Азуровое дерево
    public static final RegistryObject<Item> AZURE_HARD_BARK_SAPLING = ITEMS.register("azure_hard_bark_sapling",
            () -> new BurnSapling(InitBlocks.AZURE_HARD_BARK_SAPLING.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));
    public static final RegistryObject<Item> AZURE_HARD_BARK_LEAVES = ITEMS.register("azure_hard_bark_leaves",
            () -> new BurnLeaves(InitBlocks.AZURE_HARD_BARK_LEAVES.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));

    // Брандроссовое дерево
    public static final RegistryObject<Item> BRANDRHOSS_SAPLING = ITEMS.register("brandrhoss_sapling",
            () -> new BurnSapling(InitBlocks.BRANDRHOSS_SAPLING.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));
    public static final RegistryObject<Item> BRANDRHOSS_LEAVES = ITEMS.register("brandrhoss_leaves",
            () -> new BurnLeaves(InitBlocks.BRANDRHOSS_LEAVES.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));

    // Мирталиевое дерево
    public static final RegistryObject<Item> MIRTALIY_SAPLING = ITEMS.register("mirtaliy_sapling",
            () -> new BurnSapling(InitBlocks.MIRTALIY_SAPLING.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));
    public static final RegistryObject<Item> MIRTALIY_LEAVES = ITEMS.register("mirtaliy_leaves",
            () -> new BurnLeaves(InitBlocks.MIRTALIY_LEAVES.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));

    // Тёмная берёза
    public static final RegistryObject<Item> DARK_BIRCH_SAPLING = ITEMS.register("dark_birch_sapling",
            () -> new BurnSapling(InitBlocks.DARK_BIRCH_SAPLING.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));
    public static final RegistryObject<Item> DARK_BIRCH_LEAVES = ITEMS.register("dark_birch_leaves",
            () -> new BurnLeaves(InitBlocks.DARK_BIRCH_LEAVES.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));

    // Эленгар
    public static final RegistryObject<Item> ELENGAR_SAPLING = ITEMS.register("elengar_sapling",
            () -> new BurnSapling(InitBlocks.ELENGAR_SAPLING.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));
    public static final RegistryObject<Item> ELENGAR_LEAVES = ITEMS.register("elengar_leaves",
            () -> new BurnLeaves(InitBlocks.ELENGAR_LEAVES.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));

    // Семена
    public static final RegistryObject<Item> PURE_FRUIT_SEEDS = ITEMS.register("pure_fruit_seeds",
            () -> new ItemNameBlockItem(InitBlocks.PURE_FRUIT_SEEDS.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS))));

    // Добавление предмета
    // Еда
    public static final RegistryObject<Item> PURE_FRUIT = ITEMS.register("pure_fruit",
            () -> new Item (new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(6).build())
                    .tab(ModCreativeModeTab.LLW_ITEMS)));

    // Простые предметы
    public static final RegistryObject<Item> VERMILION = ITEMS.register("vermilion",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> COPPER_PRECIPITATE = ITEMS.register("copper_precipitate",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> PITCH_ELENGAR = ITEMS.register("pitch_elengar",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> ELENGAR_BARK = ITEMS.register("elengar_bark",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> PRIMORDIAL_FIRE = ITEMS.register("primordial_fire",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> MOON_TEAR = ITEMS.register("moon_tear",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> MOON_TEAR_POWDER = ITEMS.register("moon_tear_powder",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> SHARD_CHITIN_REAPER = ITEMS.register("shard_chitin_reaper",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> ELVEN_DUST = ITEMS.register("elven_dust",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> CHALK = ITEMS.register("chalk",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS).stacksTo(1).defaultDurability(120)));
    public static final RegistryObject<Item> BLUE_CHALK = ITEMS.register("blue_chalk",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS).stacksTo(1).defaultDurability(120)));
    public static final RegistryObject<Item> INKWELL = ITEMS.register("inkwell",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS).stacksTo(1).defaultDurability(120)));
    public static final RegistryObject<Item> GOLDEN_CAP = ITEMS.register("golden_cap",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> IRON_CAP = ITEMS.register("iron_cap",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> MOON_TEAR_CAP = ITEMS.register("moon_tear_cap",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> PESTLE = ITEMS.register("pestle",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> MORTAR_AND_PESTLE = ITEMS.register("mortar_and_pestle",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> FOCUSING_LENS = ITEMS.register("focusing_lens",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> SCROLL = ITEMS.register("scroll",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> GOLDEN_LEAF = ITEMS.register("golden_leaf",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> ACORN = ITEMS.register("acorn",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> STAR_MOSS = ITEMS.register("star_moss",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> MAGIC_CLOTH = ITEMS.register("magic_cloth",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> STONE_OF_TRANSFORMATION = ITEMS.register("stone_of_transformation",
            () -> new Item(new Item.Properties().defaultDurability(80).tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> ALCHEMICAL_SILVER = ITEMS.register("alchemical_silver",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> LIQUID_SILVER = ITEMS.register("liquid_silver",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> CRYSTAL_SHARD = ITEMS.register("crystal_shard",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> WING_OF_THE_MOON_MOTH = ITEMS.register("wing_of_the_moon_moth",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> MIRACULUM_FLAMAS = ITEMS.register("miraculum_flammas",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> CINNABAR = ITEMS.register("cinnabar",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> MERCURY = ITEMS.register("mercury",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> OLERESIN_OF_THE_MOTHER_OF_THE_FOREST = ITEMS.register("oleoresin_of_the_mother_of_the_forest",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> THE_BRANCH_OF_THE_MOTHER_OF_THE_FOREST = ITEMS.register("the_branch_of_the_mother_of_the_forest",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> CRYSTAL_HEART_OF_THE_GUARDIAN_GOLEM = ITEMS.register("crystal_heart_of_the_guardian_golem",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    

    //Алхимия
    public static final RegistryObject<Item> CRYSTAL_PHIAL = ITEMS.register("crystal_phial",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.LLW_ALCHEMY)));
    public static final RegistryObject<Item> SULFUR = ITEMS.register("sulfur",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ALCHEMY)));
    public static final RegistryObject<Item> PHOSPHORUS = ITEMS.register("phosphorus",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ALCHEMY)));
    public static final RegistryObject<Item> NIGREDO = ITEMS.register("nigredo",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ALCHEMY)));
    public static final RegistryObject<Item> ANCIENT_POT = ITEMS.register("ancient_pot",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ALCHEMY)));
    public static final RegistryObject<Item> FIRE_POT = ITEMS.register("fire_pot",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ALCHEMY)));
    public static final RegistryObject<Item> POT_OF_POISON = ITEMS.register("pot_of_poison",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ALCHEMY)));

    // Цветы
    public static final RegistryObject<Item> SUNFLOWER = ITEMS.register("sunflower",
            () -> new BlockItem(InitBlocks.SUNFLOWER.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));
    public static final RegistryObject<Item> BLACK_TOADSTOOL = ITEMS.register("black_toadstool",
            () -> new BlockItem(InitBlocks.BLACK_TOADSTOOL.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));
    public static final RegistryObject<Item> SILVER_SAGE = ITEMS.register("silver_sage",
            () -> new BlockItem(InitBlocks.SILVER_SAGE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));
    public static final RegistryObject<Item> ICY_YAWN = ITEMS.register("icy_yawn",
            () -> new BlockItem(InitBlocks.ICY_YAWN.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));
    public static final RegistryObject<Item> SLEEPY_LEAF = ITEMS.register("sleepy_leaf",
            () -> new BlockItem(InitBlocks.SLEEPY_LEAF.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

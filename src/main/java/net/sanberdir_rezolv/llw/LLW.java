package net.sanberdir_rezolv.llw;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sanberdir_rezolv.llw.init.InitBlocks;
import net.sanberdir_rezolv.llw.init.InitItems;
import net.sanberdir_rezolv.llw.world.gen.ModConfiguredFeatures;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(LLW.MODID)
public class LLW
{
    // ID Мода (Не трогать!)
    public static final String MODID = "llw";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold Blocks which will all be registered under the "examplemod" namespace
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    // Create a Deferred Register to hold Items which will all be registered under the "examplemod" namespace
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    // Образец создания блока в главном классе
    // public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)));
    // Образец создания предмета в главном классе
   //  public static final RegistryObject<Item> EXAMPLE_BLOCK_ITEM = ITEMS.register("example_block", () -> new BlockItem(EXAMPLE_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public LLW()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        // Регистрация блоков (Не трогать!)
        BLOCKS.register(modEventBus);
        InitBlocks.register(modEventBus);
        // Регистрация предметов (Не трогать!)
        ITEMS.register(modEventBus);
        InitItems.register(modEventBus);

        // Регистрация объектов (Не трогать!)
        ModConfiguredFeatures.register(modEventBus);



        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Добавление прозрачного слоя
        // Саженцы
        ItemBlockRenderTypes.setRenderLayer(InitBlocks.PURE_FRUIT_SEEDS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(InitBlocks.DARK_BIRCH_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(InitBlocks.AZURE_HARD_BARK_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(InitBlocks.BRANDRHOSS_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(InitBlocks.MIRTALIY_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(InitBlocks.ELENGAR_SAPLING.get(), RenderType.cutout());
        // Двери
        ItemBlockRenderTypes.setRenderLayer(InitBlocks.DARK_BIRCH_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(InitBlocks.AZURE_HARD_BARK_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(InitBlocks.BRANDRHOSS_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(InitBlocks.MIRTALIY_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(InitBlocks.ELENGAR_DOOR.get(), RenderType.cutout());
        // Люки
        ItemBlockRenderTypes.setRenderLayer(InitBlocks.DARK_BIRCH_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(InitBlocks.AZURE_HARD_BARK_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(InitBlocks.BRANDRHOSS_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(InitBlocks.MIRTALIY_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(InitBlocks.ELENGAR_TRAPDOOR.get(), RenderType.cutout());
        // Стекло
        ItemBlockRenderTypes.setRenderLayer(InitBlocks.ELF_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(InitBlocks.ELF_GLASS_PANE.get(), RenderType.translucent());
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Добавление компоста
            event.enqueueWork(() -> {
                ComposterBlock.COMPOSTABLES.put(InitItems.PURE_FRUIT_SEEDS.get(), 0.2f);
            });

            event.enqueueWork(() -> {
                ComposterBlock.COMPOSTABLES.put(InitItems.PURE_FRUIT.get(), 0.2f);
            });

            event.enqueueWork(() -> {
                ComposterBlock.COMPOSTABLES.put(InitItems.AZURE_HARD_BARK_LEAVES.get(), 0.2f);
            });

            event.enqueueWork(() -> {
                ComposterBlock.COMPOSTABLES.put(InitItems.AZURE_HARD_BARK_SAPLING.get(), 0.2f);
            });

            event.enqueueWork(() -> {
                ComposterBlock.COMPOSTABLES.put(InitItems.BRANDRHOSS_LEAVES.get(), 0.2f);
            });

            event.enqueueWork(() -> {
                ComposterBlock.COMPOSTABLES.put(InitItems.BRANDRHOSS_SAPLING.get(), 0.2f);
            });

            event.enqueueWork(() -> {
                ComposterBlock.COMPOSTABLES.put(InitItems.MIRTALIY_LEAVES.get(), 0.2f);
            });

            event.enqueueWork(() -> {
                ComposterBlock.COMPOSTABLES.put(InitItems.MIRTALIY_SAPLING.get(), 0.2f);
            });

            event.enqueueWork(() -> {
                ComposterBlock.COMPOSTABLES.put(InitItems.ELENGAR_LEAVES.get(), 0.2f);
            });

            event.enqueueWork(() -> {
                ComposterBlock.COMPOSTABLES.put(InitItems.ELENGAR_SAPLING.get(), 0.2f);
            });

            event.enqueueWork(() -> {
                ComposterBlock.COMPOSTABLES.put(InitItems.DARK_BIRCH_LEAVES.get(), 0.2f);
            });

            event.enqueueWork(() -> {
                ComposterBlock.COMPOSTABLES.put(InitItems.DARK_BIRCH_SAPLING.get(), 0.2f);
            });
        }
    }
}

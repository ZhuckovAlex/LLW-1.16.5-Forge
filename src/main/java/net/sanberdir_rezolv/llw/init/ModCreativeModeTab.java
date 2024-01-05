package net.sanberdir_rezolv.llw.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {


    // Добавление таба

    public static final CreativeModeTab LLW_ITEMS = new CreativeModeTab("llw_items") {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(InitItems.COPPER_PRECIPITATE.get());
            }
        };

    public static final CreativeModeTab LLW_BLOCKS= new CreativeModeTab("llw_blocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(InitBlocks.DARK_BIRCH_LOG.get());
        }
    };

    public static final CreativeModeTab LLW_ALCHEMY = new CreativeModeTab("llw_alchemy") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(InitItems.NIGREDO.get());
        }
    };

}
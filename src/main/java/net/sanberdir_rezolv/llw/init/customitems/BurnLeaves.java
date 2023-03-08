package net.sanberdir_rezolv.llw.init.customitems;

import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

public class BurnLeaves extends ItemNameBlockItem {


    public BurnLeaves(Block p_41579_, Properties p_41580_) {
        super(p_41579_, p_41580_);
    }
    // Время горения листвы
    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return 100;
    }
}

package net.sanberdir_rezolv.llw.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.sanberdir_rezolv.llw.init.InitBlocks;
import net.sanberdir_rezolv.llw.init.InitItems;

import javax.annotation.Nullable;


@Mod.EventBusSubscriber
public class SetupBlueChalk {
    @SubscribeEvent
    public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
        if (event.getHand() != event.getEntity().getUsedItemHand())
            return;
        execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        execute(null, world, x, y, z, entity);
    }

    private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null)
            return;
        if (InitItems.BLUE_CHALK.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
                && !(InitBlocks.CHALK_BLOCK.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock())
                && !(InitBlocks.BLUE_CHALK_BLOCK.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock())
                && !(InitBlocks.RED_CHALK_BLOCK.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock())
                && !(InitBlocks.GOLDEN_CHALK_BLOCK.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock())
                && world.isEmptyBlock(new BlockPos(x, y + 1, z))) {
            {
                ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                if (_ist.hurt(1, RandomSource.create(), null)) {
                    _ist.shrink(1);
                    _ist.setDamageValue(0);
                }
            }
            world.setBlock(new BlockPos(x, y + 1, z), InitBlocks.BLUE_CHALK_BLOCK.get().defaultBlockState(), 3);
            if (world instanceof Level _level) {
                if (!_level.isClientSide()) {
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.BLOCKS, 1, 1);
                }
            }
        }
    }
}


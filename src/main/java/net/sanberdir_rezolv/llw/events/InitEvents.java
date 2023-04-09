package net.sanberdir_rezolv.llw.events;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.sanberdir_rezolv.llw.LLW;
import net.sanberdir_rezolv.llw.entity.ModEntityTypes;
import net.sanberdir_rezolv.llw.entity.custom.MoonMoth;

public class InitEvents {
    @Mod.EventBusSubscriber(modid = LLW.MODID)
    public static class ForgeEvents {


        @Mod.EventBusSubscriber(modid = LLW.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
        public static class ModEventBusEvents {
            @SubscribeEvent
            public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
                event.put(ModEntityTypes.MOON_MONTH.get(), MoonMoth.setAttributes().build());
            }
        }
    }
}

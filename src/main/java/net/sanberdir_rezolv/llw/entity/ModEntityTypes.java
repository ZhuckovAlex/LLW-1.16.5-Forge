package net.sanberdir_rezolv.llw.entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sanberdir_rezolv.llw.LLW;
import net.sanberdir_rezolv.llw.entity.custom.MoonMoth;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, LLW.MODID);

    public static final RegistryObject<EntityType<MoonMoth>> MOON_MONTH =
            ENTITY_TYPES.register("moon_month",
                    () -> EntityType.Builder.of(MoonMoth::new, MobCategory.MONSTER)
                            .sized(0.4f, 0.4f)
                            .build(new ResourceLocation(LLW.MODID, "moon_month").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}

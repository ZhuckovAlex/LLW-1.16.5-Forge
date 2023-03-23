package net.sanberdir_rezolv.llw.init.sound;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sanberdir_rezolv.llw.LLW;

public class InitSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, LLW.MODID);

    public static final RegistryObject<SoundEvent> DOWSING_ROD_FOUND_ORE =
            registerSoundEvent("dowsing_rod_found_ore");

    public static RegistryObject<SoundEvent> PRIMORDIAL_FIRE_BREAK = registerSoundEvent("primordial_fire_break");
    public static RegistryObject<SoundEvent> PRIMORDIAL_FIRE_STEP = registerSoundEvent("primordial_fire_step");
    public static RegistryObject<SoundEvent> PRIMORDIAL_FIRE_PLACE = registerSoundEvent("primordial_fire_place");
    public static RegistryObject<SoundEvent> PRIMORDIAL_FIRE_HIT = registerSoundEvent("primordial_fire_hit");
    public static RegistryObject<SoundEvent> PRIMORDIAL_FIRE_FALL = registerSoundEvent("primordial_fire_fall");


    public static final ForgeSoundType PRIMORDIAL_FIRE_SOUNDS = new ForgeSoundType(0.3f, 1f,
            InitSounds.PRIMORDIAL_FIRE_BREAK, InitSounds.PRIMORDIAL_FIRE_STEP, InitSounds.PRIMORDIAL_FIRE_PLACE,
            InitSounds.PRIMORDIAL_FIRE_HIT, InitSounds.PRIMORDIAL_FIRE_FALL);


    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(LLW.MODID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}

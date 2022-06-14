package com.dreambx.earraylate.util.handlers;

import com.dreambx.earraylate.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler {
    public static SoundEvent BLOOD_AND_GUTS,FAILBOAT103_EXCALIBUUUR,THEKYLEB_7BY8,THEKYLEB_BARD,GOOD_BATTLE_04,TS1,TS2;

    //注册声音事件
    public static void registerSounds() {
        SoundEvent BLOOD_AND_GUTS = registerSound("songs.blood_and_guts");
        SoundEvent FAILBOAT103_EXCALIBUUUR = registerSound("songs.failboat103 - excalibuuur");
        SoundEvent THEKYLEB_7BY8 = registerSound("songs.thekyleb - 7 by 8");
        SoundEvent THEKYLEB_BARD = registerSound("songs.thekyleb - bard");
        SoundEvent GOOD_BATTLE_04 = registerSound("songs.good_battle_04");
        SoundEvent TS1 = registerSound("songs.ts1");
        SoundEvent TS2 = registerSound("songs.ts2");
    }

    private static SoundEvent registerSound(String name) {
        ResourceLocation location = new ResourceLocation(Reference.MODID, name);
        SoundEvent event = new SoundEvent(location);
        event.setRegistryName(name);
        ForgeRegistries.SOUND_EVENTS.register(event);
        return event;
    }
}

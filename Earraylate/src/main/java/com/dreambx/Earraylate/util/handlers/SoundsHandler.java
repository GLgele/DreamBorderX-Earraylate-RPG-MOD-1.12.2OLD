package com.dreambx.earraylate.util.handlers;

import com.dreambx.earraylate.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import org.apache.commons.codec.language.Soundex;

public class SoundsHandler {
    public static SoundEvent BLOOD_AND_GUTS,FAILBOAT103_EXCALIBUUUR,THEKYLEB_7BY8,THEKYLEB_BARD,GOOD_BATTLE_04,TS1,TS2,man,manattack,woman,womanattack,womandead;

    //注册声音事件
    public static void registerSounds() {
        // songs
        SoundEvent BLOOD_AND_GUTS = registerSound("songs.blood_and_guts");
        SoundEvent FAILBOAT103_EXCALIBUUUR = registerSound("songs.failboat103_-_excalibuuur");
        SoundEvent THEKYLEB_7BY8 = registerSound("songs.thekyleb_-_7_by_8");
        SoundEvent THEKYLEB_BARD = registerSound("songs.thekyleb_-_bard");
        SoundEvent GOOD_BATTLE_04 = registerSound("songs.good_battle_04");
        SoundEvent TS1 = registerSound("songs.ts1");
        SoundEvent TS2 = registerSound("songs.ts2");
        // sounds
        SoundEvent man = registerSound("human.man");
        SoundEvent manattack = registerSound("human.manattack");
        SoundEvent woman = registerSound("human.woman");
        SoundEvent womanattact = registerSound("human.womanattack");
        SoundEvent womandead = registerSound("human.womandead");
    }

    private static SoundEvent registerSound(String name) {
        ResourceLocation location = new ResourceLocation(Reference.MODID, name);
        SoundEvent event = new SoundEvent(location);
        event.setRegistryName(name);
        ForgeRegistries.SOUND_EVENTS.register(event);
        return event;
    }
}

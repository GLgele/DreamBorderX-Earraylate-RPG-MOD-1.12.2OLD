package com.dreambx.Earraylate;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import net.minecraft.util.SoundEvent;

// Mod主类的标记。其中只有modid是必填项。
//
// modid 不允许使用大写字母，最大长度 64，不能为空。
// 推荐在 modid 中只使用小写字母、数字、连字符和下划线，换言之即只使用满足正则表达式
// [a-z0-9\-_]{1,64} 的 modid。
// 发现不符合要求的 modid 时，会抛出 IllegalArgumentException 阻止游戏启动。
//
// name 没有限制。若不填则直接使用 modid 充当 name，但仍然会产生警告。
// 一般来说，name 都满足正则表达式 [\w ]+。但也有少许例外。
//
// version 没有限制，若不填则使用 1.0，并产生警告。
// 对于 version 来说，***强烈***推荐只用数字和点，比如只有 MAJOR.MINOR.PATCH 的 SemVer。
//
// useMetadata = true 让 Forge 以 mcmod.info 里的信息为准。它的格式在“Mod 的元数据”一节
// 会有详细说明。
@Mod(modid = "earraylate", name = "Earraylate", version = "1.0.0", useMetadata = true)
public enum Earraylate {
    INSTANCE;

    // Mod 主类实例的“工厂”。
    // 别的 Mod 开发教程肯定使用的是@Mod.Instance
    // 这里之所以这么写，是因为主类是 enum，换言之父类是 java.lang.Enum
    // 因此，FML 直接 Class.newInstance() 的话一定会报错，java.lang.Enum 没有零参构造器
    @Mod.InstanceFactory
    public static Earraylate getInstance() {
        return INSTANCE;
    }

    // 一个入口方法。
    // Mod的加载大致分为 6 个阶段，每个阶段均有一个事件代表，
    // 而 @Mod.EventHandler 注解则标记该方法将订阅此事件。
    // Mod 加载时的六个阶段对应的事件，以时间顺序排列：
    //    FMLConstructionEvent
    //    FMLPreInitializationEvent
    //    FMLInitializationEvent
    //    FMLInterModComms.IMCEvent
    //    FMLPostInitializationEvent
    //    FMLLoadCompleteEvent
    // 其中，PreInit.、Init.、IMCEvent 和 PostInit. 是最常用的四个事件，
    // 剩下两个事件只有在相当少见的情况下才会用到，大可暂时无视。

    /*@Mod.EventBusSubscriber(modid = "earraylate")
    public final class ItemInitializer {

        // 我们一会会用到它。
        public static Item black_bread;

        // 和正常的事件一样，你不需要手动调用此方法！Forge 会自动调用它的。
        @SubscribeEvent
        public static void registerItem(RegistryEvent.Register<Item> event) {

            public static Item black_bread;

            // 注意 setRegistryName 调用。
            // 每一个物品都对应唯一一个注册名，用于和其他物品区分开来。这个注册名不能含有大写字母。
            // 此方法返回被注册的 Item 对象。
            event.getRegistry().registerAll(
                    black_bread = new Item()
                            .setCreativeTab(EARRAYLATE_CREATIVE_TAB)
                            // 注意此名字和 registry name 不是一个概念。
                            // 这个名字仅用于国际化支持。
                            // 这个方法也返回 Item。
                            .setTranslationKey("item.black_bread.name")
                            .setRegistryName("earraylate:black_bread")
            );
        }
    }
    // 我们需要一个 CreativeTabs 的实例，当然那个类下面就有原版的 10 个，可以直接拿来用，
    // 但是你不觉得有一个自己的更方便吗……
    // 一般是使用匿名内部类，就像这样。
    public static final CreativeTabs EARRAYLATE_CREATIVE_TAB = new CreativeTabs("Earraylate") {
        // 获得用作标签图标的 ItemStack。你大可以往里面塞各种奇奇怪怪的数据。
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Items.DIAMOND);
        }
    };
    */
    /*
    public static final SoundEvent BLOOD_AND_GUTS = new SoundEvent(new ResourceLocation("earraylate", "blood_and_guts"));
    public static final SoundEvent FAILBOAT103_EXCALIBUUUR = new SoundEvent(new ResourceLocation("earraylate", "failboat103 - excalibuuur"));
    public static final SoundEvent THEKYLEB_7BY8 = new SoundEvent(new ResourceLocation("earraylate", "thekyleb - 7 by 8"));
    public static final SoundEvent THEKYLEB_BARD = new SoundEvent(new ResourceLocation("earraylate", "thekyleb - bard"));
    public static final SoundEvent GOOD_BATTLE_04 = new SoundEvent(new ResourceLocation("earraylate", "good_battle_04"));
    public static final SoundEvent TS1 = new SoundEvent(new ResourceLocation("earraylate", "ts1"));
    public static final SoundEvent TS2 = new SoundEvent(new ResourceLocation("earraylate", "ts2"));


    // 注意到注册名和构造时传入的那个“音效名”不是一回事。
    // 通常，为简单起见，一般会在这两个地方使用同样的名字。
    @SubscribeEvent
    public static void onSoundEvenrRegistration(RegistryEvent.Register<SoundEvent> event) {
        event.getRegistry().register(BLOOD_AND_GUTS.setRegistryName(new ResourceLocation("earraylate", "blood_and_guts")));
        event.getRegistry().register(FAILBOAT103_EXCALIBUUUR.setRegistryName(new ResourceLocation("earraylate", "failboat103 - excalibuuur")));
        event.getRegistry().register(THEKYLEB_7BY8.setRegistryName(new ResourceLocation("earraylate", "thekyleb - 7 by 8")));
        event.getRegistry().register(THEKYLEB_BARD.setRegistryName(new ResourceLocation("earraylate", "thekyleb - bard")));
        event.getRegistry().register(GOOD_BATTLE_04.setRegistryName(new ResourceLocation("earraylate", "good_battle_04")));
        event.getRegistry().register(TS1.setRegistryName(new ResourceLocation("earraylate", "ts1")));
        event.getRegistry().register(TS2.setRegistryName(new ResourceLocation("earraylate", "ts2")));
    }
    */
    @Mod.EventHandler
    public void preLoad(FMLPreInitializationEvent event) {
        System.out.println("Hello, Forge");
        System.out.println("This is Earraylate RPG!");
    }
}
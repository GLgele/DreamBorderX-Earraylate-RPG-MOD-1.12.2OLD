package com.dreambx.earraylate;

import com.dreambx.earraylate.proxy.CommonProxy;
import com.dreambx.earraylate.util.Reference;
import com.dreambx.earraylate.util.handlers.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.Logger;


@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Earraylate
{


    private static Logger logger;

    @Mod.Instance
    public static Earraylate instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public static void PreInit(FMLPreInitializationEvent event)
    {

    }

    @EventHandler
    public static void Init(FMLInitializationEvent event)
    {
        RegistryHandler.initRegistries();
    }

    @EventHandler
    public static void PostInit(FMLPostInitializationEvent event)
    {

    }

    public static final CreativeTabs ITEM_TAB = new CreativeTabs("earraylate_tab") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Blocks.GRASS);
        }
    };
}

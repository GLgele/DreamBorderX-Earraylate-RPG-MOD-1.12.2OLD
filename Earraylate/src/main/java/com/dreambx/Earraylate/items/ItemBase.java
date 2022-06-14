package com.dreambx.earraylate.items;

import com.dreambx.earraylate.Earraylate;
import com.dreambx.earraylate.init.ModItems;
import com.dreambx.earraylate.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
    //                  物品名称     放置的物品栏
    public ItemBase(String name, CreativeTabs tab) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);

        ModItems.ITEMS.add(this);
    }


    @Override
    public void registerModels() {
        Earraylate.proxy.registerItemRenderer(this, 0, "inventory");
    }
}


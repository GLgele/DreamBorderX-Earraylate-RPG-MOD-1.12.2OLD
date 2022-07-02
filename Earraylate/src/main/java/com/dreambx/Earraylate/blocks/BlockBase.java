package com.dreambx.earraylate.blocks;

import com.dreambx.earraylate.Earraylate;
import com.dreambx.earraylate.init.ModBlocks;
import com.dreambx.earraylate.init.ModItems;
import com.dreambx.earraylate.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
//import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {
    public BlockBase(String name, Material material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Earraylate.ITEM_TAB);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        Earraylate.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }

}

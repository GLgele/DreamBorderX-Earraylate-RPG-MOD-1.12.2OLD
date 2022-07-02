package com.dreambx.earraylate.init;

import com.dreambx.earraylate.blocks.BlockBase;
import com.dreambx.earraylate.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import java.util.ArrayList;
import java.util.List;


public class ModBlocks{
    public static final List<Block> BLOCKS = new ArrayList<Block>();
    public static final Block TEST_BLOCK = new BlockBase("test_block", Material.CLOTH);
}

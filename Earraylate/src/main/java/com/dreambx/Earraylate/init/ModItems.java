package com.dreambx.earraylate.init;

import com.dreambx.earraylate.Earraylate;
import com.dreambx.earraylate.items.ItemBase;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    //要全部大写,可以加下划线    //你的物品名称    //放在哪个物品栏
    public static final Item BlackBread = new ItemBase("black_bread", Earraylate.ITEM_TAB);
}

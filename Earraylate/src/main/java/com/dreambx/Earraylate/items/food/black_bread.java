package com.dreambx.Earraylate.black_bread;

import com.dreambx.Earraylate;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

@Mod.EventBusSubscriber(value = Side.CLIENT, modid = "earraylate")
public final class ModelMapper {
    @SubscribeEvent
    public static void onModelReg(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(ItemInitializer.black_bread, 0, new ModelResourceLocation(ItemInitializer.black_bread.getRegistryName(), "inventory"));
    }
}
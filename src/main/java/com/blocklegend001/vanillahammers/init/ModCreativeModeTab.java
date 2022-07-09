package com.blocklegend001.vanillahammers.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab VANILLAHAMMERS_TAB = new CreativeModeTab("vanillahammerstab") {
        @Override
        public ItemStack makeIcon() {

            return new ItemStack(ModItems.DIAMOND_HAMMER.get());
        }
    };
}

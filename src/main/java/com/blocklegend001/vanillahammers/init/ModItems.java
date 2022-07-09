
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.blocklegend001.vanillahammers.init;

import com.blocklegend001.vanillahammers.VanillaHammers;
import com.blocklegend001.vanillahammers.item.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VanillaHammers.MOD_ID);

	public static final RegistryObject<Item> WOODEN_HAMMER = ITEMS.register("wooden_hammer", () -> new WoodenHammer());
	public static final RegistryObject<Item> STONE_HAMMER = ITEMS.register("stone_hammer", () -> new StoneHammer());
	public static final RegistryObject<Item> IRON_HAMMER = ITEMS.register("iron_hammer", () -> new IronHammer());
	public static final RegistryObject<Item> GOLD_HAMMER = ITEMS.register("gold_hammer", () -> new GoldHammer());
	public static final RegistryObject<Item> EMERALD_HAMMER = ITEMS.register("emerald_hammer", () -> new EmeraldHammer());
	public static final RegistryObject<Item> DIAMOND_HAMMER = ITEMS.register("diamond_hammer", () -> new DiamondHammer());
	public static final RegistryObject<Item> NETHERITE_HAMMER = ITEMS.register("netherite_hammer", () -> new NetheriteHammer());
	public static final RegistryObject<Item> OBSIDIAN_HAMMER = ITEMS.register("obsidian_hammer", () -> new ObsidianHammer());
	public static final RegistryObject<Item> REDSTONE_HAMMER = ITEMS.register("redstone_hammer", () -> new RedstoneHammer());
	public static final RegistryObject<Item> LAPIS_HAMMER = ITEMS.register("lapis_hammer", () -> new LapisHammer());

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}

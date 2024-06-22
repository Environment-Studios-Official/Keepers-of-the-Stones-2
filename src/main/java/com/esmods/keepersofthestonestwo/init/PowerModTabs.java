/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.esmods.keepersofthestonestwo.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class PowerModTabs {
	public static CreativeModeTab TAB_STONES;
	public static CreativeModeTab TAB_ITEMS;
	public static CreativeModeTab TAB_MOBS;

	public static void load() {
		TAB_STONES = new CreativeModeTab("tab_stones") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PowerModItems.FIRE_STONE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_ITEMS = new CreativeModeTab("tab_items") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PowerModItems.EMPTY_BATTERY.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_MOBS = new CreativeModeTab("tab_mobs") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PowerModItems.ENERGIUM_GOLEM_SPAWN_EGG.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}

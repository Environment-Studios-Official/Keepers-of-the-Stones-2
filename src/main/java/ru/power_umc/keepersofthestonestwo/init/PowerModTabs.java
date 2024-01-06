
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.keepersofthestonestwo.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class PowerModTabs {
	public static CreativeModeTab TAB_STONES;
	public static CreativeModeTab TAB_ITEMS;

	public static void load() {
		TAB_STONES = new CreativeModeTab("tabstones") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PowerModItems.FIRE_STONE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_ITEMS = new CreativeModeTab("tabitems") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PowerModItems.EMPTY_BATTERY.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}


package com.esmods.keepersofthestonestwo.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import com.esmods.keepersofthestonestwo.init.PowerModTabs;

public class RawDepletedEnergiumItem extends Item {
	public RawDepletedEnergiumItem() {
		super(new Item.Properties().tab(PowerModTabs.TAB_ITEMS).stacksTo(64).rarity(Rarity.COMMON));
	}
}

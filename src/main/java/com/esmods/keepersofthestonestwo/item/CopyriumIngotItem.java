
package com.esmods.keepersofthestonestwo.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import com.esmods.keepersofthestonestwo.init.PowerModTabs;

public class CopyriumIngotItem extends Item {
	public CopyriumIngotItem() {
		super(new Item.Properties().tab(PowerModTabs.TAB_ITEMS).stacksTo(64).rarity(Rarity.COMMON));
	}
}

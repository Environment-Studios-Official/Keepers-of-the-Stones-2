
package com.esmods.keepersofthestonestwo.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import com.esmods.keepersofthestonestwo.init.PowerModTabs;

public class AmplifierDropItem extends Item {
	public AmplifierDropItem() {
		super(new Item.Properties().tab(PowerModTabs.TAB_ITEMS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.BOW;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}
}

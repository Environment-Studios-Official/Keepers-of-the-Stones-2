
package com.esmods.keepersofthestonestwo.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import com.esmods.keepersofthestonestwo.procedures.EnergiumItemsPowerLockedProcedure;
import com.esmods.keepersofthestonestwo.init.PowerModTabs;

public class EnergiumCoreItem extends Item {
	public EnergiumCoreItem() {
		super(new Item.Properties().tab(PowerModTabs.TAB_ITEMS).stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0f;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		EnergiumItemsPowerLockedProcedure.execute(entity, itemstack);
	}
}

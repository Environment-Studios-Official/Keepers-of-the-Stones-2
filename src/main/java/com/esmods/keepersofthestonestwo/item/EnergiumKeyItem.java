
package com.esmods.keepersofthestonestwo.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import com.esmods.keepersofthestonestwo.procedures.EnergiumKeyOpenVaultProcedure;
import com.esmods.keepersofthestonestwo.init.PowerModTabs;

public class EnergiumKeyItem extends Item {
	public EnergiumKeyItem() {
		super(new Item.Properties().tab(PowerModTabs.TAB_ITEMS).durability(11).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		EnergiumKeyOpenVaultProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}

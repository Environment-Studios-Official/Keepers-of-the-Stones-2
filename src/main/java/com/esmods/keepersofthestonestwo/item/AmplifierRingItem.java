
package com.esmods.keepersofthestonestwo.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import com.esmods.keepersofthestonestwo.procedures.AmplifierRingUseProcedure;
import com.esmods.keepersofthestonestwo.init.PowerModTabs;

public class AmplifierRingItem extends Item {
	public AmplifierRingItem() {
		super(new Item.Properties().tab(PowerModTabs.TAB_ITEMS).durability(3).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		AmplifierRingUseProcedure.execute(entity, ar.getObject());
		return ar;
	}
}

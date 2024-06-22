
package com.esmods.keepersofthestonestwo.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import com.esmods.keepersofthestonestwo.procedures.EnergiumItemsPowerLockedProcedure;
import com.esmods.keepersofthestonestwo.init.PowerModTabs;
import com.esmods.keepersofthestonestwo.init.PowerModItems;

public abstract class EnergiumArmorItem extends ArmorItem {
	public EnergiumArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 34;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{4, 13, 10, 4}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 20;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PowerModItems.ENERGIUM_INGOT.get()));
			}

			@Override
			public String getName() {
				return "energium_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends EnergiumArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(PowerModTabs.TAB_ITEMS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "power:textures/models/armor/energium_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			EnergiumItemsPowerLockedProcedure.execute(entity, itemstack);
		}
	}

	public static class Chestplate extends EnergiumArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(PowerModTabs.TAB_ITEMS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "power:textures/models/armor/energium_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			EnergiumItemsPowerLockedProcedure.execute(entity, itemstack);
		}
	}

	public static class Leggings extends EnergiumArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(PowerModTabs.TAB_ITEMS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "power:textures/models/armor/energium_layer_2.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			EnergiumItemsPowerLockedProcedure.execute(entity, itemstack);
		}
	}

	public static class Boots extends EnergiumArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(PowerModTabs.TAB_ITEMS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "power:textures/models/armor/energium_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			EnergiumItemsPowerLockedProcedure.execute(entity, itemstack);
		}
	}
}

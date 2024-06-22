
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

import com.esmods.keepersofthestonestwo.procedures.EarthArmorKazhdyiTikDliaShliemaProcedure;
import com.esmods.keepersofthestonestwo.procedures.EarthArmorKazhdyiTikDliaPonozhieiProcedure;
import com.esmods.keepersofthestonestwo.procedures.EarthArmorKazhdyiTikDliaNaghrudnikaProcedure;
import com.esmods.keepersofthestonestwo.procedures.EarthArmorKazhdyiTikDliaBotinokProcedure;

public abstract class EarthArmorItem extends ArmorItem {
	public EarthArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 37;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{3, 6, 8, 3}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 0;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}

			@Override
			public String getName() {
				return "earth_armor";
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

	public static class Helmet extends EarthArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(null));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "power:textures/models/armor/earth_armor_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			EarthArmorKazhdyiTikDliaShliemaProcedure.execute(entity);
		}
	}

	public static class Chestplate extends EarthArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(null));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "power:textures/models/armor/earth_armor_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			EarthArmorKazhdyiTikDliaNaghrudnikaProcedure.execute(entity);
		}
	}

	public static class Leggings extends EarthArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(null));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "power:textures/models/armor/earth_armor_layer_2.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			EarthArmorKazhdyiTikDliaPonozhieiProcedure.execute(entity);
		}
	}

	public static class Boots extends EarthArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(null));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "power:textures/models/armor/earth_armor_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			EarthArmorKazhdyiTikDliaBotinokProcedure.execute(entity);
		}
	}
}

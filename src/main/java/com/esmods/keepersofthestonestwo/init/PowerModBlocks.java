
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.esmods.keepersofthestonestwo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import com.esmods.keepersofthestonestwo.block.RawDepletedEnergiumBlockBlock;
import com.esmods.keepersofthestonestwo.block.RawAmplifierBlockBlock;
import com.esmods.keepersofthestonestwo.block.OrangePortalBlock;
import com.esmods.keepersofthestonestwo.block.MoonBlockBlock;
import com.esmods.keepersofthestonestwo.block.KeepersBoxBlock;
import com.esmods.keepersofthestonestwo.block.EnergiumControllerBlock;
import com.esmods.keepersofthestonestwo.block.EnergiumBlockBlock;
import com.esmods.keepersofthestonestwo.block.DepletedEnergiumOreBlock;
import com.esmods.keepersofthestonestwo.block.DepletedEnergiumBlockBlock;
import com.esmods.keepersofthestonestwo.block.BluePortalBlock;
import com.esmods.keepersofthestonestwo.block.BatteryChargerBlock;
import com.esmods.keepersofthestonestwo.block.AmplifierOreBlock;
import com.esmods.keepersofthestonestwo.block.AmplifierBlockBlock;
import com.esmods.keepersofthestonestwo.block.AmberBlockBlock;
import com.esmods.keepersofthestonestwo.PowerMod;

public class PowerModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PowerMod.MODID);
	public static final RegistryObject<Block> DEPLETED_ENERGIUM_ORE = REGISTRY.register("depleted_energium_ore", () -> new DepletedEnergiumOreBlock());
	public static final RegistryObject<Block> DEPLETED_ENERGIUM_BLOCK = REGISTRY.register("depleted_energium_block", () -> new DepletedEnergiumBlockBlock());
	public static final RegistryObject<Block> ENERGIUM_BLOCK = REGISTRY.register("energium_block", () -> new EnergiumBlockBlock());
	public static final RegistryObject<Block> BATTERY_CHARGER = REGISTRY.register("battery_charger", () -> new BatteryChargerBlock());
	public static final RegistryObject<Block> KEEPERS_BOX = REGISTRY.register("keepers_box", () -> new KeepersBoxBlock());
	public static final RegistryObject<Block> MOON_BLOCK = REGISTRY.register("moon_block", () -> new MoonBlockBlock());
	public static final RegistryObject<Block> ENERGIUM_CONTROLLER = REGISTRY.register("energium_controller", () -> new EnergiumControllerBlock());
	public static final RegistryObject<Block> AMPLIFIER_ORE = REGISTRY.register("amplifier_ore", () -> new AmplifierOreBlock());
	public static final RegistryObject<Block> AMPLIFIER_BLOCK = REGISTRY.register("amplifier_block", () -> new AmplifierBlockBlock());
	public static final RegistryObject<Block> RAW_DEPLETED_ENERGIUM_BLOCK = REGISTRY.register("raw_depleted_energium_block", () -> new RawDepletedEnergiumBlockBlock());
	public static final RegistryObject<Block> RAW_AMPLIFIER_BLOCK = REGISTRY.register("raw_amplifier_block", () -> new RawAmplifierBlockBlock());
	public static final RegistryObject<Block> BLUE_PORTAL = REGISTRY.register("blue_portal", () -> new BluePortalBlock());
	public static final RegistryObject<Block> ORANGE_PORTAL = REGISTRY.register("orange_portal", () -> new OrangePortalBlock());
	public static final RegistryObject<Block> AMBER_BLOCK = REGISTRY.register("amber_block", () -> new AmberBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.esmods.keepersofthestonestwo.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import com.esmods.keepersofthestonestwo.block.RawEnergiumBlockBlock;
import com.esmods.keepersofthestonestwo.block.RawDepletedEnergiumBlockBlock;
import com.esmods.keepersofthestonestwo.block.RawCopyriumBlockBlock;
import com.esmods.keepersofthestonestwo.block.RawAmplifierBlockBlock;
import com.esmods.keepersofthestonestwo.block.PurpleMushroomBlock;
import com.esmods.keepersofthestonestwo.block.PolishedCursedStoneWallBlock;
import com.esmods.keepersofthestonestwo.block.PolishedCursedStoneStairsBlock;
import com.esmods.keepersofthestonestwo.block.PolishedCursedStoneSlabBlock;
import com.esmods.keepersofthestonestwo.block.PolishedCursedStoneBlock;
import com.esmods.keepersofthestonestwo.block.OrangePortalBlock;
import com.esmods.keepersofthestonestwo.block.MoonBlockBlock;
import com.esmods.keepersofthestonestwo.block.KeepersBoxBlock;
import com.esmods.keepersofthestonestwo.block.EnergiumVaultBlock;
import com.esmods.keepersofthestonestwo.block.EnergiumOreBlock;
import com.esmods.keepersofthestonestwo.block.EnergiumControllerBlock;
import com.esmods.keepersofthestonestwo.block.EnergiumBlockBlock;
import com.esmods.keepersofthestonestwo.block.ElementalPowerGeneratorBlock;
import com.esmods.keepersofthestonestwo.block.DepletedEnergiumOreBlock;
import com.esmods.keepersofthestonestwo.block.DepletedEnergiumBlockBlock;
import com.esmods.keepersofthestonestwo.block.DeepslateEnergiumOreBlock;
import com.esmods.keepersofthestonestwo.block.DeepslateDepletedEnergiumOreBlock;
import com.esmods.keepersofthestonestwo.block.DeepslateCopyriumOreBlock;
import com.esmods.keepersofthestonestwo.block.DeepslateAmplifierOreBlock;
import com.esmods.keepersofthestonestwo.block.CursedVaultBlock;
import com.esmods.keepersofthestonestwo.block.CursedStoneWallBlock;
import com.esmods.keepersofthestonestwo.block.CursedStoneStairsBlock;
import com.esmods.keepersofthestonestwo.block.CursedStoneSlabBlock;
import com.esmods.keepersofthestonestwo.block.CursedStonePillarBlock;
import com.esmods.keepersofthestonestwo.block.CursedStoneBricksWallBlock;
import com.esmods.keepersofthestonestwo.block.CursedStoneBricksStairsBlock;
import com.esmods.keepersofthestonestwo.block.CursedStoneBricksSlabBlock;
import com.esmods.keepersofthestonestwo.block.CursedStoneBricksBlock;
import com.esmods.keepersofthestonestwo.block.CursedStoneBlock;
import com.esmods.keepersofthestonestwo.block.CursedLanternBlock;
import com.esmods.keepersofthestonestwo.block.CursedLampBlock;
import com.esmods.keepersofthestonestwo.block.CursedLadderBlock;
import com.esmods.keepersofthestonestwo.block.CopyriumOreBlock;
import com.esmods.keepersofthestonestwo.block.CopyriumBlockBlock;
import com.esmods.keepersofthestonestwo.block.BluePortalBlock;
import com.esmods.keepersofthestonestwo.block.BatteryChargerBlock;
import com.esmods.keepersofthestonestwo.block.AmplifierOreBlock;
import com.esmods.keepersofthestonestwo.block.AmplifierBlockBlock;
import com.esmods.keepersofthestonestwo.block.AmberBlockBlock;
import com.esmods.keepersofthestonestwo.PowerMod;

public class PowerModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK, PowerMod.MODID);
	public static final DeferredHolder<Block, Block> DEPLETED_ENERGIUM_ORE = REGISTRY.register("depleted_energium_ore", () -> new DepletedEnergiumOreBlock());
	public static final DeferredHolder<Block, Block> DEPLETED_ENERGIUM_BLOCK = REGISTRY.register("depleted_energium_block", () -> new DepletedEnergiumBlockBlock());
	public static final DeferredHolder<Block, Block> ENERGIUM_BLOCK = REGISTRY.register("energium_block", () -> new EnergiumBlockBlock());
	public static final DeferredHolder<Block, Block> BATTERY_CHARGER = REGISTRY.register("battery_charger", () -> new BatteryChargerBlock());
	public static final DeferredHolder<Block, Block> KEEPERS_BOX = REGISTRY.register("keepers_box", () -> new KeepersBoxBlock());
	public static final DeferredHolder<Block, Block> MOON_BLOCK = REGISTRY.register("moon_block", () -> new MoonBlockBlock());
	public static final DeferredHolder<Block, Block> ENERGIUM_CONTROLLER = REGISTRY.register("energium_controller", () -> new EnergiumControllerBlock());
	public static final DeferredHolder<Block, Block> AMPLIFIER_ORE = REGISTRY.register("amplifier_ore", () -> new AmplifierOreBlock());
	public static final DeferredHolder<Block, Block> AMPLIFIER_BLOCK = REGISTRY.register("amplifier_block", () -> new AmplifierBlockBlock());
	public static final DeferredHolder<Block, Block> RAW_DEPLETED_ENERGIUM_BLOCK = REGISTRY.register("raw_depleted_energium_block", () -> new RawDepletedEnergiumBlockBlock());
	public static final DeferredHolder<Block, Block> RAW_AMPLIFIER_BLOCK = REGISTRY.register("raw_amplifier_block", () -> new RawAmplifierBlockBlock());
	public static final DeferredHolder<Block, Block> BLUE_PORTAL = REGISTRY.register("blue_portal", () -> new BluePortalBlock());
	public static final DeferredHolder<Block, Block> ORANGE_PORTAL = REGISTRY.register("orange_portal", () -> new OrangePortalBlock());
	public static final DeferredHolder<Block, Block> AMBER_BLOCK = REGISTRY.register("amber_block", () -> new AmberBlockBlock());
	public static final DeferredHolder<Block, Block> CURSED_STONE = REGISTRY.register("cursed_stone", () -> new CursedStoneBlock());
	public static final DeferredHolder<Block, Block> CURSED_STONE_BRICKS = REGISTRY.register("cursed_stone_bricks", () -> new CursedStoneBricksBlock());
	public static final DeferredHolder<Block, Block> CURSED_STONE_STAIRS = REGISTRY.register("cursed_stone_stairs", () -> new CursedStoneStairsBlock());
	public static final DeferredHolder<Block, Block> CURSED_STONE_SLAB = REGISTRY.register("cursed_stone_slab", () -> new CursedStoneSlabBlock());
	public static final DeferredHolder<Block, Block> CURSED_STONE_BRICKS_STAIRS = REGISTRY.register("cursed_stone_bricks_stairs", () -> new CursedStoneBricksStairsBlock());
	public static final DeferredHolder<Block, Block> CURSED_STONE_BRICKS_SLAB = REGISTRY.register("cursed_stone_bricks_slab", () -> new CursedStoneBricksSlabBlock());
	public static final DeferredHolder<Block, Block> CURSED_STONE_WALL = REGISTRY.register("cursed_stone_wall", () -> new CursedStoneWallBlock());
	public static final DeferredHolder<Block, Block> CURSED_STONE_BRICKS_WALL = REGISTRY.register("cursed_stone_bricks_wall", () -> new CursedStoneBricksWallBlock());
	public static final DeferredHolder<Block, Block> POLISHED_CURSED_STONE = REGISTRY.register("polished_cursed_stone", () -> new PolishedCursedStoneBlock());
	public static final DeferredHolder<Block, Block> POLISHED_CURSED_STONE_STAIRS = REGISTRY.register("polished_cursed_stone_stairs", () -> new PolishedCursedStoneStairsBlock());
	public static final DeferredHolder<Block, Block> POLISHED_CURSED_STONE_SLAB = REGISTRY.register("polished_cursed_stone_slab", () -> new PolishedCursedStoneSlabBlock());
	public static final DeferredHolder<Block, Block> POLISHED_CURSED_STONE_WALL = REGISTRY.register("polished_cursed_stone_wall", () -> new PolishedCursedStoneWallBlock());
	public static final DeferredHolder<Block, Block> CURSED_STONE_PILLAR = REGISTRY.register("cursed_stone_pillar", () -> new CursedStonePillarBlock());
	public static final DeferredHolder<Block, Block> CURSED_LANTERN = REGISTRY.register("cursed_lantern", () -> new CursedLanternBlock());
	public static final DeferredHolder<Block, Block> COPYRIUM_ORE = REGISTRY.register("copyrium_ore", () -> new CopyriumOreBlock());
	public static final DeferredHolder<Block, Block> COPYRIUM_BLOCK = REGISTRY.register("copyrium_block", () -> new CopyriumBlockBlock());
	public static final DeferredHolder<Block, Block> RAW_COPYRIUM_BLOCK = REGISTRY.register("raw_copyrium_block", () -> new RawCopyriumBlockBlock());
	public static final DeferredHolder<Block, Block> ELEMENTAL_POWER_GENERATOR = REGISTRY.register("elemental_power_generator", () -> new ElementalPowerGeneratorBlock());
	public static final DeferredHolder<Block, Block> CURSED_VAULT = REGISTRY.register("cursed_vault", () -> new CursedVaultBlock());
	public static final DeferredHolder<Block, Block> CURSED_LADDER = REGISTRY.register("cursed_ladder", () -> new CursedLadderBlock());
	public static final DeferredHolder<Block, Block> CURSED_LAMP = REGISTRY.register("cursed_lamp", () -> new CursedLampBlock());
	public static final DeferredHolder<Block, Block> ENERGIUM_VAULT = REGISTRY.register("energium_vault", () -> new EnergiumVaultBlock());
	public static final DeferredHolder<Block, Block> PURPLE_MUSHROOM = REGISTRY.register("purple_mushroom", () -> new PurpleMushroomBlock());
	public static final DeferredHolder<Block, Block> ENERGIUM_ORE = REGISTRY.register("energium_ore", () -> new EnergiumOreBlock());
	public static final DeferredHolder<Block, Block> RAW_ENERGIUM_BLOCK = REGISTRY.register("raw_energium_block", () -> new RawEnergiumBlockBlock());
	public static final DeferredHolder<Block, Block> DEEPSLATE_DEPLETED_ENERGIUM_ORE = REGISTRY.register("deepslate_depleted_energium_ore", () -> new DeepslateDepletedEnergiumOreBlock());
	public static final DeferredHolder<Block, Block> DEEPSLATE_ENERGIUM_ORE = REGISTRY.register("deepslate_energium_ore", () -> new DeepslateEnergiumOreBlock());
	public static final DeferredHolder<Block, Block> DEEPSLATE_AMPLIFIER_ORE = REGISTRY.register("deepslate_amplifier_ore", () -> new DeepslateAmplifierOreBlock());
	public static final DeferredHolder<Block, Block> DEEPSLATE_COPYRIUM_ORE = REGISTRY.register("deepslate_copyrium_ore", () -> new DeepslateCopyriumOreBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}

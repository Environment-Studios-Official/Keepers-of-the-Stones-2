/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.esmods.keepersofthestonestwo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import com.esmods.keepersofthestonestwo.PowerMod;

public class PowerModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, PowerMod.MODID);
	public static final RegistryObject<SoundEvent> STONE_ACTIVATION = REGISTRY.register("stone_activation", () -> new SoundEvent(new ResourceLocation("power", "stone_activation")));
	public static final RegistryObject<SoundEvent> STONE_DEACTIVATION = REGISTRY.register("stone_deactivation", () -> new SoundEvent(new ResourceLocation("power", "stone_deactivation")));
	public static final RegistryObject<SoundEvent> ELECTRIC_SPARK = REGISTRY.register("electric_spark", () -> new SoundEvent(new ResourceLocation("power", "electric_spark")));
	public static final RegistryObject<SoundEvent> EAR_RINGING = REGISTRY.register("ear_ringing", () -> new SoundEvent(new ResourceLocation("power", "ear_ringing")));
	public static final RegistryObject<SoundEvent> BACKPORT_BLOCK_VAULT_STEP = REGISTRY.register("backport.block.vault.step", () -> new SoundEvent(new ResourceLocation("power", "backport.block.vault.step")));
	public static final RegistryObject<SoundEvent> BACKPORT_BLOCK_VAULT_PLACE = REGISTRY.register("backport.block.vault.place", () -> new SoundEvent(new ResourceLocation("power", "backport.block.vault.place")));
	public static final RegistryObject<SoundEvent> BACKPORT_BLOCK_VAULT_AMBIENT = REGISTRY.register("backport.block.vault.ambient", () -> new SoundEvent(new ResourceLocation("power", "backport.block.vault.ambient")));
	public static final RegistryObject<SoundEvent> BACKPORT_BLOCK_VAULT_BREAK = REGISTRY.register("backport.block.vault.break", () -> new SoundEvent(new ResourceLocation("power", "backport.block.vault.break")));
	public static final RegistryObject<SoundEvent> BACKPORT_BLOCK_VAULT_EJECT = REGISTRY.register("backport.block.vault.eject", () -> new SoundEvent(new ResourceLocation("power", "backport.block.vault.eject")));
	public static final RegistryObject<SoundEvent> BACKPORT_BLOCK_VAULT_ACTIVATE = REGISTRY.register("backport.block.vault.activate", () -> new SoundEvent(new ResourceLocation("power", "backport.block.vault.activate")));
	public static final RegistryObject<SoundEvent> BACKPORT_BLOCK_VAULT_DEACTIVATE = REGISTRY.register("backport.block.vault.deactivate", () -> new SoundEvent(new ResourceLocation("power", "backport.block.vault.deactivate")));
	public static final RegistryObject<SoundEvent> BACKPORT_BLOCK_VAULT_INSERT = REGISTRY.register("backport.block.vault.insert", () -> new SoundEvent(new ResourceLocation("power", "backport.block.vault.insert")));
	public static final RegistryObject<SoundEvent> BACKPORT_BLOCK_VAULT_INSERT_FAIL = REGISTRY.register("backport.block.vault.insert_fail", () -> new SoundEvent(new ResourceLocation("power", "backport.block.vault.insert_fail")));
	public static final RegistryObject<SoundEvent> BACKPORT_BLOCK_VAULT_OPEN_SHUTTER = REGISTRY.register("backport.block.vault.open_shutter", () -> new SoundEvent(new ResourceLocation("power", "backport.block.vault.open_shutter")));
}


/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.esmods.keepersofthestonestwo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import com.esmods.keepersofthestonestwo.potion.WhirlwindMobEffect;
import com.esmods.keepersofthestonestwo.potion.WaterMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.VacuumMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.TornadoMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.TimeStoppedMobEffect;
import com.esmods.keepersofthestonestwo.potion.TimeSlowingMobEffect;
import com.esmods.keepersofthestonestwo.potion.TimeMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.SunMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.StunMobEffect;
import com.esmods.keepersofthestonestwo.potion.SpaceMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.SoundMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.ShadowMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.RainMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.PowerLockMobEffect;
import com.esmods.keepersofthestonestwo.potion.PlantsMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.OceanMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.MoonMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.MetalMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.LightningMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.LightMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.LavaMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.IronSkinMobEffect;
import com.esmods.keepersofthestonestwo.potion.IceMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.FireMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.EtherMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.EnergyMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.EarthMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.CrystalMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.CreationMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.AnimalsMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.AirMasterMobEffect;
import com.esmods.keepersofthestonestwo.PowerMod;

public class PowerModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, PowerMod.MODID);
	public static final RegistryObject<MobEffect> FIRE_MASTER = REGISTRY.register("fire_master", () -> new FireMasterMobEffect());
	public static final RegistryObject<MobEffect> AIR_MASTER = REGISTRY.register("air_master", () -> new AirMasterMobEffect());
	public static final RegistryObject<MobEffect> EARTH_MASTER = REGISTRY.register("earth_master", () -> new EarthMasterMobEffect());
	public static final RegistryObject<MobEffect> WATER_MASTER = REGISTRY.register("water_master", () -> new WaterMasterMobEffect());
	public static final RegistryObject<MobEffect> ETHER_MASTER = REGISTRY.register("ether_master", () -> new EtherMasterMobEffect());
	public static final RegistryObject<MobEffect> ICE_MASTER = REGISTRY.register("ice_master", () -> new IceMasterMobEffect());
	public static final RegistryObject<MobEffect> LIGHTNING_MASTER = REGISTRY.register("lightning_master", () -> new LightningMasterMobEffect());
	public static final RegistryObject<MobEffect> SOUND_MASTER = REGISTRY.register("sound_master", () -> new SoundMasterMobEffect());
	public static final RegistryObject<MobEffect> LAVA_MASTER = REGISTRY.register("lava_master", () -> new LavaMasterMobEffect());
	public static final RegistryObject<MobEffect> CRYSTAL_MASTER = REGISTRY.register("crystal_master", () -> new CrystalMasterMobEffect());
	public static final RegistryObject<MobEffect> RAIN_MASTER = REGISTRY.register("rain_master", () -> new RainMasterMobEffect());
	public static final RegistryObject<MobEffect> TORNADO_MASTER = REGISTRY.register("tornado_master", () -> new TornadoMasterMobEffect());
	public static final RegistryObject<MobEffect> OCEAN_MASTER = REGISTRY.register("ocean_master", () -> new OceanMasterMobEffect());
	public static final RegistryObject<MobEffect> PLANTS_MASTER = REGISTRY.register("plants_master", () -> new PlantsMasterMobEffect());
	public static final RegistryObject<MobEffect> ANIMALS_MASTER = REGISTRY.register("animals_master", () -> new AnimalsMasterMobEffect());
	public static final RegistryObject<MobEffect> METAL_MASTER = REGISTRY.register("metal_master", () -> new MetalMasterMobEffect());
	public static final RegistryObject<MobEffect> STUN = REGISTRY.register("stun", () -> new StunMobEffect());
	public static final RegistryObject<MobEffect> WHIRLWIND = REGISTRY.register("whirlwind", () -> new WhirlwindMobEffect());
	public static final RegistryObject<MobEffect> IRON_SKIN = REGISTRY.register("iron_skin", () -> new IronSkinMobEffect());
	public static final RegistryObject<MobEffect> LIGHT_MASTER = REGISTRY.register("light_master", () -> new LightMasterMobEffect());
	public static final RegistryObject<MobEffect> SHADOW_MASTER = REGISTRY.register("shadow_master", () -> new ShadowMasterMobEffect());
	public static final RegistryObject<MobEffect> VACUUM_MASTER = REGISTRY.register("vacuum_master", () -> new VacuumMasterMobEffect());
	public static final RegistryObject<MobEffect> POWER_LOCK = REGISTRY.register("power_lock", () -> new PowerLockMobEffect());
	public static final RegistryObject<MobEffect> ENERGY_MASTER = REGISTRY.register("energy_master", () -> new EnergyMasterMobEffect());
	public static final RegistryObject<MobEffect> SUN_MASTER = REGISTRY.register("sun_master", () -> new SunMasterMobEffect());
	public static final RegistryObject<MobEffect> MOON_MASTER = REGISTRY.register("moon_master", () -> new MoonMasterMobEffect());
	public static final RegistryObject<MobEffect> SPACE_MASTER = REGISTRY.register("space_master", () -> new SpaceMasterMobEffect());
	public static final RegistryObject<MobEffect> TIME_MASTER = REGISTRY.register("time_master", () -> new TimeMasterMobEffect());
	public static final RegistryObject<MobEffect> TIME_SLOWING = REGISTRY.register("time_slowing", () -> new TimeSlowingMobEffect());
	public static final RegistryObject<MobEffect> TIME_STOPPED = REGISTRY.register("time_stopped", () -> new TimeStoppedMobEffect());
	public static final RegistryObject<MobEffect> CREATION_MASTER = REGISTRY.register("creation_master", () -> new CreationMasterMobEffect());
}

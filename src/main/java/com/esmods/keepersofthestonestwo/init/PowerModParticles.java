/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.esmods.keepersofthestonestwo.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import com.esmods.keepersofthestonestwo.client.particle.VacuumParticleParticle;
import com.esmods.keepersofthestonestwo.client.particle.TimeStopParticle;
import com.esmods.keepersofthestonestwo.client.particle.TimeSlowParticle;
import com.esmods.keepersofthestonestwo.client.particle.TimeFastParticle;
import com.esmods.keepersofthestonestwo.client.particle.TeleportationParticleParticle;
import com.esmods.keepersofthestonestwo.client.particle.TechnobarrierParticleParticle;
import com.esmods.keepersofthestonestwo.client.particle.SunParticlesParticle;
import com.esmods.keepersofthestonestwo.client.particle.StarParticleParticle;
import com.esmods.keepersofthestonestwo.client.particle.RunesOfDestructionParticle;
import com.esmods.keepersofthestonestwo.client.particle.RunesOfCreationParticle;
import com.esmods.keepersofthestonestwo.client.particle.RedMagnetParticleParticle;
import com.esmods.keepersofthestonestwo.client.particle.PoisonParticleParticle;
import com.esmods.keepersofthestonestwo.client.particle.MoonParticleParticle;
import com.esmods.keepersofthestonestwo.client.particle.MistParticleParticle;
import com.esmods.keepersofthestonestwo.client.particle.LightSparkleParticle;
import com.esmods.keepersofthestonestwo.client.particle.InsectsParticle;
import com.esmods.keepersofthestonestwo.client.particle.EnergySparkParticle;
import com.esmods.keepersofthestonestwo.client.particle.EnergiumGolemCoreAttackParticleParticle;
import com.esmods.keepersofthestonestwo.client.particle.BlueMagnetParticleParticle;
import com.esmods.keepersofthestonestwo.client.particle.BloodSplashParticle;
import com.esmods.keepersofthestonestwo.client.particle.BassBoomParticle;
import com.esmods.keepersofthestonestwo.client.particle.AmberPowerParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PowerModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.register(PowerModParticleTypes.BASS_BOOM.get(), BassBoomParticle::provider);
		event.register(PowerModParticleTypes.INSECTS.get(), InsectsParticle::provider);
		event.register(PowerModParticleTypes.LIGHT_SPARKLE.get(), LightSparkleParticle::provider);
		event.register(PowerModParticleTypes.VACUUM_PARTICLE.get(), VacuumParticleParticle::provider);
		event.register(PowerModParticleTypes.ENERGY_SPARK.get(), EnergySparkParticle::provider);
		event.register(PowerModParticleTypes.SUN_PARTICLES.get(), SunParticlesParticle::provider);
		event.register(PowerModParticleTypes.MOON_PARTICLE.get(), MoonParticleParticle::provider);
		event.register(PowerModParticleTypes.STAR_PARTICLE.get(), StarParticleParticle::provider);
		event.register(PowerModParticleTypes.TIME_SLOW.get(), TimeSlowParticle::provider);
		event.register(PowerModParticleTypes.TIME_STOP.get(), TimeStopParticle::provider);
		event.register(PowerModParticleTypes.TIME_FAST.get(), TimeFastParticle::provider);
		event.register(PowerModParticleTypes.RUNES_OF_CREATION.get(), RunesOfCreationParticle::provider);
		event.register(PowerModParticleTypes.RUNES_OF_DESTRUCTION.get(), RunesOfDestructionParticle::provider);
		event.register(PowerModParticleTypes.TECHNOBARRIER_PARTICLE.get(), TechnobarrierParticleParticle::provider);
		event.register(PowerModParticleTypes.TELEPORTATION_PARTICLE.get(), TeleportationParticleParticle::provider);
		event.register(PowerModParticleTypes.ENERGIUM_GOLEM_CORE_ATTACK_PARTICLE.get(), EnergiumGolemCoreAttackParticleParticle::provider);
		event.register(PowerModParticleTypes.AMBER_POWER.get(), AmberPowerParticle::provider);
		event.register(PowerModParticleTypes.BLOOD_SPLASH.get(), BloodSplashParticle::provider);
		event.register(PowerModParticleTypes.MIST_PARTICLE.get(), MistParticleParticle::provider);
		event.register(PowerModParticleTypes.POISON_PARTICLE.get(), PoisonParticleParticle::provider);
		event.register(PowerModParticleTypes.BLUE_MAGNET_PARTICLE.get(), BlueMagnetParticleParticle::provider);
		event.register(PowerModParticleTypes.RED_MAGNET_PARTICLE.get(), RedMagnetParticleParticle::provider);
	}
}

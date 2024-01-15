
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.keepersofthestonestwo.init;

import ru.power_umc.keepersofthestonestwo.client.particle.VacuumParticleParticle;
import ru.power_umc.keepersofthestonestwo.client.particle.LightSparkleParticle;
import ru.power_umc.keepersofthestonestwo.client.particle.InsectsParticle;
import ru.power_umc.keepersofthestonestwo.client.particle.BassBoomParticle;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PowerModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.register(PowerModParticleTypes.BASS_BOOM.get(), BassBoomParticle::provider);
		event.register(PowerModParticleTypes.INSECTS.get(), InsectsParticle::provider);
		event.register(PowerModParticleTypes.LIGHT_SPARKLE.get(), LightSparkleParticle::provider);
		event.register(PowerModParticleTypes.VACUUM_PARTICLE.get(), VacuumParticleParticle::provider);
	}
}

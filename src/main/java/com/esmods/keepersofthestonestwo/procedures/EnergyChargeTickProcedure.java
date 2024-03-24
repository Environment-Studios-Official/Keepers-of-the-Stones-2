package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.SimpleParticleType;

import com.esmods.keepersofthestonestwo.init.KeepersOfTheStones2ModParticleTypes;

public class EnergyChargeTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle((SimpleParticleType) (KeepersOfTheStones2ModParticleTypes.ENERGY_SPARK.get()), x, y, z, 0, 1, 0);
	}
}

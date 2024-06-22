package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import com.esmods.keepersofthestonestwo.init.PowerModParticleTypes;

public class BatteryChargerClientTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double fireHeight = 0;
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "craftingProgress") > 0) {
			if (Math.random() < 0.2) {
				world.addParticle((SimpleParticleType) (PowerModParticleTypes.ENERGY_SPARK.get()), (x + 0.5), (y + 1), (z + 0.5), 0.5, 0.1, 0.5);
				world.addParticle((SimpleParticleType) (PowerModParticleTypes.ENERGY_SPARK.get()), (x + 0.5), (y + 1), (z + 0.5), (-0.5), 0.1, 0.5);
				world.addParticle((SimpleParticleType) (PowerModParticleTypes.ENERGY_SPARK.get()), (x + 0.5), (y + 1), (z + 0.5), 0.5, 0.1, (-0.5));
				world.addParticle((SimpleParticleType) (PowerModParticleTypes.ENERGY_SPARK.get()), (x + 0.5), (y + 1), (z + 0.5), (-0.5), 0.1, (-0.5));
			}
		}
	}
}

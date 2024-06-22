package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class CursedLadderRotationProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return world.getBlockState(new BlockPos(x + 1, y, z)).canOcclude() || world.getBlockState(new BlockPos(x, y, z - 1)).canOcclude() || world.getBlockState(new BlockPos(x - 1, y, z)).canOcclude()
				|| world.getBlockState(new BlockPos(x, y, z + 1)).canOcclude();
	}
}

package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import com.esmods.keepersofthestonestwo.init.PowerModBlocks;

public class KeepersBoxUsloviieRazmieshchieniiaBlokaProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return !((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == PowerModBlocks.KEEPERS_BOX.get());
	}
}

package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.level.LevelAccessor;

import com.esmods.keepersofthestonestwo.network.PowerModVariables;

public class OceanStoneCheckProcedure {
	public static boolean execute(LevelAccessor world) {
		if (PowerModVariables.MapVariables.get(world).ocean_stone == false || PowerModVariables.MapVariables.get(world).get_limit_of_stones == false) {
			return false;
		}
		return true;
	}
}

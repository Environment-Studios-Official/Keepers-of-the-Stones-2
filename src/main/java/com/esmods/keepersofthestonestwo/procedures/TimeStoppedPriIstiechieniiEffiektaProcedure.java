package com.esmods.keepersofthestonestwo.procedures;

import virtuoel.pehkui.api.ScaleTypes;
import virtuoel.pehkui.api.ScaleOperations;

import net.minecraft.world.entity.Entity;

import com.esmods.keepersofthestonestwo.network.PowerModVariables;

public class TimeStoppedPriIstiechieniiEffiektaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		ScaleTypes.MOTION.getScaleData(entity).setTargetScale((float) ScaleOperations.SET.applyAsDouble(ScaleTypes.MOTION.getScaleData(entity).getTargetScale(), 1));
		{
			PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
			_vars.ability_block = false;
			_vars.syncPlayerVariables(entity);
		}
	}
}

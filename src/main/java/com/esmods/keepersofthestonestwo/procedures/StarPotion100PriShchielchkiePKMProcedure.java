package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.entity.Entity;

import com.esmods.keepersofthestonestwo.network.KeepersOfTheStones2ModVariables;

public class StarPotion100PriShchielchkiePKMProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = (entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).power + 100;
			entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.power = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}

package ru.power_umc.keepersofthestonestwo.procedures;

import ru.power_umc.keepersofthestonestwo.network.PowerModVariables;

import net.minecraft.world.entity.Entity;

public class GetPowerScaleProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "" + ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power > 9999
				? "\u221E"
				: Math.round((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power));
	}
}

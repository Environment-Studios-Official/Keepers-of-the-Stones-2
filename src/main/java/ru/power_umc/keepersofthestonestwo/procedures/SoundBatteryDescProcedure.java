package ru.power_umc.keepersofthestonestwo.procedures;

import net.minecraft.network.chat.Component;

public class SoundBatteryDescProcedure {
	public static String execute() {
		return "\u00A75\u00A7o" + Component.translatable("battery.desc.sound").getString();
	}
}
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.esmods.keepersofthestonestwo.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.damagesource.DamageSource;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PowerModDamageSources {
	public static final DamageSource ELEMENTAL_POWERS = (new DamageSource("elemental_powers"));
	public static final DamageSource ENERGIUM_GOLEM_DS = (new DamageSource("energium_golem_ds")).setScalesWithDifficulty();
}

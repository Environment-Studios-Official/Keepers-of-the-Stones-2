
package ru.power_umc.keepersofthestonestwo.potion;

import ru.power_umc.keepersofthestonestwo.procedures.EnhancedAbilitiesProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.EnergyMasterStartProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.EnergyMasterEndProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class EnergyMasterMobEffect extends MobEffect {
	public EnergyMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -13312);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.energy_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		EnergyMasterStartProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		EnhancedAbilitiesProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		EnergyMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}

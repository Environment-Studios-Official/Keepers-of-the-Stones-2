package com.esmods.keepersofthestonestwo.procedures;

import net.neoforged.neoforge.event.TickEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import javax.annotation.Nullable;

import com.esmods.keepersofthestonestwo.network.PowerModVariables;

@Mod.EventBusSubscriber
public class AbilityKeyPressedTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(PowerModVariables.PLAYER_VARIABLES).use_ability_key_var) {
			if (entity.getData(PowerModVariables.PLAYER_VARIABLES).ability_block == false) {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("fire") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("fire")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("fire") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals("fire")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_second).equals("fire") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_third).equals("fire")) {
					FireSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("air") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("air")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("air") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals("air")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_second).equals("air") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_third).equals("air")) {
					AirSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("earth") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("earth")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("earth") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals("earth")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_second).equals("earth") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_third).equals("earth")) {
					EarthSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("water") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("water")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("water") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals("water")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_second).equals("water") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_third).equals("water")) {
					WaterSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("ether") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("ether")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("ether") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals("ether")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_second).equals("ether") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_third).equals("ether")) {
					EtherSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("ice") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("ice")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("ice") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals("ice")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_second).equals("ice") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_third).equals("ice")) {
					IceSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("lightning") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("lightning")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("lightning") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals("lightning")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_second).equals("lightning") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_third).equals("lightning")) {
					LightningSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("sound") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("sound")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("sound") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals("sound")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_second).equals("sound") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_third).equals("sound")) {
					SoundSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("crystal") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("crystal")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("crystal") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals("crystal")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_second).equals("crystal") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_third).equals("crystal")) {
					CrystalSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("lava") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("lava")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("lava") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals("lava")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_second).equals("lava") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_third).equals("lava")) {
					LavaSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("rain") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("rain")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("rain") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals("rain")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_second).equals("rain") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_third).equals("rain")) {
					RainSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("tornado") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("tornado")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("tornado") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals("tornado")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_second).equals("tornado") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_third).equals("tornado")) {
					TornadoSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("ocean") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("ocean")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("ocean") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals("ocean")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_second).equals("ocean") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_third).equals("ocean")) {
					OceanSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("plants") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("plants")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("plants") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals("plants")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_second).equals("plants") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_third).equals("plants")) {
					PlantsSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("animals") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("animals")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("animals") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals("animals")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_second).equals("animals") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_third).equals("animals")) {
					AnimalsSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("metal") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("metal")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("metal") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals("metal")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_second).equals("metal") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_third).equals("metal")) {
					MetalSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("light") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("light")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("light") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals("light")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_second).equals("light") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_third).equals("light")) {
					LightSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("shadow") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("shadow")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("shadow") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals("shadow")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_second).equals("shadow") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_third).equals("shadow")) {
					ShadowSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("vacuum") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("vacuum")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("vacuum") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals("vacuum")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_second).equals("vacuum") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_third).equals("vacuum")) {
					VacuumSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("energy") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("energy")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("energy") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals("energy")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_second).equals("energy") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_third).equals("energy")) {
					EnergySpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("sun") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("sun")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("sun") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals("sun")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_second).equals("sun") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_third).equals("sun")) {
					SunSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("moon") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("moon")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("moon") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals("moon")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_second).equals("moon") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_third).equals("moon")) {
					MoonSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("space") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("space")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("space") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals("space")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_second).equals("space") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_third).equals("space")) {
					SpaceSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("time") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("time")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("time") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals("time")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_second).equals("time") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_third).equals("time")) {
					TimeSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("creation") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("creation")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("creation") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals("creation")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_second).equals("creation") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_third).equals("creation")) {
					CreationSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("destruction") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("destruction")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("destruction") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals("destruction")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_second).equals("destruction") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_third).equals("destruction")) {
					DestructionSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("blood") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("blood")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("blood") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals("blood")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_second).equals("blood") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_third).equals("blood")) {
					BloodSpecialAttackProcedure.execute(world, entity);
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("technology") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("technology")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("technology") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals("technology")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_second).equals("technology") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_third).equals("technology")) {
					TechnologySpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("teleportation") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("teleportation")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("teleportation") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals("teleportation")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_second).equals("teleportation") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_third).equals("teleportation")) {
					TeleportationSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("explosion") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("explosion")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("explosion") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals("explosion")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_second).equals("explosion") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_third).equals("explosion")) {
					ExplosionSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("amber") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("amber")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("amber") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals("amber")
						|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_second).equals("amber") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_third).equals("amber")) {
					AmberSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				{
					PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
					_vars.use_ability_key_var = false;
					_vars.syncPlayerVariables(entity);
				}
			}
		}
	}
}

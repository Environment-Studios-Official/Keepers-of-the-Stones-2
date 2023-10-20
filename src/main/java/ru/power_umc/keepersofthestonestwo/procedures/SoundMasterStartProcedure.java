package ru.power_umc.keepersofthestonestwo.procedures;

import ru.power_umc.keepersofthestonestwo.network.PowerModVariables;
import ru.power_umc.keepersofthestonestwo.init.PowerModItems;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandFunction;

import java.util.Optional;

public class SoundMasterStartProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = true;
			entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.active = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			Entity _ent = entity;
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
						_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "team add sound");
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
						_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "team modify sound color dark_purple");
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
						_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "team join sound @s");
			}
		}
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 40, 0, false, false));
		for (int index0 = 0; index0 < 20; index0++) {
			if (world instanceof ServerLevel _level && _level.getServer() != null) {
				Optional<CommandFunction> _fopt = _level.getServer().getFunctions().get(new ResourceLocation("power:sound_master"));
				if (_fopt.isPresent())
					_level.getServer().getFunctions().execute(_fopt.get(), new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null));
			}
		}
		if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).mergers == 0) {
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set(3, new ItemStack(PowerModItems.SOUND_ARMOR_HELMET.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(PowerModItems.SOUND_ARMOR_HELMET.get()));
				}
			}
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set(2, new ItemStack(PowerModItems.SOUND_ARMOR_CHESTPLATE.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(PowerModItems.SOUND_ARMOR_CHESTPLATE.get()));
				}
			}
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set(1, new ItemStack(PowerModItems.SOUND_ARMOR_LEGGINGS.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(PowerModItems.SOUND_ARMOR_LEGGINGS.get()));
				}
			}
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set(0, new ItemStack(PowerModItems.FIRE_ARMOR_BOOTS.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(PowerModItems.FIRE_ARMOR_BOOTS.get()));
				}
			}
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).enchant(Enchantments.BINDING_CURSE, 1);
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).enchant(Enchantments.VANISHING_CURSE, 1);
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).enchant(Enchantments.BINDING_CURSE, 1);
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).enchant(Enchantments.VANISHING_CURSE, 1);
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).enchant(Enchantments.BINDING_CURSE, 1);
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).enchant(Enchantments.VANISHING_CURSE, 1);
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).enchant(Enchantments.BINDING_CURSE, 1);
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).enchant(Enchantments.VANISHING_CURSE, 1);
			{
				double _setval = 8;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.wheel_one = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 8;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.element_id_fist = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).mergers == 1) {
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set(1, new ItemStack(PowerModItems.SOUND_ARMOR_LEGGINGS.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(PowerModItems.SOUND_ARMOR_LEGGINGS.get()));
				}
			}
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set(0, new ItemStack(PowerModItems.FIRE_ARMOR_BOOTS.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(PowerModItems.FIRE_ARMOR_BOOTS.get()));
				}
			}
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).enchant(Enchantments.BINDING_CURSE, 1);
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).enchant(Enchantments.VANISHING_CURSE, 1);
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).enchant(Enchantments.BINDING_CURSE, 1);
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).enchant(Enchantments.VANISHING_CURSE, 1);
			{
				double _setval = 8;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.wheel_two = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 8;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.element_id_second = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).mergers == 2) {
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set(1, new ItemStack(PowerModItems.SOUND_ARMOR_LEGGINGS.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(PowerModItems.SOUND_ARMOR_LEGGINGS.get()));
				}
			}
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).enchant(Enchantments.BINDING_CURSE, 1);
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).enchant(Enchantments.VANISHING_CURSE, 1);
			{
				double _setval = 8;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.wheel_three = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 8;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.element_id_third = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
						_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @s power:sound_dagger{Enchantments:[{id:binding_curse,lvl:1},{id:vanishing_curse,lvl:1}]}");
			}
		}
		(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).enchant(Enchantments.VANISHING_CURSE, 1);
	}
}
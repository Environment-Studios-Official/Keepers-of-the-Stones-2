
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.keepersofthestonestwo.init;

import ru.power_umc.keepersofthestonestwo.entity.WaterAttackProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.StoneAttackProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.SoundBombProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.MagicFireballProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.LavaAttackProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.IceAttackProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.GrassBlockAttackProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.EtherAttackProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.DirtBlockAttackProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.CobblestoneAttackProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.CobbledDeepslateAttackProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.BallLightningProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.AmethystAttackProjectileEntity;
import ru.power_umc.keepersofthestonestwo.PowerMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PowerModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, PowerMod.MODID);
	public static final RegistryObject<EntityType<MagicFireballProjectileEntity>> MAGIC_FIREBALL_PROJECTILE = register("projectile_magic_fireball_projectile",
			EntityType.Builder.<MagicFireballProjectileEntity>of(MagicFireballProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(MagicFireballProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<StoneAttackProjectileEntity>> STONE_ATTACK_PROJECTILE = register("projectile_stone_attack_projectile",
			EntityType.Builder.<StoneAttackProjectileEntity>of(StoneAttackProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(StoneAttackProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GrassBlockAttackProjectileEntity>> GRASS_BLOCK_ATTACK_PROJECTILE = register("projectile_grass_block_attack_projectile",
			EntityType.Builder.<GrassBlockAttackProjectileEntity>of(GrassBlockAttackProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(GrassBlockAttackProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DirtBlockAttackProjectileEntity>> DIRT_BLOCK_ATTACK_PROJECTILE = register("projectile_dirt_block_attack_projectile",
			EntityType.Builder.<DirtBlockAttackProjectileEntity>of(DirtBlockAttackProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(DirtBlockAttackProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CobblestoneAttackProjectileEntity>> COBBLESTONE_ATTACK_PROJECTILE = register("projectile_cobblestone_attack_projectile",
			EntityType.Builder.<CobblestoneAttackProjectileEntity>of(CobblestoneAttackProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(CobblestoneAttackProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CobbledDeepslateAttackProjectileEntity>> COBBLED_DEEPSLATE_ATTACK_PROJECTILE = register("projectile_cobbled_deepslate_attack_projectile",
			EntityType.Builder.<CobbledDeepslateAttackProjectileEntity>of(CobbledDeepslateAttackProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(CobbledDeepslateAttackProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WaterAttackProjectileEntity>> WATER_ATTACK_PROJECTILE = register("projectile_water_attack_projectile",
			EntityType.Builder.<WaterAttackProjectileEntity>of(WaterAttackProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(WaterAttackProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EtherAttackProjectileEntity>> ETHER_ATTACK_PROJECTILE = register("projectile_ether_attack_projectile",
			EntityType.Builder.<EtherAttackProjectileEntity>of(EtherAttackProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(EtherAttackProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<IceAttackProjectileEntity>> ICE_ATTACK_PROJECTILE = register("projectile_ice_attack_projectile", EntityType.Builder.<IceAttackProjectileEntity>of(IceAttackProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(IceAttackProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BallLightningProjectileEntity>> BALL_LIGHTNING_PROJECTILE = register("projectile_ball_lightning_projectile",
			EntityType.Builder.<BallLightningProjectileEntity>of(BallLightningProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(BallLightningProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AmethystAttackProjectileEntity>> AMETHYST_ATTACK_PROJECTILE = register("projectile_amethyst_attack_projectile",
			EntityType.Builder.<AmethystAttackProjectileEntity>of(AmethystAttackProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(AmethystAttackProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LavaAttackProjectileEntity>> LAVA_ATTACK_PROJECTILE = register("projectile_lava_attack_projectile", EntityType.Builder.<LavaAttackProjectileEntity>of(LavaAttackProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(LavaAttackProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SoundBombProjectileEntity>> SOUND_BOMB_PROJECTILE = register("projectile_sound_bomb_projectile", EntityType.Builder.<SoundBombProjectileEntity>of(SoundBombProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(SoundBombProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}
}
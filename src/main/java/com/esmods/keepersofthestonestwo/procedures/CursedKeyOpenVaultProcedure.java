package com.esmods.keepersofthestonestwo.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import com.esmods.keepersofthestonestwo.init.PowerModBlocks;
import com.esmods.keepersofthestonestwo.PowerMod;

public class CursedKeyOpenVaultProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double particleRadius = 0;
		double particleAmount = 0;
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == PowerModBlocks.CURSED_VAULT.get()) {
			if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), (entity.getStringUUID())) == 0 && new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "Opened") == 0) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble((entity.getStringUUID()), 24000);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("Opened", 60);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("power:backport.block.vault.insert")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("power:backport.block.vault.insert")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					{
						ItemStack _ist = itemstack;
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
				}
				new Object() {
					void timedLoop(int current, int total, int ticks) {
						if (!world.isClientSide() && world.getServer() != null) {
							BlockPos _bpLootTblWorld = new BlockPos(x, y, z);
							for (ItemStack itemstackiterator : world.getServer().getLootTables().get(new ResourceLocation("power:chests/cursed_castle_vaults")).getRandomItems(
									new LootContext.Builder((ServerLevel) world).withParameter(LootContextParams.ORIGIN, Vec3.atCenterOf(_bpLootTblWorld)).withParameter(LootContextParams.BLOCK_STATE, world.getBlockState(_bpLootTblWorld))
											.withOptionalParameter(LootContextParams.BLOCK_ENTITY, world.getBlockEntity(_bpLootTblWorld)).create(LootContextParamSets.EMPTY))) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 1), (z + 0.5), itemstackiterator);
									entityToSpawn.setPickUpDelay(10);
									entityToSpawn.setUnlimitedLifetime();
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x + 0.5, y + 1, z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("power:backport.block.vault.eject")), SoundSource.BLOCKS, 1, 1);
							} else {
								_level.playLocalSound((x + 0.5), (y + 1), (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("power:backport.block.vault.eject")), SoundSource.BLOCKS, 1, 1, false);
							}
						}
						final int tick2 = ticks;
						PowerMod.queueServerWork(tick2, () -> {
							if (total > current + 1) {
								timedLoop(current + 1, total, tick2);
							}
						});
					}
				}.timedLoop(0, 5, 10);
			} else {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("power:backport.block.vault.insert_fail")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("power:backport.block.vault.insert_fail")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
			}
		}
	}
}

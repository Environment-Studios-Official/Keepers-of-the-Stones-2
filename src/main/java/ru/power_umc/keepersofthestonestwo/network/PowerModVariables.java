package ru.power_umc.keepersofthestonestwo.network;

import ru.power_umc.keepersofthestonestwo.PowerMod;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.network.handling.PlayPayloadContext;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.neoforge.common.util.INBTSerializable;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.client.Minecraft;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PowerModVariables {
	public static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES = DeferredRegister.create(NeoForgeRegistries.Keys.ATTACHMENT_TYPES, PowerMod.MODID);
	public static final Supplier<AttachmentType<PlayerVariables>> PLAYER_VARIABLES = ATTACHMENT_TYPES.register("player_variables", () -> AttachmentType.serializable(() -> new PlayerVariables()).build());
	public static double dev_channel = 0.0;

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		PowerMod.addNetworkMessage(SavedDataSyncMessage.ID, SavedDataSyncMessage::new, SavedDataSyncMessage::handleData);
		PowerMod.addNetworkMessage(PlayerVariablesSyncMessage.ID, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handleData);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (event.getEntity() instanceof ServerPlayer player)
				player.getData(PLAYER_VARIABLES).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (event.getEntity() instanceof ServerPlayer player)
				player.getData(PLAYER_VARIABLES).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (event.getEntity() instanceof ServerPlayer player)
				player.getData(PLAYER_VARIABLES).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			PlayerVariables original = event.getOriginal().getData(PLAYER_VARIABLES);
			PlayerVariables clone = new PlayerVariables();
			clone.selected = original.selected;
			clone.attack = original.attack;
			clone.element_id_fist = original.element_id_fist;
			clone.element_id_second = original.element_id_second;
			clone.element_id_third = original.element_id_third;
			clone.battery = original.battery;
			clone.zeroing = original.zeroing;
			if (!event.isWasDeath()) {
				clone.active = original.active;
				clone.power = original.power;
				clone.powerTimer = original.powerTimer;
				clone.mergers = original.mergers;
				clone.ability_block = original.ability_block;
			}
			event.getEntity().setData(PLAYER_VARIABLES, clone);
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (event.getEntity() instanceof ServerPlayer player) {
				SavedData mapdata = MapVariables.get(event.getEntity().level());
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (mapdata != null)
					PacketDistributor.PLAYER.with(player).send(new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					PacketDistributor.PLAYER.with(player).send(new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (event.getEntity() instanceof ServerPlayer player) {
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (worlddata != null)
					PacketDistributor.PLAYER.with(player).send(new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "power_worldvars";

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				PacketDistributor.DIMENSION.with(level.dimension()).send(new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(new SavedData.Factory<>(WorldVariables::new, WorldVariables::load), DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "power_mapvars";
		public boolean fire_stone = false;
		public boolean air_stone = false;
		public boolean earth_stone = false;
		public boolean water_stone = false;
		public boolean ether_stone = false;
		public boolean ice_stone = false;
		public boolean lightning_stone = false;
		public boolean sound_stone = false;
		public boolean crystal_stone = false;
		public boolean lava_stone = false;
		public boolean rain_stone = false;
		public boolean tornado_stone = false;
		public boolean ocean_stone = false;
		public boolean plants_stone = false;
		public boolean animals_stone = false;
		public boolean metal_stone = false;
		public boolean light_stone = false;
		public boolean shadow_stone = false;
		public boolean vacuum_stone = false;
		public boolean energy_stone = false;
		public boolean sun_stone = false;
		public boolean moon_stone = false;
		public boolean space_stone = false;
		public boolean time_stone = false;
		public boolean blood_stone = false;
		public boolean technology_stone = false;
		public boolean teleportation_stone = false;
		public boolean explosion_stone = false;
		public boolean amber_stone = false;
		public boolean creation_stone = false;
		public boolean destruction_stone = false;
		public boolean mist_stone = false;
		public boolean sand_stone = false;
		public boolean speed_stone = false;
		public boolean poison_stone = false;
		public boolean magnet_stone = false;
		public boolean mushrooms_stone = false;
		public boolean mercury_stone = false;
		public boolean music_stone = false;
		public boolean plague_stone = false;
		public boolean blue_fire_stone = false;
		public boolean gravity_stone = false;
		public boolean smoke_stone = false;
		public boolean spirit_stone = false;
		public boolean form_stone = false;
		public boolean mind_stone = false;
		public boolean golden_dust_stone = false;
		public boolean darkness_stone = false;

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			fire_stone = nbt.getBoolean("fire_stone");
			air_stone = nbt.getBoolean("air_stone");
			earth_stone = nbt.getBoolean("earth_stone");
			water_stone = nbt.getBoolean("water_stone");
			ether_stone = nbt.getBoolean("ether_stone");
			ice_stone = nbt.getBoolean("ice_stone");
			lightning_stone = nbt.getBoolean("lightning_stone");
			sound_stone = nbt.getBoolean("sound_stone");
			crystal_stone = nbt.getBoolean("crystal_stone");
			lava_stone = nbt.getBoolean("lava_stone");
			rain_stone = nbt.getBoolean("rain_stone");
			tornado_stone = nbt.getBoolean("tornado_stone");
			ocean_stone = nbt.getBoolean("ocean_stone");
			plants_stone = nbt.getBoolean("plants_stone");
			animals_stone = nbt.getBoolean("animals_stone");
			metal_stone = nbt.getBoolean("metal_stone");
			light_stone = nbt.getBoolean("light_stone");
			shadow_stone = nbt.getBoolean("shadow_stone");
			vacuum_stone = nbt.getBoolean("vacuum_stone");
			energy_stone = nbt.getBoolean("energy_stone");
			sun_stone = nbt.getBoolean("sun_stone");
			moon_stone = nbt.getBoolean("moon_stone");
			space_stone = nbt.getBoolean("space_stone");
			time_stone = nbt.getBoolean("time_stone");
			blood_stone = nbt.getBoolean("blood_stone");
			technology_stone = nbt.getBoolean("technology_stone");
			teleportation_stone = nbt.getBoolean("teleportation_stone");
			explosion_stone = nbt.getBoolean("explosion_stone");
			amber_stone = nbt.getBoolean("amber_stone");
			creation_stone = nbt.getBoolean("creation_stone");
			destruction_stone = nbt.getBoolean("destruction_stone");
			mist_stone = nbt.getBoolean("mist_stone");
			sand_stone = nbt.getBoolean("sand_stone");
			speed_stone = nbt.getBoolean("speed_stone");
			poison_stone = nbt.getBoolean("poison_stone");
			magnet_stone = nbt.getBoolean("magnet_stone");
			mushrooms_stone = nbt.getBoolean("mushrooms_stone");
			mercury_stone = nbt.getBoolean("mercury_stone");
			music_stone = nbt.getBoolean("music_stone");
			plague_stone = nbt.getBoolean("plague_stone");
			blue_fire_stone = nbt.getBoolean("blue_fire_stone");
			gravity_stone = nbt.getBoolean("gravity_stone");
			smoke_stone = nbt.getBoolean("smoke_stone");
			spirit_stone = nbt.getBoolean("spirit_stone");
			form_stone = nbt.getBoolean("form_stone");
			mind_stone = nbt.getBoolean("mind_stone");
			golden_dust_stone = nbt.getBoolean("golden_dust_stone");
			darkness_stone = nbt.getBoolean("darkness_stone");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putBoolean("fire_stone", fire_stone);
			nbt.putBoolean("air_stone", air_stone);
			nbt.putBoolean("earth_stone", earth_stone);
			nbt.putBoolean("water_stone", water_stone);
			nbt.putBoolean("ether_stone", ether_stone);
			nbt.putBoolean("ice_stone", ice_stone);
			nbt.putBoolean("lightning_stone", lightning_stone);
			nbt.putBoolean("sound_stone", sound_stone);
			nbt.putBoolean("crystal_stone", crystal_stone);
			nbt.putBoolean("lava_stone", lava_stone);
			nbt.putBoolean("rain_stone", rain_stone);
			nbt.putBoolean("tornado_stone", tornado_stone);
			nbt.putBoolean("ocean_stone", ocean_stone);
			nbt.putBoolean("plants_stone", plants_stone);
			nbt.putBoolean("animals_stone", animals_stone);
			nbt.putBoolean("metal_stone", metal_stone);
			nbt.putBoolean("light_stone", light_stone);
			nbt.putBoolean("shadow_stone", shadow_stone);
			nbt.putBoolean("vacuum_stone", vacuum_stone);
			nbt.putBoolean("energy_stone", energy_stone);
			nbt.putBoolean("sun_stone", sun_stone);
			nbt.putBoolean("moon_stone", moon_stone);
			nbt.putBoolean("space_stone", space_stone);
			nbt.putBoolean("time_stone", time_stone);
			nbt.putBoolean("blood_stone", blood_stone);
			nbt.putBoolean("technology_stone", technology_stone);
			nbt.putBoolean("teleportation_stone", teleportation_stone);
			nbt.putBoolean("explosion_stone", explosion_stone);
			nbt.putBoolean("amber_stone", amber_stone);
			nbt.putBoolean("creation_stone", creation_stone);
			nbt.putBoolean("destruction_stone", destruction_stone);
			nbt.putBoolean("mist_stone", mist_stone);
			nbt.putBoolean("sand_stone", sand_stone);
			nbt.putBoolean("speed_stone", speed_stone);
			nbt.putBoolean("poison_stone", poison_stone);
			nbt.putBoolean("magnet_stone", magnet_stone);
			nbt.putBoolean("mushrooms_stone", mushrooms_stone);
			nbt.putBoolean("mercury_stone", mercury_stone);
			nbt.putBoolean("music_stone", music_stone);
			nbt.putBoolean("plague_stone", plague_stone);
			nbt.putBoolean("blue_fire_stone", blue_fire_stone);
			nbt.putBoolean("gravity_stone", gravity_stone);
			nbt.putBoolean("smoke_stone", smoke_stone);
			nbt.putBoolean("spirit_stone", spirit_stone);
			nbt.putBoolean("form_stone", form_stone);
			nbt.putBoolean("mind_stone", mind_stone);
			nbt.putBoolean("golden_dust_stone", golden_dust_stone);
			nbt.putBoolean("darkness_stone", darkness_stone);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				PacketDistributor.ALL.noArg().send(new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(new SavedData.Factory<>(MapVariables::new, MapVariables::load), DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage implements CustomPacketPayload {
		public static final ResourceLocation ID = new ResourceLocation(PowerMod.MODID, "saved_data_sync");
		private final int type;
		private SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			CompoundTag nbt = buffer.readNbt();
			if (nbt != null) {
				this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
				if (this.data instanceof MapVariables mapVariables)
					mapVariables.read(nbt);
				else if (this.data instanceof WorldVariables worldVariables)
					worldVariables.read(nbt);
			}
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		@Override
		public void write(final FriendlyByteBuf buffer) {
			buffer.writeInt(type);
			if (data != null)
				buffer.writeNbt(data.save(new CompoundTag()));
		}

		@Override
		public ResourceLocation id() {
			return ID;
		}

		public static void handleData(final SavedDataSyncMessage message, final PlayPayloadContext context) {
			if (context.flow() == PacketFlow.CLIENTBOUND && message.data != null) {
				context.workHandler().submitAsync(() -> {
					if (message.type == 0)
						MapVariables.clientSide.read(message.data.save(new CompoundTag()));
					else
						WorldVariables.clientSide.read(message.data.save(new CompoundTag()));
				}).exceptionally(e -> {
					context.packetHandler().disconnect(Component.literal(e.getMessage()));
					return null;
				});
			}
		}
	}

	public static class PlayerVariables implements INBTSerializable<CompoundTag> {
		public boolean active = false;
		public boolean selected = false;
		public double power = 0.0;
		public double powerTimer = 0.0;
		public String attack = "0";
		public double mergers = 0.0;
		public double element_id_fist = 0;
		public double element_id_second = 0;
		public double element_id_third = 0;
		public boolean battery = false;
		public boolean ability_block = false;
		public boolean zeroing = false;

		@Override
		public CompoundTag serializeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putBoolean("active", active);
			nbt.putBoolean("selected", selected);
			nbt.putDouble("power", power);
			nbt.putDouble("powerTimer", powerTimer);
			nbt.putString("attack", attack);
			nbt.putDouble("mergers", mergers);
			nbt.putDouble("element_id_fist", element_id_fist);
			nbt.putDouble("element_id_second", element_id_second);
			nbt.putDouble("element_id_third", element_id_third);
			nbt.putBoolean("battery", battery);
			nbt.putBoolean("ability_block", ability_block);
			nbt.putBoolean("zeroing", zeroing);
			return nbt;
		}

		@Override
		public void deserializeNBT(CompoundTag nbt) {
			active = nbt.getBoolean("active");
			selected = nbt.getBoolean("selected");
			power = nbt.getDouble("power");
			powerTimer = nbt.getDouble("powerTimer");
			attack = nbt.getString("attack");
			mergers = nbt.getDouble("mergers");
			element_id_fist = nbt.getDouble("element_id_fist");
			element_id_second = nbt.getDouble("element_id_second");
			element_id_third = nbt.getDouble("element_id_third");
			battery = nbt.getBoolean("battery");
			ability_block = nbt.getBoolean("ability_block");
			zeroing = nbt.getBoolean("zeroing");
		}

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				PacketDistributor.PLAYER.with(serverPlayer).send(new PlayerVariablesSyncMessage(this));
		}
	}

	public record PlayerVariablesSyncMessage(PlayerVariables data) implements CustomPacketPayload {
		public static final ResourceLocation ID = new ResourceLocation(PowerMod.MODID, "player_variables_sync");

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this(new PlayerVariables());
			this.data.deserializeNBT(buffer.readNbt());
		}

		@Override
		public void write(final FriendlyByteBuf buffer) {
			buffer.writeNbt(data.serializeNBT());
		}

		@Override
		public ResourceLocation id() {
			return ID;
		}

		public static void handleData(final PlayerVariablesSyncMessage message, final PlayPayloadContext context) {
			if (context.flow() == PacketFlow.CLIENTBOUND && message.data != null) {
				context.workHandler().submitAsync(() -> Minecraft.getInstance().player.getData(PLAYER_VARIABLES).deserializeNBT(message.data.serializeNBT())).exceptionally(e -> {
					context.packetHandler().disconnect(Component.literal(e.getMessage()));
					return null;
				});
			}
		}
	}
}

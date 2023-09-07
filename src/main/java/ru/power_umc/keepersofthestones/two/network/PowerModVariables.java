package ru.power_umc.keepersofthestones.two.network;

import ru.power_umc.keepersofthestones.two.PowerMod;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PowerModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		PowerMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.fire_stone = original.fire_stone;
			clone.fire = original.fire;
			clone.air_stone = original.air_stone;
			clone.air = original.air;
			clone.earth_stone = original.earth_stone;
			clone.earth = original.earth;
			clone.water_stone = original.water_stone;
			clone.water = original.water;
			clone.ether_stone = original.ether_stone;
			clone.ether = original.ether;
			clone.selected = original.selected;
			clone.attack = original.attack;
			if (!event.isWasDeath()) {
				clone.active = original.active;
				clone.power = original.power;
				clone.powerTimer = original.powerTimer;
			}
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("power", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public boolean active = false;
		public boolean fire_stone = false;
		public boolean fire = false;
		public boolean air_stone = false;
		public boolean air = false;
		public boolean earth_stone = false;
		public boolean earth = false;
		public boolean water_stone = false;
		public boolean water = false;
		public boolean ether_stone = false;
		public boolean ether = false;
		public boolean selected = false;
		public double power = 100.0;
		public double powerTimer = 50.0;
		public double attack = 1.0;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				PowerMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putBoolean("active", active);
			nbt.putBoolean("fire_stone", fire_stone);
			nbt.putBoolean("fire", fire);
			nbt.putBoolean("air_stone", air_stone);
			nbt.putBoolean("air", air);
			nbt.putBoolean("earth_stone", earth_stone);
			nbt.putBoolean("earth", earth);
			nbt.putBoolean("water_stone", water_stone);
			nbt.putBoolean("water", water);
			nbt.putBoolean("ether_stone", ether_stone);
			nbt.putBoolean("ether", ether);
			nbt.putBoolean("selected", selected);
			nbt.putDouble("power", power);
			nbt.putDouble("powerTimer", powerTimer);
			nbt.putDouble("attack", attack);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			active = nbt.getBoolean("active");
			fire_stone = nbt.getBoolean("fire_stone");
			fire = nbt.getBoolean("fire");
			air_stone = nbt.getBoolean("air_stone");
			air = nbt.getBoolean("air");
			earth_stone = nbt.getBoolean("earth_stone");
			earth = nbt.getBoolean("earth");
			water_stone = nbt.getBoolean("water_stone");
			water = nbt.getBoolean("water");
			ether_stone = nbt.getBoolean("ether_stone");
			ether = nbt.getBoolean("ether");
			selected = nbt.getBoolean("selected");
			power = nbt.getDouble("power");
			powerTimer = nbt.getDouble("powerTimer");
			attack = nbt.getDouble("attack");
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.active = message.data.active;
					variables.fire_stone = message.data.fire_stone;
					variables.fire = message.data.fire;
					variables.air_stone = message.data.air_stone;
					variables.air = message.data.air;
					variables.earth_stone = message.data.earth_stone;
					variables.earth = message.data.earth;
					variables.water_stone = message.data.water_stone;
					variables.water = message.data.water;
					variables.ether_stone = message.data.ether_stone;
					variables.ether = message.data.ether;
					variables.selected = message.data.selected;
					variables.power = message.data.power;
					variables.powerTimer = message.data.powerTimer;
					variables.attack = message.data.attack;
				}
			});
			context.setPacketHandled(true);
		}
	}
}

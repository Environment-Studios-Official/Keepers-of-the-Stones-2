/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.esmods.keepersofthestonestwo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeModificationEvent;

import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.EntityType;

import com.esmods.keepersofthestonestwo.PowerMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PowerModAttributes {
	public static final DeferredRegister<Attribute> ATTRIBUTES = DeferredRegister.create(ForgeRegistries.ATTRIBUTES, PowerMod.MODID);
	public static final RegistryObject<Attribute> FROZENINICE = ATTRIBUTES.register("frozen_in_ice", () -> (new RangedAttribute("attribute." + PowerMod.MODID + ".frozen_in_ice", 0, 0, 1)).setSyncable(true));
	public static final RegistryObject<Attribute> SEALEDINAMBER = ATTRIBUTES.register("sealed_in_amber", () -> (new RangedAttribute("attribute." + PowerMod.MODID + ".sealed_in_amber", 0, 0, 1)).setSyncable(true));

	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			ATTRIBUTES.register(FMLJavaModLoadingContext.get().getModEventBus());
		});
	}

	@SubscribeEvent
	public static void addAttributes(EntityAttributeModificationEvent event) {
		event.add(EntityType.ZOMBIE, FROZENINICE.get());
		event.add(EntityType.PLAYER, FROZENINICE.get());
		event.add(EntityType.PLAYER, SEALEDINAMBER.get());
		event.add(EntityType.ZOMBIE, SEALEDINAMBER.get());
	}
}

package com.esmods.keepersofthestonestwo.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.WidgetSprites;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

import com.esmods.keepersofthestonestwo.world.inventory.KeepersBoxGUIPart4Menu;
import com.esmods.keepersofthestonestwo.procedures.PlantsStoneCheckProcedure;
import com.esmods.keepersofthestonestwo.procedures.MetalStoneCheckProcedure;
import com.esmods.keepersofthestonestwo.procedures.EtherStoneCheckProcedure;
import com.esmods.keepersofthestonestwo.procedures.EarthStoneCheckProcedure;
import com.esmods.keepersofthestonestwo.procedures.CrystalStoneCheckProcedure;
import com.esmods.keepersofthestonestwo.procedures.CreationStoneCheckProcedure;
import com.esmods.keepersofthestonestwo.procedures.AnimalsStoneCheckProcedure;
import com.esmods.keepersofthestonestwo.procedures.AmberStoneCheckProcedure;
import com.esmods.keepersofthestonestwo.network.KeepersBoxGUIPart4ButtonMessage;

public class KeepersBoxGUIPart4Screen extends AbstractContainerScreen<KeepersBoxGUIPart4Menu> {
	private final static HashMap<String, Object> guistate = KeepersBoxGUIPart4Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_keepers_box_button_up;
	ImageButton imagebutton_keepers_box_button_down_locked;
	ImageButton imagebutton_animals_element;
	ImageButton imagebutton_crystal_element;
	ImageButton imagebutton_ether_element;
	ImageButton imagebutton_metal_element;
	ImageButton imagebutton_earth_element;
	ImageButton imagebutton_plants_element;
	ImageButton imagebutton_amber_element;

	public KeepersBoxGUIPart4Screen(KeepersBoxGUIPart4Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 267;
		this.imageHeight = 188;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (AnimalsStoneCheckProcedure.execute(world))
			if (mouseX > leftPos + 44 && mouseX < leftPos + 68 && mouseY > topPos + 64 && mouseY < topPos + 88)
				guiGraphics.renderTooltip(font, Component.translatable("gui.power.keepers_box_gui_part_4.tooltip_animals"), mouseX, mouseY);
		if (CreationStoneCheckProcedure.execute(world))
			if (mouseX > leftPos + 91 && mouseX < leftPos + 115 && mouseY > topPos + 64 && mouseY < topPos + 88)
				guiGraphics.renderTooltip(font, Component.translatable("gui.power.keepers_box_gui_part_4.tooltip_crystal"), mouseX, mouseY);
		if (EtherStoneCheckProcedure.execute(world))
			if (mouseX > leftPos + 42 && mouseX < leftPos + 66 && mouseY > topPos + 103 && mouseY < topPos + 127)
				guiGraphics.renderTooltip(font, Component.translatable("gui.power.keepers_box_gui_part_4.tooltip_ether"), mouseX, mouseY);
		if (MetalStoneCheckProcedure.execute(world))
			if (mouseX > leftPos + 133 && mouseX < leftPos + 157 && mouseY > topPos + 64 && mouseY < topPos + 88)
				guiGraphics.renderTooltip(font, Component.translatable("gui.power.keepers_box_gui_part_4.tooltip_metal"), mouseX, mouseY);
		if (EarthStoneCheckProcedure.execute(world))
			if (mouseX > leftPos + 157 && mouseX < leftPos + 181 && mouseY > topPos + 65 && mouseY < topPos + 89)
				guiGraphics.renderTooltip(font, Component.translatable("gui.power.keepers_box_gui_part_4.tooltip_earth"), mouseX, mouseY);
		if (PlantsStoneCheckProcedure.execute(world))
			if (mouseX > leftPos + 182 && mouseX < leftPos + 206 && mouseY > topPos + 65 && mouseY < topPos + 89)
				guiGraphics.renderTooltip(font, Component.translatable("gui.power.keepers_box_gui_part_4.tooltip_plants"), mouseX, mouseY);
		if (AmberStoneCheckProcedure.execute(world))
			if (mouseX > leftPos + 91 && mouseX < leftPos + 115 && mouseY > topPos + 102 && mouseY < topPos + 126)
				guiGraphics.renderTooltip(font, Component.translatable("gui.power.keepers_box_gui_part_4.tooltip_amber"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("power:textures/screens/keepers_box_gui_part_4.png"), this.leftPos + 5, this.topPos + -34, 0, 0, 240, 260, 240, 260);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		imagebutton_keepers_box_button_up = new ImageButton(this.leftPos + 209, this.topPos + 70, 18, 18,
				new WidgetSprites(new ResourceLocation("power:textures/screens/keepers_box_button_up.png"), new ResourceLocation("power:textures/screens/keepers_box_button_up_active.png")), e -> {
					if (true) {
						PacketDistributor.SERVER.noArg().send(new KeepersBoxGUIPart4ButtonMessage(0, x, y, z));
						KeepersBoxGUIPart4ButtonMessage.handleButtonAction(entity, 0, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_keepers_box_button_up", imagebutton_keepers_box_button_up);
		this.addRenderableWidget(imagebutton_keepers_box_button_up);
		imagebutton_keepers_box_button_down_locked = new ImageButton(this.leftPos + 209, this.topPos + 103, 18, 18,
				new WidgetSprites(new ResourceLocation("power:textures/screens/keepers_box_button_down_locked.png"), new ResourceLocation("power:textures/screens/keepers_box_button_down_locked.png")), e -> {
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_keepers_box_button_down_locked", imagebutton_keepers_box_button_down_locked);
		this.addRenderableWidget(imagebutton_keepers_box_button_down_locked);
		imagebutton_animals_element = new ImageButton(this.leftPos + 49, this.topPos + 69, 16, 16,
				new WidgetSprites(new ResourceLocation("power:textures/screens/animals_element.png"), new ResourceLocation("power:textures/screens/animals_element_highlighted.png")), e -> {
					if (AnimalsStoneCheckProcedure.execute(world)) {
						PacketDistributor.SERVER.noArg().send(new KeepersBoxGUIPart4ButtonMessage(2, x, y, z));
						KeepersBoxGUIPart4ButtonMessage.handleButtonAction(entity, 2, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (AnimalsStoneCheckProcedure.execute(world))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_animals_element", imagebutton_animals_element);
		this.addRenderableWidget(imagebutton_animals_element);
		imagebutton_crystal_element = new ImageButton(this.leftPos + 95, this.topPos + 69, 16, 16,
				new WidgetSprites(new ResourceLocation("power:textures/screens/crystal_element.png"), new ResourceLocation("power:textures/screens/crystal_element_highlighted.png")), e -> {
					if (CrystalStoneCheckProcedure.execute(world)) {
						PacketDistributor.SERVER.noArg().send(new KeepersBoxGUIPart4ButtonMessage(3, x, y, z));
						KeepersBoxGUIPart4ButtonMessage.handleButtonAction(entity, 3, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (CrystalStoneCheckProcedure.execute(world))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_crystal_element", imagebutton_crystal_element);
		this.addRenderableWidget(imagebutton_crystal_element);
		imagebutton_ether_element = new ImageButton(this.leftPos + 49, this.topPos + 106, 16, 16,
				new WidgetSprites(new ResourceLocation("power:textures/screens/ether_element.png"), new ResourceLocation("power:textures/screens/ether_element_highlighted.png")), e -> {
					if (EtherStoneCheckProcedure.execute(world)) {
						PacketDistributor.SERVER.noArg().send(new KeepersBoxGUIPart4ButtonMessage(4, x, y, z));
						KeepersBoxGUIPart4ButtonMessage.handleButtonAction(entity, 4, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (EtherStoneCheckProcedure.execute(world))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_ether_element", imagebutton_ether_element);
		this.addRenderableWidget(imagebutton_ether_element);
		imagebutton_metal_element = new ImageButton(this.leftPos + 138, this.topPos + 69, 16, 16,
				new WidgetSprites(new ResourceLocation("power:textures/screens/metal_element.png"), new ResourceLocation("power:textures/screens/metal_element_highlighted.png")), e -> {
					if (MetalStoneCheckProcedure.execute(world)) {
						PacketDistributor.SERVER.noArg().send(new KeepersBoxGUIPart4ButtonMessage(5, x, y, z));
						KeepersBoxGUIPart4ButtonMessage.handleButtonAction(entity, 5, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (MetalStoneCheckProcedure.execute(world))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_metal_element", imagebutton_metal_element);
		this.addRenderableWidget(imagebutton_metal_element);
		imagebutton_earth_element = new ImageButton(this.leftPos + 162, this.topPos + 69, 16, 16,
				new WidgetSprites(new ResourceLocation("power:textures/screens/earth_element.png"), new ResourceLocation("power:textures/screens/earth_element_highlighted.png")), e -> {
					if (EarthStoneCheckProcedure.execute(world)) {
						PacketDistributor.SERVER.noArg().send(new KeepersBoxGUIPart4ButtonMessage(6, x, y, z));
						KeepersBoxGUIPart4ButtonMessage.handleButtonAction(entity, 6, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (EarthStoneCheckProcedure.execute(world))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_earth_element", imagebutton_earth_element);
		this.addRenderableWidget(imagebutton_earth_element);
		imagebutton_plants_element = new ImageButton(this.leftPos + 184, this.topPos + 69, 16, 16,
				new WidgetSprites(new ResourceLocation("power:textures/screens/plants_element.png"), new ResourceLocation("power:textures/screens/plants_element_highlighted.png")), e -> {
					if (PlantsStoneCheckProcedure.execute(world)) {
						PacketDistributor.SERVER.noArg().send(new KeepersBoxGUIPart4ButtonMessage(7, x, y, z));
						KeepersBoxGUIPart4ButtonMessage.handleButtonAction(entity, 7, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (PlantsStoneCheckProcedure.execute(world))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_plants_element", imagebutton_plants_element);
		this.addRenderableWidget(imagebutton_plants_element);
		imagebutton_amber_element = new ImageButton(this.leftPos + 95, this.topPos + 106, 16, 16, 0, 0, 16, new ResourceLocation("power:textures/screens/atlas/imagebutton_amber_element.png"), 16, 32, e -> {
			if (AmberStoneCheckProcedure.execute(world)) {
				PowerMod.PACKET_HANDLER.sendToServer(new KeepersBoxGUIPart4ButtonMessage(8, x, y, z));
				KeepersBoxGUIPart4ButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (AmberStoneCheckProcedure.execute(world))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_amber_element", imagebutton_amber_element);
		this.addRenderableWidget(imagebutton_amber_element);
	}
}

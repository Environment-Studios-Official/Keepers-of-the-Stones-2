package com.esmods.keepersofthestonestwo.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesCreationMenu;
import com.esmods.keepersofthestonestwo.procedures.GetWheelTwoProcedure;
import com.esmods.keepersofthestonestwo.procedures.GetWheelThreeProcedure;
import com.esmods.keepersofthestonestwo.network.WheelAbilitiesCreationButtonMessage;
import com.esmods.keepersofthestonestwo.PowerMod;

public class WheelAbilitiesCreationScreen extends AbstractContainerScreen<WheelAbilitiesCreationMenu> {
	private final static HashMap<String, Object> guistate = WheelAbilitiesCreationMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_1;
	Button button_2;
	Button button_3;
	ImageButton imagebutton_wheel_button_1;
	ImageButton imagebutton_wheel_button_2;
	ImageButton imagebutton_wheel_button_3;

	public WheelAbilitiesCreationScreen(WheelAbilitiesCreationMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 192;
		this.imageHeight = 192;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("power:textures/screens/wheel_of_abilities.png"), this.leftPos + -1, this.topPos + 0, 0, 0, 192, 192, 192, 192);

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
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_1 = Button.builder(Component.translatable("gui.power.wheel_abilities_creation.button_1"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new WheelAbilitiesCreationButtonMessage(0, x, y, z));
				WheelAbilitiesCreationButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 78, this.topPos + 24, 30, 20).build();
		guistate.put("button:button_1", button_1);
		this.addRenderableWidget(button_1);
		button_2 = Button.builder(Component.translatable("gui.power.wheel_abilities_creation.button_2"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new WheelAbilitiesCreationButtonMessage(1, x, y, z));
				WheelAbilitiesCreationButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 142, this.topPos + 86, 30, 20).build();
		guistate.put("button:button_2", button_2);
		this.addRenderableWidget(button_2);
		button_3 = Button.builder(Component.translatable("gui.power.wheel_abilities_creation.button_3"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new WheelAbilitiesCreationButtonMessage(2, x, y, z));
				WheelAbilitiesCreationButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 80, this.topPos + 148, 30, 20).build();
		guistate.put("button:button_3", button_3);
		this.addRenderableWidget(button_3);
		imagebutton_wheel_button_1 = new ImageButton(this.leftPos + 140, this.topPos + 154, 10, 7, 0, 0, 7, new ResourceLocation("power:textures/screens/atlas/imagebutton_wheel_button_1.png"), 10, 14, e -> {
			if (GetWheelTwoProcedure.execute(entity)) {
				PowerMod.PACKET_HANDLER.sendToServer(new WheelAbilitiesCreationButtonMessage(3, x, y, z));
				WheelAbilitiesCreationButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (GetWheelTwoProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_wheel_button_1", imagebutton_wheel_button_1);
		this.addRenderableWidget(imagebutton_wheel_button_1);
		imagebutton_wheel_button_2 = new ImageButton(this.leftPos + 152, this.topPos + 154, 10, 7, 0, 0, 7, new ResourceLocation("power:textures/screens/atlas/imagebutton_wheel_button_2.png"), 10, 14, e -> {
			if (GetWheelTwoProcedure.execute(entity)) {
				PowerMod.PACKET_HANDLER.sendToServer(new WheelAbilitiesCreationButtonMessage(4, x, y, z));
				WheelAbilitiesCreationButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (GetWheelTwoProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_wheel_button_2", imagebutton_wheel_button_2);
		this.addRenderableWidget(imagebutton_wheel_button_2);
		imagebutton_wheel_button_3 = new ImageButton(this.leftPos + 164, this.topPos + 154, 10, 7, 0, 0, 7, new ResourceLocation("power:textures/screens/atlas/imagebutton_wheel_button_3.png"), 10, 14, e -> {
			if (GetWheelThreeProcedure.execute(entity)) {
				PowerMod.PACKET_HANDLER.sendToServer(new WheelAbilitiesCreationButtonMessage(5, x, y, z));
				WheelAbilitiesCreationButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (GetWheelThreeProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_wheel_button_3", imagebutton_wheel_button_3);
		this.addRenderableWidget(imagebutton_wheel_button_3);
	}
}

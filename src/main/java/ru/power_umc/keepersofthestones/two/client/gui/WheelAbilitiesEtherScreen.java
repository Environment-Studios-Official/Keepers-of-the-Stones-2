package ru.power_umc.keepersofthestones.two.client.gui;

import ru.power_umc.keepersofthestones.two.world.inventory.WheelAbilitiesEtherMenu;
import ru.power_umc.keepersofthestones.two.procedures.GetWheelTwoProcedure;
import ru.power_umc.keepersofthestones.two.procedures.GetWheelThreeProcedure;
import ru.power_umc.keepersofthestones.two.network.WheelAbilitiesEtherButtonMessage;
import ru.power_umc.keepersofthestones.two.PowerMod;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class WheelAbilitiesEtherScreen extends AbstractContainerScreen<WheelAbilitiesEtherMenu> {
	private final static HashMap<String, Object> guistate = WheelAbilitiesEtherMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_wheel_button_1;
	ImageButton imagebutton_wheel_button_2;
	ImageButton imagebutton_wheel_button_3;
	ImageButton imagebutton_ethereal_ray;
	ImageButton imagebutton_ethereal_volley;
	ImageButton imagebutton_ethereal_aura;

	public WheelAbilitiesEtherScreen(WheelAbilitiesEtherMenu container, Inventory inventory, Component text) {
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
		if (mouseX > leftPos + 84 && mouseX < leftPos + 108 && mouseY > topPos + 22 && mouseY < topPos + 46)
			guiGraphics.renderTooltip(font, Component.translatable("gui.power.wheel_abilities_ether.tooltip_ethereal_ray_uses_10_power_poin"), mouseX, mouseY);
		if (mouseX > leftPos + 144 && mouseX < leftPos + 168 && mouseY > topPos + 84 && mouseY < topPos + 108)
			guiGraphics.renderTooltip(font, Component.translatable("gui.power.wheel_abilities_ether.tooltip_ethereal_volley_uses_30_power_p"), mouseX, mouseY);
		if (mouseX > leftPos + 20 && mouseX < leftPos + 44 && mouseY > topPos + 84 && mouseY < topPos + 108)
			guiGraphics.renderTooltip(font, Component.translatable("gui.power.wheel_abilities_ether.tooltip_ethereal_aura_uses_80_power_poi"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("power:textures/screens/wheel_of_abilities.png"), this.leftPos + 0, this.topPos + 0, 0, 0, 192, 192, 192, 192);

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
		imagebutton_wheel_button_1 = new ImageButton(this.leftPos + 141, this.topPos + 154, 10, 7, 0, 0, 7, new ResourceLocation("power:textures/screens/atlas/imagebutton_wheel_button_1.png"), 10, 14, e -> {
			if (GetWheelTwoProcedure.execute(entity)) {
				PowerMod.PACKET_HANDLER.sendToServer(new WheelAbilitiesEtherButtonMessage(0, x, y, z));
				WheelAbilitiesEtherButtonMessage.handleButtonAction(entity, 0, x, y, z);
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
		imagebutton_wheel_button_2 = new ImageButton(this.leftPos + 153, this.topPos + 154, 10, 7, 0, 0, 7, new ResourceLocation("power:textures/screens/atlas/imagebutton_wheel_button_2.png"), 10, 14, e -> {
			if (GetWheelTwoProcedure.execute(entity)) {
				PowerMod.PACKET_HANDLER.sendToServer(new WheelAbilitiesEtherButtonMessage(1, x, y, z));
				WheelAbilitiesEtherButtonMessage.handleButtonAction(entity, 1, x, y, z);
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
		imagebutton_wheel_button_3 = new ImageButton(this.leftPos + 165, this.topPos + 154, 10, 7, 0, 0, 7, new ResourceLocation("power:textures/screens/atlas/imagebutton_wheel_button_3.png"), 10, 14, e -> {
			if (GetWheelThreeProcedure.execute(entity)) {
				PowerMod.PACKET_HANDLER.sendToServer(new WheelAbilitiesEtherButtonMessage(2, x, y, z));
				WheelAbilitiesEtherButtonMessage.handleButtonAction(entity, 2, x, y, z);
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
		imagebutton_ethereal_ray = new ImageButton(this.leftPos + 73, this.topPos + 12, 46, 46, 0, 0, 46, new ResourceLocation("power:textures/screens/atlas/imagebutton_ethereal_ray.png"), 46, 92, e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new WheelAbilitiesEtherButtonMessage(3, x, y, z));
				WheelAbilitiesEtherButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_ethereal_ray", imagebutton_ethereal_ray);
		this.addRenderableWidget(imagebutton_ethereal_ray);
		imagebutton_ethereal_volley = new ImageButton(this.leftPos + 134, this.topPos + 73, 46, 46, 0, 0, 46, new ResourceLocation("power:textures/screens/atlas/imagebutton_ethereal_volley.png"), 46, 92, e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new WheelAbilitiesEtherButtonMessage(4, x, y, z));
				WheelAbilitiesEtherButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_ethereal_volley", imagebutton_ethereal_volley);
		this.addRenderableWidget(imagebutton_ethereal_volley);
		imagebutton_ethereal_aura = new ImageButton(this.leftPos + 12, this.topPos + 73, 46, 46, 0, 0, 46, new ResourceLocation("power:textures/screens/atlas/imagebutton_ethereal_aura.png"), 46, 92, e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new WheelAbilitiesEtherButtonMessage(5, x, y, z));
				WheelAbilitiesEtherButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_ethereal_aura", imagebutton_ethereal_aura);
		this.addRenderableWidget(imagebutton_ethereal_aura);
	}
}

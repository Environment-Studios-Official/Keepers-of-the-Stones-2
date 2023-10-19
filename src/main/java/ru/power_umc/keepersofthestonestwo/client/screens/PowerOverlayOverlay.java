
package ru.power_umc.keepersofthestonestwo.client.screens;

import ru.power_umc.keepersofthestonestwo.procedures.GetPowerScaleProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.GetLevelProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.GetActiveProcedure;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class PowerOverlayOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (true) {
			if (GetActiveProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("power:textures/screens/power_scale_star.png"), w - 44, h - 21, 0, 0, 16, 16, 16, 16);
			}
			if (GetActiveProcedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						GetPowerScaleProcedure.execute(entity), w - 29, h - 16, -1, false);
			if (GetActiveProcedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						GetLevelProcedure.execute(entity), w - 69, h - 16, -1, false);
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}

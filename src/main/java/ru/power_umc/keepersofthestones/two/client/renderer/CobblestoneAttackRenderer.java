package ru.power_umc.keepersofthestones.two.client.renderer;

import ru.power_umc.keepersofthestones.two.entity.CobblestoneAttackEntity;
import ru.power_umc.keepersofthestones.two.client.model.Modelblock_attack;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CobblestoneAttackRenderer extends EntityRenderer<CobblestoneAttackEntity> {
	private static final ResourceLocation texture = new ResourceLocation("power:textures/entities/cobblestone_attack.png");
	private final Modelblock_attack model;

	public CobblestoneAttackRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelblock_attack(context.bakeLayer(Modelblock_attack.LAYER_LOCATION));
	}

	@Override
	public void render(CobblestoneAttackEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(CobblestoneAttackEntity entity) {
		return texture;
	}
}


package com.esmods.keepersofthestonestwo.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

import com.esmods.keepersofthestonestwo.entity.model.EnergiumGolemModel;
import com.esmods.keepersofthestonestwo.entity.EnergiumGolemEntity;

public class EnergiumGolemRenderer extends GeoEntityRenderer<EnergiumGolemEntity> {
	public EnergiumGolemRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new EnergiumGolemModel());
		this.shadowRadius = 1.5f;
	}

	@Override
	public RenderType getRenderType(EnergiumGolemEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}

	@Override
	protected float getDeathMaxRotation(EnergiumGolemEntity entityLivingBaseIn) {
		return 0.0F;
	}
}

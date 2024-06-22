
package com.esmods.keepersofthestonestwo.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

import com.esmods.keepersofthestonestwo.entity.model.TurretModel;
import com.esmods.keepersofthestonestwo.entity.TurretEntity;

public class TurretRenderer extends GeoEntityRenderer<TurretEntity> {
	public TurretRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new TurretModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(TurretEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}

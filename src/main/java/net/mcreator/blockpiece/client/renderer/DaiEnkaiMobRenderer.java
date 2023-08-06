
package net.mcreator.blockpiece.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.blockpiece.entity.DaiEnkaiMobEntity;
import net.mcreator.blockpiece.client.model.Modeldaienkai;

public class DaiEnkaiMobRenderer extends MobRenderer<DaiEnkaiMobEntity, Modeldaienkai<DaiEnkaiMobEntity>> {
	public DaiEnkaiMobRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldaienkai(context.bakeLayer(Modeldaienkai.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<DaiEnkaiMobEntity, Modeldaienkai<DaiEnkaiMobEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("blockpiece:textures/entities/daienkai.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(DaiEnkaiMobEntity entity) {
		return new ResourceLocation("blockpiece:textures/entities/daienkai.png");
	}
}

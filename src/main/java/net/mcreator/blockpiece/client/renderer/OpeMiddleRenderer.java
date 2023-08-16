
package net.mcreator.blockpiece.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.blockpiece.entity.OpeMiddleEntity;
import net.mcreator.blockpiece.client.model.ModelInvisMob;

public class OpeMiddleRenderer extends MobRenderer<OpeMiddleEntity, ModelInvisMob<OpeMiddleEntity>> {
	public OpeMiddleRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelInvisMob(context.bakeLayer(ModelInvisMob.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(OpeMiddleEntity entity) {
		return new ResourceLocation("blockpiece:textures/entities/invismob.png");
	}
}

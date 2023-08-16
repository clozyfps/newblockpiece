
package net.mcreator.blockpiece.client.renderer;

public class OpeMiddleRenderer extends MobRenderer<OpeMiddleEntity, ModelInvisMob<OpeMiddleEntity>> {

	public OpeMiddleRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelInvisMob(context.bakeLayer(ModelInvisMob.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(OpeMiddleEntity entity) {
		return new ResourceLocation("blockpiece:textures/entities/invismob.png");
	}

}

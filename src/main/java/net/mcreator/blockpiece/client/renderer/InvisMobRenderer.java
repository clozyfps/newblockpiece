
package net.mcreator.blockpiece.client.renderer;

public class InvisMobRenderer extends MobRenderer<InvisMobEntity, ModelInvisMob<InvisMobEntity>> {

	public InvisMobRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelInvisMob(context.bakeLayer(ModelInvisMob.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(InvisMobEntity entity) {
		return new ResourceLocation("blockpiece:textures/entities/invismob.png");
	}

}

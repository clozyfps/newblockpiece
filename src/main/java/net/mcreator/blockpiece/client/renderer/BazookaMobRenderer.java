
package net.mcreator.blockpiece.client.renderer;

public class BazookaMobRenderer extends MobRenderer<BazookaMobEntity, Modelbazooka<BazookaMobEntity>> {

	public BazookaMobRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbazooka(context.bakeLayer(Modelbazooka.LAYER_LOCATION)), 0f);

	}

	@Override
	public ResourceLocation getTextureLocation(BazookaMobEntity entity) {
		return new ResourceLocation("blockpiece:textures/entities/newarm.png");
	}

}

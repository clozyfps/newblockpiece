
package net.mcreator.blockpiece.client.renderer;

public class PistolMobForwardRenderer extends MobRenderer<PistolMobForwardEntity, Modellonghandfoward<PistolMobForwardEntity>> {

	public PistolMobForwardRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellonghandfoward(context.bakeLayer(Modellonghandfoward.LAYER_LOCATION)), 0f);

	}

	@Override
	public ResourceLocation getTextureLocation(PistolMobForwardEntity entity) {
		return new ResourceLocation("blockpiece:textures/entities/newarm.png");
	}

}

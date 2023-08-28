
package net.mcreator.blockpiece.client.renderer;

public class TaktSpikeRenderer extends MobRenderer<TaktSpikeEntity, Modeltaktspike<TaktSpikeEntity>> {

	public TaktSpikeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltaktspike(context.bakeLayer(Modeltaktspike.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(TaktSpikeEntity entity) {
		return new ResourceLocation("blockpiece:textures/entities/dirt.png");
	}

}

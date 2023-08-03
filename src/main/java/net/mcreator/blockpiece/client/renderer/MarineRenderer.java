
package net.mcreator.blockpiece.client.renderer;

public class MarineRenderer extends HumanoidMobRenderer<MarineEntity, HumanoidModel<MarineEntity>> {

	public MarineRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(MarineEntity entity) {
		return new ResourceLocation("blockpiece:textures/entities/one_piece_marine.png");
	}

}

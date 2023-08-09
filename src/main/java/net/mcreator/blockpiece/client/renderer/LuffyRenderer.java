
package net.mcreator.blockpiece.client.renderer;

public class LuffyRenderer extends HumanoidMobRenderer<LuffyEntity, HumanoidModel<LuffyEntity>> {

	public LuffyRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(LuffyEntity entity) {
		return new ResourceLocation("blockpiece:textures/entities/luffyskin.png");
	}

}

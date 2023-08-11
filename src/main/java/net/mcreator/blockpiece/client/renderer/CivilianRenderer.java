
package net.mcreator.blockpiece.client.renderer;

public class CivilianRenderer extends HumanoidMobRenderer<CivilianEntity, HumanoidModel<CivilianEntity>> {

	public CivilianRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(CivilianEntity entity) {
		return new ResourceLocation("blockpiece:textures/entities/civilian_4.png");
	}

}

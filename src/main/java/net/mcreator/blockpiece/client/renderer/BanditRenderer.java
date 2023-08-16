
package net.mcreator.blockpiece.client.renderer;

public class BanditRenderer extends HumanoidMobRenderer<BanditEntity, HumanoidModel<BanditEntity>> {

	public BanditRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(BanditEntity entity) {
		return new ResourceLocation("blockpiece:textures/entities/civilian_3.png");
	}

}

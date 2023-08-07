
package net.mcreator.blockpiece.client.renderer;

public class EnkaiMobRenderer extends HumanoidMobRenderer<EnkaiMobEntity, HumanoidModel<EnkaiMobEntity>> {

	public EnkaiMobRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(EnkaiMobEntity entity) {
		return new ResourceLocation("blockpiece:textures/entities/a2i2e_layer_2.png");
	}

}

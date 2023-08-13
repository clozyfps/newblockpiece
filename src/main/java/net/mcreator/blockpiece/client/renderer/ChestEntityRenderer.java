
package net.mcreator.blockpiece.client.renderer;

public class ChestEntityRenderer extends HumanoidMobRenderer<ChestEntityEntity, HumanoidModel<ChestEntityEntity>> {

	public ChestEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(ChestEntityEntity entity) {
		return new ResourceLocation("blockpiece:textures/entities/a2i2e_layer_2.png");
	}

}

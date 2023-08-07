
package net.mcreator.blockpiece.client.renderer;

public class DaiEnkaiMobRenderer extends MobRenderer<DaiEnkaiMobEntity, Modeldaienkai<DaiEnkaiMobEntity>> {

	public DaiEnkaiMobRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldaienkai(context.bakeLayer(Modeldaienkai.LAYER_LOCATION)), 0.5f);

		this.addLayer(new EyesLayer<DaiEnkaiMobEntity, Modeldaienkai<DaiEnkaiMobEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("blockpiece:textures/entities/daienkai.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(DaiEnkaiMobEntity entity) {
		return new ResourceLocation("blockpiece:textures/entities/daienkai.png");
	}

}

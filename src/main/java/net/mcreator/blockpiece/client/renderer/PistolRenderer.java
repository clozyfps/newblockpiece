package net.mcreator.blockpiece.client.renderer;

public class PistolRenderer extends EntityRenderer<PistolEntity> {

	private static final ResourceLocation texture = new ResourceLocation("blockpiece:textures/entities/newarm.png");

	private final Modelpistol model;

	public PistolRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelpistol(context.bakeLayer(Modelpistol.LAYER_LOCATION));
	}

	@Override
	public void render(PistolEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Vector3f.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Vector3f.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
		poseStack.popPose();

		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(PistolEntity entity) {
		return texture;
	}

}

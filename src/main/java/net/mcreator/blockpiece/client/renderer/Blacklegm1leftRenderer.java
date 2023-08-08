package net.mcreator.blockpiece.client.renderer;

public class Blacklegm1leftRenderer extends EntityRenderer<Blacklegm1leftEntity> {

	private static final ResourceLocation texture = new ResourceLocation("blockpiece:textures/entities/blacklegm1right.png");

	private final Modelblacklegm1left model;

	public Blacklegm1leftRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelblacklegm1left(context.bakeLayer(Modelblacklegm1left.LAYER_LOCATION));
	}

	@Override
	public void render(Blacklegm1leftEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Vector3f.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Vector3f.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
		poseStack.popPose();

		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(Blacklegm1leftEntity entity) {
		return texture;
	}

}

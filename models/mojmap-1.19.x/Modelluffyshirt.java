// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelluffyshirt<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "luffyshirt"), "main");
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;

	public Modelluffyshirt(ModelPart root) {
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 51)
						.addBox(-4.0F, 0.0F, -2.2F, 3.0F, 12.0F, 0.2F, new CubeDeformation(0.0F)).texOffs(18, 43)
						.addBox(-2.4F, 2.0F, -2.4F, 1.0F, 1.0F, 0.2F, new CubeDeformation(0.0F)).texOffs(18, 43)
						.addBox(-2.4F, 4.0F, -2.4F, 1.0F, 1.0F, 0.2F, new CubeDeformation(0.0F)).texOffs(18, 43)
						.addBox(-2.4F, 6.0F, -2.4F, 1.0F, 1.0F, 0.2F, new CubeDeformation(0.0F)).texOffs(18, 43)
						.addBox(-2.4F, 8.0F, -2.4F, 1.0F, 1.0F, 0.2F, new CubeDeformation(0.0F)).texOffs(0, 51)
						.addBox(1.0F, 0.0F, -2.2F, 3.0F, 12.0F, 0.2F, new CubeDeformation(0.0F)).texOffs(47, 0)
						.addBox(-4.0F, 0.0F, 2.0F, 8.0F, 12.0F, 0.2F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body_r1 = Body
				.addOrReplaceChild("Body_r1",
						CubeListBuilder.create().texOffs(55, 13).addBox(-2.0F, -24.0F, -4.2F, 4.0F, 12.0F, 0.2F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2",
				CubeListBuilder.create().texOffs(55, 26).addBox(-2.0F, -24.0F, -4.2F, 4.0F, 12.0F, 0.2F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3",
				CubeListBuilder.create().texOffs(42, 44)
						.addBox(1.0F, -2.0F, 24.0F, 3.0F, 4.0F, 0.2F, new CubeDeformation(0.0F)).texOffs(42, 44)
						.addBox(-4.0F, -2.0F, 24.0F, 3.0F, 4.0F, 0.2F, new CubeDeformation(0.0F)).texOffs(42, 44)
						.addBox(1.0F, -2.0F, 11.8F, 3.0F, 4.0F, 0.2F, new CubeDeformation(0.0F)).texOffs(42, 44)
						.addBox(-4.0F, -2.0F, 11.8F, 3.0F, 4.0F, 0.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(21, 59)
						.addBox(-5.0F, -2.2F, -2.0F, 4.0F, 0.2F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(-5.2F, -2.0F, -2.0F, 0.2F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(11, 51)
						.addBox(-1.0F, -2.0F, -2.0F, 0.2F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 2.0F, 0.0F));

		PartDefinition LeftArm_r1 = RightArm.addOrReplaceChild("LeftArm_r1",
				CubeListBuilder.create().texOffs(16, 9)
						.addBox(-2.2F, -6.0F, -4.1F, 0.2F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 0)
						.addBox(2.0F, -6.0F, -4.1F, 0.2F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.1F, 4.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(12, 0)
						.addBox(1.0F, -2.2F, -2.0F, 4.0F, 0.2F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(5.0F, -2.0F, -2.0F, 0.2F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 18)
						.addBox(0.8F, -2.0F, -2.0F, 0.2F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 2.0F, 0.0F));

		PartDefinition LeftArm_r2 = LeftArm.addOrReplaceChild("LeftArm_r2",
				CubeListBuilder.create().texOffs(0, 17)
						.addBox(2.0F, -6.0F, -4.1F, 0.2F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(25, 41)
						.addBox(-2.2F, -6.0F, -4.1F, 0.2F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.1F, 4.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmihawkcape<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mihawkcape"), "main");
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;

	public Modelmihawkcape(ModelPart root) {
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(36, 32)
				.addBox(3.51F, 1.0F, -2.6F, 1.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(33, 30)
				.addBox(3.51F, 1.0F, -2.601F, 1.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(33, 30).mirror()
				.addBox(-4.51F, 1.0F, -2.601F, 1.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(21, 50).addBox(-4.51F, 1.0F, -2.6F, 1.01F, 8.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1",
				CubeListBuilder.create().texOffs(35, 18).addBox(-6.5F, -0.5F, -0.5F, 9.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 0.5944F, 4.0792F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2",
				CubeListBuilder.create().texOffs(35, 29).addBox(-6.5F, -0.5F, -0.5F, 9.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -0.2836F, 4.3145F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3",
				CubeListBuilder.create().texOffs(35, 16).addBox(-6.5F, -0.5F, -0.5F, 9.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -0.9861F, 4.7201F, -0.6981F, 0.0F, 0.0F));

		PartDefinition Body_r4 = Body.addOrReplaceChild("Body_r4",
				CubeListBuilder.create().texOffs(0, 30).addBox(-0.5F, -0.5F, -2.6F, 1.0F, 1.0F, 7.1F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.7201F, -0.9861F, 0.0F, 0.0F, 0.0F, -0.6981F));

		PartDefinition Body_r5 = Body.addOrReplaceChild("Body_r5",
				CubeListBuilder.create().texOffs(17, 29).addBox(-0.5F, -0.5F, -2.6F, 1.0F, 1.0F, 7.1F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3145F, -0.2836F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Body_r6 = Body.addOrReplaceChild("Body_r6",
				CubeListBuilder.create().texOffs(26, 5).addBox(-0.5F, -0.5F, -2.6F, 1.0F, 1.0F, 7.1F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0792F, 0.5944F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition Body_r7 = Body.addOrReplaceChild("Body_r7",
				CubeListBuilder.create().texOffs(13, 5)
						.addBox(-2.4F, 0.7F, -2.65F, 1.3F, 0.6F, 1.3F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.4F, -2.1F, -2.65F, 3.0F, 2.8F, 1.3F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(0.6F, -1.8F, -2.65F, 4.9F, 1.8F, 1.3F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.6104F, 14.8514F, 4.3641F, 0.8616F, 0.1789F, -1.3225F));

		PartDefinition Body_r8 = Body.addOrReplaceChild("Body_r8",
				CubeListBuilder.create().texOffs(13, 7)
						.addBox(1.1F, 0.7F, -2.65F, 1.3F, 0.6F, 1.3F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(-0.6F, -2.1F, -2.65F, 3.0F, 2.8F, 1.3F, new CubeDeformation(0.0F)).texOffs(9, 30)
						.addBox(-5.5F, -1.8F, -2.65F, 4.9F, 1.8F, 1.3F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.6104F, 14.8514F, 4.3641F, 0.8616F, -0.1789F, 1.3225F));

		PartDefinition Body_r9 = Body.addOrReplaceChild("Body_r9",
				CubeListBuilder.create().texOffs(15, 19).addBox(-7.0F, -1.5F, -0.5F, 9.0F, 4.0F, 2.3F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, 15.4108F, 3.3677F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Body_r10 = Body.addOrReplaceChild("Body_r10",
				CubeListBuilder.create().texOffs(14, 0).addBox(-7.0F, -1.0F, -0.5F, 9.0F, 3.0F, 2.3F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, 12.2014F, 2.246F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Body_r11 = Body.addOrReplaceChild("Body_r11",
				CubeListBuilder.create().texOffs(24, 25).addBox(-7.0F, -1.0F, -0.5F, 9.0F, 2.0F, 2.3F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, 10.3082F, 1.8694F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Body_r12 = Body.addOrReplaceChild("Body_r12",
				CubeListBuilder.create().texOffs(0, 54).addBox(-0.5F, -1.5F, -2.6F, 1.0F, 4.2F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.6246F, 15.0288F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition Body_r13 = Body.addOrReplaceChild("Body_r13",
				CubeListBuilder.create().texOffs(44, 41).addBox(-0.5F, -1.0F, -2.6F, 1.0F, 3.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5028F, 11.8194F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition Body_r14 = Body.addOrReplaceChild("Body_r14",
				CubeListBuilder.create().texOffs(44, 0).addBox(-0.5F, -1.0F, -2.6F, 1.0F, 2.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1262F, 9.9262F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition Body_r15 = Body.addOrReplaceChild("Body_r15",
				CubeListBuilder.create().texOffs(13, 5).addBox(-2.2F, -3.8F, -4.5F, 1.6F, 4.8F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.382F, 1.3431F, 0.0F, 1.5708F, 0.0F));

		PartDefinition Body_r16 = Body.addOrReplaceChild("Body_r16",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.2F, -3.8F, -4.5F, 2.3F, 4.8F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.5341F, 1.4642F, -1.5708F, 1.4399F, -1.5708F));

		PartDefinition Body_r17 = Body.addOrReplaceChild("Body_r17",
				CubeListBuilder.create().texOffs(0, 19).addBox(-1.25F, -1.0F, -4.5F, 2.5F, 2.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.9414F, 3.0801F, -1.5708F, 1.3963F, -1.5708F));

		PartDefinition Body_r18 = Body.addOrReplaceChild("Body_r18",
				CubeListBuilder.create().texOffs(44, 51).addBox(-0.5F, -0.5F, -2.6F, 1.0F, 1.0F, 7.1F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.7201F, -0.9861F, 0.0F, 0.0F, 0.0F, 0.6981F));

		PartDefinition Body_r19 = Body.addOrReplaceChild("Body_r19",
				CubeListBuilder.create().texOffs(35, 0).addBox(-0.5F, -0.5F, -2.6F, 1.0F, 1.0F, 7.1F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.3145F, -0.2836F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition Body_r20 = Body.addOrReplaceChild("Body_r20",
				CubeListBuilder.create().texOffs(33, 55).addBox(-0.5F, -0.5F, -2.6F, 1.0F, 1.0F, 7.1F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0792F, 0.5944F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition Body_r21 = Body.addOrReplaceChild("Body_r21",
				CubeListBuilder.create().texOffs(30, 42).addBox(-0.5F, -1.5F, -2.6F, 1.0F, 4.2F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.6246F, 15.0288F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition Body_r22 = Body.addOrReplaceChild("Body_r22",
				CubeListBuilder.create().texOffs(0, 45).addBox(-0.5F, -1.0F, -2.6F, 1.0F, 3.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5028F, 11.8194F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition Body_r23 = Body.addOrReplaceChild("Body_r23",
				CubeListBuilder.create().texOffs(44, 8).addBox(-0.5F, -1.0F, -2.6F, 1.0F, 2.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1262F, 9.9262F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(48, 32)
						.addBox(-3.0F, -2.1F, -2.0F, 4.0F, 0.1F, 4.0F, new CubeDeformation(0.0F)).texOffs(55, 27)
						.addBox(1.0F, -2.0F, -2.0F, 0.1F, 10.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(55, 31)
						.addBox(-3.0F, -2.0F, -2.1F, 4.0F, 10.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(55, 31)
						.addBox(-3.0F, -2.0F, 2.0F, 4.0F, 10.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(55, 27)
						.addBox(-3.1F, -2.0F, -2.0F, 0.1F, 10.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(48, 32)
						.addBox(-1.0F, -2.1F, -2.0F, 4.0F, 0.1F, 4.0F, new CubeDeformation(0.0F)).texOffs(55, 27)
						.addBox(-1.1F, -2.0F, -2.0F, 0.1F, 10.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(55, 31)
						.addBox(-1.0F, -2.0F, -2.1F, 4.0F, 10.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(55, 31)
						.addBox(-1.0F, -2.0F, 2.0F, 4.0F, 10.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(55, 27)
						.addBox(3.0F, -2.0F, -2.0F, 0.1F, 10.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

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
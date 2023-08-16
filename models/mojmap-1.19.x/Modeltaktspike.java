// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeltaktspike<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "taktspike"), "main");
	private final ModelPart bb_main;

	public Modeltaktspike(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-3.5F, -18.0F, -1.0F, 7.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-5.5F, -8.0F, -3.0F, 11.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(1, 3)
						.addBox(-6.5F, 2.0F, -4.0F, 13.0F, 10.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(5, 0)
						.addBox(-7.5F, 12.0F, -5.0F, 15.0F, 10.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -20.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -1.5F, -8.0F, 17.0F, 3.0F, 16.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8093F, 0.1086F, -3.1001F, 2.9013F, -1.4347F, -2.8655F));

		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, 0.0F, -8.0F, 17.0F, 3.0F, 16.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.3749F, -0.9981F, -3.6416F, 2.6215F, -1.4183F, -2.5828F));

		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -1.5F, -8.0F, 14.0F, 2.0F, 16.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4249F, -0.5F, -7.6039F, 0.0873F, -0.5236F, 0.0F));

		PartDefinition cube_r5 = bb_main
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(0, 0).addBox(-11.0F, -1.0F, -15.0F, 14.0F, 2.0F, 16.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3491F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}
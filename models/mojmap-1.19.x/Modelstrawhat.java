// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelstrawhat<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "strawhat"), "main");
	private final ModelPart Head;

	public Modelstrawhat(ModelPart root) {
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-6.0F, -7.0F, -6.0F, 12.0F, 0.5F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 33)
						.addBox(-5.0F, -6.5F, -5.0F, 10.0F, 0.1F, 10.0F, new CubeDeformation(0.0F)).texOffs(10, 11)
						.addBox(-6.0F, -6.5F, 5.0F, 12.0F, 0.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 11)
						.addBox(-6.0F, -6.5F, -6.0F, 12.0F, 0.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
						.addBox(-4.5F, -10.0F, -4.5F, 9.0F, 2.9F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 62)
						.addBox(-4.5F, -8.4F, -4.6F, 9.0F, 1.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(0, 62)
						.addBox(-4.5F, -8.4F, 4.5F, 9.0F, 1.4F, 0.1F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1",
				CubeListBuilder.create().texOffs(0, 62)
						.addBox(-4.5F, 0.1F, 4.5F, 9.0F, 1.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(11, 11).mirror()
						.addBox(-5.0F, 2.0F, -6.0F, 10.0F, 0.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -8.5F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2",
				CubeListBuilder.create().texOffs(0, 62)
						.addBox(-4.5F, 0.1F, 4.5F, 9.0F, 1.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(11, 11)
						.addBox(-5.0F, 2.0F, -6.0F, 10.0F, 0.5F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.5F, 0.0F, 0.0F, 1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
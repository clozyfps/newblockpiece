package net.mcreator.blockpiece.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelmarinecape<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("blockpiece", "modelmarinecape"), "main");
	public final ModelPart Body;
	public final ModelPart armr;
	public final ModelPart arml;

	public Modelmarinecape(ModelPart root) {
		this.Body = root.getChild("Body");
		this.armr = root.getChild("armr");
		this.arml = root.getChild("arml");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -0.1F, -2.0F, 16.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(33, 29).addBox(0.0F, -0.2F, -1.0F, 9.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(11, 10)
						.addBox(7.0F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(53, 33).addBox(9.0F, 0.8F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(52, 52)
						.addBox(8.6F, 0.8F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(33, 33).addBox(7.1F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 6)
						.addBox(-8.1F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(11, 6).addBox(-8.0F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 25)
						.addBox(-9.0F, -0.2F, -1.0F, 9.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 6).addBox(-9.0F, 0.8F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 11)
						.addBox(-8.6F, 0.8F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(0, 6).addBox(0.0F, 0.0F, -4.2F, 0.0F, 4.0F, 4.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.1459F, 12.9543F, 2.2F, 0.0F, 0.0F, 0.2182F));
		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2", CubeListBuilder.create().texOffs(44, 33).addBox(0.0F, -1.5F, -2.0F, 0.0F, 12.0F, 4.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.2307F, 2.4943F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3",
				CubeListBuilder.create().texOffs(45, 16).addBox(-1.1F, 2.25F, -3.1F, 4.2F, 2.0F, 4.2F, new CubeDeformation(0.0F)).texOffs(0, 40).addBox(-1.0F, -7.75F, -3.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 8.75F, 5.0F, 0.5575F, -0.095F, 0.2859F));
		PartDefinition Body_r4 = Body.addOrReplaceChild("Body_r4",
				CubeListBuilder.create().texOffs(26, 48).addBox(-3.1F, 2.25F, -3.1F, 4.2F, 2.0F, 4.2F, new CubeDeformation(0.0F)).texOffs(41, 0).addBox(-3.0F, -7.75F, -3.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 8.75F, 5.0F, 0.5575F, 0.095F, -0.2859F));
		PartDefinition Body_r5 = Body.addOrReplaceChild("Body_r5", CubeListBuilder.create().texOffs(22, 6).addBox(0.0F, -5.0557F, -5.6043F, 0.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.249F, 16.1515F, 2.2323F, 1.5708F, 1.5272F, 1.789F));
		PartDefinition Body_r6 = Body.addOrReplaceChild("Body_r6", CubeListBuilder.create().texOffs(21, 29).addBox(0.0F, -5.0557F, -5.6043F, 0.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.248F, 16.1515F, 2.2333F, 1.5708F, -1.5272F, -1.789F));
		PartDefinition Body_r7 = Body.addOrReplaceChild("Body_r7", CubeListBuilder.create().texOffs(0, 28).addBox(0.0F, -2.0F, -2.0F, 0.0F, 4.0F, 4.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5787F, 14.9069F, 0.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition Body_r8 = Body.addOrReplaceChild("Body_r8", CubeListBuilder.create().texOffs(0, 6).addBox(-0.1155F, -3.5F, -2.0F, 0.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.3255F, 3.6648F, 2.2F, 0.0F, -1.5708F, -0.0873F));
		PartDefinition Body_r9 = Body.addOrReplaceChild("Body_r9", CubeListBuilder.create().texOffs(11, 18).addBox(0.1F, -3.5F, -2.0F, 0.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.3265F, 3.6647F, 2.199F, 0.0F, 1.5708F, 0.0873F));
		PartDefinition Body_r10 = Body.addOrReplaceChild("Body_r10", CubeListBuilder.create().texOffs(17, 48).addBox(0.0F, -1.5F, -2.0F, 0.0F, 12.0F, 4.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.2307F, 2.4943F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition Body_r11 = Body.addOrReplaceChild("Body_r11", CubeListBuilder.create().texOffs(11, 6).addBox(-2.1F, -24.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition Body_r12 = Body.addOrReplaceChild("Body_r12", CubeListBuilder.create().texOffs(49, 46).addBox(-0.3F, -0.5F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -0.6F, 0.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition Body_r13 = Body.addOrReplaceChild("Body_r13", CubeListBuilder.create().texOffs(43, 50).addBox(0.3F, -0.5F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.2182F));
		PartDefinition armr = partdefinition.addOrReplaceChild("armr", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition arml = partdefinition.addOrReplaceChild("arml", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armr.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arml.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}

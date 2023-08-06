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
public class Modeldaienkai<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("blockpiece", "modeldaienkai"), "main");
	public final ModelPart bone3;

	public Modeldaienkai(ModelPart root) {
		this.bone3 = root.getChild("bone3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone3 = partdefinition.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition in = bone3.addOrReplaceChild("in",
				CubeListBuilder.create().texOffs(0, 190).addBox(-17.44F, -24.8F, -17.44F, 34.88F, 4.36F, 34.88F, new CubeDeformation(0.0F)).texOffs(144, 103).addBox(-23.98F, -31.34F, -23.98F, 47.96F, 6.54F, 47.96F, new CubeDeformation(0.0F))
						.texOffs(171, 0).addBox(-17.44F, -81.48F, -17.44F, 34.88F, 4.36F, 34.88F, new CubeDeformation(0.0F)).texOffs(0, 96).addBox(-23.98F, -77.12F, -23.98F, 47.96F, 6.54F, 47.96F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-28.34F, -70.58F, -28.34F, 56.68F, 39.24F, 56.68F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -3.54F, 0.0F));
		PartDefinition out = bone3.addOrReplaceChild("out",
				CubeListBuilder.create().texOffs(122, 240).addBox(-28.34F, -70.58F, -32.7F, 56.68F, 39.24F, 4.36F, new CubeDeformation(0.0F)).texOffs(0, 229).addBox(-28.34F, -70.58F, 28.34F, 56.68F, 39.24F, 4.36F, new CubeDeformation(0.0F))
						.texOffs(288, 114).addBox(-23.98F, -77.12F, 23.98F, 47.96F, 6.54F, 4.36F, new CubeDeformation(0.0F)).texOffs(288, 103).addBox(-23.98F, -77.12F, -28.34F, 47.96F, 6.54F, 4.36F, new CubeDeformation(0.0F)).texOffs(276, 22)
						.addBox(-23.98F, -81.48F, 17.44F, 47.96F, 4.36F, 6.54F, new CubeDeformation(0.0F)).texOffs(276, 11).addBox(-23.98F, -81.48F, -23.98F, 47.96F, 4.36F, 6.54F, new CubeDeformation(0.0F)).texOffs(49, 276)
						.addBox(17.44F, -81.48F, -17.44F, 6.54F, 4.36F, 34.88F, new CubeDeformation(0.0F)).texOffs(0, 272).addBox(-23.98F, -81.48F, -17.44F, 6.54F, 4.36F, 34.88F, new CubeDeformation(0.0F)).texOffs(105, 158)
						.addBox(-17.44F, -85.84F, -17.44F, 34.88F, 4.36F, 34.88F, new CubeDeformation(0.0F)).texOffs(98, 283).addBox(-23.98F, -31.34F, 23.98F, 47.96F, 6.54F, 4.36F, new CubeDeformation(0.0F)).texOffs(262, 191)
						.addBox(-23.98F, -24.8F, 17.44F, 47.96F, 4.36F, 6.54F, new CubeDeformation(0.0F)).texOffs(276, 0).addBox(-23.98F, -24.8F, -23.98F, 47.96F, 4.36F, 6.54F, new CubeDeformation(0.0F)).texOffs(240, 205)
						.addBox(17.44F, -24.8F, -17.44F, 6.54F, 4.36F, 34.88F, new CubeDeformation(0.0F)).texOffs(244, 244).addBox(-23.98F, -24.8F, -17.44F, 6.54F, 4.36F, 34.88F, new CubeDeformation(0.0F)).texOffs(202, 283)
						.addBox(-23.98F, -31.34F, -28.34F, 47.96F, 6.54F, 4.36F, new CubeDeformation(0.0F)).texOffs(0, 151).addBox(-17.44F, -20.44F, -17.44F, 34.88F, 4.36F, 34.88F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -3.54F, 0.0F));
		PartDefinition cube_r1 = out
				.addOrReplaceChild(
						"cube_r1", CubeListBuilder.create().texOffs(210, 169).addBox(-28.34F, 50.14F, -28.34F, 56.68F, 6.54F, 4.36F, new CubeDeformation(0.0F)).texOffs(210, 180)
								.addBox(-28.34F, 4.36F, -28.34F, 56.68F, 6.54F, 4.36F, new CubeDeformation(0.0F)).texOffs(140, 197).addBox(-28.34F, 10.9F, -32.7F, 56.68F, 39.24F, 4.36F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -81.48F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r2 = out
				.addOrReplaceChild(
						"cube_r2", CubeListBuilder.create().texOffs(210, 158).addBox(-28.34F, 50.14F, -28.34F, 56.68F, 6.54F, 4.36F, new CubeDeformation(0.0F)).texOffs(224, 92)
								.addBox(-28.34F, 4.36F, -28.34F, 56.68F, 6.54F, 4.36F, new CubeDeformation(0.0F)).texOffs(228, 39).addBox(-28.34F, 10.9F, -32.7F, 56.68F, 39.24F, 4.36F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -81.48F, 0.0F, 0.0F, 1.5708F, 0.0F));
		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}

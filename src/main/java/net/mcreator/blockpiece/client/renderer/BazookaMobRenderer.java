
package net.mcreator.blockpiece.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.blockpiece.entity.BazookaMobEntity;
import net.mcreator.blockpiece.client.model.Modelbazooka;

public class BazookaMobRenderer extends MobRenderer<BazookaMobEntity, Modelbazooka<BazookaMobEntity>> {
	public BazookaMobRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbazooka(context.bakeLayer(Modelbazooka.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(BazookaMobEntity entity) {
		return new ResourceLocation("blockpiece:textures/entities/newarm.png");
	}
}

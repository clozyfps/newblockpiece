
package net.mcreator.blockpiece.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.blockpiece.entity.PistolMobForwardEntity;
import net.mcreator.blockpiece.client.model.Modellonghandfoward;

public class PistolMobForwardRenderer extends MobRenderer<PistolMobForwardEntity, Modellonghandfoward<PistolMobForwardEntity>> {
	public PistolMobForwardRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellonghandfoward(context.bakeLayer(Modellonghandfoward.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(PistolMobForwardEntity entity) {
		return new ResourceLocation("blockpiece:textures/entities/armnew.png");
	}
}

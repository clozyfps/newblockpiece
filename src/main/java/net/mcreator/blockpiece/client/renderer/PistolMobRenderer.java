
package net.mcreator.blockpiece.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.blockpiece.entity.PistolMobEntity;
import net.mcreator.blockpiece.client.model.Modellonghandnew;

public class PistolMobRenderer extends MobRenderer<PistolMobEntity, Modellonghandnew<PistolMobEntity>> {
	public PistolMobRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellonghandnew(context.bakeLayer(Modellonghandnew.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PistolMobEntity entity) {
		return new ResourceLocation("blockpiece:textures/entities/newarm.png");
	}
}

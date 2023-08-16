
package net.mcreator.blockpiece.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.blockpiece.entity.TaktSpikeEntity;
import net.mcreator.blockpiece.client.model.Modeltaktspike;

public class TaktSpikeRenderer extends MobRenderer<TaktSpikeEntity, Modeltaktspike<TaktSpikeEntity>> {
	public TaktSpikeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltaktspike(context.bakeLayer(Modeltaktspike.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TaktSpikeEntity entity) {
		return new ResourceLocation("blockpiece:textures/entities/dirt.png");
	}
}

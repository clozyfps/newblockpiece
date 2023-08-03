
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blockpiece.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.blockpiece.client.model.Modellonghandnew;
import net.mcreator.blockpiece.client.model.Modellonghandfoward;
import net.mcreator.blockpiece.client.model.Modellonghand;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class BlockpieceModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modellonghand.LAYER_LOCATION, Modellonghand::createBodyLayer);
		event.registerLayerDefinition(Modellonghandnew.LAYER_LOCATION, Modellonghandnew::createBodyLayer);
		event.registerLayerDefinition(Modellonghandfoward.LAYER_LOCATION, Modellonghandfoward::createBodyLayer);
	}
}

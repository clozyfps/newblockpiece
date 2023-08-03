
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blockpiece.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.blockpiece.client.renderer.PistolMobRenderer;
import net.mcreator.blockpiece.client.renderer.PistolMobForwardRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BlockpieceModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(BlockpieceModEntities.PISTOL_MOB_FORWARD.get(), PistolMobForwardRenderer::new);
		event.registerEntityRenderer(BlockpieceModEntities.PISTOL_MOB.get(), PistolMobRenderer::new);
	}
}

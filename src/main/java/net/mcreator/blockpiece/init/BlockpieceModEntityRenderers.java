
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blockpiece.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.blockpiece.client.renderer.PistolMobRenderer;
import net.mcreator.blockpiece.client.renderer.PistolMobForwardRenderer;
import net.mcreator.blockpiece.client.renderer.MarineRenderer;
import net.mcreator.blockpiece.client.renderer.EnkaiMobRenderer;
import net.mcreator.blockpiece.client.renderer.DaiEnkaiMobRenderer;
import net.mcreator.blockpiece.client.renderer.BazookaMobRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BlockpieceModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(BlockpieceModEntities.PISTOL_MOB_FORWARD.get(), PistolMobForwardRenderer::new);
		event.registerEntityRenderer(BlockpieceModEntities.PISTOL_MOB.get(), PistolMobRenderer::new);
		event.registerEntityRenderer(BlockpieceModEntities.BAZOOKA_MOB.get(), BazookaMobRenderer::new);
		event.registerEntityRenderer(BlockpieceModEntities.MARINE.get(), MarineRenderer::new);
		event.registerEntityRenderer(BlockpieceModEntities.HIKEN.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(BlockpieceModEntities.ENKAI_MOB.get(), EnkaiMobRenderer::new);
		event.registerEntityRenderer(BlockpieceModEntities.DAI_ENKAI_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(BlockpieceModEntities.DAI_ENKAI_MOB.get(), DaiEnkaiMobRenderer::new);
	}
}

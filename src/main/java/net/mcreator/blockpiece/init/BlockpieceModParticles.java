
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blockpiece.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.blockpiece.client.particle.WhiteDustParticleParticle;
import net.mcreator.blockpiece.client.particle.SmokeParticleParticle;
import net.mcreator.blockpiece.client.particle.RoomParticleParticle;
import net.mcreator.blockpiece.client.particle.FireParticleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BlockpieceModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.register(BlockpieceModParticleTypes.FIRE_PARTICLE.get(), FireParticleParticle::provider);
		event.register(BlockpieceModParticleTypes.SMOKE_PARTICLE.get(), SmokeParticleParticle::provider);
		event.register(BlockpieceModParticleTypes.WHITE_DUST_PARTICLE.get(), WhiteDustParticleParticle::provider);
		event.register(BlockpieceModParticleTypes.ROOM_PARTICLE.get(), RoomParticleParticle::provider);
	}
}

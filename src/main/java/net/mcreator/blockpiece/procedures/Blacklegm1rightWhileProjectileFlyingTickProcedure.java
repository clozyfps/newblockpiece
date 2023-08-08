package net.mcreator.blockpiece.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.blockpiece.init.BlockpieceModParticleTypes;
import net.mcreator.blockpiece.BlockpieceMod;

public class Blacklegm1rightWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		immediatesourceentity.setNoGravity(true);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (BlockpieceModParticleTypes.WHITE_DUST_PARTICLE.get()), x, y, z, 1, 0.1, 0.1, 0.1, 0);
		BlockpieceMod.queueServerWork(10, () -> {
			if (!immediatesourceentity.level.isClientSide())
				immediatesourceentity.discard();
		});
	}
}

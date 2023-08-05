package net.mcreator.blockpiece.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.blockpiece.init.BlockpieceModParticleTypes;

public class ExplosionBlocksTickingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (BlockpieceModParticleTypes.SMOKE_PARTICLE.get()), x, y, z, 1, 0.01, 0.01, 0.01, 0);
	}
}

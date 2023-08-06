package net.mcreator.blockpiece.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ExplosionBlocksTickingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (BlockpieceModParticleTypes.DELETED_MOD_ELEMENT.get()), x, y, z, 1, 0.01, 0.01, 0.01, 0);
	}
}

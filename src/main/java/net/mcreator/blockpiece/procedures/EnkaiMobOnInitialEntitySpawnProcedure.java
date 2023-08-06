package net.mcreator.blockpiece.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.blockpiece.BlockpieceMod;

public class EnkaiMobOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		BlockpieceMod.queueServerWork(50, () -> {
			if (!entity.level.isClientSide())
				entity.discard();
		});
	}
}

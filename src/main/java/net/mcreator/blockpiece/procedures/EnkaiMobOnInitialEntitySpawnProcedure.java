package net.mcreator.blockpiece.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

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

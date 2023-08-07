package net.mcreator.blockpiece.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class DaiEnkaiMobOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		BlockpieceMod.queueServerWork(20, () -> {
			entity.getPersistentData().putBoolean("enkaicurrent", true);
		});
		BlockpieceMod.queueServerWork(100, () -> {
			if (!entity.level.isClientSide())
				entity.discard();
		});
	}
}

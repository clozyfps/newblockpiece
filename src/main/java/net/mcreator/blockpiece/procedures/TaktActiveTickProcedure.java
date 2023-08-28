package net.mcreator.blockpiece.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class TaktActiveTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.END_ROD, (entity.getPersistentData().getDouble("activeX")), (entity.getPersistentData().getDouble("activeY")), (entity.getPersistentData().getDouble("activeZ")), 5, 0.6, 0.1, 0.6, 0);
	}
}

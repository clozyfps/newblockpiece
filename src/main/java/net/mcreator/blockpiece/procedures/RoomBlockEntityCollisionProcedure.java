package net.mcreator.blockpiece.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class RoomBlockEntityCollisionProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("inRoom")) {
			entity.getPersistentData().putBoolean("inRoom", false);
		} else {
			entity.getPersistentData().putBoolean("inRoom", true);
		}
	}
}

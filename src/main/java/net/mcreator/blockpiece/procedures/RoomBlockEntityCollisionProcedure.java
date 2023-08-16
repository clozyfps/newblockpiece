package net.mcreator.blockpiece.procedures;

import net.minecraft.world.entity.Entity;

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

package net.mcreator.blockpiece.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.blockpiece.network.BlockpieceModVariables;

public class QuestDisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean v = false;
		if (((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).QuestGoal).isEmpty()) {
			v = false;
		} else {
			v = true;
		}
		return v;
	}
}

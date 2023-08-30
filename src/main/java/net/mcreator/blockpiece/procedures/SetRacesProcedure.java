package net.mcreator.blockpiece.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.blockpiece.network.BlockpieceModVariables;

import java.util.HashMap;

public class SetRacesProcedure {
	public static void execute(Entity entity, HashMap cmdparams) {
		if (entity == null || cmdparams == null)
			return;
		if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("Human") || (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("human")) {
			{
				String _setval = "Human";
				entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Race = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}

package net.mcreator.blockpiece.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.blockpiece.network.BlockpieceModVariables;

import java.util.HashMap;

public class SetDevilFruitProcedure {
	public static void execute(Entity entity, HashMap cmdparams) {
		if (entity == null || cmdparams == null)
			return;
		if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("Gum") || (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("gum")
				|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("Gum Gum") || (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("gum gum")) {
			{
				String _setval = "Gum";
				entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.DevilFruit = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("Ope") || (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("ope")
				|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("Ope Ope") || (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("ope ope")) {
			{
				String _setval = "Ope";
				entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.DevilFruit = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}

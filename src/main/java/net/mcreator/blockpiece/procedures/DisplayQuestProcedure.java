package net.mcreator.blockpiece.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.blockpiece.network.BlockpieceModVariables;

public class DisplayQuestProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		String v = "";
		if (((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).QuestGoal).equals("Item")) {
			v = "Retrieve " + (entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).QuestItem + " - "
					+ new java.text.DecimalFormat("#").format((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).QuestProgress) + "/"
					+ new java.text.DecimalFormat("#").format((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).QuestRequirement);
		} else if (((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).QuestGoal).equals("Mob")) {
			v = "Kill " + (entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).QuestMob + "s" + " - "
					+ new java.text.DecimalFormat("#").format((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).QuestProgress) + "/"
					+ new java.text.DecimalFormat("#").format((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).QuestRequirement);
		}
		return v;
	}
}

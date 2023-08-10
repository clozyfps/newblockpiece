package net.mcreator.blockpiece.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.blockpiece.network.BlockpieceModVariables;

public class DisplayLVLProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Level : " + new java.text.DecimalFormat("#").format((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).Level);
	}
}

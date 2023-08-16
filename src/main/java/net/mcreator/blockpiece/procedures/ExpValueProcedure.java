package net.mcreator.blockpiece.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ExpValueProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return new java.text.DecimalFormat("#").format((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).Exp) + "";
	}
}

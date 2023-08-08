package net.mcreator.blockpiece.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.blockpiece.network.BlockpieceModVariables;

public class SwitchMovesetProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.isShiftKeyDown()) {
			if (((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SelectedMoveset).isEmpty()) {
				{
					String _setval = "Fighting Style";
					entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SelectedMoveset = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SelectedMoveset).equals("Fighting Style")) {
				{
					String _setval = "Devil Fruit";
					entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SelectedMoveset = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SelectedMoveset).equals("Devil Fruit")) {
				{
					String _setval = "Race";
					entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SelectedMoveset = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SelectedMoveset).equals("Race")) {
				{
					String _setval = "Fighting Style";
					entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SelectedMoveset = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else {
			if (((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SelectedMoveset).isEmpty()) {
				{
					String _setval = "Race";
					entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SelectedMoveset = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SelectedMoveset).equals("Fighting Style")) {
				{
					String _setval = "Race";
					entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SelectedMoveset = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SelectedMoveset).equals("Devil Fruit")) {
				{
					String _setval = "Fighting Style";
					entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SelectedMoveset = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SelectedMoveset).equals("Race")) {
				{
					String _setval = "Devil Fruit";
					entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SelectedMoveset = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SelectedMove).equals("Shambles (Entity)")) {
				{
					String _setval = "Shambles (Block)";
					entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SelectedMove = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SelectedMove).equals("Shambles (Block)")) {
				{
					String _setval = "Shambles (Entity)";
					entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SelectedMove = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}

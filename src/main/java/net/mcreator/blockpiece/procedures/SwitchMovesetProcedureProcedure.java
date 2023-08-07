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
				entity.getPersistentData().putString("fsMove", ((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SelectedMove));
				if ((entity.getPersistentData().getString("dfMove")).isEmpty()) {
					{
						String _setval = "Not Selected";
						entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SelectedMove = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						String _setval = entity.getPersistentData().getString("dfMove");
						entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SelectedMove = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				{
					String _setval = "Devil Fruit";
					entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SelectedMoveset = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SelectedMoveset).equals("Devil Fruit")) {
				entity.getPersistentData().putString("dfMove", ((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SelectedMove));
				if ((entity.getPersistentData().getString("raceMove")).isEmpty()) {
					{
						String _setval = "Not Selected";
						entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SelectedMove = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						String _setval = entity.getPersistentData().getString("raceMove");
						entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SelectedMove = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				{
					String _setval = "Race";
					entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SelectedMoveset = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SelectedMoveset).equals("Race")) {
				entity.getPersistentData().putString("raceMove", ((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SelectedMove));
				if ((entity.getPersistentData().getString("fsMove")).isEmpty()) {
					{
						String _setval = "Not Selected";
						entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SelectedMove = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						String _setval = entity.getPersistentData().getString("fsMove");
						entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SelectedMove = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
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
		}
	}
}

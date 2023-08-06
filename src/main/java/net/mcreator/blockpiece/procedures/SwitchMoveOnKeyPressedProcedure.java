package net.mcreator.blockpiece.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.blockpiece.network.BlockpieceModVariables;

public class SwitchMoveOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SelectedMoveset).equals("Devil Fruit")
				&& ((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).DevilFruit).equals("Gum")) {
			if (!entity.isShiftKeyDown()) {
				if ((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SwitchCurrentMove < 6) {
					{
						double _setval = (entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SwitchCurrentMove + 1;
						entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SwitchCurrentMove = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						double _setval = 1;
						entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SwitchCurrentMove = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else {
				if ((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SwitchCurrentMove <= 6
						&& (entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SwitchCurrentMove != 1) {
					{
						double _setval = (entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SwitchCurrentMove - 1;
						entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SwitchCurrentMove = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SwitchCurrentMove == 1) {
					{
						double _setval = 6;
						entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SwitchCurrentMove = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
			if ((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SwitchCurrentMove == 1) {
				{
					String _setval = "Pistol";
					entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SelectedMove = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SwitchCurrentMove == 2) {
				{
					String _setval = "Rocket";
					entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SelectedMove = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SwitchCurrentMove == 3) {
				{
					String _setval = "Bazooka";
					entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SelectedMove = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SwitchCurrentMove == 4) {
				{
					String _setval = "Gatling";
					entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SelectedMove = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SwitchCurrentMove == 5) {
				{
					String _setval = "Rifle";
					entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SelectedMove = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SwitchCurrentMove == 6) {
				{
					String _setval = "Cannon";
					entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SelectedMove = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if (((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SelectedMoveset).equals("Devil Fruit")
				&& ((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).DevilFruit).equals("Mera")) {
			if (!entity.isShiftKeyDown()) {
				if ((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SwitchCurrentMove < 4) {
					{
						double _setval = (entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SwitchCurrentMove + 1;
						entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SwitchCurrentMove = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						double _setval = 1;
						entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SwitchCurrentMove = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else {
				if ((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SwitchCurrentMove <= 4
						&& (entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SwitchCurrentMove != 1) {
					{
						double _setval = (entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SwitchCurrentMove - 1;
						entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SwitchCurrentMove = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SwitchCurrentMove == 1) {
					{
						double _setval = 4;
						entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SwitchCurrentMove = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
			if ((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SwitchCurrentMove == 1) {
				{
					String _setval = "Hiken";
					entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SelectedMove = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SwitchCurrentMove == 2) {
				{
					String _setval = "Higan";
					entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SelectedMove = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SwitchCurrentMove == 3) {
				{
					String _setval = "Enkai";
					entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SelectedMove = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SwitchCurrentMove == 4) {
				{
					String _setval = "Dai Enkai";
					entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SelectedMove = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}

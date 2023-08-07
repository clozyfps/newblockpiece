package net.mcreator.blockpiece.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.blockpiece.network.BlockpieceModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MasterySystemProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity.getPersistentData().getBoolean("usingmovedf")) {
			if ((sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).DFMastery <= 149) {
				{
					double _setval = (sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).DFMastery + 1;
					entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.DFMastery = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if ((sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).DFMastery < 25) {
					{
						double _setval = 1;
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DFMasteryMultiplier = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				} else if ((sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).DFMastery >= 25
						&& (sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).DFMastery < 50) {
					{
						double _setval = 1.2;
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DFMasteryMultiplier = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				} else if ((sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).DFMastery >= 50
						&& (sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).DFMastery < 75) {
					{
						double _setval = 1.4;
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DFMasteryMultiplier = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				} else if ((sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).DFMastery >= 75
						&& (sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).DFMastery < 100) {
					{
						double _setval = 1.6;
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DFMasteryMultiplier = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				} else if ((sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).DFMastery >= 100
						&& (sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).DFMastery < 125) {
					{
						double _setval = 1.8;
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DFMasteryMultiplier = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				} else if ((sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).DFMastery >= 125
						&& (sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).DFMastery <= 150) {
					{
						double _setval = 2;
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DFMasteryMultiplier = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				}
			} else if ((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).DFMastery == 150) {
				{
					double _setval = 150;
					entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.DFMastery = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (sourceentity.getPersistentData().getBoolean("usingmoverace")) {
			if ((sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).RaceMastery <= 149) {
				{
					double _setval = (sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).RaceMastery + 1;
					entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.RaceMastery = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if ((sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).RaceMastery < 25) {
					{
						double _setval = 1;
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.RaceMasteryMultiplier = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				} else if ((sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).RaceMastery >= 25
						&& (sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).RaceMastery < 50) {
					{
						double _setval = 1.2;
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.RaceMasteryMultiplier = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				} else if ((sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).RaceMastery >= 50
						&& (sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).RaceMastery < 75) {
					{
						double _setval = 1.4;
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.RaceMasteryMultiplier = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				} else if ((sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).RaceMastery >= 75
						&& (sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).RaceMastery < 100) {
					{
						double _setval = 1.6;
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.RaceMasteryMultiplier = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				} else if ((sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).RaceMastery >= 100
						&& (sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).RaceMastery < 125) {
					{
						double _setval = 1.8;
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.RaceMasteryMultiplier = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				} else if ((sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).RaceMastery >= 125
						&& (sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).RaceMastery <= 150) {
					{
						double _setval = 2;
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.RaceMasteryMultiplier = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				}
			} else if ((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).RaceMastery == 150) {
				{
					double _setval = 150;
					entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.RaceMasteryMultiplier = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (sourceentity.getPersistentData().getBoolean("usingmovefs")) {
			if ((sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).FSMastery <= 149) {
				{
					double _setval = (sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).FSMastery + 1;
					entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.FSMastery = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if ((sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).FSMastery < 25) {
					{
						double _setval = 1;
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.FSMasteryMultiplier = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				} else if ((sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).FSMastery >= 25
						&& (sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).FSMastery < 50) {
					{
						double _setval = 1.2;
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.FSMasteryMultiplier = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				} else if ((sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).FSMastery >= 50
						&& (sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).FSMastery < 75) {
					{
						double _setval = 1.4;
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.FSMasteryMultiplier = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				} else if ((sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).FSMastery >= 75
						&& (sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).FSMastery < 100) {
					{
						double _setval = 1.6;
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.FSMasteryMultiplier = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				} else if ((sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).FSMastery >= 100
						&& (sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).FSMastery < 125) {
					{
						double _setval = 1.8;
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.FSMasteryMultiplier = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				} else if ((sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).FSMastery >= 125
						&& (sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).FSMastery <= 150) {
					{
						double _setval = 2;
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.FSMasteryMultiplier = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				}
			} else if ((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).FSMastery == 150) {
				{
					double _setval = 150;
					entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.FSMasteryMultiplier = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}

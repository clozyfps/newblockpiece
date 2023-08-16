package net.mcreator.blockpiece.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.blockpiece.network.BlockpieceModVariables;

public class OnCivilianRightClickedProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		double rgoal = 0;
		double ritem = 0;
		double rmob = 0;
		if (((sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).QuestGoal).isEmpty()) {
			rgoal = Mth.nextInt(RandomSource.create(), 1, 2);
			if (rgoal == 1) {
				{
					String _setval = "Item";
					sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.QuestGoal = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				ritem = Mth.nextInt(RandomSource.create(), 1, 4);
				if (ritem == 1) {
					{
						String _setval = "Rotten Flesh";
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.QuestItem = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					{
						double _setval = Mth.nextInt(RandomSource.create(), 10, 15);
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.QuestRequirement = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				} else if (ritem == 2) {
					{
						String _setval = "Iron Ingot";
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.QuestItem = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					{
						double _setval = Mth.nextInt(RandomSource.create(), 4, 8);
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.QuestRequirement = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				} else if (ritem == 3) {
					{
						String _setval = "Gold Ingot";
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.QuestItem = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					{
						double _setval = Mth.nextInt(RandomSource.create(), 4, 8);
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.QuestRequirement = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				} else if (ritem == 4) {
					{
						String _setval = "Diamond";
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.QuestItem = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					{
						double _setval = Mth.nextInt(RandomSource.create(), 1, 2);
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.QuestRequirement = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				}
			} else if (rgoal == 2) {
				{
					String _setval = "Mob";
					sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.QuestGoal = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				rmob = Mth.nextInt(RandomSource.create(), 1, 2);
				if (rmob == 1) {
					{
						String _setval = "Bandit";
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.QuestMob = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					{
						double _setval = Mth.nextInt(RandomSource.create(), 4, 8);
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.QuestRequirement = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				} else if (rmob == 2) {
					{
						String _setval = "Husk";
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.QuestMob = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					{
						double _setval = Mth.nextInt(RandomSource.create(), 5, 10);
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.QuestRequirement = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				}
			}
		} else if (((sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).QuestGoal).equals("Item")) {
			if (((sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).QuestItem).equals("Rotten Flesh")
					&& (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.ROTTEN_FLESH) {
				((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
				if ((sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).QuestProgress
						+ 1 < (sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).QuestRequirement) {
					{
						double _setval = (sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).QuestProgress + 1;
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.QuestProgress = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				} else if ((sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).QuestProgress
						+ 1 == (sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).QuestRequirement) {
					{
						double _setval = 0;
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.QuestProgress = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					{
						double _setval = 0;
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.QuestRequirement = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					{
						String _setval = "";
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.QuestItem = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					{
						String _setval = "";
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.QuestGoal = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				}
			} else if (((sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).QuestItem).equals("Iron Ingot")
					&& (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.IRON_INGOT) {
				((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
				if ((sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).QuestProgress
						+ 1 < (sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).QuestRequirement) {
					{
						double _setval = (sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).QuestProgress + 1;
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.QuestProgress = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				} else if ((sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).QuestProgress
						+ 1 == (sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).QuestRequirement) {
					{
						double _setval = 0;
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.QuestProgress = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					{
						double _setval = 0;
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.QuestRequirement = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					{
						String _setval = "";
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.QuestItem = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					{
						String _setval = "";
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.QuestGoal = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				}
			} else if (((sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).QuestItem).equals("Gold Ingot")
					&& (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.GOLD_INGOT) {
				((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
				if ((sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).QuestProgress
						+ 1 < (sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).QuestRequirement) {
					{
						double _setval = (sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).QuestProgress + 1;
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.QuestProgress = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				} else if ((sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).QuestProgress
						+ 1 == (sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).QuestRequirement) {
					{
						double _setval = 0;
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.QuestProgress = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					{
						double _setval = 0;
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.QuestRequirement = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					{
						String _setval = "";
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.QuestItem = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					{
						String _setval = "";
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.QuestGoal = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				}
			} else if (((sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).QuestItem).equals("Diamond")
					&& (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.DIAMOND) {
				((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
				if ((sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).QuestProgress
						+ 1 < (sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).QuestRequirement) {
					{
						double _setval = (sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).QuestProgress + 1;
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.QuestProgress = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				} else if ((sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).QuestProgress
						+ 1 == (sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).QuestRequirement) {
					{
						double _setval = 0;
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.QuestProgress = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					{
						double _setval = 0;
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.QuestRequirement = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					{
						String _setval = "";
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.QuestItem = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					{
						String _setval = "";
						sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.QuestGoal = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				}
			}
		}
	}
}

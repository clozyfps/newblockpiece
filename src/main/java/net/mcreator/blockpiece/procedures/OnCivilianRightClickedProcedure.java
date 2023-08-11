package net.mcreator.blockpiece.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class OnCivilianRightClickedProcedure {
public static void execute(
Entity sourceentity
) {
if(
sourceentity == null
) return ;
double rgoal = 0;double ritem = 0;double rmob = 0;
if (().isEmpty()) {rgoal = Mth.nextInt(RandomSource.create(), 1, 2);if (rgoal==1) {ritem = Mth.nextInt(RandomSource.create(), 1, 4);if (ritem==1) {}else if (ritem==2) {}else if (ritem==3) {}else if (ritem==4) {}}else if (rgoal==2) {rmob = Mth.nextInt(RandomSource.create(), 1, 2);if (rmob==1) {}else if (rmob==2) {}}}else if (().equals("Item")) {if (().equals("Rotten Flesh")&&(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem():ItemStack.EMPTY).getItem() == Items.ROTTEN_FLESH) {((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem():ItemStack.EMPTY)).shrink(1);if (+1<) {}else if (+1==) {}}else if (().equals("Iron Ingot")&&(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem():ItemStack.EMPTY).getItem() == Items.IRON_INGOT) {((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem():ItemStack.EMPTY)).shrink(1);if (+1<) {}else if (+1==) {}}else if (().equals("Gold Ingot")&&(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem():ItemStack.EMPTY).getItem() == Items.GOLD_INGOT) {((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem():ItemStack.EMPTY)).shrink(1);if (+1<) {}else if (+1==) {}}else if (().equals("Diamond")&&(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem():ItemStack.EMPTY).getItem() == Items.DIAMOND) {((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem():ItemStack.EMPTY)).shrink(1);if (+1<) {}else if (+1==) {}}}
}
}

package net.mcreator.blockpiece.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class QuestHandlingProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

private static void execute(
@Nullable Event event,
Entity entity,
Entity sourceentity
) {
if(
entity == null ||
sourceentity == null
) return ;
if (sourceentity instanceof Player||sourceentity instanceof ServerPlayer) {if (().equals("Mob")) {if (().equals("Bandit")) {if (entity instanceof BanditEntity) {if (+1<) {}else if (+1==) {}}}else if (().equals("Husk")) {if (entity instanceof Husk) {if (+1<) {}else if (+1==) {}}}}}
}
}

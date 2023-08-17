package net.mcreator.blockpiece.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class StaminaRegenProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

private static void execute(
@Nullable Event event,
Entity entity
) {
if(
entity == null
) return ;
if (entity.getPersistentData().getDouble("staminaTimer")==0) {entity.getPersistentData().putDouble("staminaTimer", 20);}else if (entity.getPersistentData().getDouble("staminaTimer")>0) {entity.getPersistentData().putDouble("staminaTimer", (entity.getPersistentData().getDouble("staminaTimer")-1));}if (entity.getPersistentData().getDouble("staminaTimer")==0) {if (+2<=) {}else{}}
}
}

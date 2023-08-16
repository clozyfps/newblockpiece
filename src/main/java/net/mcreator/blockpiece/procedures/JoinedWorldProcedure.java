package net.mcreator.blockpiece.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class JoinedWorldProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

private static void execute(
@Nullable Event event,
LevelAccessor world,
double x,
double y,
double z,
Entity entity
) {
if(
entity == null
) return ;
double number_pick = 0;
if (==false) {{
if(entity instanceof ServerPlayer _ent) {
BlockPos _bpos = new BlockPos(x,y,z);
NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
@Override public Component getDisplayName() {
return Component.literal("StartGui");
}
@Override public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
return new StartGuiMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
}
}, _bpos);
}
}
if(entity instanceof ServerPlayer _player) {
Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("blockpiece:the_one_piece"));
AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
if (!_ap.isDone()) {
Iterator _iterator = _ap.getRemainingCriteria().iterator();
while(_iterator.hasNext())
_player.getAdvancements().award(_adv, (String)_iterator.next());
}
}number_pick = Mth.nextInt(RandomSource.create(), 1, 2);if (number_pick<=22) {if (number_pick==1) {}if (number_pick==2) {}}}
}
}

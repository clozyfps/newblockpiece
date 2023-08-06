
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blockpiece.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.blockpiece.network.UseMoveMessage;
import net.mcreator.blockpiece.network.SwitchMovesetMessage;
import net.mcreator.blockpiece.network.SwitchMoveMessage;
import net.mcreator.blockpiece.network.OpenMainMenuMessage;
import net.mcreator.blockpiece.BlockpieceMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class BlockpieceModKeyMappings {
	public static final KeyMapping USE_MOVE = new KeyMapping("key.blockpiece.use_move", GLFW.GLFW_KEY_F, "key.categories.bp") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				BlockpieceMod.PACKET_HANDLER.sendToServer(new UseMoveMessage(0, 0));
				UseMoveMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping SWITCH_MOVESET = new KeyMapping("key.blockpiece.switch_moveset", GLFW.GLFW_KEY_V, "key.categories.bp") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				BlockpieceMod.PACKET_HANDLER.sendToServer(new SwitchMovesetMessage(0, 0));
				SwitchMovesetMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping SWITCH_MOVE = new KeyMapping("key.blockpiece.switch_move", GLFW.GLFW_KEY_R, "key.categories.bp") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				BlockpieceMod.PACKET_HANDLER.sendToServer(new SwitchMoveMessage(0, 0));
				SwitchMoveMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping OPEN_MAIN_MENU = new KeyMapping("key.blockpiece.open_main_menu", GLFW.GLFW_KEY_M, "key.categories.ui") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				BlockpieceMod.PACKET_HANDLER.sendToServer(new OpenMainMenuMessage(0, 0));
				OpenMainMenuMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(USE_MOVE);
		event.register(SWITCH_MOVESET);
		event.register(SWITCH_MOVE);
		event.register(OPEN_MAIN_MENU);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				USE_MOVE.consumeClick();
				SWITCH_MOVESET.consumeClick();
				SWITCH_MOVE.consumeClick();
				OPEN_MAIN_MENU.consumeClick();
			}
		}
	}
}

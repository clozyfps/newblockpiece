
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blockpiece.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.blockpiece.client.gui.StartGuiScreen;
import net.mcreator.blockpiece.client.gui.MainMenuScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BlockpieceModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(BlockpieceModMenus.MAIN_MENU.get(), MainMenuScreen::new);
			MenuScreens.register(BlockpieceModMenus.START_GUI.get(), StartGuiScreen::new);
		});
	}
}

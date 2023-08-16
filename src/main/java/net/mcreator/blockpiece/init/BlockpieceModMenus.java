
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blockpiece.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.blockpiece.world.inventory.StartGuiMenu;
import net.mcreator.blockpiece.world.inventory.MainMenuMenu;
import net.mcreator.blockpiece.BlockpieceMod;

public class BlockpieceModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, BlockpieceMod.MODID);
	public static final RegistryObject<MenuType<MainMenuMenu>> MAIN_MENU = REGISTRY.register("main_menu", () -> IForgeMenuType.create(MainMenuMenu::new));
	public static final RegistryObject<MenuType<StartGuiMenu>> START_GUI = REGISTRY.register("start_gui", () -> IForgeMenuType.create(StartGuiMenu::new));
}

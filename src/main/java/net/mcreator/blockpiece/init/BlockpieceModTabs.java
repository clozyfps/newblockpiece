
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blockpiece.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class BlockpieceModTabs {
	public static CreativeModeTab TAB_BLOCK_PIECE_MOBS;

	public static void load() {
		TAB_BLOCK_PIECE_MOBS = new CreativeModeTab("tabblock_piece_mobs") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BlockpieceModItems.MARINE_SPAWN_EGG.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}

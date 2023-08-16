
package net.mcreator.blockpiece.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.blockpiece.init.BlockpieceModTabs;

public class BountyPosterItem extends Item {
	public BountyPosterItem() {
		super(new Item.Properties().tab(BlockpieceModTabs.TAB_BLOCK_PIECE_ARMOR).stacksTo(64).rarity(Rarity.COMMON));
	}
}

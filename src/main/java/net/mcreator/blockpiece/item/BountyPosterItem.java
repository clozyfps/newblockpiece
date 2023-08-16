
package net.mcreator.blockpiece.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class BountyPosterItem extends Item {

	public BountyPosterItem() {
		super(new Item.Properties().tab(BlockpieceModTabs.TAB_BLOCK_PIECE_ARMOR).stacksTo(64).rarity(Rarity.COMMON));
	}

}


package net.mcreator.blockpiece.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class BountyPosterItem extends Item {

	public BountyPosterItem() {
		super(new Item.Properties().tab(BlockpieceModTabs.TAB_BLOCK_PIECE_ITEM).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		BountyPosterRightclickedProcedure.execute();
		return ar;
	}

}

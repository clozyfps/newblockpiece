
package net.mcreator.blockpiece.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class MeraMeraFruitItemItem extends Item {

	public MeraMeraFruitItemItem() {
		super(new Item.Properties().tab(BlockpieceModTabs.TAB_BLOCK_PIECE_FRUITS).stacksTo(1).fireResistant().rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f)

				.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 60;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Mera Mera No Mi - Logia Fruit"));
	}

}


package net.mcreator.blockpiece.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.mcreator.blockpiece.procedures.MeraMeraFruitItemPlayerFinishesUsingItemProcedure;
import net.mcreator.blockpiece.init.BlockpieceModTabs;

import java.util.List;

public class MeraMeraFruitItemItem extends Item {
	public MeraMeraFruitItemItem() {
		super(new Item.Properties().tab(BlockpieceModTabs.TAB_BLOCK_PIECE_FRUITS).stacksTo(1).fireResistant().rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f).alwaysEat()

				.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 60;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Logia Type Fruit"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		MeraMeraFruitItemPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}

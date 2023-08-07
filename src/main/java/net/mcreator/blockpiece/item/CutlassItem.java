
package net.mcreator.blockpiece.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class CutlassItem extends SwordItem {
	public CutlassItem() {
		super(new Tier() {
			public int getUses() {
				return 800;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 5;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, -1f, new Item.Properties().tab(BlockpieceModTabs.TAB_DELETED_MOD_ELEMENT));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("A basic pirates cutlass"));
	}
}


package net.mcreator.blockpiece.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MesHeartItem extends Item {
	public MesHeartItem() {
		super(new Item.Properties().tab(null).stacksTo(1).fireResistant().rarity(Rarity.EPIC));
	}
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blockpiece.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.blockpiece.item.OpeOpeFruitItemItem;
import net.mcreator.blockpiece.item.MihawkCapeArmorItem;
import net.mcreator.blockpiece.item.MeraMeraFruitItemItem;
import net.mcreator.blockpiece.item.GumoGumoFruitItemItem;
import net.mcreator.blockpiece.item.ExplosionBlocksItem;
import net.mcreator.blockpiece.BlockpieceMod;

public class BlockpieceModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BlockpieceMod.MODID);
	public static final RegistryObject<Item> MIHAWK_CAPE_ARMOR_CHESTPLATE = REGISTRY.register("mihawk_cape_armor_chestplate", () -> new MihawkCapeArmorItem.Chestplate());
	public static final RegistryObject<Item> MARINE_SPAWN_EGG = REGISTRY.register("marine_spawn_egg", () -> new ForgeSpawnEggItem(BlockpieceModEntities.MARINE, -1, -16777063, new Item.Properties().tab(BlockpieceModTabs.TAB_BLOCK_PIECE_MOBS)));
	public static final RegistryObject<Item> OPE_OPE_FRUIT_ITEM = REGISTRY.register("ope_ope_fruit_item", () -> new OpeOpeFruitItemItem());
	public static final RegistryObject<Item> GUMO_GUMO_FRUIT_ITEM = REGISTRY.register("gumo_gumo_fruit_item", () -> new GumoGumoFruitItemItem());
	public static final RegistryObject<Item> MERA_MERA_FRUIT_ITEM = REGISTRY.register("mera_mera_fruit_item", () -> new MeraMeraFruitItemItem());
	public static final RegistryObject<Item> EXPLOSION_BLOCKS = REGISTRY.register("explosion_blocks", () -> new ExplosionBlocksItem());
}

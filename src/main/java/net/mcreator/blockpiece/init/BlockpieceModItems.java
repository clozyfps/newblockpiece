
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blockpiece.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.blockpiece.item.PistolItem;
import net.mcreator.blockpiece.item.OpeOpeFruitItemItem;
import net.mcreator.blockpiece.item.MihawkCapeArmorItem;
import net.mcreator.blockpiece.item.MeraMeraFruitItemItem;
import net.mcreator.blockpiece.item.LuffyFitItem;
import net.mcreator.blockpiece.item.HikenItem;
import net.mcreator.blockpiece.item.GumoGumoFruitItemItem;
import net.mcreator.blockpiece.item.ExplosionBlocksItem;
import net.mcreator.blockpiece.item.DaiEnkaiProjectileItem;
import net.mcreator.blockpiece.item.CutlassItem;
import net.mcreator.blockpiece.item.BountyPosterItem;
import net.mcreator.blockpiece.BlockpieceMod;

public class BlockpieceModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BlockpieceMod.MODID);
	public static final RegistryObject<Item> MIHAWK_CAPE_ARMOR_CHESTPLATE = REGISTRY.register("mihawk_cape_armor_chestplate", () -> new MihawkCapeArmorItem.Chestplate());
	public static final RegistryObject<Item> MARINE_SPAWN_EGG = REGISTRY.register("marine_spawn_egg", () -> new ForgeSpawnEggItem(BlockpieceModEntities.MARINE, -1, -16777063, new Item.Properties().tab(BlockpieceModTabs.TAB_BLOCK_PIECE_MOBS)));
	public static final RegistryObject<Item> OPE_OPE_FRUIT_ITEM = REGISTRY.register("ope_ope_fruit_item", () -> new OpeOpeFruitItemItem());
	public static final RegistryObject<Item> GUMO_GUMO_FRUIT_ITEM = REGISTRY.register("gumo_gumo_fruit_item", () -> new GumoGumoFruitItemItem());
	public static final RegistryObject<Item> MERA_MERA_FRUIT_ITEM = REGISTRY.register("mera_mera_fruit_item", () -> new MeraMeraFruitItemItem());
	public static final RegistryObject<Item> HIKEN = REGISTRY.register("hiken", () -> new HikenItem());
	public static final RegistryObject<Item> EXPLOSION_BLOCKS = REGISTRY.register("explosion_blocks", () -> new ExplosionBlocksItem());
	public static final RegistryObject<Item> DAI_ENKAI_PROJECTILE = REGISTRY.register("dai_enkai_projectile", () -> new DaiEnkaiProjectileItem());
	public static final RegistryObject<Item> CUTLASS = REGISTRY.register("cutlass", () -> new CutlassItem());
	public static final RegistryObject<Item> LUFFY_SPAWN_EGG = REGISTRY.register("luffy_spawn_egg", () -> new ForgeSpawnEggItem(BlockpieceModEntities.LUFFY, -3394816, -3381760, new Item.Properties().tab(BlockpieceModTabs.TAB_BLOCK_PIECE_MOBS)));
	public static final RegistryObject<Item> LUFFY_FIT_HELMET = REGISTRY.register("luffy_fit_helmet", () -> new LuffyFitItem.Helmet());
	public static final RegistryObject<Item> LUFFY_FIT_CHESTPLATE = REGISTRY.register("luffy_fit_chestplate", () -> new LuffyFitItem.Chestplate());
	public static final RegistryObject<Item> CIVILIAN_SPAWN_EGG = REGISTRY.register("civilian_spawn_egg",
			() -> new ForgeSpawnEggItem(BlockpieceModEntities.CIVILIAN, -3355444, -6710887, new Item.Properties().tab(BlockpieceModTabs.TAB_BLOCK_PIECE_MOBS)));
	public static final RegistryObject<Item> BANDIT_SPAWN_EGG = REGISTRY.register("bandit_spawn_egg", () -> new ForgeSpawnEggItem(BlockpieceModEntities.BANDIT, -3381760, -26317, new Item.Properties().tab(BlockpieceModTabs.TAB_BLOCK_PIECE_MOBS)));
	public static final RegistryObject<Item> TREASURE_CHEST = block(BlockpieceModBlocks.TREASURE_CHEST, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BOUNTY_POSTER = REGISTRY.register("bounty_poster", () -> new BountyPosterItem());
	public static final RegistryObject<Item> PISTOL = REGISTRY.register("pistol", () -> new PistolItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}

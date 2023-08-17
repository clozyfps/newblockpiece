
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blockpiece.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.blockpiece.block.TreasureChestBlock;
import net.mcreator.blockpiece.block.RoomBlockBlock;
import net.mcreator.blockpiece.BlockpieceMod;

public class BlockpieceModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BlockpieceMod.MODID);
	public static final RegistryObject<Block> TREASURE_CHEST = REGISTRY.register("treasure_chest", () -> new TreasureChestBlock());
	public static final RegistryObject<Block> ROOM_BLOCK = REGISTRY.register("room_block", () -> new RoomBlockBlock());
}

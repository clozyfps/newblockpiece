
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blockpiece.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.blockpiece.world.biome.MainWorldBiomeBiome;
import net.mcreator.blockpiece.BlockpieceMod;

public class BlockpieceModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, BlockpieceMod.MODID);
	public static final RegistryObject<Biome> MAIN_WORLD_BIOME = REGISTRY.register("main_world_biome", MainWorldBiomeBiome::createBiome);
}

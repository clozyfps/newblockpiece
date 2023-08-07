
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blockpiece.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.blockpiece.BlockpieceMod;

public class BlockpieceModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, BlockpieceMod.MODID);
	public static final RegistryObject<SimpleParticleType> FIRE_PARTICLE = REGISTRY.register("fire_particle", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> SMOKE_PARTICLE = REGISTRY.register("smoke_particle", () -> new SimpleParticleType(false));
}

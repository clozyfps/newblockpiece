
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blockpiece.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.blockpiece.potion.HiganMobEffect;
import net.mcreator.blockpiece.potion.DfCooldownMobEffect;
import net.mcreator.blockpiece.potion.DaiEnkaiMobEffect;
import net.mcreator.blockpiece.BlockpieceMod;

public class BlockpieceModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, BlockpieceMod.MODID);
	public static final RegistryObject<MobEffect> DAI_ENKAI = REGISTRY.register("dai_enkai", () -> new DaiEnkaiMobEffect());
	public static final RegistryObject<MobEffect> HIGAN = REGISTRY.register("higan", () -> new HiganMobEffect());
	public static final RegistryObject<MobEffect> DF_COOLDOWN = REGISTRY.register("df_cooldown", () -> new DfCooldownMobEffect());
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blockpiece.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.blockpiece.entity.PistolMobForwardEntity;
import net.mcreator.blockpiece.entity.PistolMobEntity;
import net.mcreator.blockpiece.entity.MarineEntity;
import net.mcreator.blockpiece.entity.HikenEntity;
import net.mcreator.blockpiece.entity.EnkaiMobEntity;
import net.mcreator.blockpiece.entity.DaiEnkaiProjectileEntity;
import net.mcreator.blockpiece.entity.DaiEnkaiMobEntity;
import net.mcreator.blockpiece.entity.BazookaMobEntity;
import net.mcreator.blockpiece.BlockpieceMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockpieceModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BlockpieceMod.MODID);
	public static final RegistryObject<EntityType<PistolMobForwardEntity>> PISTOL_MOB_FORWARD = register("pistol_mob_forward", EntityType.Builder.<PistolMobForwardEntity>of(PistolMobForwardEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PistolMobForwardEntity::new).fireImmune().sized(1f, 0f));
	public static final RegistryObject<EntityType<PistolMobEntity>> PISTOL_MOB = register("pistol_mob", EntityType.Builder.<PistolMobEntity>of(PistolMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(PistolMobEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BazookaMobEntity>> BAZOOKA_MOB = register("bazooka_mob", EntityType.Builder.<BazookaMobEntity>of(BazookaMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(BazookaMobEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MarineEntity>> MARINE = register("marine",
			EntityType.Builder.<MarineEntity>of(MarineEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MarineEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HikenEntity>> HIKEN = register("projectile_hiken",
			EntityType.Builder.<HikenEntity>of(HikenEntity::new, MobCategory.MISC).setCustomClientFactory(HikenEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EnkaiMobEntity>> ENKAI_MOB = register("enkai_mob",
			EntityType.Builder.<EnkaiMobEntity>of(EnkaiMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnkaiMobEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DaiEnkaiProjectileEntity>> DAI_ENKAI_PROJECTILE = register("projectile_dai_enkai_projectile", EntityType.Builder.<DaiEnkaiProjectileEntity>of(DaiEnkaiProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(DaiEnkaiProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DaiEnkaiMobEntity>> DAI_ENKAI_MOB = register("dai_enkai_mob", EntityType.Builder.<DaiEnkaiMobEntity>of(DaiEnkaiMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DaiEnkaiMobEntity::new).fireImmune().sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			PistolMobForwardEntity.init();
			PistolMobEntity.init();
			BazookaMobEntity.init();
			MarineEntity.init();
			EnkaiMobEntity.init();
			DaiEnkaiMobEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(PISTOL_MOB_FORWARD.get(), PistolMobForwardEntity.createAttributes().build());
		event.put(PISTOL_MOB.get(), PistolMobEntity.createAttributes().build());
		event.put(BAZOOKA_MOB.get(), BazookaMobEntity.createAttributes().build());
		event.put(MARINE.get(), MarineEntity.createAttributes().build());
		event.put(ENKAI_MOB.get(), EnkaiMobEntity.createAttributes().build());
		event.put(DAI_ENKAI_MOB.get(), DaiEnkaiMobEntity.createAttributes().build());
	}
}

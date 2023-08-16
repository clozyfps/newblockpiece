package net.mcreator.blockpiece.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.blockpiece.network.BlockpieceModVariables;
import net.mcreator.blockpiece.init.BlockpieceModMobEffects;
import net.mcreator.blockpiece.init.BlockpieceModEntities;
import net.mcreator.blockpiece.entity.PistolEntity;
import net.mcreator.blockpiece.entity.BazookaMobEntity;
import net.mcreator.blockpiece.BlockpieceMod;

public class GumProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(BlockpieceModMobEffects.DF_COOLDOWN.get()) : false)) {
			if (((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SelectedMove).equals("Pistol")) {
				entity.getPersistentData().putBoolean("usingmovedf", true);
				BlockpieceMod.queueServerWork(10, () -> {
					entity.getPersistentData().putBoolean("usingmovedf", false);
				});
				{
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level;
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
								AbstractArrow entityToSpawn = new PistolEntity(BlockpieceModEntities.PISTOL.get(), level);
								entityToSpawn.setOwner(shooter);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, 6, 2);
						_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
						_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 4, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
				}
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(BlockpieceModMobEffects.DF_COOLDOWN.get(), 50, 1, false, false));
			}
			if (((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SelectedMove).equals("Rocket")) {
				entity.getPersistentData().putBoolean("usingmovedf", true);
				BlockpieceMod.queueServerWork(45, () -> {
					entity.getPersistentData().putBoolean("usingmovedf", false);
				});
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new BazookaMobEntity(BlockpieceModEntities.BAZOOKA_MOB.get(), _level);
					entityToSpawn.moveTo(x, y, z, 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					entityToSpawn.setDeltaMovement(0, 0, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				BlockpieceMod.queueServerWork(30, () -> {
					entity.setDeltaMovement(new Vec3((2.5 * entity.getLookAngle().x), (1 * entity.getLookAngle().y), (2.5 * entity.getLookAngle().z)));
				});
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(BlockpieceModMobEffects.DF_COOLDOWN.get(), 70, 1, false, false));
			}
		}
	}
}

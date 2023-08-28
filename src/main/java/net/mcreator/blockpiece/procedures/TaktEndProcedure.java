package net.mcreator.blockpiece.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class TaktEndProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		Entity v = null;
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new TaktSpikeEntity(BlockpieceModEntities.TAKT_SPIKE.get(), _level);
			entityToSpawn.moveTo((entity.getPersistentData().getDouble("activeX")), (entity.getPersistentData().getDouble("activeY") - 3), (entity.getPersistentData().getDouble("activeZ")), 0, 0);
			entityToSpawn.setYBodyRot(0);
			entityToSpawn.setYHeadRot(0);
			entityToSpawn.setDeltaMovement(0, 0, 0);
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
		v = (Entity) world.getEntitiesOfClass(TaktSpikeEntity.class, AABB.ofSize(new Vec3(x, y, z), 50, 50, 50), e -> true).stream().sorted(new Object() {
			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
				return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
			}
		}.compareDistOf(x, y, z)).findFirst().orElse(null);
		v.setDeltaMovement(new Vec3(0, 2, 0));
		entity.getPersistentData().putBoolean("aoefirst", true);
		BlockpieceMod.queueServerWork(20, () -> {
			entity.getPersistentData().putBoolean("aoefirst", false);
		});
		{
			final Vec3 _center = new Vec3((v.getX()), (v.getY()), (v.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entity == entityiterator) || !(entityiterator == v)) {
					entityiterator.hurt(DamageSource.GENERIC, 50);
					entityiterator.getPersistentData().putBoolean("aoe", true);
				}
			}
		}
	}
}

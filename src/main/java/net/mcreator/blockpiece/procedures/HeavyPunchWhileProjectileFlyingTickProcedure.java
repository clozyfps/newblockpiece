package net.mcreator.blockpiece.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class HeavyPunchWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.POOF, x, y, z, 2, 1, 1, 1, 0.3);
		entity.getPersistentData().putBoolean("aoefirst", true);
		BlockpieceMod.queueServerWork(20, () -> {
			entity.getPersistentData().putBoolean("aoefirst", false);
		});
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entity == entityiterator)) {
					if (!(immediatesourceentity == entityiterator)) {
						entityiterator.hurt(DamageSource.GENERIC, 3);
						entityiterator.getPersistentData().putBoolean("aoe", true);
						entityiterator.setDeltaMovement(new Vec3((0.2 * immediatesourceentity.getLookAngle().x), (0 * immediatesourceentity.getLookAngle().y), (0.2 * immediatesourceentity.getLookAngle().z)));
					}
				}
			}
		}
		BlockpieceMod.queueServerWork(10, () -> {
			if (!immediatesourceentity.level.isClientSide())
				immediatesourceentity.discard();
		});
	}
}

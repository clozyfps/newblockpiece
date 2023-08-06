package net.mcreator.blockpiece.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class EnkaiTowerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xRadius = 0;
		double zRadius = 0;
		double degree = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		degree = Math.toRadians(entity.getYRot());
		xRadius = 3;
		zRadius = 3;
		for (int index0 = 0; index0 < 36; index0++) {
			x_pos = x + Math.cos(degree) * xRadius;
			y_pos = y + 0.5;
			y_pos = y + 1;
			y_pos = y + 1.5;
			y_pos = y + 2;
			y_pos = y + 2.5;
			y_pos = y + 3;
			y_pos = y + 3.5;
			y_pos = y + 4;
			y_pos = y + 4.5;
			y_pos = y + 5;
			y_pos = y + 5.5;
			y_pos = y + 6;
			y_pos = y + 6.5;
			y_pos = y + 7;
			y_pos = y + 7.5;
			y_pos = y + 8;
			y_pos = y + 8.5;
			y_pos = y + 9;
			y_pos = y + 9.5;
			y_pos = y + 10;
			y_pos = y + 10.5;
			y_pos = y + 11;
			y_pos = y + 11.5;
			y_pos = y + 12;
			y_pos = y + 12.5;
			y_pos = y + 13.5;
			y_pos = y + 14;
			y_pos = y + 14.5;
			y_pos = y + 15;
			z_pos = z + Math.sin(degree) * zRadius;
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.FLAME, x_pos, y_pos, z_pos, 2, 0.1, 0.1, 0.1, 0);
			{
				final Vec3 _center = new Vec3(x_pos, y_pos, z_pos);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator)) {
						entity.hurt(DamageSource.GENERIC, 4);
					}
				}
			}
			degree = degree + Math.toRadians(5);
		}
		degree = Math.toRadians(entity.getYRot());
		xRadius = -3;
		zRadius = -3;
		for (int index1 = 0; index1 < 36; index1++) {
			x_pos = x + Math.cos(degree) * xRadius;
			y_pos = y + 0.5;
			y_pos = y + 1;
			y_pos = y + 1.5;
			y_pos = y + 2;
			y_pos = y + 2.5;
			y_pos = y + 3;
			y_pos = y + 3.5;
			y_pos = y + 4;
			y_pos = y + 4.5;
			y_pos = y + 5;
			y_pos = y + 5.5;
			y_pos = y + 6;
			y_pos = y + 6.5;
			y_pos = y + 7;
			y_pos = y + 7.5;
			y_pos = y + 8;
			y_pos = y + 8.5;
			y_pos = y + 9;
			y_pos = y + 9.5;
			y_pos = y + 10;
			y_pos = y + 10.5;
			y_pos = y + 11;
			y_pos = y + 11.5;
			y_pos = y + 12;
			y_pos = y + 12.5;
			y_pos = y + 13.5;
			y_pos = y + 14;
			y_pos = y + 14.5;
			y_pos = y + 15;
			z_pos = z + Math.sin(degree) * zRadius;
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.FLAME, x_pos, y_pos, z_pos, 2, 0.1, 0.1, 0.1, 0);
			{
				final Vec3 _center = new Vec3(x_pos, y_pos, z_pos);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator)) {
						entity.hurt(DamageSource.GENERIC, 4);
					}
				}
			}
			degree = degree + Math.toRadians(5);
		}
	}
}

package net.mcreator.blockpiece.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class EnkaiGroundProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double xRadius = 0;
		double loop = 0;
		double zRadius = 0;
		double particleAmount = 0;
		loop = 0;
		particleAmount = 8;
		xRadius = 4;
		zRadius = 4;
		while (loop < particleAmount) {
			world.addParticle(ParticleTypes.FLAME, (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), y, (z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 0, 0.05, 0);
			loop = loop + 1;
		}
		loop = 0;
		particleAmount = 8;
		xRadius = 5;
		zRadius = 5;
		while (loop < particleAmount) {
			world.addParticle(ParticleTypes.FLAME, (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), y, (z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 0, 0.05, 0);
			loop = loop + 1;
		}
		loop = 0;
		particleAmount = 8;
		xRadius = 6;
		zRadius = 6;
		while (loop < particleAmount) {
			world.addParticle(ParticleTypes.FLAME, (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), y, (z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 0, 0.05, 0);
			loop = loop + 1;
		}
		loop = 0;
		particleAmount = 8;
		xRadius = 1;
		zRadius = 1;
		while (loop < particleAmount) {
			world.addParticle(ParticleTypes.FLAME, (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), y, (z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 0, 0.05, 0);
			loop = loop + 1;
		}
		loop = 0;
		particleAmount = 8;
		xRadius = 2;
		zRadius = 2;
		while (loop < particleAmount) {
			world.addParticle(ParticleTypes.FLAME, (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), y, (z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 0, 0.05, 0);
			loop = loop + 1;
		}
		loop = 0;
		particleAmount = 8;
		xRadius = 3;
		zRadius = 3;
		while (loop < particleAmount) {
			world.addParticle(ParticleTypes.FLAME, (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), y, (z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 0, 0.05, 0);
			loop = loop + 1;
		}
		loop = 0;
		particleAmount = 8;
		xRadius = 7;
		zRadius = 7;
		while (loop < particleAmount) {
			world.addParticle(ParticleTypes.FLAME, (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), y, (z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 0, 0.05, 0);
			loop = loop + 1;
		}
		loop = 0;
		particleAmount = 8;
		xRadius = 8;
		zRadius = 8;
		while (loop < particleAmount) {
			world.addParticle(ParticleTypes.FLAME, (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), y, (z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 0, 0.05, 0);
			loop = loop + 1;
		}
		loop = 0;
		particleAmount = 8;
		xRadius = 9;
		zRadius = 9;
		while (loop < particleAmount) {
			world.addParticle(ParticleTypes.FLAME, (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), y, (z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 0, 0.05, 0);
			loop = loop + 1;
		}
	}
}

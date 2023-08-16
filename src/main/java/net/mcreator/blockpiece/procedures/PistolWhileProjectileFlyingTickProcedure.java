package net.mcreator.blockpiece.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class PistolWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		world.addParticle(ParticleTypes.CRIT, x, y, z, 0, 0, 0);
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(
					new CommandSourceStack(CommandSource.NULL, new Vec3((immediatesourceentity.getX()), (immediatesourceentity.getY()), (immediatesourceentity.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
							.withSuppressedOutput(),
					"particle minecraft:dust 0 0 0 1 ^0 ^0 ^0 0.1 0.5 0.1 0 1");
		entity.setNoGravity(true);
	}
}

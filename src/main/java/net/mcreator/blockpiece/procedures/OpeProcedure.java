package net.mcreator.blockpiece.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.blockpiece.network.BlockpieceModVariables;
import net.mcreator.blockpiece.init.BlockpieceModBlocks;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class OpeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xRay = 0;
		double yRay = 0;
		double zRay = 0;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		if (((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SelectedMove).equals("Room")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("couldnt figure out so just put this here to fill the if block -katsu :)"), false);
		}
		xRay = entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("roomSize")))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
				.getBlockPos().getX();
		yRay = entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("roomSize")))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
				.getBlockPos().getY();
		zRay = entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("roomSize")))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
				.getBlockPos().getZ();
		if (((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SelectedMove).equals("Shambles (Entity)") && entity.getPersistentData().getBoolean("roomActive")
				&& entity.getPersistentData().getBoolean("inRoom")) {
			{
				final Vec3 _center = new Vec3(xRay, yRay, zRay);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(2 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					xPos = entity.getX();
					yPos = entity.getY();
					zPos = entity.getZ();
					{
						Entity _ent = entity;
						_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
					}
					{
						Entity _ent = entityiterator;
						_ent.teleportTo(xPos, yPos, zPos);
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(xPos, yPos, zPos, _ent.getYRot(), _ent.getXRot());
					}
				}
			}
		} else if (((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SelectedMove).equals("Shambles (Block)") && entity.getPersistentData().getBoolean("roomActive")
				&& entity.getPersistentData().getBoolean("inRoom")) {
			if (!((world.getBlockState(new BlockPos(xRay, yRay, zRay))).getBlock() == Blocks.AIR) || !((world.getBlockState(new BlockPos(xRay, yRay, zRay))).getBlock() == BlockpieceModBlocks.ROOM_BLOCK.get())) {
				world.setBlock(new BlockPos(x, y, z), (world.getBlockState(new BlockPos(xRay, yRay, zRay))), 3);
				{
					Entity _ent = entity;
					_ent.teleportTo(xRay, yRay, zRay);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(xRay, yRay, zRay, _ent.getYRot(), _ent.getXRot());
				}
				world.setBlock(new BlockPos(xRay, yRay, zRay), Blocks.AIR.defaultBlockState(), 3);
			}
		}
	}
}

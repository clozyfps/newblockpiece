package net.mcreator.blockpiece.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
<<<<<<< HEAD
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
=======
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
>>>>>>> branch 'master' of https://github.com/clozyfps/newblockpiece.git
import net.minecraft.core.BlockPos;

import net.mcreator.blockpiece.network.BlockpieceModVariables;

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
			if (!entity.getPersistentData().getBoolean("roomActive")) {
				if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.AIR) {
					entity.getPersistentData().putDouble("roomSize", 25);
					entity.getPersistentData().putBoolean("roomActive", true);
					entity.getPersistentData().putBoolean("inRoom", true);
					entity.getPersistentData().putDouble("roomPosX", (entity.getX()));
					entity.getPersistentData().putDouble("roomPosY", (entity.getY()));
					entity.getPersistentData().putDouble("roomPosZ", (entity.getZ()));
					int horizontalRadiusSphere = (int) (entity.getPersistentData().getDouble("roomSize")) - 1;
					int verticalRadiusSphere = (int) (entity.getPersistentData().getDouble("roomSize")) - 1;
					int yIterationsSphere = verticalRadiusSphere;
					for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
						for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
							for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
								double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
										+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
								if (distanceSq <= 1.0) {
									if (!((world.getBlockState(new BlockPos(x + xi, y + i, z + zi))).getBlock() == Blocks.AIR)) {
										world.setBlock(new BlockPos(x, y, z), Blocks.DIAMOND_ORE.defaultBlockState(), 3);
									}
								}
							}
						}
					}
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("Must be in an open space!"), true);
				}
			} else if (entity.getPersistentData().getBoolean("roomActive")) {
				entity.getPersistentData().putDouble("roomSize", 0);
				entity.getPersistentData().putBoolean("roomActive", false);
				entity.getPersistentData().putBoolean("inRoom", false);
				int horizontalRadiusSphere = (int) (entity.getPersistentData().getDouble("roomSize")) - 1;
				int verticalRadiusSphere = (int) (entity.getPersistentData().getDouble("roomSize")) - 1;
				int yIterationsSphere = verticalRadiusSphere;
				for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
					for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
						for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
							double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
									+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
							if (distanceSq <= 1.0) {
								if ((world.getBlockState(new BlockPos(entity.getPersistentData().getDouble("roomPosX"), entity.getPersistentData().getDouble("roomPosY"), entity.getPersistentData().getDouble("roomPosZ"))))
										.getBlock() == Blocks.DIAMOND_ORE) {
									world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
								}
							}
						}
					}
				}
			}
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
			if (!((world.getBlockState(new BlockPos(xRay, yRay, zRay))).getBlock() == Blocks.AIR)) {
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

package net.mcreator.blockpiece.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.blockpiece.network.BlockpieceModVariables;
import net.mcreator.blockpiece.init.BlockpieceModMobEffects;
import net.mcreator.blockpiece.init.BlockpieceModEntities;
import net.mcreator.blockpiece.init.BlockpieceModBlocks;
import net.mcreator.blockpiece.entity.OpeMiddleEntity;

import java.util.stream.Collectors;
import java.util.Map;
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
					entity.getPersistentData().putBoolean("opeDeactivated", false);
					entity.getPersistentData().putDouble("roomSize", 25);
					entity.getPersistentData().putBoolean("roomActive", true);
					entity.getPersistentData().putBoolean("inRoom", true);
					entity.getPersistentData().putDouble("roomPosX", (entity.getX()));
					entity.getPersistentData().putDouble("roomPosY", (entity.getY()));
					entity.getPersistentData().putDouble("roomPosZ", (entity.getZ()));
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new OpeMiddleEntity(BlockpieceModEntities.OPE_MIDDLE.get(), _level);
						entityToSpawn.moveTo(x, y, z, 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((entity.getPersistentData().getDouble("roomSize")) / 2d), e -> true).stream()
								.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							entityiterator.getPersistentData().putBoolean("inRoom", true);
						}
					}
					int horizontalRadiusSphere = (int) (entity.getPersistentData().getDouble("roomSize")) - 1;
					int verticalRadiusSphere = (int) (entity.getPersistentData().getDouble("roomSize")) - 1;
					int yIterationsSphere = verticalRadiusSphere;
					for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
						for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
							for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
								double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
										+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
								if (distanceSq <= 1.0) {
									if ((world.getBlockState(new BlockPos(x + xi, y + i, z + zi))).getBlock() == Blocks.AIR) {
										{
											BlockPos _bp = new BlockPos(x + xi, y + i, z + zi);
											BlockState _bs = BlockpieceModBlocks.ROOM_BLOCK.get().defaultBlockState();
											BlockState _bso = world.getBlockState(_bp);
											for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
												Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
												if (_property != null && _bs.getValue(_property) != null)
													try {
														_bs = _bs.setValue(_property, (Comparable) entry.getValue());
													} catch (Exception e) {
													}
											}
											world.setBlock(_bp, _bs, 3);
										}
									}
								}
							}
						}
					}
					OpeSecondaryProcedure.execute(world, x, y, z, entity);
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("Must be in an open space!"), true);
				}
			} else if (entity.getPersistentData().getBoolean("roomActive")) {
				entity.getPersistentData().putBoolean("opeDeactivated", true);
				entity.getPersistentData().putDouble("roomSize", 0);
				entity.getPersistentData().putBoolean("roomActive", false);
				entity.getPersistentData().putBoolean("inRoom", false);
				entity.getPersistentData().putDouble("roomPosX", 0);
				entity.getPersistentData().putDouble("roomPosY", 0);
				entity.getPersistentData().putDouble("roomPosZ", 0);
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
		if (((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SelectedMove).equals("Amputate") && entity.getPersistentData().getBoolean("roomActive")
				&& entity.getPersistentData().getBoolean("inRoom")) {
			world.setBlock(new BlockPos(xRay, yRay, zRay), Blocks.AIR.defaultBlockState(), 3);
		}
		if (((entity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).SelectedMove).equals("Takt") && entity.getPersistentData().getBoolean("roomActive")
				&& entity.getPersistentData().getBoolean("inRoom")) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(BlockpieceModMobEffects.TAKT_ACTIVE.get(), 30, 0, true, false));
			entity.getPersistentData().putDouble("activeX", xRay);
			entity.getPersistentData().putDouble("activeY", yRay);
			entity.getPersistentData().putDouble("activeZ", zRay);
		}
	}
}

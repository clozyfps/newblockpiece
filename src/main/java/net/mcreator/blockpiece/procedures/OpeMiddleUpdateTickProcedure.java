package net.mcreator.blockpiece.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.blockpiece.init.BlockpieceModBlocks;

import java.util.Map;
import java.util.Comparator;
import java.util.ArrayList;

public class OpeMiddleUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		String v = "";
		if ((entity.getPersistentData().getString("owner")).isEmpty()) {
			v = ((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)).getDisplayName().getString();
			entity.getPersistentData().putString("owner", v);
		} else {
			for (Entity entityiterator : new ArrayList<>(world.players())) {
				if ((entityiterator.getDisplayName().getString()).equals(entity.getPersistentData().getString("owner"))) {
					if (entityiterator.getPersistentData().getBoolean("opeDeactivated")) {
						int horizontalRadiusSphere = (int) (entityiterator.getPersistentData().getDouble("roomSize")) - 1;
						int verticalRadiusSphere = (int) (entityiterator.getPersistentData().getDouble("roomSize")) - 1;
						int yIterationsSphere = verticalRadiusSphere;
						for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
							for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
								for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
									double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
											+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
									if (distanceSq <= 1.0) {
										if ((world.getBlockState(new BlockPos(x + xi, y + i, z + zi))).getBlock() == BlockpieceModBlocks.ROOM_BLOCK.get()) {
											{
												BlockPos _bp = new BlockPos(x + xi, y + i, z + zi);
												BlockState _bs = Blocks.AIR.defaultBlockState();
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
					}
				}
			}
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}

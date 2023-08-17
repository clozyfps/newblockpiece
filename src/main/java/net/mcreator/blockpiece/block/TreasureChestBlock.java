
package net.mcreator.blockpiece.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.blockpiece.procedures.TreasureChestRightClickProcedure;

import java.util.List;
import java.util.Collections;

public class TreasureChestBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public TreasureChestBlock() {
		super(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(5.85, 2, 14, 10.15, 7, 14.15), box(4.72963, 3.63247, 14, 6.02963, 8.63247, 14.1), box(9.97037, 3.63247, 14, 11.27037, 8.63247, 14.1), box(2.85, 8.82132, 3.97368, 4.15, 12.12132, 12.02868),
					box(11.85, 8.82132, 3.97368, 13.15, 12.12132, 12.02868), box(11.85, 9, 1.85, 13.15, 10, 14.15), box(11.85, 8.68683, 1.72028, 13.15, 11.68683, 5.02028), box(1, 11, 4, 15, 12, 12), box(1, 0, 2, 15, 10, 14),
					box(0.85, 7, 1.85, 15.15, 9, 14.15), box(2.85, 9, 1.85, 4.15, 10, 14.15), box(2.85, 8.68683, 10.97972, 4.15, 11.68683, 14.27972), box(2.85, 8.68683, 1.72028, 4.15, 11.68683, 5.02028), box(1, 10, 3, 15, 11, 13),
					box(1, 9.5, 10.96789, 15, 10.5, 13.79289), box(1, 9.23273, 2.85234, 15, 12.05773, 3.85234), box(11.85, 8.68683, 10.97972, 13.15, 11.68683, 14.27972));
			case NORTH -> Shapes.or(box(5.85, 2, 1.85, 10.15, 7, 2), box(9.97037, 3.63247, 1.9, 11.27037, 8.63247, 2), box(4.72963, 3.63247, 1.9, 6.02963, 8.63247, 2), box(11.85, 8.82132, 3.97132, 13.15, 12.12132, 12.02632),
					box(2.85, 8.82132, 3.97132, 4.15, 12.12132, 12.02632), box(2.85, 9, 1.85, 4.15, 10, 14.15), box(2.85, 8.68683, 10.97972, 4.15, 11.68683, 14.27972), box(1, 11, 4, 15, 12, 12), box(1, 0, 2, 15, 10, 14),
					box(0.85, 7, 1.85, 15.15, 9, 14.15), box(11.85, 9, 1.85, 13.15, 10, 14.15), box(11.85, 8.68683, 1.72028, 13.15, 11.68683, 5.02028), box(11.85, 8.68683, 10.97972, 13.15, 11.68683, 14.27972), box(1, 10, 3, 15, 11, 13),
					box(1, 9.5, 2.20711, 15, 10.5, 5.03211), box(1, 9.23273, 12.14766, 15, 12.05773, 13.14766), box(2.85, 8.68683, 1.72028, 4.15, 11.68683, 5.02028));
			case EAST -> Shapes.or(box(14, 2, 5.85, 14.15, 7, 10.15), box(14, 3.63247, 9.97037, 14.1, 8.63247, 11.27037), box(14, 3.63247, 4.72963, 14.1, 8.63247, 6.02963), box(3.97368, 8.82132, 11.85, 12.02868, 12.12132, 13.15),
					box(3.97368, 8.82132, 2.85, 12.02868, 12.12132, 4.15), box(1.85, 9, 2.85, 14.15, 10, 4.15), box(1.72028, 8.68683, 2.85, 5.02028, 11.68683, 4.15), box(4, 11, 1, 12, 12, 15), box(2, 0, 1, 14, 10, 15),
					box(1.85, 7, 0.85, 14.15, 9, 15.15), box(1.85, 9, 11.85, 14.15, 10, 13.15), box(10.97972, 8.68683, 11.85, 14.27972, 11.68683, 13.15), box(1.72028, 8.68683, 11.85, 5.02028, 11.68683, 13.15), box(3, 10, 1, 13, 11, 15),
					box(10.96789, 9.5, 1, 13.79289, 10.5, 15), box(2.85234, 9.23273, 1, 3.85234, 12.05773, 15), box(10.97972, 8.68683, 2.85, 14.27972, 11.68683, 4.15));
			case WEST -> Shapes.or(box(1.85, 2, 5.85, 2, 7, 10.15), box(1.9, 3.63247, 4.72963, 2, 8.63247, 6.02963), box(1.9, 3.63247, 9.97037, 2, 8.63247, 11.27037), box(3.97132, 8.82132, 2.85, 12.02632, 12.12132, 4.15),
					box(3.97132, 8.82132, 11.85, 12.02632, 12.12132, 13.15), box(1.85, 9, 11.85, 14.15, 10, 13.15), box(10.97972, 8.68683, 11.85, 14.27972, 11.68683, 13.15), box(4, 11, 1, 12, 12, 15), box(2, 0, 1, 14, 10, 15),
					box(1.85, 7, 0.85, 14.15, 9, 15.15), box(1.85, 9, 2.85, 14.15, 10, 4.15), box(1.72028, 8.68683, 2.85, 5.02028, 11.68683, 4.15), box(10.97972, 8.68683, 2.85, 14.27972, 11.68683, 4.15), box(3, 10, 1, 13, 11, 15),
					box(2.20711, 9.5, 1, 5.03211, 10.5, 15), box(12.14766, 9.23273, 1, 13.14766, 12.05773, 15), box(1.72028, 8.68683, 11.85, 5.02028, 11.68683, 13.15));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();
		TreasureChestRightClickProcedure.execute(world, x, y, z);
		return InteractionResult.SUCCESS;
	}
}

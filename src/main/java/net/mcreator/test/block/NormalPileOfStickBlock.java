
package net.mcreator.test.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class NormalPileOfStickBlock extends Block implements SimpleWaterloggedBlock {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	public NormalPileOfStickBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.WOOD).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return state.getFluidState().isEmpty();
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
			default -> Shapes.or(box(7, 0, 0, 9, 2, 16), box(9, 0, 0, 11, 2, 16), box(5, 0, 0, 7, 2, 16), box(6, 2, 0, 8, 4, 16), box(8, 2, 0, 10, 4, 16), box(7, 4, 0, 9, 6, 16));
			case NORTH -> Shapes.or(box(7, 0, 0, 9, 2, 16), box(5, 0, 0, 7, 2, 16), box(9, 0, 0, 11, 2, 16), box(8, 2, 0, 10, 4, 16), box(6, 2, 0, 8, 4, 16), box(7, 4, 0, 9, 6, 16));
			case EAST -> Shapes.or(box(0, 0, 7, 16, 2, 9), box(0, 0, 5, 16, 2, 7), box(0, 0, 9, 16, 2, 11), box(0, 2, 8, 16, 4, 10), box(0, 2, 6, 16, 4, 8), box(0, 4, 7, 16, 6, 9));
			case WEST -> Shapes.or(box(0, 0, 7, 16, 2, 9), box(0, 0, 9, 16, 2, 11), box(0, 0, 5, 16, 2, 7), box(0, 2, 6, 16, 4, 8), box(0, 2, 8, 16, 4, 10), box(0, 4, 7, 16, 6, 9));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING, WATERLOGGED);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		boolean flag = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite()).setValue(WATERLOGGED, flag);
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public FluidState getFluidState(BlockState state) {
		return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
	}

	@Override
	public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
		if (state.getValue(WATERLOGGED)) {
			world.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
		}
		return super.updateShape(state, facing, facingState, world, currentPos, facingPos);
	}
}
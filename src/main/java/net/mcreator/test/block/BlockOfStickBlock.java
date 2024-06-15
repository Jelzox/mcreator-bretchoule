
package net.mcreator.test.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class BlockOfStickBlock extends Block implements SimpleWaterloggedBlock {
	public static final DirectionProperty FACING = DirectionalBlock.FACING;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	public BlockOfStickBlock() {
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
			default -> Shapes.or(box(0, 0, 0, 2, 2, 16), box(2, 0, 0, 4, 2, 16), box(6, 0, 0, 8, 2, 16), box(4, 0, 0, 6, 2, 16), box(10, 0, 0, 12, 2, 16), box(8, 0, 0, 10, 2, 16), box(14, 0, 0, 16, 2, 16), box(12, 0, 0, 14, 2, 16),
					box(14, 2, 0, 16, 4, 16), box(12, 2, 0, 14, 4, 16), box(10, 2, 0, 12, 4, 16), box(8, 2, 0, 10, 4, 16), box(6, 2, 0, 8, 4, 16), box(4, 2, 0, 6, 4, 16), box(2, 2, 0, 4, 4, 16), box(0, 2, 0, 2, 4, 16), box(2, 4, 0, 4, 6, 16),
					box(0, 4, 0, 2, 6, 16), box(6, 4, 0, 8, 6, 16), box(4, 4, 0, 6, 6, 16), box(10, 4, 0, 12, 6, 16), box(8, 4, 0, 10, 6, 16), box(14, 4, 0, 16, 6, 16), box(12, 4, 0, 14, 6, 16), box(0, 6, 0, 2, 8, 16), box(2, 6, 0, 4, 8, 16),
					box(4, 6, 0, 6, 8, 16), box(6, 6, 0, 8, 8, 16), box(8, 6, 0, 10, 8, 16), box(10, 6, 0, 12, 8, 16), box(12, 6, 0, 14, 8, 16), box(14, 6, 0, 16, 8, 16), box(0, 8, 0, 2, 10, 16), box(2, 8, 0, 4, 10, 16), box(4, 8, 0, 6, 10, 16),
					box(6, 8, 0, 8, 10, 16), box(8, 8, 0, 10, 10, 16), box(10, 8, 0, 12, 10, 16), box(12, 8, 0, 14, 10, 16), box(14, 8, 0, 16, 10, 16), box(0, 10, 0, 2, 12, 16), box(2, 10, 0, 4, 12, 16), box(4, 10, 0, 6, 12, 16),
					box(6, 10, 0, 8, 12, 16), box(8, 10, 0, 10, 12, 16), box(10, 10, 0, 12, 12, 16), box(12, 10, 0, 14, 12, 16), box(14, 10, 0, 16, 12, 16), box(0, 12, 0, 2, 14, 16), box(2, 12, 0, 4, 14, 16), box(4, 12, 0, 6, 14, 16),
					box(6, 12, 0, 8, 14, 16), box(8, 12, 0, 10, 14, 16), box(10, 12, 0, 12, 14, 16), box(12, 12, 0, 14, 14, 16), box(14, 12, 0, 16, 14, 16), box(0, 14, 0, 2, 16, 16), box(2, 14, 0, 4, 16, 16), box(4, 14, 0, 6, 16, 16),
					box(8, 14, 0, 10, 16, 16), box(6, 14, 0, 8, 16, 16), box(10, 14, 0, 12, 16, 16), box(12, 14, 0, 14, 16, 16), box(14, 14, 0, 16, 16, 16));
			case NORTH -> Shapes.or(box(14, 0, 0, 16, 2, 16), box(12, 0, 0, 14, 2, 16), box(8, 0, 0, 10, 2, 16), box(10, 0, 0, 12, 2, 16), box(4, 0, 0, 6, 2, 16), box(6, 0, 0, 8, 2, 16), box(0, 0, 0, 2, 2, 16), box(2, 0, 0, 4, 2, 16),
					box(0, 2, 0, 2, 4, 16), box(2, 2, 0, 4, 4, 16), box(4, 2, 0, 6, 4, 16), box(6, 2, 0, 8, 4, 16), box(8, 2, 0, 10, 4, 16), box(10, 2, 0, 12, 4, 16), box(12, 2, 0, 14, 4, 16), box(14, 2, 0, 16, 4, 16), box(12, 4, 0, 14, 6, 16),
					box(14, 4, 0, 16, 6, 16), box(8, 4, 0, 10, 6, 16), box(10, 4, 0, 12, 6, 16), box(4, 4, 0, 6, 6, 16), box(6, 4, 0, 8, 6, 16), box(0, 4, 0, 2, 6, 16), box(2, 4, 0, 4, 6, 16), box(14, 6, 0, 16, 8, 16), box(12, 6, 0, 14, 8, 16),
					box(10, 6, 0, 12, 8, 16), box(8, 6, 0, 10, 8, 16), box(6, 6, 0, 8, 8, 16), box(4, 6, 0, 6, 8, 16), box(2, 6, 0, 4, 8, 16), box(0, 6, 0, 2, 8, 16), box(14, 8, 0, 16, 10, 16), box(12, 8, 0, 14, 10, 16), box(10, 8, 0, 12, 10, 16),
					box(8, 8, 0, 10, 10, 16), box(6, 8, 0, 8, 10, 16), box(4, 8, 0, 6, 10, 16), box(2, 8, 0, 4, 10, 16), box(0, 8, 0, 2, 10, 16), box(14, 10, 0, 16, 12, 16), box(12, 10, 0, 14, 12, 16), box(10, 10, 0, 12, 12, 16),
					box(8, 10, 0, 10, 12, 16), box(6, 10, 0, 8, 12, 16), box(4, 10, 0, 6, 12, 16), box(2, 10, 0, 4, 12, 16), box(0, 10, 0, 2, 12, 16), box(14, 12, 0, 16, 14, 16), box(12, 12, 0, 14, 14, 16), box(10, 12, 0, 12, 14, 16),
					box(8, 12, 0, 10, 14, 16), box(6, 12, 0, 8, 14, 16), box(4, 12, 0, 6, 14, 16), box(2, 12, 0, 4, 14, 16), box(0, 12, 0, 2, 14, 16), box(14, 14, 0, 16, 16, 16), box(12, 14, 0, 14, 16, 16), box(10, 14, 0, 12, 16, 16),
					box(6, 14, 0, 8, 16, 16), box(8, 14, 0, 10, 16, 16), box(4, 14, 0, 6, 16, 16), box(2, 14, 0, 4, 16, 16), box(0, 14, 0, 2, 16, 16));
			case EAST -> Shapes.or(box(0, 0, 14, 16, 2, 16), box(0, 0, 12, 16, 2, 14), box(0, 0, 8, 16, 2, 10), box(0, 0, 10, 16, 2, 12), box(0, 0, 4, 16, 2, 6), box(0, 0, 6, 16, 2, 8), box(0, 0, 0, 16, 2, 2), box(0, 0, 2, 16, 2, 4),
					box(0, 2, 0, 16, 4, 2), box(0, 2, 2, 16, 4, 4), box(0, 2, 4, 16, 4, 6), box(0, 2, 6, 16, 4, 8), box(0, 2, 8, 16, 4, 10), box(0, 2, 10, 16, 4, 12), box(0, 2, 12, 16, 4, 14), box(0, 2, 14, 16, 4, 16), box(0, 4, 12, 16, 6, 14),
					box(0, 4, 14, 16, 6, 16), box(0, 4, 8, 16, 6, 10), box(0, 4, 10, 16, 6, 12), box(0, 4, 4, 16, 6, 6), box(0, 4, 6, 16, 6, 8), box(0, 4, 0, 16, 6, 2), box(0, 4, 2, 16, 6, 4), box(0, 6, 14, 16, 8, 16), box(0, 6, 12, 16, 8, 14),
					box(0, 6, 10, 16, 8, 12), box(0, 6, 8, 16, 8, 10), box(0, 6, 6, 16, 8, 8), box(0, 6, 4, 16, 8, 6), box(0, 6, 2, 16, 8, 4), box(0, 6, 0, 16, 8, 2), box(0, 8, 14, 16, 10, 16), box(0, 8, 12, 16, 10, 14), box(0, 8, 10, 16, 10, 12),
					box(0, 8, 8, 16, 10, 10), box(0, 8, 6, 16, 10, 8), box(0, 8, 4, 16, 10, 6), box(0, 8, 2, 16, 10, 4), box(0, 8, 0, 16, 10, 2), box(0, 10, 14, 16, 12, 16), box(0, 10, 12, 16, 12, 14), box(0, 10, 10, 16, 12, 12),
					box(0, 10, 8, 16, 12, 10), box(0, 10, 6, 16, 12, 8), box(0, 10, 4, 16, 12, 6), box(0, 10, 2, 16, 12, 4), box(0, 10, 0, 16, 12, 2), box(0, 12, 14, 16, 14, 16), box(0, 12, 12, 16, 14, 14), box(0, 12, 10, 16, 14, 12),
					box(0, 12, 8, 16, 14, 10), box(0, 12, 6, 16, 14, 8), box(0, 12, 4, 16, 14, 6), box(0, 12, 2, 16, 14, 4), box(0, 12, 0, 16, 14, 2), box(0, 14, 14, 16, 16, 16), box(0, 14, 12, 16, 16, 14), box(0, 14, 10, 16, 16, 12),
					box(0, 14, 6, 16, 16, 8), box(0, 14, 8, 16, 16, 10), box(0, 14, 4, 16, 16, 6), box(0, 14, 2, 16, 16, 4), box(0, 14, 0, 16, 16, 2));
			case WEST -> Shapes.or(box(0, 0, 0, 16, 2, 2), box(0, 0, 2, 16, 2, 4), box(0, 0, 6, 16, 2, 8), box(0, 0, 4, 16, 2, 6), box(0, 0, 10, 16, 2, 12), box(0, 0, 8, 16, 2, 10), box(0, 0, 14, 16, 2, 16), box(0, 0, 12, 16, 2, 14),
					box(0, 2, 14, 16, 4, 16), box(0, 2, 12, 16, 4, 14), box(0, 2, 10, 16, 4, 12), box(0, 2, 8, 16, 4, 10), box(0, 2, 6, 16, 4, 8), box(0, 2, 4, 16, 4, 6), box(0, 2, 2, 16, 4, 4), box(0, 2, 0, 16, 4, 2), box(0, 4, 2, 16, 6, 4),
					box(0, 4, 0, 16, 6, 2), box(0, 4, 6, 16, 6, 8), box(0, 4, 4, 16, 6, 6), box(0, 4, 10, 16, 6, 12), box(0, 4, 8, 16, 6, 10), box(0, 4, 14, 16, 6, 16), box(0, 4, 12, 16, 6, 14), box(0, 6, 0, 16, 8, 2), box(0, 6, 2, 16, 8, 4),
					box(0, 6, 4, 16, 8, 6), box(0, 6, 6, 16, 8, 8), box(0, 6, 8, 16, 8, 10), box(0, 6, 10, 16, 8, 12), box(0, 6, 12, 16, 8, 14), box(0, 6, 14, 16, 8, 16), box(0, 8, 0, 16, 10, 2), box(0, 8, 2, 16, 10, 4), box(0, 8, 4, 16, 10, 6),
					box(0, 8, 6, 16, 10, 8), box(0, 8, 8, 16, 10, 10), box(0, 8, 10, 16, 10, 12), box(0, 8, 12, 16, 10, 14), box(0, 8, 14, 16, 10, 16), box(0, 10, 0, 16, 12, 2), box(0, 10, 2, 16, 12, 4), box(0, 10, 4, 16, 12, 6),
					box(0, 10, 6, 16, 12, 8), box(0, 10, 8, 16, 12, 10), box(0, 10, 10, 16, 12, 12), box(0, 10, 12, 16, 12, 14), box(0, 10, 14, 16, 12, 16), box(0, 12, 0, 16, 14, 2), box(0, 12, 2, 16, 14, 4), box(0, 12, 4, 16, 14, 6),
					box(0, 12, 6, 16, 14, 8), box(0, 12, 8, 16, 14, 10), box(0, 12, 10, 16, 14, 12), box(0, 12, 12, 16, 14, 14), box(0, 12, 14, 16, 14, 16), box(0, 14, 0, 16, 16, 2), box(0, 14, 2, 16, 16, 4), box(0, 14, 4, 16, 16, 6),
					box(0, 14, 8, 16, 16, 10), box(0, 14, 6, 16, 16, 8), box(0, 14, 10, 16, 16, 12), box(0, 14, 12, 16, 16, 14), box(0, 14, 14, 16, 16, 16));
			case UP -> Shapes.or(box(14, 0, 0, 16, 16, 2), box(12, 0, 0, 14, 16, 2), box(8, 0, 0, 10, 16, 2), box(10, 0, 0, 12, 16, 2), box(4, 0, 0, 6, 16, 2), box(6, 0, 0, 8, 16, 2), box(0, 0, 0, 2, 16, 2), box(2, 0, 0, 4, 16, 2),
					box(0, 0, 2, 2, 16, 4), box(2, 0, 2, 4, 16, 4), box(4, 0, 2, 6, 16, 4), box(6, 0, 2, 8, 16, 4), box(8, 0, 2, 10, 16, 4), box(10, 0, 2, 12, 16, 4), box(12, 0, 2, 14, 16, 4), box(14, 0, 2, 16, 16, 4), box(12, 0, 4, 14, 16, 6),
					box(14, 0, 4, 16, 16, 6), box(8, 0, 4, 10, 16, 6), box(10, 0, 4, 12, 16, 6), box(4, 0, 4, 6, 16, 6), box(6, 0, 4, 8, 16, 6), box(0, 0, 4, 2, 16, 6), box(2, 0, 4, 4, 16, 6), box(14, 0, 6, 16, 16, 8), box(12, 0, 6, 14, 16, 8),
					box(10, 0, 6, 12, 16, 8), box(8, 0, 6, 10, 16, 8), box(6, 0, 6, 8, 16, 8), box(4, 0, 6, 6, 16, 8), box(2, 0, 6, 4, 16, 8), box(0, 0, 6, 2, 16, 8), box(14, 0, 8, 16, 16, 10), box(12, 0, 8, 14, 16, 10), box(10, 0, 8, 12, 16, 10),
					box(8, 0, 8, 10, 16, 10), box(6, 0, 8, 8, 16, 10), box(4, 0, 8, 6, 16, 10), box(2, 0, 8, 4, 16, 10), box(0, 0, 8, 2, 16, 10), box(14, 0, 10, 16, 16, 12), box(12, 0, 10, 14, 16, 12), box(10, 0, 10, 12, 16, 12),
					box(8, 0, 10, 10, 16, 12), box(6, 0, 10, 8, 16, 12), box(4, 0, 10, 6, 16, 12), box(2, 0, 10, 4, 16, 12), box(0, 0, 10, 2, 16, 12), box(14, 0, 12, 16, 16, 14), box(12, 0, 12, 14, 16, 14), box(10, 0, 12, 12, 16, 14),
					box(8, 0, 12, 10, 16, 14), box(6, 0, 12, 8, 16, 14), box(4, 0, 12, 6, 16, 14), box(2, 0, 12, 4, 16, 14), box(0, 0, 12, 2, 16, 14), box(14, 0, 14, 16, 16, 16), box(12, 0, 14, 14, 16, 16), box(10, 0, 14, 12, 16, 16),
					box(6, 0, 14, 8, 16, 16), box(8, 0, 14, 10, 16, 16), box(4, 0, 14, 6, 16, 16), box(2, 0, 14, 4, 16, 16), box(0, 0, 14, 2, 16, 16));
			case DOWN -> Shapes.or(box(14, 0, 14, 16, 16, 16), box(12, 0, 14, 14, 16, 16), box(8, 0, 14, 10, 16, 16), box(10, 0, 14, 12, 16, 16), box(4, 0, 14, 6, 16, 16), box(6, 0, 14, 8, 16, 16), box(0, 0, 14, 2, 16, 16), box(2, 0, 14, 4, 16, 16),
					box(0, 0, 12, 2, 16, 14), box(2, 0, 12, 4, 16, 14), box(4, 0, 12, 6, 16, 14), box(6, 0, 12, 8, 16, 14), box(8, 0, 12, 10, 16, 14), box(10, 0, 12, 12, 16, 14), box(12, 0, 12, 14, 16, 14), box(14, 0, 12, 16, 16, 14),
					box(12, 0, 10, 14, 16, 12), box(14, 0, 10, 16, 16, 12), box(8, 0, 10, 10, 16, 12), box(10, 0, 10, 12, 16, 12), box(4, 0, 10, 6, 16, 12), box(6, 0, 10, 8, 16, 12), box(0, 0, 10, 2, 16, 12), box(2, 0, 10, 4, 16, 12),
					box(14, 0, 8, 16, 16, 10), box(12, 0, 8, 14, 16, 10), box(10, 0, 8, 12, 16, 10), box(8, 0, 8, 10, 16, 10), box(6, 0, 8, 8, 16, 10), box(4, 0, 8, 6, 16, 10), box(2, 0, 8, 4, 16, 10), box(0, 0, 8, 2, 16, 10),
					box(14, 0, 6, 16, 16, 8), box(12, 0, 6, 14, 16, 8), box(10, 0, 6, 12, 16, 8), box(8, 0, 6, 10, 16, 8), box(6, 0, 6, 8, 16, 8), box(4, 0, 6, 6, 16, 8), box(2, 0, 6, 4, 16, 8), box(0, 0, 6, 2, 16, 8), box(14, 0, 4, 16, 16, 6),
					box(12, 0, 4, 14, 16, 6), box(10, 0, 4, 12, 16, 6), box(8, 0, 4, 10, 16, 6), box(6, 0, 4, 8, 16, 6), box(4, 0, 4, 6, 16, 6), box(2, 0, 4, 4, 16, 6), box(0, 0, 4, 2, 16, 6), box(14, 0, 2, 16, 16, 4), box(12, 0, 2, 14, 16, 4),
					box(10, 0, 2, 12, 16, 4), box(8, 0, 2, 10, 16, 4), box(6, 0, 2, 8, 16, 4), box(4, 0, 2, 6, 16, 4), box(2, 0, 2, 4, 16, 4), box(0, 0, 2, 2, 16, 4), box(14, 0, 0, 16, 16, 2), box(12, 0, 0, 14, 16, 2), box(10, 0, 0, 12, 16, 2),
					box(6, 0, 0, 8, 16, 2), box(8, 0, 0, 10, 16, 2), box(4, 0, 0, 6, 16, 2), box(2, 0, 0, 4, 16, 2), box(0, 0, 0, 2, 16, 2));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING, WATERLOGGED);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		boolean flag = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;
		return this.defaultBlockState().setValue(FACING, context.getClickedFace()).setValue(WATERLOGGED, flag);
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

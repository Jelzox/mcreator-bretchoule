
package net.mcreator.test.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class GlassDoorBlock extends DoorBlock {
	public GlassDoorBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.HAT).mapColor(MapColor.METAL).sound(SoundType.GLASS).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).dynamicShape(), BlockSetType.STONE);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}
}

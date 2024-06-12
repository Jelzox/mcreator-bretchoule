
package net.mcreator.test.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class DirtSlabBlock extends SlabBlock {
	public DirtSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GRAVEL).strength(1f, 10f).dynamicShape());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}
}
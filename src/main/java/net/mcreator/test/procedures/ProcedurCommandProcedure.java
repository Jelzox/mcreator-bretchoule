package net.mcreator.test.procedures;

import net.minecraftforge.eventbus.api.Event;

public class ProcedurCommandProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isClientSide()) {
			BlockPos _bp = BlockPos.containing(x, y, z + 1);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getPersistentData().putString("part", "head");
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
		world.setBlock(BlockPos.containing(x, y, z + 1), Blocks.WHITE_BED.defaultBlockState(), 3);
	}
}

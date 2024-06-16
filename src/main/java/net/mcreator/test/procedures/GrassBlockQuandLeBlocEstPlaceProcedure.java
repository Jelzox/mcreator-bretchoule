package net.mcreator.test.procedures;

import net.minecraftforge.eventbus.api.Event;

public class GrassBlockQuandLeBlocEstPlaceProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == TestModBlocks.GRASS_SLAB.get()) {
			{
				BlockPos _bp = BlockPos.containing(x - 1, y, z);
				BlockState _bs = Blocks.GRASS_BLOCK.defaultBlockState();
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

package net.mcreator.test.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.test.init.TestModBlocks;

public class DirtBiomeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))) == TestModBlocks.GRASS_SLAB.get().defaultBlockState()
				&& (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("plains")) || world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("forest")))) {
		}
	}
}

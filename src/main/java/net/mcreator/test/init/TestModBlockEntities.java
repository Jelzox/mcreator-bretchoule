
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.test.block.entity.TestTirroirTileEntity;
import net.mcreator.test.block.entity.ExpeditionBlockBlockEntity;
import net.mcreator.test.TestMod;

public class TestModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, TestMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> EXPEDITION_BLOCK = register("expedition_block", TestModBlocks.EXPEDITION_BLOCK, ExpeditionBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<TestTirroirTileEntity>> TEST_TIRROIR = REGISTRY.register("test_tirroir", () -> BlockEntityType.Builder.of(TestTirroirTileEntity::new, TestModBlocks.TEST_TIRROIR.get()).build(null));

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}

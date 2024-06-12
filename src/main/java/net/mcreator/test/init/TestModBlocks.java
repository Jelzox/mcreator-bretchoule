
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.test.block.VerticalSlabBlock;
import net.mcreator.test.block.TestGlassTrapBlock;
import net.mcreator.test.block.TestGlassDoorBlock;
import net.mcreator.test.block.SecretOakTrapBlock;
import net.mcreator.test.block.SecretOakDoorBlock;
import net.mcreator.test.TestMod;

public class TestModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TestMod.MODID);
	public static final RegistryObject<Block> VERTICAL_SLAB = REGISTRY.register("vertical_slab", () -> new VerticalSlabBlock());
	public static final RegistryObject<Block> SECRET_OAK_DOOR = REGISTRY.register("secret_oak_door", () -> new SecretOakDoorBlock());
	public static final RegistryObject<Block> SECRET_OAK_TRAP = REGISTRY.register("secret_oak_trap", () -> new SecretOakTrapBlock());
	public static final RegistryObject<Block> TEST_GLASS_DOOR = REGISTRY.register("test_glass_door", () -> new TestGlassDoorBlock());
	public static final RegistryObject<Block> TEST_GLASS_TRAP = REGISTRY.register("test_glass_trap", () -> new TestGlassTrapBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}

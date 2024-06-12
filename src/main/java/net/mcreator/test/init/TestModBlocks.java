
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.test.block.SecretOakTrapdoorBlock;
import net.mcreator.test.block.SecretOakDoorBlock;
import net.mcreator.test.block.OakAltSlabBlock;
import net.mcreator.test.block.GlassTrapdoorBlock;
import net.mcreator.test.block.GlassDoorBlock;
import net.mcreator.test.TestMod;

public class TestModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TestMod.MODID);
	public static final RegistryObject<Block> OAK_ALT_SLAB = REGISTRY.register("oak_alt_slab", () -> new OakAltSlabBlock());
	public static final RegistryObject<Block> SECRET_OAK_DOOR = REGISTRY.register("secret_oak_door", () -> new SecretOakDoorBlock());
	public static final RegistryObject<Block> SECRET_OAK_TRAPDOOR = REGISTRY.register("secret_oak_trapdoor", () -> new SecretOakTrapdoorBlock());
	public static final RegistryObject<Block> GLASS_DOOR = REGISTRY.register("glass_door", () -> new GlassDoorBlock());
	public static final RegistryObject<Block> GLASS_TRAPDOOR = REGISTRY.register("glass_trapdoor", () -> new GlassTrapdoorBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}

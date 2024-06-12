
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.test.block.OakSecretTrapdoorBlock;
import net.mcreator.test.block.OakSecretDoorBlock;
import net.mcreator.test.block.OakAltSlabBlock;
import net.mcreator.test.block.GlassTrapdoorBlock;
import net.mcreator.test.block.GlassDoorBlock;
import net.mcreator.test.block.BirchAltSlabBlock;
import net.mcreator.test.TestMod;

public class TestModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TestMod.MODID);
	public static final RegistryObject<Block> OAK_ALT_SLAB = REGISTRY.register("oak_alt_slab", () -> new OakAltSlabBlock());
	public static final RegistryObject<Block> GLASS_DOOR = REGISTRY.register("glass_door", () -> new GlassDoorBlock());
	public static final RegistryObject<Block> GLASS_TRAPDOOR = REGISTRY.register("glass_trapdoor", () -> new GlassTrapdoorBlock());
	public static final RegistryObject<Block> OAK_SECRET_DOOR = REGISTRY.register("oak_secret_door", () -> new OakSecretDoorBlock());
	public static final RegistryObject<Block> OAK_SECRET_TRAPDOOR = REGISTRY.register("oak_secret_trapdoor", () -> new OakSecretTrapdoorBlock());
	public static final RegistryObject<Block> BIRCH_ALT_SLAB = REGISTRY.register("birch_alt_slab", () -> new BirchAltSlabBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}

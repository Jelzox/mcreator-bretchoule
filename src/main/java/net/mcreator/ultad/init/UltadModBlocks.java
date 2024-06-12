
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ultad.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.ultad.block.SecretOakTrapdoorBlock;
import net.mcreator.ultad.block.SecretOakDoorBlock;
import net.mcreator.ultad.block.OakAltSlabBlock;
import net.mcreator.ultad.block.GlassTrapdoorBlock;
import net.mcreator.ultad.block.GlassDoorBlock;
import net.mcreator.ultad.UltadMod;

public class UltadModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, UltadMod.MODID);
	public static final RegistryObject<Block> OAK_ALT_SLAB = REGISTRY.register("oak_alt_slab", () -> new OakAltSlabBlock());
	public static final RegistryObject<Block> SECRET_OAK_DOOR = REGISTRY.register("secret_oak_door", () -> new SecretOakDoorBlock());
	public static final RegistryObject<Block> SECRET_OAK_TRAPDOOR = REGISTRY.register("secret_oak_trapdoor", () -> new SecretOakTrapdoorBlock());
	public static final RegistryObject<Block> GLASS_DOOR = REGISTRY.register("glass_door", () -> new GlassDoorBlock());
	public static final RegistryObject<Block> GLASS_TRAPDOOR = REGISTRY.register("glass_trapdoor", () -> new GlassTrapdoorBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}

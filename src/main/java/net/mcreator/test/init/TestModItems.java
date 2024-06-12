
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.test.TestMod;

public class TestModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);
	public static final RegistryObject<Item> OAK_ALT_SLAB = block(TestModBlocks.OAK_ALT_SLAB);
	public static final RegistryObject<Item> GLASS_DOOR = doubleBlock(TestModBlocks.GLASS_DOOR);
	public static final RegistryObject<Item> GLASS_TRAPDOOR = block(TestModBlocks.GLASS_TRAPDOOR);
	public static final RegistryObject<Item> OAK_SECRET_DOOR = doubleBlock(TestModBlocks.OAK_SECRET_DOOR);
	public static final RegistryObject<Item> OAK_SECRET_TRAPDOOR = block(TestModBlocks.OAK_SECRET_TRAPDOOR);
	public static final RegistryObject<Item> BIRCH_ALT_SLAB = block(TestModBlocks.BIRCH_ALT_SLAB);
	public static final RegistryObject<Item> OAK_WALL = block(TestModBlocks.OAK_WALL);
	public static final RegistryObject<Item> BIRCH_WALL = block(TestModBlocks.BIRCH_WALL);
	public static final RegistryObject<Item> JUNGLE_WALL = block(TestModBlocks.JUNGLE_WALL);
	public static final RegistryObject<Item> SPRUCE_WALL = block(TestModBlocks.SPRUCE_WALL);
	public static final RegistryObject<Item> ACACIA_WALL = block(TestModBlocks.ACACIA_WALL);
	public static final RegistryObject<Item> CRIMSON_WALL = block(TestModBlocks.CRIMSON_WALL);
	public static final RegistryObject<Item> WARPED_WALL = block(TestModBlocks.WARPED_WALL);
	public static final RegistryObject<Item> DIRT_SLAB = block(TestModBlocks.DIRT_SLAB);
	public static final RegistryObject<Item> EXPEDITION_BLOCK = block(TestModBlocks.EXPEDITION_BLOCK);
	public static final RegistryObject<Item> GRASS_SLAB = block(TestModBlocks.GRASS_SLAB);
	public static final RegistryObject<Item> DARK_OAK_WALL = block(TestModBlocks.DARK_OAK_WALL);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}

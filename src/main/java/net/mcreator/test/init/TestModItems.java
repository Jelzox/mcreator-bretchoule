
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
	public static final RegistryObject<Item> SECRET_OAK_DOOR = doubleBlock(TestModBlocks.SECRET_OAK_DOOR);
	public static final RegistryObject<Item> SECRET_OAK_TRAPDOOR = block(TestModBlocks.SECRET_OAK_TRAPDOOR);
	public static final RegistryObject<Item> GLASS_DOOR = doubleBlock(TestModBlocks.GLASS_DOOR);
	public static final RegistryObject<Item> GLASS_TRAPDOOR = block(TestModBlocks.GLASS_TRAPDOOR);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}

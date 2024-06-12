
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ultad.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.ultad.UltadMod;

public class UltadModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, UltadMod.MODID);
	public static final RegistryObject<Item> OAK_ALT_SLAB = block(UltadModBlocks.OAK_ALT_SLAB);
	public static final RegistryObject<Item> SECRET_OAK_DOOR = doubleBlock(UltadModBlocks.SECRET_OAK_DOOR);
	public static final RegistryObject<Item> SECRET_OAK_TRAPDOOR = block(UltadModBlocks.SECRET_OAK_TRAPDOOR);
	public static final RegistryObject<Item> GLASS_DOOR = doubleBlock(UltadModBlocks.GLASS_DOOR);
	public static final RegistryObject<Item> GLASS_TRAPDOOR = block(UltadModBlocks.GLASS_TRAPDOOR);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}

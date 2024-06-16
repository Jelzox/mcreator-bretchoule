
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.test.TestMod;

public class TestModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TestMod.MODID);
	public static final RegistryObject<CreativeModeTab> TEST = REGISTRY.register("test",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.test.test")).icon(() -> new ItemStack(Blocks.BARRIER)).displayItems((parameters, tabData) -> {
				tabData.accept(TestModBlocks.SMALL_PILE_OF_STICK.get().asItem());
				tabData.accept(TestModBlocks.NORMAL_PILE_OF_STICK.get().asItem());
				tabData.accept(TestModBlocks.BIG_PILE_OF_STICK.get().asItem());
				tabData.accept(TestModBlocks.SIMPLE_STICK.get().asItem());
				tabData.accept(TestModBlocks.BLOCK_OF_STICK.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> MORE_WALL = REGISTRY.register("more_wall",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.test.more_wall")).icon(() -> new ItemStack(TestModBlocks.OAK_WALL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TestModBlocks.OAK_WALL.get().asItem());
				tabData.accept(TestModBlocks.BIRCH_WALL.get().asItem());
				tabData.accept(TestModBlocks.JUNGLE_WALL.get().asItem());
				tabData.accept(TestModBlocks.SPRUCE_WALL.get().asItem());
				tabData.accept(TestModBlocks.ACACIA_WALL.get().asItem());
				tabData.accept(TestModBlocks.CRIMSON_WALL.get().asItem());
				tabData.accept(TestModBlocks.WARPED_WALL.get().asItem());
				tabData.accept(TestModBlocks.DARK_OAK_WALL.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> SECRET_ENTRANCES = REGISTRY.register("secret_entrances",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.test.secret_entrances")).icon(() -> new ItemStack(TestModBlocks.OAK_SECRET_TRAPDOOR.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TestModBlocks.GLASS_DOOR.get().asItem());
				tabData.accept(TestModBlocks.GLASS_TRAPDOOR.get().asItem());
				tabData.accept(TestModBlocks.OAK_SECRET_DOOR.get().asItem());
				tabData.accept(TestModBlocks.OAK_SECRET_TRAPDOOR.get().asItem());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> VERTICAL_SLABS = REGISTRY.register("vertical_slabs",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.test.vertical_slabs")).icon(() -> new ItemStack(TestModBlocks.OAK_ALT_SLAB.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TestModBlocks.OAK_ALT_SLAB.get().asItem());
				tabData.accept(TestModBlocks.BIRCH_ALT_SLAB.get().asItem());
				tabData.accept(TestModBlocks.DIRT_SLAB.get().asItem());
				tabData.accept(TestModBlocks.GRASS_SLAB.get().asItem());
				tabData.accept(TestModBlocks.EXPEDITION_BLOCK.get().asItem());
				tabData.accept(TestModBlocks.LADDER_BLOCK.get().asItem());
				tabData.accept(TestModBlocks.BIRCH_LADDER_BLOCK.get().asItem());
				tabData.accept(TestModBlocks.SPRUCE_LADDER_BLOCK.get().asItem());
				tabData.accept(TestModBlocks.JUNGLE_LADDER_BLOCK.get().asItem());
				tabData.accept(TestModBlocks.ACACIA_LADDER_BLOCK.get().asItem());
				tabData.accept(TestModBlocks.DARK_OAK_LADDER_BLOCK.get().asItem());
			})

					.build());
}

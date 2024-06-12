
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.test.TestMod;

public class TestModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TestMod.MODID);
	public static final RegistryObject<CreativeModeTab> TEST = REGISTRY.register("test",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.test.test")).icon(() -> new ItemStack(TestModBlocks.VERTICAL_SLAB.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TestModBlocks.VERTICAL_SLAB.get().asItem());
				tabData.accept(TestModBlocks.TEST_GLASS_DOOR.get().asItem());
				tabData.accept(TestModBlocks.TEST_GLASS_TRAP.get().asItem());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> SECRET_BLOCK = REGISTRY.register("secret_block",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.test.secret_block")).icon(() -> new ItemStack(TestModBlocks.SECRET_OAK_DOOR.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TestModBlocks.SECRET_OAK_DOOR.get().asItem());
				tabData.accept(TestModBlocks.SECRET_OAK_TRAP.get().asItem());
			}).withSearchBar().build());
}

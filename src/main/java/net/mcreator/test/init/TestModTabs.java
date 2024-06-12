
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
			})

					.build());
}

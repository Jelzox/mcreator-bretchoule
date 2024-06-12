
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ultad.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.ultad.UltadMod;

public class UltadModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UltadMod.MODID);
	public static final RegistryObject<CreativeModeTab> SECRET_ENTRANCES = REGISTRY.register("secret_entrances",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.ultad.secret_entrances")).icon(() -> new ItemStack(Blocks.BEDROCK)).displayItems((parameters, tabData) -> {
				tabData.accept(UltadModBlocks.SECRET_OAK_DOOR.get().asItem());
				tabData.accept(UltadModBlocks.SECRET_OAK_TRAPDOOR.get().asItem());
				tabData.accept(UltadModBlocks.GLASS_DOOR.get().asItem());
				tabData.accept(UltadModBlocks.GLASS_TRAPDOOR.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> VERTICAL_SLABS = REGISTRY.register("vertical_slabs",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.ultad.vertical_slabs")).icon(() -> new ItemStack(UltadModBlocks.OAK_ALT_SLAB.get())).displayItems((parameters, tabData) -> {
				tabData.accept(UltadModBlocks.OAK_ALT_SLAB.get().asItem());
			})

					.build());
}

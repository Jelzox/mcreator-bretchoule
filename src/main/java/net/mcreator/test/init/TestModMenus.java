
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.test.world.inventory.StorageTestMenu;
import net.mcreator.test.world.inventory.SmallPileOfStickGuiMenu;
import net.mcreator.test.world.inventory.GuiTestGelMenu;
import net.mcreator.test.world.inventory.FletchingTableGuiMenu;
import net.mcreator.test.TestMod;

public class TestModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, TestMod.MODID);
	public static final RegistryObject<MenuType<GuiTestGelMenu>> GUI_TEST_GEL = REGISTRY.register("gui_test_gel", () -> IForgeMenuType.create(GuiTestGelMenu::new));
	public static final RegistryObject<MenuType<SmallPileOfStickGuiMenu>> SMALL_PILE_OF_STICK_GUI = REGISTRY.register("small_pile_of_stick_gui", () -> IForgeMenuType.create(SmallPileOfStickGuiMenu::new));
	public static final RegistryObject<MenuType<FletchingTableGuiMenu>> FLETCHING_TABLE_GUI = REGISTRY.register("fletching_table_gui", () -> IForgeMenuType.create(FletchingTableGuiMenu::new));
	public static final RegistryObject<MenuType<StorageTestMenu>> STORAGE_TEST = REGISTRY.register("storage_test", () -> IForgeMenuType.create(StorageTestMenu::new));
}

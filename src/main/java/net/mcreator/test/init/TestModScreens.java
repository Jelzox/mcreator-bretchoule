
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.test.client.gui.StorageTestScreen;
import net.mcreator.test.client.gui.SmallPileOfStickGuiScreen;
import net.mcreator.test.client.gui.GuiTestGelScreen;
import net.mcreator.test.client.gui.FletchingTableGuiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TestModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(TestModMenus.GUI_TEST_GEL.get(), GuiTestGelScreen::new);
			MenuScreens.register(TestModMenus.SMALL_PILE_OF_STICK_GUI.get(), SmallPileOfStickGuiScreen::new);
			MenuScreens.register(TestModMenus.FLETCHING_TABLE_GUI.get(), FletchingTableGuiScreen::new);
			MenuScreens.register(TestModMenus.STORAGE_TEST.get(), StorageTestScreen::new);
		});
	}
}

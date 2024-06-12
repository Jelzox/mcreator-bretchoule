package net.mcreator.test.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Checkbox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.test.world.inventory.GuiTestGelMenu;
import net.mcreator.test.network.GuiTestGelButtonMessage;
import net.mcreator.test.TestMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class GuiTestGelScreen extends AbstractContainerScreen<GuiTestGelMenu> {
	private final static HashMap<String, Object> guistate = GuiTestGelMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Checkbox Glacon;
	Checkbox Glacon2;
	Button button_congeler;

	public GuiTestGelScreen(GuiTestGelMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("test:textures/screens/gui_test_gel.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		button_congeler = Button.builder(Component.translatable("gui.test.gui_test_gel.button_congeler"), e -> {
			if (true) {
				TestMod.PACKET_HANDLER.sendToServer(new GuiTestGelButtonMessage(0, x, y, z));
				GuiTestGelButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 69, this.topPos + 26, 67, 20).build();
		guistate.put("button:button_congeler", button_congeler);
		this.addRenderableWidget(button_congeler);
		Glacon = new Checkbox(this.leftPos + 40, this.topPos + 7, 20, 20, Component.translatable("gui.test.gui_test_gel.Glacon"), false);
		guistate.put("checkbox:Glacon", Glacon);
		this.addRenderableWidget(Glacon);
		Glacon2 = new Checkbox(this.leftPos + 40, this.topPos + 47, 20, 20, Component.translatable("gui.test.gui_test_gel.Glacon2"), false);
		guistate.put("checkbox:Glacon2", Glacon2);
		this.addRenderableWidget(Glacon2);
	}
}

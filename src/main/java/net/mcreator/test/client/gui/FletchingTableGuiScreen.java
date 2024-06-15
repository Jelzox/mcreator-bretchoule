package net.mcreator.test.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.test.world.inventory.FletchingTableGuiMenu;
import net.mcreator.test.network.FletchingTableGuiButtonMessage;
import net.mcreator.test.TestMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class FletchingTableGuiScreen extends AbstractContainerScreen<FletchingTableGuiMenu> {
	private final static HashMap<String, Object> guistate = FletchingTableGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_uncraft_arrow;

	public FletchingTableGuiScreen(FletchingTableGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = new ResourceLocation("test:textures/screens/fletching_table_gui.png");

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
		button_uncraft_arrow = Button.builder(Component.translatable("gui.test.fletching_table_gui.button_uncraft_arrow"), e -> {
			if (true) {
				TestMod.PACKET_HANDLER.sendToServer(new FletchingTableGuiButtonMessage(0, x, y, z));
				FletchingTableGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 51, this.topPos + 24, 93, 20).build();
		guistate.put("button:button_uncraft_arrow", button_uncraft_arrow);
		this.addRenderableWidget(button_uncraft_arrow);
	}
}

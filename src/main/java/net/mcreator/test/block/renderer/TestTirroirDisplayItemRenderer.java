package net.mcreator.test.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.test.block.model.TestTirroirDisplayModel;
import net.mcreator.test.block.display.TestTirroirDisplayItem;

public class TestTirroirDisplayItemRenderer extends GeoItemRenderer<TestTirroirDisplayItem> {
	public TestTirroirDisplayItemRenderer() {
		super(new TestTirroirDisplayModel());
	}

	@Override
	public RenderType getRenderType(TestTirroirDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

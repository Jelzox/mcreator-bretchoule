package net.mcreator.test.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.test.block.model.TestTirroirBlockModel;
import net.mcreator.test.block.entity.TestTirroirTileEntity;

public class TestTirroirTileRenderer extends GeoBlockRenderer<TestTirroirTileEntity> {
	public TestTirroirTileRenderer() {
		super(new TestTirroirBlockModel());
	}

	@Override
	public RenderType getRenderType(TestTirroirTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

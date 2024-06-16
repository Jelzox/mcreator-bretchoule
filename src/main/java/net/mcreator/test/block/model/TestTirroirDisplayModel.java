package net.mcreator.test.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.test.block.display.TestTirroirDisplayItem;

public class TestTirroirDisplayModel extends GeoModel<TestTirroirDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(TestTirroirDisplayItem animatable) {
		return new ResourceLocation("test", "animations/tirroir_-_converted.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TestTirroirDisplayItem animatable) {
		return new ResourceLocation("test", "geo/tirroir_-_converted.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TestTirroirDisplayItem entity) {
		return new ResourceLocation("test", "textures/block/oak_planks.png");
	}
}

package net.mcreator.test.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.test.block.entity.TestTirroirTileEntity;

public class TestTirroirBlockModel extends GeoModel<TestTirroirTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TestTirroirTileEntity animatable) {
		return new ResourceLocation("test", "animations/tirroir_-_converted.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TestTirroirTileEntity animatable) {
		return new ResourceLocation("test", "geo/tirroir_-_converted.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TestTirroirTileEntity animatable) {
		return new ResourceLocation("test", "textures/block/oak_planks.png");
	}
}

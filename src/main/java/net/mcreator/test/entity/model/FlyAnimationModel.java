package net.mcreator.test.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.test.entity.FlyAnimationEntity;

public class FlyAnimationModel extends GeoModel<FlyAnimationEntity> {
	@Override
	public ResourceLocation getAnimationResource(FlyAnimationEntity entity) {
		return new ResourceLocation("test", "animations/fly.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FlyAnimationEntity entity) {
		return new ResourceLocation("test", "geo/fly.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FlyAnimationEntity entity) {
		return new ResourceLocation("test", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(FlyAnimationEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("Head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}


package net.mcreator.blockpiece.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.blockpiece.procedures.DaiEnkaiOnEffectActiveTickProcedure;
import net.mcreator.blockpiece.procedures.DaiEnkaiEffectExpiresProcedure;

public class DaiEnkaiMobEffect extends MobEffect {
	public DaiEnkaiMobEffect() {
		super(MobEffectCategory.NEUTRAL, -3381760);
	}

	@Override
	public String getDescriptionId() {
		return "effect.blockpiece.dai_enkai";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		DaiEnkaiOnEffectActiveTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ());
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		DaiEnkaiEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}

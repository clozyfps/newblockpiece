
package net.mcreator.blockpiece.potion;

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
		DaiEnkaiOnEffectActiveTickProcedure.execute(

		);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		DaiEnkaiEffectExpiresProcedure.execute(

		);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}

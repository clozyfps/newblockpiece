
package net.mcreator.blockpiece.potion;

public class DfCooldownMobEffect extends MobEffect {

	public DfCooldownMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.blockpiece.df_cooldown";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}

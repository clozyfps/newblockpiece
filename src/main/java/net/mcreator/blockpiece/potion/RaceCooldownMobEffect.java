
package net.mcreator.blockpiece.potion;

public class RaceCooldownMobEffect extends MobEffect {

	public RaceCooldownMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.blockpiece.race_cooldown";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}

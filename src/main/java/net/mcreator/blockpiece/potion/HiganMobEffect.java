
package net.mcreator.blockpiece.potion;

public class HiganMobEffect extends MobEffect {

	public HiganMobEffect() {
		super(MobEffectCategory.NEUTRAL, -26368);
	}

	@Override
	public String getDescriptionId() {
		return "effect.blockpiece.higan";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		HiganOnEffectActiveTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}

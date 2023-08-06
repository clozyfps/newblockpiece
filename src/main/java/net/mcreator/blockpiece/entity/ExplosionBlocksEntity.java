
package net.mcreator.blockpiece.entity;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class ExplosionBlocksEntity extends AbstractArrow implements ItemSupplier {
	public ExplosionBlocksEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(BlockpieceModEntities.EXPLOSION_BLOCKS.get(), world);
	}

	public ExplosionBlocksEntity(EntityType<? extends ExplosionBlocksEntity> type, Level world) {
		super(type, world);
	}

	public ExplosionBlocksEntity(EntityType<? extends ExplosionBlocksEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public ExplosionBlocksEntity(EntityType<? extends ExplosionBlocksEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return ItemStack.EMPTY;
	}

	@Override
	protected ItemStack getPickupItem() {
		return ItemStack.EMPTY;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void tick() {
		super.tick();
		ExplosionBlocksTickingProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
		if (this.inGround)
			this.discard();
	}

	public static ExplosionBlocksEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		ExplosionBlocksEntity entityarrow = new ExplosionBlocksEntity(BlockpieceModEntities.EXPLOSION_BLOCKS.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("")), SoundSource.PLAYERS, 1, 1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static ExplosionBlocksEntity shoot(LivingEntity entity, LivingEntity target) {
		ExplosionBlocksEntity entityarrow = new ExplosionBlocksEntity(BlockpieceModEntities.EXPLOSION_BLOCKS.get(), entity, entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 0f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(0);
		entityarrow.setKnockback(0);
		entityarrow.setCritArrow(false);
		entity.level.addFreshEntity(entityarrow);
		entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("")), SoundSource.PLAYERS, 1, 1f / (RandomSource.create().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}

package net.mcreator.blockpiece.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.blockpiece.network.BlockpieceModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ExpProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity sourceentity) {
		execute(null, world, x, y, z, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if ((sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).Exp <= (sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new BlockpieceModVariables.PlayerVariables())).ExpCap) {
			{
				double _setval = (sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).Exp + Mth.nextInt(RandomSource.create(), 1, 4);
				sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Exp = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		} else if ((sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).Exp > (sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new BlockpieceModVariables.PlayerVariables())).ExpCap) {
			{
				double _setval = (sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).Level + 1;
				sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Level = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
			{
				double _setval = 0;
				sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Exp = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
			{
				double _setval = (sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BlockpieceModVariables.PlayerVariables())).ExpCap + Mth.nextInt(RandomSource.create(), 5, 10);
				sourceentity.getCapability(BlockpieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ExpCap = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (sourceentity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Level Up!"), true);
		}
	}
}

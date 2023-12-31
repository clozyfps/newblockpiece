package net.mcreator.blockpiece.network;

import software.bernie.shadowed.eliotlash.mclib.math.functions.classic.Exp;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.blockpiece.BlockpieceMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockpieceModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		BlockpieceMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level.isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level.isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level.isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.SelectedMoveset = original.SelectedMoveset;
			clone.DevilFruit = original.DevilFruit;
			clone.Race = original.Race;
			clone.FightingStyle = original.FightingStyle;
			clone.SwitchCurrentMove = original.SwitchCurrentMove;
			clone.SelectedMove = original.SelectedMove;
			clone.BusoHakiProgress = original.BusoHakiProgress;
			clone.HaoHakiProgress = original.HaoHakiProgress;
			clone.KenHakiProgress = original.KenHakiProgress;
			clone.FSMasteryMultiplier = original.FSMasteryMultiplier;
			clone.DFMasteryMultiplier = original.DFMasteryMultiplier;
			clone.ExpCap = original.ExpCap;
			clone.RaceMasteryMultiplier = original.RaceMasteryMultiplier;
			clone.Level = original.Level;
			clone.Exp = original.Exp;
			clone.Beli = original.Beli;
			clone.DFMastery = original.DFMastery;
			clone.RaceMastery = original.RaceMastery;
			clone.FSMastery = original.FSMastery;
			clone.QuestGoal = original.QuestGoal;
			clone.QuestItem = original.QuestItem;
			clone.QuestMob = original.QuestMob;
			clone.QuestProgress = original.QuestProgress;
			clone.QuestRequirement = original.QuestRequirement;
			clone.Faction = original.Faction;
			clone.Stamina = original.Stamina;
			clone.StaminaCap = original.StaminaCap;
			clone.FirstName = original.FirstName;
			clone.Clan = original.Clan;
			if (!event.isWasDeath()) {
			}
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("blockpiece", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public String SelectedMoveset = "";
		public String DevilFruit = "";
		public String Race = "";
		public String FightingStyle = "";
		public double SwitchCurrentMove = 0;
		public String SelectedMove = "Not Selected";
		public double BusoHakiProgress = 0;
		public double HaoHakiProgress = 0;
		public double KenHakiProgress = 0;
		public double FSMasteryMultiplier = 1.0;
		public double DFMasteryMultiplier = 1.0;
		public double ExpCap = 15.0;
		public double RaceMasteryMultiplier = 1.0;
		public double Level = 1.0;
		public double Exp = 0.0;
		public double Beli = 0;
		public double DFMastery = 0;
		public double RaceMastery = 0;
		public double FSMastery = 0;
		public String QuestGoal = "";
		public String QuestItem = "";
		public String QuestMob = "";
		public double QuestProgress = 0;
		public double QuestRequirement = 0;
		public String Faction = "";
		public double Stamina = 0;
		public double StaminaCap = 0;
		public String FirstName = "\"\"";
		public String Clan = "\"\"";

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				BlockpieceMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putString("SelectedMoveset", SelectedMoveset);
			nbt.putString("DevilFruit", DevilFruit);
			nbt.putString("Race", Race);
			nbt.putString("FightingStyle", FightingStyle);
			nbt.putDouble("SwitchCurrentMove", SwitchCurrentMove);
			nbt.putString("SelectedMove", SelectedMove);
			nbt.putDouble("BusoHakiProgress", BusoHakiProgress);
			nbt.putDouble("HaoHakiProgress", HaoHakiProgress);
			nbt.putDouble("KenHakiProgress", KenHakiProgress);
			nbt.putDouble("FSMasteryMultiplier", FSMasteryMultiplier);
			nbt.putDouble("DFMasteryMultiplier", DFMasteryMultiplier);
			nbt.putDouble("ExpCap", ExpCap);
			nbt.putDouble("RaceMasteryMultiplier", RaceMasteryMultiplier);
			nbt.putDouble("Level", Level);
			nbt.putDouble("Exp", Exp);
			nbt.putDouble("Beli", Beli);
			nbt.putDouble("DFMastery", DFMastery);
			nbt.putDouble("RaceMastery", RaceMastery);
			nbt.putDouble("FSMastery", FSMastery);
			nbt.putString("QuestGoal", QuestGoal);
			nbt.putString("QuestItem", QuestItem);
			nbt.putString("QuestMob", QuestMob);
			nbt.putDouble("QuestProgress", QuestProgress);
			nbt.putDouble("QuestRequirement", QuestRequirement);
			nbt.putString("Faction", Faction);
			nbt.putDouble("Stamina", Stamina);
			nbt.putDouble("StaminaCap", StaminaCap);
			nbt.putString("FirstName", FirstName);
			nbt.putString("Clan", Clan);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			SelectedMoveset = nbt.getString("SelectedMoveset");
			DevilFruit = nbt.getString("DevilFruit");
			Race = nbt.getString("Race");
			FightingStyle = nbt.getString("FightingStyle");
			SwitchCurrentMove = nbt.getDouble("SwitchCurrentMove");
			SelectedMove = nbt.getString("SelectedMove");
			BusoHakiProgress = nbt.getDouble("BusoHakiProgress");
			HaoHakiProgress = nbt.getDouble("HaoHakiProgress");
			KenHakiProgress = nbt.getDouble("KenHakiProgress");
			FSMasteryMultiplier = nbt.getDouble("FSMasteryMultiplier");
			DFMasteryMultiplier = nbt.getDouble("DFMasteryMultiplier");
			ExpCap = nbt.getDouble("ExpCap");
			RaceMasteryMultiplier = nbt.getDouble("RaceMasteryMultiplier");
			Level = nbt.getDouble("Level");
			Exp = nbt.getDouble("Exp");
			Beli = nbt.getDouble("Beli");
			DFMastery = nbt.getDouble("DFMastery");
			RaceMastery = nbt.getDouble("RaceMastery");
			FSMastery = nbt.getDouble("FSMastery");
			QuestGoal = nbt.getString("QuestGoal");
			QuestItem = nbt.getString("QuestItem");
			QuestMob = nbt.getString("QuestMob");
			QuestProgress = nbt.getDouble("QuestProgress");
			QuestRequirement = nbt.getDouble("QuestRequirement");
			Faction = nbt.getString("Faction");
			Stamina = nbt.getDouble("Stamina");
			StaminaCap = nbt.getDouble("StaminaCap");
			FirstName = nbt.getString("FirstName");
			Clan = nbt.getString("Clan");
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.SelectedMoveset = message.data.SelectedMoveset;
					variables.DevilFruit = message.data.DevilFruit;
					variables.Race = message.data.Race;
					variables.FightingStyle = message.data.FightingStyle;
					variables.SwitchCurrentMove = message.data.SwitchCurrentMove;
					variables.SelectedMove = message.data.SelectedMove;
					variables.BusoHakiProgress = message.data.BusoHakiProgress;
					variables.HaoHakiProgress = message.data.HaoHakiProgress;
					variables.KenHakiProgress = message.data.KenHakiProgress;
					variables.FSMasteryMultiplier = message.data.FSMasteryMultiplier;
					variables.DFMasteryMultiplier = message.data.DFMasteryMultiplier;
					variables.ExpCap = message.data.ExpCap;
					variables.RaceMasteryMultiplier = message.data.RaceMasteryMultiplier;
					variables.Level = message.data.Level;
					variables.Exp = message.data.Exp;
					variables.Beli = message.data.Beli;
					variables.DFMastery = message.data.DFMastery;
					variables.RaceMastery = message.data.RaceMastery;
					variables.FSMastery = message.data.FSMastery;
					variables.QuestGoal = message.data.QuestGoal;
					variables.QuestItem = message.data.QuestItem;
					variables.QuestMob = message.data.QuestMob;
					variables.QuestProgress = message.data.QuestProgress;
					variables.QuestRequirement = message.data.QuestRequirement;
					variables.Faction = message.data.Faction;
					variables.Stamina = message.data.Stamina;
					variables.StaminaCap = message.data.StaminaCap;
					variables.FirstName = message.data.FirstName;
					variables.Clan = message.data.Clan;
				}
			});
			context.setPacketHandled(true);
		}
	}
}

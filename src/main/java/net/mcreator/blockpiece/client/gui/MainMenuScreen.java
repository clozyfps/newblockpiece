package net.mcreator.blockpiece.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.blockpiece.world.inventory.MainMenuMenu;
import net.mcreator.blockpiece.procedures.DisplayRACEProcedure;
import net.mcreator.blockpiece.procedures.DisplayPlayerGUIProcedure;
import net.mcreator.blockpiece.procedures.DisplayLVLProcedure;
import net.mcreator.blockpiece.procedures.DisplayFSProcedure;
import net.mcreator.blockpiece.procedures.DisplayDFProcedure;
import net.mcreator.blockpiece.procedures.DisplayBeliProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class MainMenuScreen extends AbstractContainerScreen<MainMenuMenu> {
	private final static HashMap<String, Object> guistate = MainMenuMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public MainMenuScreen(MainMenuMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		if (DisplayPlayerGUIProcedure.execute(entity) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryRaw(this.leftPos + 129, this.topPos + 80, 30, 0f + (float) Math.atan((this.leftPos + 129 - mouseX) / 40.0), (float) Math.atan((this.topPos + 30 - mouseY) / 40.0), livingEntity);
		}
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		RenderSystem.setShaderTexture(0, new ResourceLocation("blockpiece:textures/screens/mainmapgui.png"));
		this.blit(ms, this.leftPos + -39, this.topPos + -50, 0, 0, 256, 256, 256, 256);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack,

				DisplayDFProcedure.execute(entity), 106, 99, -12829636);
		this.font.draw(poseStack,

				DisplayFSProcedure.execute(entity), 106, 123, -12829636);
		this.font.draw(poseStack,

				DisplayRACEProcedure.execute(entity), 98, 146, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.blockpiece.main_menu.label_devil_fruit"), 99, 89, -1);
		this.font.draw(poseStack, Component.translatable("gui.blockpiece.main_menu.label_fighting_style"), 92, 112, -1);
		this.font.draw(poseStack, Component.translatable("gui.blockpiece.main_menu.label_race"), 115, 136, -1);
		this.font.draw(poseStack, Component.translatable("gui.blockpiece.main_menu.label_beli"), 8, 23, -13312);
		this.font.draw(poseStack,

				DisplayBeliProcedure.execute(entity), 37, 23, -13312);
		this.font.draw(poseStack,

				DisplayLVLProcedure.execute(entity), 8, 11, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
	}
}

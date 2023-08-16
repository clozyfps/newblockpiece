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

import net.mcreator.blockpiece.world.inventory.BountyMenuMenu;
import net.mcreator.blockpiece.procedures.LastNameValueProcedure;
import net.mcreator.blockpiece.procedures.FirstNameValueProcedure;
import net.mcreator.blockpiece.procedures.DisplayPlayerGUIProcedure;
import net.mcreator.blockpiece.procedures.BountyValueProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class BountyMenuScreen extends AbstractContainerScreen<BountyMenuMenu> {
	private final static HashMap<String, Object> guistate = BountyMenuMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public BountyMenuScreen(BountyMenuMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("blockpiece:textures/screens/bounty_menu.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		if (DisplayPlayerGUIProcedure.execute(entity) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryRaw(this.leftPos + 4, this.topPos + 85, 40, 0f, 0, livingEntity);
		}
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("blockpiece:textures/screens/pixil-frame-0_2.png"));
		this.blit(ms, this.leftPos + -76, this.topPos + -19, 0, 0, 157, 190, 157, 190);

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

				FirstNameValueProcedure.execute(entity), -55, 106, -16777216);
		this.font.draw(poseStack,

				LastNameValueProcedure.execute(entity), 17, 106, -16777216);
		this.font.draw(poseStack,

				BountyValueProcedure.execute(entity), -28, 123, -16777216);
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

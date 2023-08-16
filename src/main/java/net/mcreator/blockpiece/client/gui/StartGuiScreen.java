package net.mcreator.blockpiece.client.gui;

public class StartGuiScreen extends AbstractContainerScreen<StartGuiMenu> {

	private final static HashMap<String, Object> guistate = StartGuiMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	EditBox FirstName;

	Button button_begin;

	public StartGuiScreen(StartGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("blockpiece:textures/screens/start_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);

		FirstName.render(ms, mouseX, mouseY, partialTicks);

	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}

		if (FirstName.isFocused())
			return FirstName.keyPressed(key, b, c);

		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		FirstName.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.blockpiece.start_gui.label_what_shall_the_world_call_you"), -74, -11, -1);
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

		FirstName = new EditBox(this.font, this.leftPos + -59, this.topPos + 11, 120, 20, Component.translatable("gui.blockpiece.start_gui.FirstName")) {
			{
				setSuggestion(Component.translatable("gui.blockpiece.start_gui.FirstName").getString());
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);

				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.blockpiece.start_gui.FirstName").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);

				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.blockpiece.start_gui.FirstName").getString());
				else
					setSuggestion(null);
			}
		};
		FirstName.setMaxLength(32767);

		guistate.put("text:FirstName", FirstName);
		this.addWidget(this.FirstName);

		button_begin = new Button(this.leftPos + -24, this.topPos + 44, 51, 20, Component.translatable("gui.blockpiece.start_gui.button_begin"), e -> {
			if (true) {
				BlockpieceMod.PACKET_HANDLER.sendToServer(new StartGuiButtonMessage(0, x, y, z));
				StartGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});

		guistate.put("button:button_begin", button_begin);
		this.addRenderableWidget(button_begin);

	}

}

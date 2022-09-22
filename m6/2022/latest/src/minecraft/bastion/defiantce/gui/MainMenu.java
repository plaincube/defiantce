package bastion.defiantce.gui;

import bastion.defiantce.Defiant;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

public class MainMenu extends GuiScreen {
	
	public MainMenu() {
		
	}
	
	public void initGui() {
		
	}
	
	public void drawScreen(int mouseX, int mouseY, float partialticks) {
		
		mc.getTextureManager().bindTexture(new ResourceLocation("defiantce/mainMenuBackground.jpg"));
		this.drawModalRectWithCustomSizedTexture(0, 0, 0, 0, this.width, this.height, this.width, this.height);
		this.drawGradientRect(0, height - 90, width, height, 0x00000000, 0xff000000);
		
		String[] buttons = {"SinglePlayer", "MultiPlayer", "Settings", "Language", "Quit"};
		int count = 0;
		for(String name : buttons) {
			float x = (width / buttons.length) * count + (width /buttons.length) / 2f + * -mc.fontRendererObj.getStringWidth(name);
		}
		
		GlStateManager.pushMatrix();
		GlStateManager.translate(width / 2f, height / 2f, 0);
		GlStateManager.scale(3,  3,  1);
		GlStateManager.translate(-(width / 2f), -(height / 2f), 0);
		GlStateManager.popMatrix();
		
		this.drawCenteredString(mc.fontRendererObj, Defiant.name + Defiant.version + " by Cube and Healer", width /2f, height /2.5f - mc.fontRendererObj.FONT_HEIGHT /2f, -1);
		this.drawCenteredString(mc.fontRendererObj, "By Cube and Healer", width /2f, height /2.25f - mc.fontRendererObj.FONT_HEIGHT /2f, -1);
		
	}
	
	public void mousePressed(int mouseX, int mouseY, int button) {
		
	}
	
	public void onGuiClosed() {
		
	}
	
}

package bastion.defiantce.gui;

import bastion.defiantce.Defiant;
import bastion.defiantce.module.Module;
import bastion.defiantce.utils.Wrapper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiIngame;

public class GuiIngameHook extends GuiIngame {

	public GuiIngameHook(Minecraft mcIn) {
		super(mcIn);
	}
	
	public void renderGameOverlay(float p_175180_1_){
	      super.renderGameOverlay(p_175180_1_);
	      
	      if(!mc.gameSettings.showDebugInfo) {
	    	  
	    	  drawRect(2, 2, 95, 14, 0x80000000);
		      Wrapper.fr.drawString("DefiantCE", 4, 4, 0x00CDFF);
		      Wrapper.fr.drawString("FPS: " + mc.getDebugFPS(), 55, 4, -1);
		      
		      renderArrayList();
	    	  
	      }
	      
	}     

	public void renderArrayList() {
		int yCount = 10;
		int index = 0;
		long x = 0;
		for (Module m : Defiant.instance.moduleManager.getModules()) {
			m.onRender();
			if(m.isToggled()) {
				Wrapper.fr.drawString("- " + m.getName(), 5, yCount + 5, 0xFD0808);
				yCount += 10;
				index++;
				x++;
			}
		}
		
	}
	
}

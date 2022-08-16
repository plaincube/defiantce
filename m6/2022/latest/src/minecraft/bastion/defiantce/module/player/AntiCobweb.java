package bastion.defiantce.module.player;

import bastion.defiantce.module.Category;
import bastion.defiantce.module.Module;

public class AntiCobweb extends Module{

	public AntiCobweb() {
		super("AntiCobweb", 0, Category.PLAYER);
	}
	
	@Override
	public void onUpdate() {
		if(this.isToggled()) {
			mc.thePlayer.isInWeb = false;
		}
	}

}
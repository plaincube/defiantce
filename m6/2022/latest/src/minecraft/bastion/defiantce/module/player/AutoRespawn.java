package bastion.defiantce.module.player;

import bastion.defiantce.module.Category;
import bastion.defiantce.module.Module;
public class AutoRespawn extends Module{

	public AutoRespawn() {
		super("AutoRespawn", 0, Category.PLAYER);
	}
	
	@Override
	public void onUpdate() {
		if(this.isToggled()) {
			if(mc.thePlayer.isDead) {
				mc.thePlayer.respawnPlayer();
			}
		}
	}

}
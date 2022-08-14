package bastion.defiantce.module.movement;

import org.lwjgl.input.Keyboard;

import bastion.defiantce.module.Category;
import bastion.defiantce.module.Module;

public class SpeedHack extends Module{

	public SpeedHack() {
		super("SpeedHack", Keyboard.KEY_L, Category.MOVEMENT);
	}
	
	public void onUpdate() {
		if(this.isToggled()) {
			if(mc.thePlayer.onGround) {
				mc.thePlayer.motionX *= 2.0f;
				mc.thePlayer.motionZ *= 2.0f;
			}
		}
	}

}
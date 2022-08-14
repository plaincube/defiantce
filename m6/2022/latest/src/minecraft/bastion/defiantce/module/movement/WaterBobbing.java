package bastion.defiantce.module.movement;

import org.lwjgl.input.Keyboard;

import bastion.defiantce.module.Category;
import bastion.defiantce.module.Module;

public class WaterBobbing extends Module {

	public WaterBobbing() {
		super("WaterBobbing", Keyboard.KEY_U, Category.MOVEMENT);
	}
	
	@Override
	public void onUpdate() {
		if(this.isToggled()) {
			if(mc.thePlayer.isInWater()) {
				mc.thePlayer.motionY += 0.4;
			}
		}
	}

}

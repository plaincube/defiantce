package bastion.defiantce.module.movement;

import org.lwjgl.input.Keyboard;

import bastion.defiantce.module.Category;
import bastion.defiantce.module.Module;
import bastion.defiantce.utils.Invoker;

public class WallClimb extends Module{

	public WallClimb() {
		super("WallClimb", Keyboard.KEY_SEMICOLON, Category.MOVEMENT);

	}
	
	@Override
	public void onUpdate() {
		if(this.isToggled()) {
			if(Invoker.isCollidedHorizontally()) {
				Invoker.setMotionY(0.2);
				
				float var6 = 0.15F;
				
				if(Invoker.getMotionX() < (double)-var6) {
					Invoker.setMotionX((double)-var6);
				}
				
				if(Invoker.getMotionX() > (double)-var6) {
					Invoker.setMotionX((double)-var6);
				}
				
				if(Invoker.getMotionZ() < (double)-var6) {
					Invoker.setMotionZ((double)-var6);
				}
				
				if(Invoker.getMotionZ() > (double)-var6) {
					Invoker.setMotionZ((double)-var6);
				}
				
				Invoker.setFallDistance(0);
				
				if(Invoker.getMotionY() < 0.15D) {
					Invoker.setMotionY(-0.15D);
				}
			}
		}
	}
		
}
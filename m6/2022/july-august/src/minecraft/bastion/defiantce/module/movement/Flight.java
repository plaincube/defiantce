package bastion.defiantce.module.movement;

import org.lwjgl.input.Keyboard;

import bastion.defiantce.module.Category;
import bastion.defiantce.module.Module;

public class Flight extends Module {
	
	public static float flyHackSpeed = 0.1f;

	public Flight() {
		super("Flight", Keyboard.KEY_I, Category.MOVEMENT);
	}
	
	public void onDisable() {
		if(!mc.thePlayer.capabilities.isCreativeMode) {
			mc.thePlayer.capabilities.isFlying = false;
		}
		super.onDisable();
	}
	
	public void onUpdate( ) {
		if(this.isToggled()) {
			
			mc.thePlayer.capabilities.isFlying = true;
			
			if(mc.gameSettings.keyBindJump.isPressed()) {
				mc.thePlayer.motionY += 0.2f;
			}
			
			if(mc.gameSettings.keyBindSneak.isPressed()) {
				mc.thePlayer.motionY -= 0.2f;
			}
			
			if(mc.gameSettings.keyBindForward.isPressed()) {
				mc.thePlayer.capabilities.setFlySpeed(flyHackSpeed);
			}
			
			super.onDisable();
			
		}
	}

}

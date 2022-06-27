package bastion.defiantce.module.movement;

import org.lwjgl.input.Keyboard;

import bastion.defiantce.module.Category;
import bastion.defiantce.module.Module;

public class AutoWalk extends Module{

	public AutoWalk() {
		super("AutoWalk", Keyboard.KEY_, Category.MOVEMENT);
	}
	
	@Override
	public void onUpdate() {
		if(this.isToggled()) {
			mc.gameSettings.keyBindForward.pressed = true;
		}
	}
	@Override
	public void onDisable() {
		mc.gameSettings.keyBindForward.pressed = false;
		super.onDisable();
	}

}

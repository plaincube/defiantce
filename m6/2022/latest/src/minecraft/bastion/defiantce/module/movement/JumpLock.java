package bastion.defiantce.module.movement;

import bastion.defiantce.module.Category;
import bastion.defiantce.module.Module;
public class JumpLock extends Module{

	public JumpLock() {
		super("JumpLock", 0, Category.MOVEMENT);
	}
	
	@Override
	public void onDisable() {
		mc.gameSettings.keyBindJump.pressed = false;
		super.onDisable();
	}
	
	@Override
	public void onUpdate() {
		if(this.isToggled()) {
			mc.gameSettings.keyBindJump.pressed = true;
		}
	}

}
package bastion.defiantce.module.player;

import bastion.defiantce.module.Category;
import bastion.defiantce.module.Module;
import net.minecraft.network.play.client.C03PacketPlayer;

public class NoDamage extends Module {

	public NoDamage() {
		super("NoDamage", 0, Category.PLAYER);
	}
	
	public void onUpdate() {
		if(this.isToggled()) {
			mc.thePlayer.capabilities.disableDamage = true;
			if(mc.thePlayer.fallDistance > 2f) {
				mc.thePlayer.sendQueue.addToSendQueue(new C03PacketPlayer(true));
			}
			super.onUpdate();
		}
	}

}

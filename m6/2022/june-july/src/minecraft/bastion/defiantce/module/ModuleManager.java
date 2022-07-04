package bastion.defiantce.module;

import java.util.ArrayList;

import bastion.defiantce.module.combat.*;
import bastion.defiantce.module.movement.*;

public class ModuleManager {

	public static ArrayList<Module> mods;
	
	public ModuleManager() {
		mods = new ArrayList<Module>();
		
		//COMBAT
		newMod(new FastBow());
		newMod(new KillAura());
		
		//MOVEMENT
		newMod(new AutoJump());
		newMod(new Flight());
		newMod(new NoFallDamage());
		newMod(new ParkourHelper());
		newMod(new QuickLand());
		newMod(new SneakLock());
		newMod(new SpeedHack());
		newMod(new SprintLock());
		newMod(new UnlimitedJumps());
		newMod(new WalkLock());
		newMod(new WallClimb());
		newMod(new WaterBobbing());
		
		//PLAYER
		
		//RENDER
		
		//MISC
	}
	
	public static void newMod(Module m) {
		mods.add(m);
	}
	
	public static ArrayList<Module> getModules() {
		return mods;
	}
	
	public static void onUpdate() {
		for(Module m : mods) {
			m.onUpdate();
		}
	}
	
	public static void onRender() {
		for (Module m : mods) {
			m.onRender();
		}
	}
	
	public static void onKey(int k) {
		for (Module m : mods) {
			if (m.getKey() == k) {
				m.toggle();
			}
		}
	}
	
}

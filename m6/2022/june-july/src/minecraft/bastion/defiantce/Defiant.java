package bastion.defiantce;

import org.lwjgl.opengl.Display;

import bastion.defiantce.module.ModuleManager;
import de.Hero.settings.SettingsManager;

public class Defiant {
	
	public static Defiant instance = new Defiant();	

	public static String name = "DefiantCE", version = "2022 m6", creator = "Cube";
	
	public static ModuleManager moduleManager;
	
	public static SettingsManager settingsManager;
	
	public static void startClient() {
		settingsManager = new SettingsManager();
		
		moduleManager = new ModuleManager();
		
		System.out.println("DCE: DefiantCE has started (main menu loaded).");
		
		Display.setTitle(name + " " + version);
	}
	
}
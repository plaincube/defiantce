package bastion.defiantce;

import java.util.concurrent.CopyOnWriteArrayList;

import org.lwjgl.opengl.Display;

import bastion.defiantce.command.CommandManager;
import bastion.defiantce.event.Event;
import bastion.defiantce.event.events.EventChat;
import bastion.defiantce.extensions.DiscordRP;
import bastion.defiantce.module.Module;
import bastion.defiantce.module.ModuleManager;
import de.Hero.clickgui.ClickGUI;
import de.Hero.settings.SettingsManager;

public class Defiant {
	
	public static Defiant instance = new Defiant();	

	public static String name = "DefiantCE", version = "2022 m6", creator = "Cube";
	
	public static ModuleManager moduleManager;
	
	public static SettingsManager settingsManager;
	
	public static ClickGUI clickGUI;
	
	public static CommandManager cmdManager;
	
	public static DiscordRP discordRP = new DiscordRP();
	
	public static void startClient() {
		
		settingsManager = new SettingsManager();
		
		moduleManager = new ModuleManager();
		
		clickGUI = new ClickGUI();
		
		cmdManager = new CommandManager();
		
		discordRP.start();
		
		System.out.println("DefiantCE has started (main menu loaded).");
		
		Display.setTitle(name + " " + version);
		
	}
	
	public static void onEvent(Event e) {
		if(e instanceof EventChat) {
			cmdManager.handleChat((EventChat)e);
		}
		for(Module m : modules) {
			if(!m.toggled)
				continue;
			m.onEvent(e);
		}
	}
	
	public static DiscordRP getDiscordRP() {
		return discordRP;
	}
	
	public static CopyOnWriteArrayList<Module> modules = new CopyOnWriteArrayList<Module>();
	
}

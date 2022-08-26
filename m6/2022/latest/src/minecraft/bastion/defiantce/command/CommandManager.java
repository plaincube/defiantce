package bastion.defiantce.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bastion.defiantce.Defiant;
import bastion.defiantce.command.commands.*;
import bastion.defiantce.event.events.EventChat;

public class CommandManager {

	public static List<Command> commands = new ArrayList<Command>();
	public String prefix = "dce--";
	
	public CommandManager() {
		setup();
	}
	
	public void setup() {
		
		//Commands
		commands.add(new Bind());
		commands.add(new Toggle());
	}
	
	public static List<Command> getCommands(){
		return commands;
	}
	
	public void handleChat(EventChat event) {
		String message = event.getMessage();
		
		if(!message.startsWith(prefix))
			return;
		
		event.setCancelled(true);
		
		message = message.substring(prefix.length());
		
		boolean foundCommand = false;
		
		if(message.split(" ").length > 0) {
			String commandName = message.split(" ")[0];
			
			for(Command c : commands) {
				if(c.aliases.contains(commandName) || c.name.equalsIgnoreCase(commandName)) {
					c.onCommand(Arrays.copyOfRange(message.split(" "), 1, message.split(" ").length), message);
					foundCommand = true;
					break;
				}
			}
		}
		
		if(!foundCommand) {
			Defiant.instance.moduleManager.addChatMessage("Command not found!");
		}
		
	}
	
}

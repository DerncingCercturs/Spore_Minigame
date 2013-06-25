package net.minigame.spore;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {

  public Commands(SporeMinigame sporeMinigame) {
		// TODO Auto-generated constructor stub
	}

	@Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		Player player = (Player) sender;
    	if(cmd.getName().equalsIgnoreCase("stest")){
			player.sendMessage(enabled);
			//broken until we can find out how to make value from config static
		}
    	return false;
    }
}

package net.minigame.spore;

import java.util.logging.Logger;

import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

//Haha I can edit this.


public class SporeMinigame extends JavaPlugin implements Listener {
  public final Logger logger =  Logger.getLogger("Minecraft");
	public static SporeMinigame plugin;
	
    @Override
    public void onEnable(){
    	PluginDescriptionFile pdfFile = this.getDescription();
    	this.logger.info(pdfFile.getName() + " " + "v" + " " + pdfFile.getVersion() + " " + "has been enabled");
    	getServer().getPluginManager().registerEvents(this,this);
    }

    @Override
    public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " " + "has been disabled.");
    }
}

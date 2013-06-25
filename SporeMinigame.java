package net.minigame.spore;

import java.io.File;
import java.util.logging.Logger;

import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;


public class SporeMinigame extends JavaPlugin implements Listener {
	public final Logger logger =  Logger.getLogger("Minecraft");
	
	@Override
    	public void onEnable(){
    		PluginDescriptionFile pdfFile = this.getDescription();
    		this.logger.info(pdfFile.getName() + "  v " + pdfFile.getVersion() + " has been enabled");
    		getServer().getPluginManager().registerEvents(this,this);
    		getCommand("stest").setExecutor(new Commands(this));
    		File config = new File(getDataFolder() + File.separator + "config.yml");
    		if(!config.exists()){
    		this.logger.info("Creating default config file for " + pdfFile.getName() + "...");
    		this.getConfig().addDefault("status", "true");
    		this.getConfig().options().copyDefaults(true);
    		this.saveConfig();
    	}
    	
    	String enabled = this.getConfig().getString("status");
    	//make this static
    }

    @Override
    public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " " + "has been disabled.");
    }       
}

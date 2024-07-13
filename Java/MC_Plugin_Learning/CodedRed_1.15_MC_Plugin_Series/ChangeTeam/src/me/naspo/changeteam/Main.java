package me.naspo.changeteam;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        super.onEnable();
        getLogger().info("ChangeTeam has been enabled!");
        GUI obj = new GUI();
        Commands commands = new Commands(obj);
        this.getCommand("changeteam").setExecutor(commands);
        this.getServer().getPluginManager().registerEvents(commands, this);
    }

    @Override
    public void onDisable() {
        super.onDisable();
        getLogger().info("ChangeTeam has been disabled!");
    }
    
}

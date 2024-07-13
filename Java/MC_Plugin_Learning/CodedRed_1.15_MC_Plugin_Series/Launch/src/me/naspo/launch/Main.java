package me.naspo.launch;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        super.onEnable();
        getLogger().info("Launch has been enabled!");
        this.getCommand("launch").setExecutor(new launch());
        this.getCommand("push").setExecutor(new push());
    }

    @Override
    public void onDisable() {
        super.onDisable();
        getLogger().info("Launch has been disabled!");
    }

}

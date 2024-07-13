package me.naspo.startool;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        super.onEnable();
        getLogger().info("StarTool has been enabled!");
        this.getCommand("startool").setExecutor(new StarTool());
        this.getServer().getPluginManager().registerEvents(new StarTool(), this);
    }

    @Override
    public void onDisable() {
        super.onDisable();
        getLogger().info("StarTool has been disabled!");
    }
}

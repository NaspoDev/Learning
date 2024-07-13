package me.naspo.godboots;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        super.onEnable();
        getLogger().info("GodBoots has been enabled!");
        this.getCommand("godboots").setExecutor(new GodBoots());
        this.getServer().getPluginManager().registerEvents(new GodBoots(), this);
    }

    @Override
    public void onDisable() {
        super.onDisable();
        getLogger().info("GodBoots has been disabled!");
    }
}

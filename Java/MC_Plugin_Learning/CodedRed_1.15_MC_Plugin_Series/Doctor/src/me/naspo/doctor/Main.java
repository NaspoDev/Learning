package me.naspo.doctor;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        super.onEnable();
        getLogger().info("Doctor has been enabled!");
        this.getCommand("doctor").setExecutor(new Heal());
    }

    @Override
    public void onDisable() {
        super.onDisable();
        getLogger().info("Doctor has been disabled!");
    }

}

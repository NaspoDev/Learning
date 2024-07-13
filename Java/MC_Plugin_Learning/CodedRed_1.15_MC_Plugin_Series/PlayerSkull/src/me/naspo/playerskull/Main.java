package me.naspo.playerskull;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        super.onEnable();
        getLogger().info("PlayerSkull has been enabled!");
    }

    @Override
    public void onDisable() {
        super.onDisable();
        getLogger().info("PlayerSkull has been disabled!");
    }
}

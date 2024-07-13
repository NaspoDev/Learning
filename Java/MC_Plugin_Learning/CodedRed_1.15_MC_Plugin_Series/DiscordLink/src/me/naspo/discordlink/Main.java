package me.naspo.discordlink;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        super.onEnable();
        getLogger().info("DiscordLink has been enabled!");
        this.getCommand("discord").setExecutor(new Discord());
    }

    @Override
    public void onDisable() {
        super.onDisable();
        getLogger().info("DiscordLink has been disabled!");
    }
}

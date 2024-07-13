package me.naspo.customconfig;

import org.bukkit.plugin.java.JavaPlugin;

public final class CustomConfig extends JavaPlugin {

    Folder folder = new Folder(this);
    Data data = new Data(this);
    DataConfig dataConfig = new DataConfig(this);

    @Override
    public void onEnable() {
        // Plugin startup logic
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

package me.naspo.customconfig;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;

public class Data {

    CustomConfig plugin;
    Data(CustomConfig plugin) {
        this.plugin = plugin;
        saveDefaultConfig();
    }

    private FileConfiguration dataConfig = null;
    private File configFile = null;

    public void reloadFile() {
        if (configFile == null) {
            configFile = new File(plugin.getDataFolder(), "data.yml");
            dataConfig = YamlConfiguration.loadConfiguration(configFile);

            InputStream defaultStream = plugin.getResource("data.yml");
            if (defaultStream != null) {
                YamlConfiguration defaultConfig = YamlConfiguration.loadConfiguration(new InputStreamReader(defaultStream));
                dataConfig.setDefaults(defaultConfig);
            }
        }
    }

    public FileConfiguration getConfig() {
        if (dataConfig == null) {
            reloadFile();
            return dataConfig;
        }
        return dataConfig;
    }

    public void saveConfig() {
        if (dataConfig == null || configFile == null) {
            return;
        }
        try {
            getConfig().save(configFile);
        } catch (IOException e) {
            plugin.getLogger().log(Level.SEVERE, "Could not save config to " + configFile, e);
        }
    }

    public void saveDefaultConfig() {
        if (configFile == null) {
            configFile = new File(plugin.getDataFolder(), "data.yml");
            if(!configFile.exists()) {
                plugin.saveResource("data.yml", false);
            }
        }
    }
}

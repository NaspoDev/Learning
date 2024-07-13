package me.naspo.customconfig;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;

public class DataConfig {

    CustomConfig plugin;
    DataConfig(CustomConfig plugin) {
        this.plugin = plugin;
    }

    private File file;
    private FileConfiguration customFile;

    public void setup() {
        file = new File(plugin.getDataFolder(), "dataconfig.yml");

        if (!(file.exists())) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                plugin.getLogger().log(Level.SEVERE, "Could not create dataconfig.yml!");
            }
        }
        customFile = YamlConfiguration.loadConfiguration(file);
    }

    public FileConfiguration get() {
        if (customFile == null) {
            setup();
        }
        return customFile;
    }

    public void save() {
        try {
            customFile.save(file);
        } catch (IOException e) {
            plugin.getLogger().log(Level.SEVERE, "Could not save dataconfig.yml!");
        }
    }

    public void reload() {
        customFile = YamlConfiguration.loadConfiguration(file);
    }
}

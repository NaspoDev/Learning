package me.naspo.customconfig;

import java.io.File;
import java.util.logging.Level;

//Create a directory
public class Folder {

    CustomConfig plugin;
    Folder(CustomConfig plugin) {
        this.plugin = plugin;
    }

    public void directory() {
        File dir = new File(plugin.getDataFolder(), "DataFolder");

        if (!dir.exists()) {
            try {
                dir.mkdir();
                plugin.getLogger().info("Directory created successfully.");
            } catch (Exception e) {
                plugin.getLogger().log(Level.SEVERE, "Could not make directory!");
            }
        } else {
            plugin.getLogger().info("Directory already exists.");
        }
    }
}

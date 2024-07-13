package me.naspo.randomblock;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Random;

public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        super.onEnable();
        getLogger().info("RandomBlock has been enabled.");
        this.saveDefaultConfig();
        this.getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        super.onDisable();
        getLogger().info("RandomBlock has been disabled.");
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (label.equalsIgnoreCase("randomblock")) {
            if (!sender.hasPermission("randomblock.reload")) {
                sender.sendMessage(ChatColor.RED + "You do not have permission.");
                return true;
            }
            if (args.length == 0) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&',
                        "&cDid you mean &e/randomblock reload&c?"));
            } else if (args[0].equalsIgnoreCase("reload")) {
                this.reloadConfig();
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&',
                        this.getConfig().getString("messages.reload")));
            } else if (args[0].equalsIgnoreCase("testmsg")) {
                for (String msg : this.getConfig().getStringList("messages.testmsg")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&',
                            msg));
                }
            }
            sender.sendMessage(ChatColor.RED + "Incorrect Usage.");
            return true;
        }

        return false;
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        this.getConfig().getConfigurationSection("blocks").getKeys(false).forEach(key -> {
            if (key.equalsIgnoreCase(event.getBlock().getType().toString())) {
                ItemStack[] items = new ItemStack[this.getConfig().getStringList("blocks." + key).size()];
                ItemStack item;
                int position = 0;
                Random rand = new Random();
                for (String i : this.getConfig().getStringList("blocks." + key)) {
                    try {
                        item = new ItemStack(Material.matchMaterial(i), rand.nextInt(16) + 1);
                    } catch (Exception e) {
                        item = new ItemStack(Material.matchMaterial(key));
                    }
                    items[position] = item;
                    position++;
                }
                int num = rand.nextInt(items.length);
                event.setDropItems(false);
                World world = event.getPlayer().getWorld();
                Location loc = event.getBlock().getLocation();
                world.dropItemNaturally(loc, items[num]);
            }
        });
    }

}

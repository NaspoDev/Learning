package me.naspo.changeteam;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class GUI {

    public Inventory inv;

    public GUI() {
        createInv();
    }

    public void createInv() {
        inv = Bukkit.createInventory(null, 9, ChatColor.GREEN + "" + ChatColor.BOLD + "Pick a Team");

        ItemStack item = new ItemStack(Material.BLUE_CONCRETE);
        ItemMeta meta = item.getItemMeta();

        //Blue Team
        meta.setDisplayName(ChatColor.DARK_BLUE + "BLUE TEAM");
        List<String> lore = new ArrayList<String>();
        lore.add(ChatColor.GRAY + "Click to join team.");
        meta.setLore(lore);
        item.setItemMeta(meta);
        inv.setItem(0, item);

        //Red Team
        item.setType(Material.RED_CONCRETE);
        meta.setDisplayName(ChatColor.RED + "RED TEAM");
        item.setItemMeta(meta);
        inv.setItem(1, item);

        //Green Team
        item.setType(Material.LIME_CONCRETE);
        meta.setDisplayName(ChatColor.GREEN + "GREEN TEAM");
        item.setItemMeta(meta);
        inv.setItem(2, item);

        //Yellow Team
        item.setType(Material.YELLOW_CONCRETE);
        meta.setDisplayName(ChatColor.YELLOW + "YELLOW TEAM");
        item.setItemMeta(meta);
        inv.setItem(3, item);

        //Orange Team
        item.setType(Material.ORANGE_CONCRETE);
        meta.setDisplayName(ChatColor.GOLD + "Orange TEAM");
        item.setItemMeta(meta);
        inv.setItem(4, item);

        //Purple Team
        item.setType(Material.PURPLE_CONCRETE);
        meta.setDisplayName(ChatColor.DARK_PURPLE + "PURPLE TEAM");
        item.setItemMeta(meta);
        inv.setItem(5, item);

        //Cyan Team
        item.setType(Material.CYAN_CONCRETE);
        meta.setDisplayName(ChatColor.AQUA + "CYAN TEAM");
        item.setItemMeta(meta);
        inv.setItem(6, item);

        //Close Button
        item.setType(Material.BARRIER);
        meta.setDisplayName(ChatColor.DARK_RED + "Close Menu");
        lore.clear();
        meta.setLore(lore);
        item.setItemMeta(meta);
        inv.setItem(8, item);
    }
}

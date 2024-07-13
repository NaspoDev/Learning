package me.naspo.changeteam;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class Commands implements CommandExecutor, Listener {

    private final GUI obj;

    public Commands(GUI gui) {
        this.obj = gui;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (label.equalsIgnoreCase("changeteam")) {
            if (!(sender instanceof Player)) {
                sender.sendMessage("Only players can use this command.");
                return true;
            }
            Player player = (Player) sender;
            //open the gui
            player.openInventory(obj.inv);
            return true;
        }

        return false;
    }

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if (!(event.getClickedInventory().equals(obj.inv))) {
            return;
        }
        event.setCancelled(true);

        Player player = (Player) event.getWhoClicked();
        //blue team
        if (event.getSlot() == 0) {
            ItemStack[] armor = player.getEquipment().getArmorContents();
            armor = changeColor(armor, Color.BLUE);
            player.getEquipment().setArmorContents(armor);
            player.closeInventory();
            player.sendMessage(ChatColor.GOLD + "You changed your team!");

        }
        //red team
        if (event.getSlot() == 1) {
            ItemStack[] armor = player.getEquipment().getArmorContents();
            armor = changeColor(armor, Color.RED);
            player.getEquipment().setArmorContents(armor);
            player.closeInventory();
            player.sendMessage(ChatColor.GOLD + "You changed your team!");

        }
        //green team
        if (event.getSlot() == 2) {
            ItemStack[] armor = player.getEquipment().getArmorContents();
            armor = changeColor(armor, Color.LIME);
            player.getEquipment().setArmorContents(armor);
            player.closeInventory();
            player.sendMessage(ChatColor.GOLD + "You changed your team!");

        }
        //yellow team
        if (event.getSlot() == 3) {
            ItemStack[] armor = player.getEquipment().getArmorContents();
            armor = changeColor(armor, Color.YELLOW);
            player.getEquipment().setArmorContents(armor);
            player.closeInventory();
            player.sendMessage(ChatColor.GOLD + "You changed your team!");

        }
        //orange team
        if (event.getSlot() == 4) {
            ItemStack[] armor = player.getEquipment().getArmorContents();
            armor = changeColor(armor, Color.ORANGE);
            player.getEquipment().setArmorContents(armor);
            player.closeInventory();
            player.sendMessage(ChatColor.GOLD + "You changed your team!");

        }
        //purple team
        if (event.getSlot() == 5) {
            ItemStack[] armor = player.getEquipment().getArmorContents();
            armor = changeColor(armor, Color.PURPLE);
            player.getEquipment().setArmorContents(armor);
            player.closeInventory();
            player.sendMessage(ChatColor.GOLD + "You changed your team!");

        }
        //cyan team
        if (event.getSlot() == 6) {
            ItemStack[] armor = player.getEquipment().getArmorContents();
            armor = changeColor(armor, Color.AQUA);
            player.getEquipment().setArmorContents(armor);
            player.closeInventory();
            player.sendMessage(ChatColor.GOLD + "You changed your team!");

        }
        //close button
        if (event.getSlot() == 8) {
            player.closeInventory();
        }
    }

    public ItemStack[] changeColor (ItemStack[] a, Color color) {
        for (ItemStack item : a) {
            try {
                if (item.getType() == Material.LEATHER_BOOTS || item.getType() == Material.LEATHER_LEGGINGS
                        || item.getType() == Material.LEATHER_CHESTPLATE || item.getType() == Material.LEATHER_HELMET) {
                    LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
                    meta.setColor(color);
                    item.setItemMeta(meta);
                }
            } catch (Exception e) {
                //do nothing
            }
        }

        return a;
    }
}

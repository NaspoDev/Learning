package me.naspo.privatevault;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VaultStuff implements CommandExecutor, Listener {

    PrivateVault plugin;
    VaultStuff(PrivateVault plugin) {
        this.plugin = plugin;
    }

    HashMap<String, ItemStack[]> menus = new HashMap<String, ItemStack[]>();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("pv")) {
            if (!(sender instanceof Player)) {
                sender.sendMessage("This command can only be used by a player.");
                return true;
            }
            Player player = (Player) sender;
            Inventory vault = Bukkit.createInventory(player, 54, player.getName() + "'s Vault");
            if (menus.containsKey(player.getUniqueId().toString())) {
                vault.setContents(menus.get(player.getUniqueId().toString()));
                player.openInventory(vault);
                return true;
            }
            player.openInventory(vault);
            return true;
        }

        return false;
    }

    @EventHandler
    public void onGUIClose(InventoryCloseEvent event) {
        if (event.getView().getTitle().contains(event.getPlayer().getName() + "'s Vault")) {
            menus.put(event.getPlayer().getUniqueId().toString(), event.getInventory().getContents());
        }
    }

    public void saveInvs() {
        for (Map.Entry<String, ItemStack[]> entry : menus.entrySet()) {
            plugin.getConfig().set("data." + entry.getKey(), entry.getValue());
        }
        plugin.saveConfig();
    }

    public void restoreInvs() {
        plugin.getConfig().getConfigurationSection("data").getKeys(false).forEach(key -> {
            ItemStack[] content = ((List<ItemStack>) plugin.getConfig().get("data." + key)).toArray(new ItemStack[0]);
            menus.put(key, content);
        });
    }
}

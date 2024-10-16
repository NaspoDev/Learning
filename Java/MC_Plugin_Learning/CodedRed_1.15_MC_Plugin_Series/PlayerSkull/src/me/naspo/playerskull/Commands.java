package me.naspo.playerskull;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Commands implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (label.equalsIgnoreCase("skull")) {
            if (!(sender instanceof Player)) {
                sender.sendMessage("Only players can use this command!");
                return true;
            }
            Player player = (Player) sender;
            if (args.length == 0) {
                //give player their own skull
                player.sendMessage(ChatColor.translateAlternateColorCodes('&',
                        "&aYou have been given the skull of &6" + player.getName()));
                player.getInventory().addItem(getPlayerHead(player.getName()));
                return true;
            }
            // /skull <player>
            player.sendMessage(ChatColor.translateAlternateColorCodes('&',
                    "&aYou have been given the skull of &6" + args[0]));
            player.getInventory().addItem(getPlayerHead(args[0]));
            return true;

        }

        return false;
    }
    public ItemStack getPlayerHead(String player) {
        /* Also checking post and pre 1.13 because material names are different, and because why the fuck not do
        more work right? */

        boolean isNewVersion = Arrays.stream(Material.values()).map(Material::name).collect(Collectors.toList())
                .contains("PLAYER_HEAD");

        Material type = Material.matchMaterial(isNewVersion ? "PLAYER_HEAD" : "SKULL_ITEM");
        ItemStack item = new ItemStack(type, 1);

        if (!(isNewVersion)) {
            item.setDurability((short)3);
        }

        SkullMeta meta = (SkullMeta) item.getItemMeta();
        meta.setOwner(player);
        item.setItemMeta(meta);

        return item;
    }
}

package me.naspo.discordlink;

import dev.perryplaysmc.dynamicjson.DynamicJText;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Discord implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (label.equalsIgnoreCase("discord")){
            if (!(sender instanceof Player)){
                sender.sendMessage("You have access to console and you're still not in the discord? " +
                        "You don't deserve it at that point.");
                return true;
            }
            Player player = (Player) sender;
            if (!(player.hasPermission("discordlink.use"))) {
                player.sendMessage(ChatColor.RED + "You do not have permission.");
                return true;
            }
            if (args.length == 0) {
                DynamicJText jmsg = new DynamicJText();
                jmsg.add("&b&lDISCORD")
                        .onHover(ChatColor.translateAlternateColorCodes
                                ('&', "&7&oClick this message."))
                        .command("/discord link");
                jmsg.send(player);
                return true;
            }
            if (args[0].equalsIgnoreCase("link")){
                player.sendMessage(ChatColor.translateAlternateColorCodes
                        ('&', "&aDiscord &7» &b&ndiscord.gg/deltarealms"));
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 0.7f, 1.0f);
                return true;
            }
            player.sendMessage(ChatColor.RED + "Usage: /discord");
            return true;

        }

        return false;
    }

}

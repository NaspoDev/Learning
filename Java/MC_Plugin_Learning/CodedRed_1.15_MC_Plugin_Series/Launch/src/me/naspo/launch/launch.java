package me.naspo.launch;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class launch implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (label.equalsIgnoreCase("launch") || label.equalsIgnoreCase("lch")){
            if (!(sender instanceof Player)){
                sender.sendMessage("This command can only be used by a player.");
                return true;
            }
            Player player = (Player) sender;
            if (args.length == 0){
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b&lZoom!"));
                player.setVelocity(player.getLocation().getDirection().multiply(2).setY(2));
                return true;
            }
            if (isNum(args[0])) {
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b&lZoom!"));
                player.setVelocity(player.getLocation().getDirection().multiply(Integer.parseInt(args[0])).setY(2));
            }else{
                player.sendMessage(ChatColor.RED + "Usage: /launch <multiplier>");
            }

            return true;
        }

        return false;
    }

    public boolean isNum(String num) {
        try {
            Integer.parseInt(num);
        }catch (Exception e) {
            return false;
        }

        return true;
    }

}

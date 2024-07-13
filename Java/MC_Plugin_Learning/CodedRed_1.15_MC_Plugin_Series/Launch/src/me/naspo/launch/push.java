package me.naspo.launch;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class push implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (label.equalsIgnoreCase("push")){
            if (!(sender instanceof Player)){
                sender.sendMessage("Only players can use this command!");
                return true;
            }
            Player player = (Player) sender;
            if (args.length == 0){
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&e&lPush!"));
                player.setVelocity(player.getLocation().getDirection().multiply(2));
                return true;
            }
            if (isNum(args[0])){
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&e&lPush!"));
                player.setVelocity(player.getLocation().getDirection().multiply(Integer.parseInt(args[0])));
            }else{
                player.sendMessage(ChatColor.RED + "Usage: /push <multiplier> (max multiplier of 5).");
            }
        }

        return false;
    }

    public boolean isNum(String val) {
        try {
            Integer.parseInt(val);
        }catch (Exception e){
            return false;
        }
        if (Integer.parseInt(val) > 5){
            return false;
        }
        return true;
    }

}

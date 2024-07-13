package me.naspo.startool;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StarTool implements CommandExecutor, Listener {

    public List<String> list = new ArrayList<>();
    HashMap<String, Long> cooldowns = new HashMap<String, Long>();

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (label.equalsIgnoreCase("startool")) {
            if (!(sender instanceof Player)) {
                sender.sendMessage("This command can only be used by a player.");
                return true;
            }
            Player player = (Player) sender;
            if (player.getInventory().firstEmpty() == -1) {
                Location loc = player.getLocation();
                World world = player.getWorld();
                world.dropItemNaturally(loc, getItem());
                player.sendMessage("The Minecraft Gods dropped a gift for you.");
                return true;
            }
            player.getInventory().addItem(getItem());
            player.sendMessage(ChatColor.GOLD + "A gift presented to you by the Minecraft Gods.");
            return true;
        }

        return false;
    }

    public ItemStack getItem() {
        Material type;
        ItemStack item = new ItemStack(Material.TRIDENT);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&2&oAncient Trident"));
        List<String> lore = new ArrayList<String>();
        lore.add("");
        lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC + "(Right-click) - Spawn minions.");
        lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC + "(Left-click) - Shoot explosives.");

        meta.setLore(lore);
        meta.addEnchant(Enchantment.LOYALTY, 10, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        item.setItemMeta(meta);

        return item;
    }

    @EventHandler
    public void onClick(PlayerInteractEvent event) {
        Player player = (Player) event.getPlayer();
        if (player.getInventory().getItemInMainHand().getType().equals(Material.TRIDENT)) {
            if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().contains("Ancient Trident")) {
                if (player.getInventory().getItemInMainHand().getItemMeta().hasLore()) {
                    //right-click
                    if (event.getAction() == Action.RIGHT_CLICK_AIR) {
                        if (!(list.contains(player.getName()))) {
                            list.add(player.getName());
                            return;
                        }
                    }
                    if (event.getAction() == Action.LEFT_CLICK_AIR) {
                        player.launchProjectile(Fireball.class);

                        //cooldown
                        if (cooldowns.containsKey(player.getName())) {
                            //player is inside hashmap
                            if (cooldowns.get(player.getName()) > System.currentTimeMillis()) {
                                //they still have time left in the cooldown
                                long timeLeft = cooldowns.get(player.getName()) - System.currentTimeMillis() / 1000;
                                player.sendMessage(ChatColor.RED + "Cooldown remaining: " +
                                        ChatColor.GOLD + timeLeft + ChatColor.GOLD + " seconds.");
                                return;
                            }
                        }

                        cooldowns.put(player.getName(), System.currentTimeMillis() + (5000));
                    }
                }
            }
            if (list.contains(player.getName())) {
                list.remove(player.getName());
            }
        }
    }

    @EventHandler
    public void onLand(ProjectileHitEvent event) {
        if (event.getEntityType() == EntityType.TRIDENT) {
            if (event.getEntity().getShooter() instanceof Player) {
                Player player = (Player) event.getEntity().getShooter();
                if (list.contains(player.getName())) {
                    //spawn drowned
                    Location loc = event.getEntity().getLocation();
                    loc.setY(loc.getY() + 1);

                    for (int i = 1; i < 4; i++) {
                        loc.getWorld().spawnEntity(loc, EntityType.DROWNED);
                        loc.setX(loc.getX() + i);
                    }
                }
            }
        }
    }
}

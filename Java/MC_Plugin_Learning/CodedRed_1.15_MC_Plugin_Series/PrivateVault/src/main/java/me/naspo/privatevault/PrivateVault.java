package me.naspo.privatevault;

import org.bukkit.plugin.java.JavaPlugin;

public final class PrivateVault extends JavaPlugin {

    VaultStuff vaultStuff = new VaultStuff(this);

    @Override
    public void onEnable() {
        super.onEnable();
        this.saveDefaultConfig();
        this.getCommand("pv").setExecutor(vaultStuff);
        this.getServer().getPluginManager().registerEvents(vaultStuff, this);

        if (this.getConfig().contains("data")) {
            vaultStuff.restoreInvs();
        }
    }

    @Override
    public void onDisable() {
        super.onDisable();
        if (!(vaultStuff.menus.isEmpty())) {
            vaultStuff.saveInvs();
        }
    }
}

package me.okden.TutorialPlugin;

import me.okden.TutorialPlugin.papi.DynamicTabExpansion;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("onEnable is called!");
        if(Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null) {
            new DynamicTabExpansion(this).register();
        }
    }

    @Override
    public void onDisable() {
        getLogger().info("onDisable is called!");
    }
}

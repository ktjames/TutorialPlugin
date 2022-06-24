package me.okden.TutorialPlugin.papi;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import me.okden.TutorialPlugin.Main;
import org.bukkit.OfflinePlayer;
import org.jetbrains.annotations.NotNull;

public class DynamicTabExpansion extends PlaceholderExpansion {

    private final Main tutorialPlugin;

    public DynamicTabExpansion(Main tutorialPlugin) {
        this.tutorialPlugin = tutorialPlugin;
    }

    @Override
    public @NotNull String getAuthor() {
        return "okden";
    }

    @Override
    public @NotNull String getIdentifier() {
        return "dynotab";
    }

    @Override
    public @NotNull String getVersion() {
        return "1.0.0";
    }

    @Override
    public boolean persist() {
        return true;
    }

    @Override
    public String onRequest(OfflinePlayer player, String params) {
        if (params.equalsIgnoreCase("example1")) {
            return "example text 1";
        }
        return null;
    }
}

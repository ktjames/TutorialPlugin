package me.okden.TutorialPlugin;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.jetbrains.annotations.NotNull;

public class DynamicTabExpansion extends PlaceholderExpansion {

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
}

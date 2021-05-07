package me.aylias.mods.fabric.wecommandtools;

import me.aylias.mods.fabric.wecommandtools.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class ModBase implements ModInitializer {

    public static final String MODID = "wecomtools";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}

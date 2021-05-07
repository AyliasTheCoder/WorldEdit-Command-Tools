package me.aylias.mods.fabric.wecommandtools.registry;

import me.aylias.mods.fabric.wecommandtools.ModBase;
import me.aylias.mods.fabric.wecommandtools.commanditems.SetItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item SET_COMMAND = new SetItem();

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(ModBase.MODID, "set"), SET_COMMAND);
    }
}

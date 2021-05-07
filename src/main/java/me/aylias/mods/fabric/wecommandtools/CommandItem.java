package me.aylias.mods.fabric.wecommandtools;

import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public abstract class CommandItem extends Item {

    public CommandItem() {
        super(new Item.Settings().group(ItemGroup.MISC).maxCount(1));
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (!world.isClient()) {
            this.runCommand();
        }

        return super.finishUsing(stack, world, user);
    }

    protected abstract void runCommand();
}

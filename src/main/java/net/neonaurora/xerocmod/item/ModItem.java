package net.neonaurora.xerocmod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neonaurora.xerocmod.XerocMod;

public class ModItem {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(XerocMod.MODID);

public static final DeferredItem<Item> PEBBLE = ITEMS.register("pebble",
        () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

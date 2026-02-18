package com.kaev.pridetech.item;

import com.kaev.pridetech.PrideTech;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PrideTech.MOD_ID);

    public static final DeferredItem<Item> COLORLESS_SPARKLING_PARTICLE = ITEMS.register("colorless_sparkling_particle",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> COLORLESS_SPARKLING_DUST = ITEMS.register("colorless_sparkling_dust",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TECH_COG = ITEMS.register("tech_cog",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}

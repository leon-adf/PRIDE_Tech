package com.kaev.pridetech.item;

import com.kaev.pridetech.PrideTech;
import com.kaev.pridetech.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModesTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PrideTech.MOD_ID);

    public static final Supplier<CreativeModeTab> PRIDE_TECH_TAB = CREATIVE_MODE_TAB.register("pride_tech_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.TECH_COG.get()))
                    .title(Component.translatable("creativetab.pridetech.pride_tech_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.COLORLESS_SPARKLING_PARTICLE);
                        output.accept((ModItems.COLORLESS_SPARKLING_DUST));
                        output.accept(ModBlocks.COLORLESS_COMPRESSED_PARTICLE);
                        output.accept(ModBlocks.COLORLESS_COMPRESSED_DUST);
                    })
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}

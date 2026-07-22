package com.greenapple.greendelight.registry;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, "greendelight");

    public static final RegistryObject<Item> FORK = ITEMS.register("fork",
            () -> new Item(new Item.Properties().stacksTo(1).durability(250)));

    public static final RegistryObject<Item> SPOON = ITEMS.register("spoon",
            () -> new Item(new Item.Properties().stacksTo(1).durability(250)));

    // Added the Dish container item (stacks to 64)
    public static final RegistryObject<Item> DISH = ITEMS.register("dish",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

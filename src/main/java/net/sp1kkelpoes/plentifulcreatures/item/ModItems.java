package net.sp1kkelpoes.plentifulcreatures.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sp1kkelpoes.plentifulcreatures.PlentifulCreatures;

public class ModItems {
    public static final Item BANANA = registerItem("banana", new Item(new FabricItemSettings()));

    private static void addItemsToFoodItemGroup(FabricItemGroupEntries entries) {
        entries.add(BANANA);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PlentifulCreatures.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PlentifulCreatures.LOGGER.info("Registering Mod Items for " + PlentifulCreatures.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodItemGroup);
    }
}
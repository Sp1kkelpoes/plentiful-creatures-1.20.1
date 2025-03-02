package net.sp1kkelpoes.plentifulcreatures.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.sp1kkelpoes.plentifulcreatures.PlentifulCreatures;
import net.sp1kkelpoes.plentifulcreatures.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup FOOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PlentifulCreatures.MOD_ID, "food"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.food"))
                    .icon(() ->  new ItemStack(ModItems.BANANA)).entries((displayContext, entries) -> {
                        entries.add(ModItems.BANANA); // This is also the order of displaying in the tab


                        entries.add(ModBlocks.BANANA_BLOCK); // It drops like a couple of bananas


                    }).build());

    public static void registerItemGroups() {
        PlentifulCreatures.LOGGER.info("Registering Item Groups for " + PlentifulCreatures.MOD_ID);
    }
}

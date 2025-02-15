package net.schepka.voxlated.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.schepka.voxlated.Voxlated;

public class ModItems {

    public static final Item GOLDRING = registerItem("goldring", new Item(new FabricItemSettings()));
    public static final Item BUMBLZHONEY = registerItem("bumblz_honey", new Item(new FabricItemSettings()));
    public static final Item BLOODIRON = registerItem("blood_iron", new Item(new FabricItemSettings()));
    public static final Item COG = registerItem("cog", new Item(new FabricItemSettings()));
    public static final Item BLOODCOG = registerItem("blood_cog", new Item(new FabricItemSettings()));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Voxlated.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Voxlated.LOGGER.info("Registering Mod Items for " + Voxlated.MOD_ID);

    }
}

package net.schepka.voxlated.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.schepka.voxlated.Voxlated;

public class ModItemGroups {
    public static final ItemGroup GOLDRING_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(Voxlated.MOD_ID, "goldring"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.goldring"))
                    .icon(() -> new ItemStack(ModItems.GOLDRING)).entries((displayContext, entries) -> {
                        entries.add(ModItems.GOLDRING);
                        entries.add(ModItems.BUMBLZHONEY);
                        entries.add(ModItems.BLOODIRON);
                        entries.add(ModItems.COG);
                        entries.add(ModItems.BLOODCOG);

                    }).build());


    public static void registerItemGroups() {
        Voxlated.LOGGER.info("Registering Item Groups for " +Voxlated.MOD_ID);
    }
}

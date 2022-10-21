package net.moonvent.firstmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.moonvent.firstmod.MoonventMod;

public class FirstItem {
    public static final Item RAW_TANZANITE = registerItem("raw_tanzanite", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item TANZANITE = registerItem("tanzanite", new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MoonventMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MoonventMod.LOGGER.debug("Register Mod Items for " + MoonventMod.MOD_ID);
    }
}

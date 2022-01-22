package com.teamaurora.enhanced_mushrooms.core.registry.util;

import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

/**
 * Pretty hacky I might say
 * Totally not "borrowed" from differentiate
 */
public class GroupUtil {
    public static int getIndex(Item item, NonNullList<ItemStack> items) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getItem() == item) {
                return i;
            }
        }
        return -1;
    }

    public static void fillItem(Item item, Item followItem, CreativeModeTab currentTab, CreativeModeTab tab, NonNullList<ItemStack> items) {
        if (currentTab.equals(tab) || currentTab.equals(CreativeModeTab.TAB_SEARCH)) {
            int index = getIndex(followItem, items);
            if (index != -1) {
                items.add(++index, new ItemStack(item));
            } else {
                items.add(new ItemStack(item));
            }
        }
    }
}
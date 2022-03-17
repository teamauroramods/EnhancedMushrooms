package com.teamaurora.enhanced_mushrooms.common.item;

import net.minecraft.core.NonNullList;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;

/**
 * @author Steven
 * Pretty hacky I might say
 * Totally not "borrowed" from differentiate
 */
public class FollowItemLike extends BlockItem {
    private final ItemLike followItem;
    private final CreativeModeTab tab;

    public FollowItemLike(Block block, Properties properties, CreativeModeTab tab, ItemLike followItem) {
        super(block, properties);
        this.followItem = followItem;
        this.tab = tab;
    }

    @Override
    public void fillItemCategory(CreativeModeTab tab, NonNullList<ItemStack> items) {
        fillItem(this.asItem(), this.followItem.asItem(), tab, this.tab, items);
    }

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
package com.teamaurora.enhanced_mushrooms.common.item;

import gg.moonflower.pollen.api.item.TabFiller;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

import java.util.function.Predicate;

/**
 * @author Steven
 * Pretty hacky I might say
 * Totally not "borrowed" from differentiate
 */
public class TabInsertBlockItem extends BlockItem {
    private final Predicate<ItemStack> filter;
    private final boolean insertBefore;

    public TabInsertBlockItem(Item insertAfter, Block block, Properties properties) {
        this(stack -> stack.getItem() == insertAfter, false, block, properties);
    }

    public TabInsertBlockItem(Class<Item> insertAfterClass, Block block, Properties properties) {
        this(stack -> insertAfterClass.isInstance(stack.getItem()), false, block, properties);
    }

    public TabInsertBlockItem(Predicate<ItemStack> filter, Block block, Properties properties) {
        this(filter, false, block, properties);
    }

    public TabInsertBlockItem(Predicate<ItemStack> filter, boolean insertBefore, Block block, Properties properties) {
        super(block, properties);
        this.filter = filter;
        this.insertBefore = insertBefore;
    }

    @Override
    public void fillItemCategory(CreativeModeTab category, NonNullList<ItemStack> items) {
        if (this.allowdedIn(category))
            TabFiller.insert(new ItemStack(this), this.insertBefore, items, this.filter);
    }
}
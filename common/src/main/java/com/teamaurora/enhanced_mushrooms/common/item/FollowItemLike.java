package com.teamaurora.enhanced_mushrooms.common.item;

import com.teamaurora.enhanced_mushrooms.core.registry.util.GroupUtil;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;

/**
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
        GroupUtil.fillItem(this.asItem(), this.followItem.asItem(), tab, this.tab, items);
    }
}
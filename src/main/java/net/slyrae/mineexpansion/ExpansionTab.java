package net.slyrae.mineexpansion;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ExpansionTab extends CreativeTabs {

	public ExpansionTab(int index, String label) {
		super(index, label);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Items.ENDER_EYE);
	}

}

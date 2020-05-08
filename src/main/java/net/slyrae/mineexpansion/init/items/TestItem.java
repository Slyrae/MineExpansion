package net.slyrae.mineexpansion.init.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.slyrae.mineexpansion.Main;

public class TestItem extends ItemBase {

	// Base Constructor
	public TestItem(String name) {
		super(name);
		setUnlocalizedName(name);
		//setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		//CommonRegistryHandler.ITEMS.add(this);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}

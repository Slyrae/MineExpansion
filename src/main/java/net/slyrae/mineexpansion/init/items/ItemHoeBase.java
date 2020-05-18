package net.slyrae.mineexpansion.init.items;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;
import net.slyrae.mineexpansion.Main;
import net.slyrae.mineexpansion.init.ItemInit;

public class ItemHoeBase extends ItemHoe {

	protected String name;
	protected String phrase;
	
	public ItemHoeBase(String name, ToolMaterial material) {
		super(material);
		this.name = name;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(Main.tabExpansion);
		ItemInit.ITEMS.add(this);
	}

	public void registerItemModel() {
		Main.proxy.registerItemRenderer(this, 0, name);
	}
}

package net.slyrae.mineexpansion.init.items;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;
import net.slyrae.mineexpansion.Main;
import net.slyrae.mineexpansion.init.ItemInit;

public class ItemShovelBase extends ItemSpade {

	protected String name;
	protected String phrase;
	
	public ItemShovelBase(String name, ToolMaterial material) {
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

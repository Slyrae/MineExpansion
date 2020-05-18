package net.slyrae.mineexpansion.init.items;

import net.minecraft.item.ItemPickaxe;
import net.slyrae.mineexpansion.Main;
import net.slyrae.mineexpansion.init.ItemInit;

public class ItemPickaxeBase extends ItemPickaxe {

	protected String name;
	protected String phrase;
	
	public ItemPickaxeBase(String name, ToolMaterial material) {
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

package net.slyrae.mineexpansion.init.items;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;
import net.slyrae.mineexpansion.Main;
import net.slyrae.mineexpansion.init.ItemInit;

public class ItemAxeBase extends ItemAxe {

	protected String name;
	protected String phrase;
	
	public ItemAxeBase(String name, ToolMaterial material, float attackDmg, float attackSpeed) {
		super(material, attackDmg, attackSpeed);
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

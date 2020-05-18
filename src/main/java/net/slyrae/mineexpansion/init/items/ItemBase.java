package net.slyrae.mineexpansion.init.items;

import java.util.List;

import net.java.games.input.Component;
import net.java.games.input.Keyboard;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.slyrae.mineexpansion.Main;
import net.slyrae.mineexpansion.init.ItemInit;

public class ItemBase extends Item {

	protected String name;
	protected String phrase;
	
	public ItemBase(String name) {
		super();
		this.name = name;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(Main.tabExpansion);
		ItemInit.ITEMS.add(this);
		//this.phrase = phrase;
		//CommonRegistryHandler.ITEMS.add(this);
	}
	
	public void registerItemModel() {
		Main.proxy.registerItemRenderer(this, 0, name);
	}
	
	/*@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add("Damage: " + stack.getItemDamage());
		tooltip.add(phrase);
	}*/
	
	
	public void addInfo(String info)
	{
		this.phrase = info;
	}
	/*@Override
	public ItemBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}*/
}

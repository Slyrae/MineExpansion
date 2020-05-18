package net.slyrae.mineexpansion.init;

import java.util.ArrayList;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.oredict.OreDictionary;
import net.slyrae.mineexpansion.Config;
import net.slyrae.mineexpansion.Main;
import net.slyrae.mineexpansion.init.items.ItemAxeBase;
import net.slyrae.mineexpansion.init.items.ItemBase;
import net.slyrae.mineexpansion.init.items.ItemHoeBase;
import net.slyrae.mineexpansion.init.items.ItemPickaxeBase;
import net.slyrae.mineexpansion.init.items.ItemShovelBase;
import net.slyrae.mineexpansion.init.items.ItemSwordBase;
import net.slyrae.mineexpansion.util.ModToolMaterial;

public class ItemInit {

	public static final ArrayList<Item> ITEMS = new ArrayList<Item>();
	
	public static Item test_ingot;
	
	public static Item alloy_steel;
	public static Item alloy_wrought_iron;
	public static Item alloy_bronze;
	
	public static Item ingot_steel;
	public static Item ingot_copper;
	public static Item ingot_tin;
	public static Item ingot_bronze;
	public static Item ingot_slag;
	public static Item ingot_wrought_iron;
	public static Item ingot_brass;
	
	public static Item pickaxe_copper;
	public static Item shovel_copper;
	public static Item axe_copper;
	public static Item sword_copper;
	public static Item hoe_copper;
	
	public static Item pickaxe_tin;
	public static Item shovel_tin;
	public static Item axe_tin;
	public static Item sword_tin;
	public static Item hoe_tin;
	
	public static Item pickaxe_bronze;
	public static Item shovel_bronze;
	public static Item axe_bronze;
	public static Item sword_bronze;
	public static Item hoe_bronze;
	
	public static Item pickaxe_wrought_iron;
	public static Item shovel_wrought_iron;
	public static Item axe_wrought_iron;
	public static Item sword_wrought_iron;
	public static Item hoe_wrought_iron;
	
	public static Item pickaxe_steel;
	public static Item shovel_steel;
	public static Item axe_steel;
	public static Item sword_steel;
	public static Item hoe_steel;
	
	public static Item pickaxe_brass;
	public static Item shovel_brass;
	public static Item axe_brass;
	public static Item sword_brass;
	public static Item hoe_brass;
	
	public static void init()
	{
		if(Config.debug)Main.logger.info("Item Creation Started.");
		ModToolMaterial.Create();
		
		test_ingot = new ItemBase("test_ingot");
		alloy_steel = new ItemBase("alloy_steel");
		//alloy_steel.addInfo("Steel");
		alloy_wrought_iron = new ItemBase("alloy_wrought_iron");
		//alloy_wrought_iron.addInfo("Wrought Iron");
		alloy_bronze = new ItemBase("alloy_bronze");
		
		ingot_steel = new ItemBase("ingot_steel");
		ingot_wrought_iron = new ItemBase("ingot_wrought_iron");
		ingot_copper = new ItemBase("ingot_copper");
		ingot_tin = new ItemBase("ingot_tin");
		ingot_bronze = new ItemBase("ingot_bronze");
		ingot_slag = new ItemBase("ingot_slag");
		ingot_brass = new ItemBase("ingot_brass");
		
		pickaxe_copper = new ItemPickaxeBase("pickaxe_copper", ModToolMaterial.COPPER);
		shovel_copper = new ItemShovelBase("shovel_copper", ModToolMaterial.COPPER);
		axe_copper = new ItemAxeBase("axe_copper", ModToolMaterial.COPPER, ModToolMaterial.COPPER.getEfficiency(), -3.1f);
		sword_copper = new ItemSwordBase("sword_copper", ModToolMaterial.COPPER);
		hoe_copper = new ItemHoeBase("hoe_copper", ModToolMaterial.COPPER);
		
		pickaxe_tin = new ItemPickaxeBase("pickaxe_tin", ModToolMaterial.TIN);
		shovel_tin = new ItemShovelBase("shovel_tin", ModToolMaterial.TIN);
		axe_tin = new ItemAxeBase("axe_tin", ModToolMaterial.TIN, ModToolMaterial.TIN.getEfficiency(), -3.1f);
		sword_tin = new ItemSwordBase("sword_tin", ModToolMaterial.TIN);
		hoe_tin = new ItemHoeBase("hoe_tin", ModToolMaterial.TIN);
		
		pickaxe_bronze = new ItemPickaxeBase("pickaxe_bronze", ModToolMaterial.BRONZE);
		shovel_bronze = new ItemShovelBase("shovel_bronze", ModToolMaterial.BRONZE);
		axe_bronze = new ItemAxeBase("axe_bronze", ModToolMaterial.BRONZE, ModToolMaterial.BRONZE.getEfficiency(), -3.1f);
		sword_bronze = new ItemSwordBase("sword_bronze", ModToolMaterial.BRONZE);
		hoe_bronze = new ItemHoeBase("hoe_bronze", ModToolMaterial.BRONZE);
		
		pickaxe_wrought_iron = new ItemPickaxeBase("pickaxe_wrought_iron", ModToolMaterial.WROUGHTIRON);
		shovel_wrought_iron = new ItemShovelBase("shovel_wrought_iron", ModToolMaterial.WROUGHTIRON);
		axe_wrought_iron = new ItemAxeBase("axe_wrought_iron", ModToolMaterial.WROUGHTIRON, ModToolMaterial.COPPER.getEfficiency(), -3.1f);
		sword_wrought_iron = new ItemSwordBase("sword_wrought_iron", ModToolMaterial.WROUGHTIRON);
		hoe_wrought_iron = new ItemHoeBase("hoe_wrought_iron", ModToolMaterial.WROUGHTIRON);
		
		pickaxe_steel = new ItemPickaxeBase("pickaxe_steel", ModToolMaterial.STEEL);
		shovel_steel = new ItemShovelBase("shovel_steel", ModToolMaterial.STEEL);
		axe_steel = new ItemAxeBase("axe_steel", ModToolMaterial.STEEL, ModToolMaterial.STEEL.getEfficiency(), -3.1f);
		sword_steel = new ItemSwordBase("sword_steel", ModToolMaterial.STEEL);
		hoe_steel = new ItemHoeBase("hoe_steel", ModToolMaterial.STEEL);
		
		pickaxe_brass = new ItemPickaxeBase("pickaxe_brass", ModToolMaterial.BRASS);
		shovel_brass = new ItemShovelBase("shovel_brass", ModToolMaterial.BRASS);
		axe_brass = new ItemAxeBase("axe_brass", ModToolMaterial.BRASS, ModToolMaterial.BRASS.getEfficiency(), -3.1f);
		sword_brass = new ItemSwordBase("sword_brass", ModToolMaterial.BRASS);
		hoe_brass = new ItemHoeBase("hoe_brass", ModToolMaterial.BRASS);
		
		if(Config.debug)Main.logger.info("All Items Created.");
	}
	
	public static void register()
	{
		if(Config.debug)Main.logger.info("Item Registration Started.");
		
		for(int i = 0; i < ITEMS.size(); i++) {
			ForgeRegistries.ITEMS.register(ITEMS.get(i));
			ITEMS.get(i).setCreativeTab(Main.tabExpansion);
			ModelLoader.setCustomModelResourceLocation(ITEMS.get(i), 0, new ModelResourceLocation(ITEMS.get(i).getRegistryName(), "inventory"));
			if(Config.debug)Main.logger.info("Item registered " + ITEMS.get(i).getRegistryName());
		}
		/*
		if(Config.debug)Main.logger.info("All Items Registered.");
		registerItem(test_ingot);
		
		registerItem(alloy_steel);
		registerItem(alloy_wrought_iron);
		
		registerItem(ingot_copper);
		registerItem(ingot_tin);
		registerItem(ingot_steel);
		registerItem(ingot_slag);
		registerItem(ingot_wrought_iron);*/
	}
	
	public static void registerItemsToDictionary()
	{
		OreDictionary.registerOre("ingotSteel", ingot_steel);
		OreDictionary.registerOre("ingotCopper", ingot_copper);
		OreDictionary.registerOre("ingotTin", ingot_tin);
		OreDictionary.registerOre("ingotBronze", ingot_bronze);
		OreDictionary.registerOre("ingotWroughtIron", ingot_wrought_iron);
		OreDictionary.registerOre("ingotBrass", ingot_brass);
		
		OreDictionary.registerOre("alloySteel", alloy_steel);
		OreDictionary.registerOre("alloyBronze", alloy_bronze);
		OreDictionary.registerOre("alloyWroughtIron", alloy_wrought_iron);
        Main.logger.info("Ore dictionary elements added!");
    
	}
	
	public static void registerItem(Item item)
	{
		ForgeRegistries.ITEMS.register(item);
		//item.setCreativeTab(Main.tabExpansion);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		
		
	}
}
package net.slyrae.mineexpansion.init;

import java.util.ArrayList;

import org.apache.logging.log4j.Logger;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.slyrae.mineexpansion.Config;
import net.slyrae.mineexpansion.Main;
import net.slyrae.mineexpansion.init.items.ItemBase;
import net.slyrae.mineexpansion.util.ModInfo;

public class ItemInit {

	public static final ArrayList<ItemBase> ITEMS = new ArrayList<ItemBase>();
	
	public static Item test_ingot;
	
	public static Item alloy_steel;
	public static Item alloy_wrought_iron;
	
	public static Item ingot_steel;
	public static Item ingot_copper;
	public static Item ingot_tin;
	public static Item ingot_slag;
	public static Item ingot_wrought_iron;
	
	public static void init()
	{
		if(Config.debug)Main.logger.info("Item Creation Started.");
		
		test_ingot = new ItemBase("test_ingot");
		alloy_steel = new ItemBase("alloy_steel");
		//alloy_steel.addInfo("Steel");
		alloy_wrought_iron = new ItemBase("alloy_wrought_iron");
		//alloy_wrought_iron.addInfo("Wrought Iron");
		
		ingot_steel = new ItemBase("ingot_steel");
		ingot_copper = new ItemBase("ingot_copper");
		ingot_tin = new ItemBase("ingot_tin");
		ingot_slag = new ItemBase("ingot_slag");
		ingot_wrought_iron = new ItemBase("ingot_wrought_iron");
		
		if(Config.debug)Main.logger.info("All Items Created.");
	}
	
	public static void register()
	{
		/*if(Config.debug)Main.logger.info("Item Registration Started.");
		
		for(int i = 0; i < ITEMS.size(); i++) {
			ForgeRegistries.ITEMS.register(ITEMS.get(i));
			ITEMS.get(i).setCreativeTab(Main.tabExpansion);
			ModelLoader.setCustomModelResourceLocation(ITEMS.get(i), 0, new ModelResourceLocation(ITEMS.get(i).getRegistryName(), "inventory"));
			if(Config.debug)Main.logger.info("Item registered " + ITEMS.get(i).getRegistryName());
		}
		
		if(Config.debug)Main.logger.info("All Items Registered.");*/
		registerItem(test_ingot);
		
		registerItem(alloy_steel);
		registerItem(alloy_wrought_iron);
		
		registerItem(ingot_copper);
		registerItem(ingot_tin);
		registerItem(ingot_steel);
		registerItem(ingot_slag);
		registerItem(ingot_wrought_iron);
	}
	
	public static void registerItem(Item item)
	{
		ForgeRegistries.ITEMS.register(item);
		//item.setCreativeTab(Main.tabExpansion);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		
		
	}
}
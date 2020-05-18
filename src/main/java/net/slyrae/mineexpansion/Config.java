package net.slyrae.mineexpansion;

import java.util.ArrayList;
import java.util.List;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.slyrae.mineexpansion.util.ModInfo;

public class Config {
	
	public static boolean paracelsusEnabled = false;
	public static boolean replaceTextures = true;
	public static boolean useDurabilityTooptip = true;
	public static boolean debug = true;
	
	public static boolean steelTools = true;
	public static int steelHarvestLevel = 2;
	public static int steelDurability = 625;
	public static float steelEfficiency = 6.0f;
	public static float steelDamage = 3.0f;
	public static int steelEnchantability = 10;
	
	public static boolean copperTools = true;
	public static int copperHarvestLevel = 1;
	public static int copperDurability = 201;
	public static float copperEfficiency = 5.0f;
	public static float copperDamage = 2.0f;
	public static int copperEnchantability = 14;
	
	public static boolean tinTools = true;
	public static int tinHarvestLevel = 2;
	public static int tinDurability = 131;
	public static float tinEfficiency = 8.0f;
	public static float tinDamage = 2.0f;
	public static int tinEnchantability = 18;
	
	public static boolean bronzeTools = true;
	public static int bronzeHarvestLevel = 2;
	public static int bronzeDurability = 501;
	public static float bronzeEfficiency = 6.0f;
	public static float bronzeDamage = 3.0f;
	public static int bronzeEnchantability = 16;
	
	public static boolean wroughtTools = true;
	public static int wroughtHarvestLevel = 2;
	public static int wroughtDurability = 751;
	public static float wroughtEfficiency = 5.0f;
	public static float wroughtDamage = 3.0f;
	public static int wroughtEnchantability = 5;
	
	public static boolean brassTools = true;
	public static int brassHarvestLevel = 3;
	public static int brassDurability = 1561;
	public static float brassEfficiency = 8.0f;
	public static float brassDamage = 4.0f;
	public static int brassEnchantability = 18;
	
	private static List<String> listToolsOrder = new ArrayList<String>();
			
	public Config(FMLPreInitializationEvent e)
	{
		Configuration config = new Configuration(e.getSuggestedConfigurationFile());
		config.load();
		config.addCustomCategoryComment("general", "All the basic mod settings can be found here.");
		
		config.setCategoryPropertyOrder("tools", listToolsOrder);
		
		paracelsusEnabled = config.getBoolean("Paracelsus Compatibility Mode", "general", false, "If TRUE, reconfigures mod to work in tandem with Paracelsus mod.\nLeave FALSE for standalone version of mod.\n");
		replaceTextures = config.getBoolean("Replace Textures", "general", true, "If TRUE, replaces many vanilla and mod textures for enhanced versions that\nrespect the etiquette of pixel art and vanilla's style.\nPlease give it a try before disabling! You may be pleasantly surprised.\n");
		useDurabilityTooptip = config.getBoolean("Tool Damage Tips", "general", true, "If TRUE, injects a subtle tooltip into most tools, assigning them names for their condition.\nI.e; New, Used, Weathered, etc...\n");
		
		config.addCustomCategoryComment("tools", "Anything related to tools. Fully configurable.");
		steelTools = config.getBoolean("Enable Steel Tools", "tools", true, "If TRUE, tools made from STEEL will be loaded.\nSTEEL is a great all-purpose material with high durability but low enchantability.\n");
		steelHarvestLevel = config.getInt("STEEL Harvest Level", "tools", 2, 0, 3, "0 WOOD, 1 STONE, 2 IRON, 3 DIAMOND, 0 GOLD.\nDetermines what this material is capable of mining with a pickaxe.\nA value of 3 is required to mine Obsidian.\n");
		steelDurability = config.getInt("STEEL Durability", "tools", 625, 0, 2147483647, "59 WOOD, 131 STONE, 250 IRON, 1561 DIAMOND, 32 GOLD.\nHow long this material will last before it breaks.\nNOTE: For precise in-game values, add +1 to this number.\n");
		steelEfficiency = config.getFloat("STEEL Efficiency", "tools", 6.0f, 0f, 2147483647f, "2.0f WOOD, 4.0f STONE, 6.0f IRON, 8.0f DIAMOND, 12.0f GOLD.\nHow quickly this material can harvest blocks. Higher is faster.\n");
		steelDamage = config.getFloat("STEEL Damage", "tools", 3.0f, 0f, 2147483647f, "0.0f WOOD, 1.0f STONE, 2.0f IRON, 3.0f DIAMOND, 0.0f GOLD.\n4 + this = the damage a sword of material deals to entities.\n");
		steelEnchantability = config.getInt("STEEL Enchantability", "tools", 10, 0, 2147483647, "15 WOOD, 5 STONE, 14 IRON, 10 DIAMOND, 22 GOLD.\nThe higher this number is, the better chances are of getting higher level enchantments.\n");
		
		copperTools = config.getBoolean("Enable Copper Tools", "tools", true, "If TRUE, tools made from COPPER will be loaded.\nCOPPER is a weaker, cheaper alternative to iron when making tools and armor.\n");
		copperHarvestLevel = config.getInt("COPPER Harvest Level", "tools", 2, 0, 3, "0 WOOD, 1 STONE, 2 IRON, 3 DIAMOND, 0 GOLD.\nDetermines what this material is capable of mining with a pickaxe.\nA value of 3 is required to mine Obsidian.\n");
		copperDurability = config.getInt("COPPER Durability", "tools", 201, 0, 2147483647, "59 WOOD, 131 STONE, 250 IRON, 1561 DIAMOND, 32 GOLD.\nHow long this material will last before it breaks.\nNOTE: For precise in-game values, add +1 to this number.\n");
		copperEfficiency = config.getFloat("COPPER Efficiency", "tools", 5.0f, 0f, 2147483647f, "2.0f WOOD, 4.0f STONE, 6.0f IRON, 8.0f DIAMOND, 12.0f GOLD.\nHow quickly this material can harvest blocks. Higher is faster.\n");
		copperDamage = config.getFloat("COPPER Damage", "tools", 2.0f, 0f, 2147483647f, "0.0f WOOD, 1.0f STONE, 2.0f IRON, 3.0f DIAMOND, 0.0f GOLD.\n4 + this = the damage a sword of material deals to entities.\n");
		copperEnchantability = config.getInt("Enchantability", "tools", 14, 0, 2147483647, "15 WOOD, 5 STONE, 14 IRON, 10 DIAMOND, 22 GOLD.\nThe higher this number is, the better chances are of getting higher level enchantments.\n");
		
		tinTools = config.getBoolean("Enable Tin Tools", "tools", true, "If TRUE, tools made from TIN will be loaded.\nTIN is a brittle, but highly enchantable alternative to iron and gold when making tools and armor.\n");
		tinHarvestLevel = config.getInt("TIN Harvest Level", "tools", 2, 0, 3, "0 WOOD, 1 STONE, 2 IRON, 3 DIAMOND, 0 GOLD.\nDetermines what this material is capable of mining with a pickaxe.\nA value of 3 is required to mine Obsidian.\n");
		tinDurability = config.getInt("TIN Durability", "tools", 131, 0, 2147483647, "59 WOOD, 131 STONE, 250 IRON, 1561 DIAMOND, 32 GOLD.\nHow long this material will last before it breaks.\nNOTE: For precise in-game values, add +1 to this number.\n");
		tinEfficiency = config.getFloat("TIN Efficiency", "tools", 8.0f, 0f, 2147483647f, "2.0f WOOD, 4.0f STONE, 6.0f IRON, 8.0f DIAMOND, 12.0f GOLD.\nHow quickly this material can harvest blocks. Higher is faster.\n");
		tinDamage = config.getFloat("TIN Damage", "tools", 2.0f, 0f, 2147483647f, "0.0f WOOD, 1.0f STONE, 2.0f IRON, 3.0f DIAMOND, 0.0f GOLD.\n4 + this = the damage a sword of material deals to entities.\n");
		tinEnchantability = config.getInt("TIN Enchantability", "tools", 18, 0, 2147483647, "15 WOOD, 5 STONE, 14 IRON, 10 DIAMOND, 22 GOLD.\nThe higher this number is, the better chances are of getting higher level enchantments.\n");
		
		bronzeTools = config.getBoolean("Enable Bronze Tools", "tools", true, "If TRUE, tools made from BRONZE will be loaded.\nBRONZE falls short of BRONZE in durability, but is significantly more enchantable.\n");
		bronzeHarvestLevel = config.getInt("BRONZE Harvest Level", "tools", 2, 0, 3, "0 WOOD, 1 STONE, 2 IRON, 3 DIAMOND, 0 GOLD.\nDetermines what this material is capable of mining with a pickaxe.\nA value of 3 is required to mine Obsidian.\n");
		bronzeDurability = config.getInt("BRONZE Durability", "tools", 501, 0, 2147483647, "59 WOOD, 131 STONE, 250 IRON, 1561 DIAMOND, 32 GOLD.\nHow long this material will last before it breaks.\nNOTE: For precise in-game values, add +1 to this number.\n");
		bronzeEfficiency = config.getFloat("BRONZE Efficiency", "tools", 6.0f, 0f, 2147483647f, "2.0f WOOD, 4.0f STONE, 6.0f IRON, 8.0f DIAMOND, 12.0f GOLD.\nHow quickly this material can harvest blocks. Higher is faster.\n");
		bronzeDamage = config.getFloat("BRONZE Damage", "tools", 3.0f, 0f, 2147483647f, "0.0f WOOD, 1.0f STONE, 2.0f IRON, 3.0f DIAMOND, 0.0f GOLD.\n4 + this = the damage a sword of material deals to entities.\n");
		bronzeEnchantability = config.getInt("BRONZE Enchantability", "tools", 16, 0, 2147483647, "15 WOOD, 5 STONE, 14 IRON, 10 DIAMOND, 22 GOLD.\nThe higher this number is, the better chances are of getting higher level enchantments.\n");
		
		wroughtTools = config.getBoolean("Enable Wrought Iron Tools", "tools", true, "If TRUE, tools made from WROUGHT IRON will be loaded.\nWROUGHT IRON is remarkably strong, heavy, and barely enchantable.\n");
		wroughtHarvestLevel = config.getInt("WROUGHT IRON Harvest Level", "tools", 2, 0, 3, "0 WOOD, 1 STONE, 2 IRON, 3 DIAMOND, 0 GOLD.\nDetermines what this material is capable of mining with a pickaxe.\nA value of 3 is required to mine Obsidian.\n");
		wroughtDurability = config.getInt("WROUGHT IRON Durability", "tools", 751, 0, 2147483647, "59 WOOD, 131 STONE, 250 IRON, 1561 DIAMOND, 32 GOLD.\nHow long this material will last before it breaks.\nNOTE: For precise in-game values, add +1 to this number.\n");
		wroughtEfficiency = config.getFloat("WROUGHT IRON Efficiency", "tools", 5.0f, 0f, 2147483647f, "2.0f WOOD, 4.0f STONE, 6.0f IRON, 8.0f DIAMOND, 12.0f GOLD.\nHow quickly this material can harvest blocks. Higher is faster.\n");
		wroughtDamage = config.getFloat("WROUGHT IRON Damage", "tools", 3.0f, 0f, 2147483647f, "0.0f WOOD, 1.0f STONE, 2.0f IRON, 3.0f DIAMOND, 0.0f GOLD.\n4 + this = the damage a sword of material deals to entities.\n");
		wroughtEnchantability = config.getInt("WROUGHT IRON Enchantability", "tools", 5, 0, 2147483647, "15 WOOD, 5 STONE, 14 IRON, 10 DIAMOND, 22 GOLD.\nThe higher this number is, the better chances are of getting higher level enchantments.\n");
		
		brassTools = config.getBoolean("Enable Brass Tools", "tools", true, "If TRUE, tools made from BRASS will be loaded.\nBy default, BRASS is an epic dungeon loot material with exceptional properties. High durability, damage, and enchantability.\n");
		brassHarvestLevel = config.getInt("BRASS Harvest Level", "tools", 3, 0, 3, "0 WOOD, 1 STONE, 2 IRON, 3 DIAMOND, 0 GOLD.\nDetermines what this material is capable of mining with a pickaxe.\nA value of 3 is required to mine Obsidian.\n");
		brassDurability = config.getInt("BRASS Durability", "tools", 1561, 0, 2147483647, "59 WOOD, 131 STONE, 250 IRON, 1561 DIAMOND, 32 GOLD.\nHow long this material will last before it breaks.\nNOTE: For precise in-game values, add +1 to this number.\n");
		brassEfficiency = config.getFloat("BRASS Efficiency", "tools", 8.0f, 0f, 2147483647f, "2.0f WOOD, 4.0f STONE, 6.0f IRON, 8.0f DIAMOND, 12.0f GOLD.\nHow quickly this material can harvest blocks. Higher is faster.\n");
		brassDamage = config.getFloat("BRASS Damage", "tools", 4.0f, 0f, 2147483647f, "0.0f WOOD, 1.0f STONE, 2.0f IRON, 3.0f DIAMOND, 0.0f GOLD.\n4 + this = the damage a sword of material deals to entities.\n");
		brassEnchantability = config.getInt("BRASS Enchantability", "tools", 18, 0, 2147483647, "15 WOOD, 5 STONE, 14 IRON, 10 DIAMOND, 22 GOLD.\nThe higher this number is, the better chances are of getting higher level enchantments.\n");
		debug = config.getBoolean("Console Debugging", "general", true, "Enabling tells the mod to be super chatty in the console.\n");

		
		config.save();
	}
}

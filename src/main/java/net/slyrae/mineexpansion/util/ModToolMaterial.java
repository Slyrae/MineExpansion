package net.slyrae.mineexpansion.util;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.slyrae.mineexpansion.Config;
import net.slyrae.mineexpansion.Main;

public class ModToolMaterial {

	public static ToolMaterial STEEL;
	public static ToolMaterial COPPER;
	public static ToolMaterial TIN;
	public static ToolMaterial BRONZE;
	public static ToolMaterial WROUGHTIRON;
	public static ToolMaterial BRASS;
	
	// MAKE THIS SHIT GO THROUGH CONFIG LOL
	// might need to convert this to enums
	
	/*WOOD(0, 59, 2.0F, 0.0F, 15),
    STONE(1, 131, 4.0F, 1.0F, 5),
    IRON(2, 250, 6.0F, 2.0F, 14),
    DIAMOND(3, 1561, 8.0F, 3.0F, 10),
    GOLD(0, 32, 12.0F, 0.0F, 22);

    /** The level of material this tool can harvest (3 = DIAMOND, 2 = IRON, 1 = STONE, 0 = WOOD/GOLD) */
    /** The number of uses this material allows. (wood = 59, stone = 131, iron = 250, diamond = 1561, gold = 32) */
    /** The strength of this tool material against blocks which it is effective against. */
    /** Damage versus entities. */
    /** Defines the natural enchantability factor of the material. */
	public static void Create() {
		if(Config.debug)Main.logger.info("Creating custom ToolMaterials. Accessing config.yml for values.");
		STEEL = EnumHelper.addToolMaterial("STEEL", Config.steelHarvestLevel, Config.steelDurability, Config.steelEfficiency, Config.steelDamage, Config.steelEnchantability);
		COPPER = EnumHelper.addToolMaterial("COPPER", Config.copperHarvestLevel, Config.copperDurability, Config.copperEfficiency, Config.copperDamage, Config.copperEnchantability);
		TIN = EnumHelper.addToolMaterial("TIN", Config.tinHarvestLevel, Config.tinDurability, Config.tinEfficiency, Config.tinDamage, Config.tinEnchantability);
		BRONZE = EnumHelper.addToolMaterial("BRONZE", Config.bronzeHarvestLevel, Config.bronzeDurability, Config.bronzeEfficiency, Config.bronzeDamage, Config.bronzeEnchantability);
		WROUGHTIRON = EnumHelper.addToolMaterial("WROUGHTIRON", Config.wroughtHarvestLevel, Config.wroughtDurability, Config.wroughtEfficiency, Config.wroughtDamage, Config.wroughtEnchantability);
		BRASS = EnumHelper.addToolMaterial("BRASS", Config.brassHarvestLevel, Config.brassDurability, Config.brassEfficiency, Config.brassDamage, Config.brassEnchantability);
		if(Config.debug)Main.logger.info("Custom ToolMaterials created.");
	}
	
	public static float getAttackSpeed(ToolMaterial material) {
		return 1f;
	}
}

package net.slyrae.mineexpansion;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class Config {
	
	public static boolean paracelsusEnabled = false;
	public static boolean replaceTextures = true;
	public static boolean useDurabilityTooptip = true;
	public static boolean debug = true;
	
	public Config(FMLPreInitializationEvent e)
	{
		Configuration config = new Configuration(e.getSuggestedConfigurationFile());
		config.load();
		
		paracelsusEnabled = config.getBoolean("Paracelsus Compatibility Mode", Configuration.CATEGORY_GENERAL, false, "If TRUE, reconfigures mod to work in tandem with Paracelsus mod.\nLeave FALSE for standalone version of mod.");
		
		replaceTextures = config.getBoolean("Replace Textures", Configuration.CATEGORY_GENERAL, true, "If TRUE, replaces many vanilla and mod textures for enhanced versions that respect the etiquette of pixel art and vanilla's style.\nPlease give it a try before disabling! You may be pleasantly surprised.");
		
		useDurabilityTooptip = config.getBoolean("Tool Damage Tips", Configuration.CATEGORY_GENERAL, true, "If TRUE, injects a subtle tooltip into most tools, assigning them names for their condition. I.e; New, Used, Weathered, etc");
		
		debug = config.getBoolean("Console Debugging", Configuration.CATEGORY_GENERAL, true, "Enabling tells the mod to be super chatty in the console.");
		
		
		config.save();
	}
}

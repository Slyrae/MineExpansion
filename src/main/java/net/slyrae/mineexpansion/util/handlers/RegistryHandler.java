package net.slyrae.mineexpansion.util.handlers;

import net.slyrae.mineexpansion.init.ItemInit;

public class RegistryHandler {

	public static void Client() {
		
	}
	
	public static void Common() {
		ItemInit.init();
		ItemInit.register();
		
		/*BlockInit.init();
		BlockInit.register();
		
		ToolInit.init();
		ToolInit.register();
		
		ArmorInit.init();
		ArmorInit.register();*/
	}
}

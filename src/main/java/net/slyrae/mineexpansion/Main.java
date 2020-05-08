package net.slyrae.mineexpansion;

import org.apache.logging.log4j.Logger;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.slyrae.mineexpansion.init.ItemInit;
import net.slyrae.mineexpansion.proxy.IProxy;
import net.slyrae.mineexpansion.util.ModInfo;
import net.slyrae.mineexpansion.util.handlers.RegistryHandler;
import net.slyrae.mineexpansion.util.handlers.ReplaceTextureHandler;

@Mod(
modid = ModInfo.MODID,
name = ModInfo.NAME,
version = ModInfo.VERSION
)
public class Main
{
	@Instance
	public static Main instance;
	@SidedProxy(clientSide = ModInfo.CLIENT, serverSide = ModInfo.SERVER)
	public static IProxy proxy;
    public static Logger logger;
    public static CreativeTabs tabExpansion;
    
    public static FMLPreInitializationEvent preInitEvent;
    public static FMLInitializationEvent initEvent;
    public static FMLPostInitializationEvent postInitEvent;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	logger = event.getModLog();
    	logger.info("Pre-Initialization Started.");
    	if(Config.debug)logger.info("Debugging Enabled.");
    	
    	preInitEvent = event;
    	
    	proxy.preInit();
    	
    	tabExpansion = new CreativeTabs((CreativeTabs.CREATIVE_TAB_ARRAY.length), "tabExpansion") {
    		@Override
    		@SideOnly(Side.CLIENT)
    		public ItemStack getTabIconItem() {
    			return new ItemStack(ItemInit.test_ingot);
    		}
    	};
    	
    	RegistryHandler.Common();
    	//ReplaceTextureHandler.replaceItemTextures();
        
        logger.info("Pre-Initialization Completed.");
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	logger.info("Initialization Started.");
    	
    	initEvent = event;
    	
    	proxy.init();
    	
    	logger.info("Initialization Completed.");
        // some example code
        //logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	logger.info("Post-Initialization Started.");
    	
    	postInitEvent = event;
    	
    	proxy.postInit();
    	
    	//logger.info("!!! TEST ITEM !!! >> {}", CommonRegistryHandler.testItem.getRegistryName());
    	logger.info("Post-Initialization Completed.");
    	logger.info("MineExpansion by Slyrae [" + ModInfo.VERSION + "] for Minecraft " + ModInfo.ACCEPTED_VERSIONS + " successfully activated. Enjoy!");

    }
}

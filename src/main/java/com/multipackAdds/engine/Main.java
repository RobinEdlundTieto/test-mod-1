package com.multipackAdds.engine;

import com.multipackAdds.engine.LogHelper;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = refStrings.MODID, name = refStrings.NAME, version = refStrings.VERSION,
acceptedMinecraftVersions = refStrings.MC_VERSION, canBeDeactivated = refStrings.canbedeactived)
public class Main
{
	 @Instance
	    public static Main instance = new Main();
	    
	    @SidedProxy(clientSide = refStrings.CLIENTSIDE, serverSide = refStrings.SERVERSIDE)
	    public static ClientProxy proxy;

	    @EventHandler
	    public void preInit(FMLPreInitializationEvent e) {
	    		proxy.preInit(e);
	    }

	    @EventHandler
	    public void init(FMLInitializationEvent e) {
	    	proxy.init(e);
	    }

	    @EventHandler
	    public void postInit(FMLPostInitializationEvent e) {
	    	proxy.postInit(e);
	    }
}
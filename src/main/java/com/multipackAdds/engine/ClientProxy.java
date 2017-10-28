package com.multipackAdds.engine;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.*;
import com.warfareAdds.Items.*;

public class ClientProxy {
    @EventHandler
    public void preInit(FMLPreInitializationEvent e){
    	   ModItems.init();
           LogHelper.info("PreInitialized");
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
    	 LogHelper.info("Initialized");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	 LogHelper.info("PostInitialized");
    }
}

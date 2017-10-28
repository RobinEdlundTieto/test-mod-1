package com.multipackAdds.engine;

import com.warfareAdds.Items.fullBar;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemFood;

public class ModItems {
	public static ItemFood fullBar;
	
	public static final void init(){
	fullBar = new fullBar();
	GameRegistry.registerItem(fullBar, "full bar");}
}

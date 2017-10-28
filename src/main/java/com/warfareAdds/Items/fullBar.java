package com.warfareAdds.Items;

import com.multipackAdds.engine.LogHelper;
import com.multipackAdds.engine.refStrings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class fullBar extends ItemFood{
	 public fullBar(){
		 super(30, 1.0F, true);
		 this.setAlwaysEdible();
		 this.setUnlocalizedName("fullBar");
		 this.setCreativeTab(CreativeTabs.tabFood);
		 this.setTextureName(refStrings.MODID + ":fullBar");
		 LogHelper.info("fullBar fixed");
		 
	 }  
}

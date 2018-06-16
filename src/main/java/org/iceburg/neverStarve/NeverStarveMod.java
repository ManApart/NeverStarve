package org.iceburg.neverStarve;


import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = NeverStarveMod.MODID, name = NeverStarveMod.NAME, version = NeverStarveMod.VERSION)
public class NeverStarveMod {
	
	public static final String MODID = "ak never starve mod";
	public static final String NAME = "AK Never Starve";
	public static final String VERSION = "1.0";
    
	@Mod.Instance(MODID)
	public static NeverStarveMod instance;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
    	//Handle blocks
    	System.out.println("Pre initializing Never Starve mod");
    }
    @EventHandler
    public void init(FMLInitializationEvent event){
    	MinecraftForge.EVENT_BUS.register(new LivingHurtHandler());
    	
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
    	//wrap up
    	System.out.println("Post initializing Never Starve mod");
    }
    
    
}

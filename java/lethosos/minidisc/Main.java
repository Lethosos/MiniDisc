package lethosos.minidisc;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

import lethosos.minidisc.init.DiscConfig;
import lethosos.minidisc.init.DiscSound;
import lethosos.minidisc.json.DiscJSON;
import lethosos.minidisc.json.DiscJSONWriter;
import lethosos.minidisc.proxy.CommonProxy;
import lethosos.minidisc.utils.Reference;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	
	public static File config;
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	//public static final CreativeTabs MINIDISC = new DiscTab("minidisc_tab");

	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		DiscConfig.registerConfig(event);
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent event)
	{
		DiscJSON.build();
	}

	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{
		
	}
}

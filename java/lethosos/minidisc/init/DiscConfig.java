package lethosos.minidisc.init;

import java.io.File;
import java.sql.Ref;
import java.util.ArrayList;
import java.util.List;

import lethosos.minidisc.Main;
import lethosos.minidisc.utils.Reference;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DiscConfig
{
	private static Configuration config = null;
	
	public static final List<String> COLLECTION_LIST = new ArrayList<String>();
	
	private static String[] dummy = new String[20];
	
	public static void init(File file)
	{
		config = new Configuration(file);
		String category;
		category = "album_list";
		config.addCustomCategoryComment(category, "Add a list of album directories here. Use commas to seperate each item.");
		String tempList[] = config.getStringList("List", category, dummy, "");
		
		config.save();
	}
	
	public static void registerConfig(FMLPreInitializationEvent event)
	{
		Main.config = new File(event.getModConfigurationDirectory() + "/" + Reference.MOD_ID);
		Main.config.mkdirs();
		init(new File(Main.config.getPath(), Reference.MOD_ID + ".cfg"));
	}
	
	public static Configuration getConfig()
	{
		return config;
	}
}

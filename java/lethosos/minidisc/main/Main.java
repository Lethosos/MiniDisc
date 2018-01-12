package lethosos.minidisc.main;

import lethosos.minidisc.init.DiscBlocks;
import lethosos.minidisc.init.DiscCrafting;
import lethosos.minidisc.init.DiscItems;
import lethosos.minidisc.init.DiscSound;
import lethosos.minidisc.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Ref.MOD_ID, version = Ref.VERSION, acceptedMinecraftVersions = Ref.ACC_VERSION)
public class Main
{
	@Instance
	public static Main instance;
	
	@SidedProxy (clientSide = Ref.CLIENT_PROXY, serverSide = Ref.SERVER_PROXY)
	public static CommonProxy proxy;

    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
    	DiscSound.init();
        
        DiscItems.init();
        DiscItems.register();
        
        DiscBlocks.init();
        DiscBlocks.register();
        
        //DiscTileEntities.register();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init();
        
        DiscCrafting.register();
        DiscSound.init();
        
    }
    
    @EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {
        // some example code
        
    }
    
    public static CreativeTabs tabMinidisc = new CreativeTabs("tab_minidisc")
    {
    	@Override
    	public ItemStack getTabIconItem()
    	{
    		return new ItemStack(DiscItems.disc_1);
    	}
    };
}

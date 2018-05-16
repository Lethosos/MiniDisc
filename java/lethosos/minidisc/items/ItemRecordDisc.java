package lethosos.minidisc.items;

import java.util.List;

import javax.annotation.Nullable;

import lethosos.minidisc.Main;
import lethosos.minidisc.init.DiscItems;
import lethosos.minidisc.utils.IHasModel;
import lethosos.minidisc.utils.Label;
import lethosos.minidisc.utils.Reference;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;

public class ItemRecordDisc extends ItemRecord implements IHasModel
{
	public String fullName;
	public String album;
	
	public ItemRecordDisc(Label recordLabel, net.minecraft.util.SoundEvent soundEvent)
	{
		super(Reference.MOD_ID + ":" + recordLabel.smallName, soundEvent);
		setRegistryName("record_" + recordLabel.smallName);
		setUnlocalizedName(recordLabel.smallName);
		setCreativeTab(CreativeTabs.MISC);
		
		fullName = recordLabel.fullName;
		album = recordLabel.album;
		
		DiscItems.ITEMS.add(this);
		
		System.out.println("Sound registered: " + soundEvent.getRegistryName() + soundEvent.toString());
	}

	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer((Item)this, 0, "inventory");
	}
	
	@Override
	public String getRecordNameLocal()
	{
		return (fullName + " - " + album);
	}

	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
	{
		stack.setTranslatableName(fullName);
		tooltip.add(album);
	}
}
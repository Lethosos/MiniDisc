package lethosos.minidisc.item;

import lethosos.minidisc.main.Main;
import lethosos.minidisc.main.Ref;
import net.minecraft.item.ItemRecord;
import net.minecraftforge.client.event.sound.SoundEvent;

public class ItemRecordDisc extends ItemRecord {
	public ItemRecordDisc(String recordName, net.minecraft.util.SoundEvent soundEvent) {
		super(Ref.MOD_ID + ":" + recordName, soundEvent);
		setRegistryName(Ref.MOD_ID, "record_" + recordName);
		setUnlocalizedName(recordName);
		setCreativeTab(Main.tabMinidisc);
	}
}
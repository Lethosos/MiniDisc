package lethosos.minidisc.init;

import lethosos.minidisc.item.ItemRecordDisc;
import lethosos.minidisc.main.Ref;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class DiscItems {
	
	public static ItemRecordDisc disc_1;
	public static ItemRecordDisc disc_2;
	public static ItemRecordDisc disc_3;
	public static ItemRecordDisc disc_4;
	public static ItemRecordDisc disc_5;
	public static ItemRecordDisc disc_6;
	
	public static void init() {
		disc_1 = new ItemRecordDisc(Ref.RecordList.DISC_1.getRegistryName(), DiscSound.register("record." + Ref.RecordList.DISC_1.getRegistryName()));
		disc_2 = new ItemRecordDisc(Ref.RecordList.DISC_2.getRegistryName(), DiscSound.register("record." + Ref.RecordList.DISC_2.getRegistryName()));
		disc_3 = new ItemRecordDisc(Ref.RecordList.DISC_3.getRegistryName(), DiscSound.register("record." + Ref.RecordList.DISC_3.getRegistryName()));
		disc_4 = new ItemRecordDisc(Ref.RecordList.DISC_4.getRegistryName(), DiscSound.register("record." + Ref.RecordList.DISC_4.getRegistryName()));
		disc_5 = new ItemRecordDisc(Ref.RecordList.DISC_5.getRegistryName(), DiscSound.register("record." + Ref.RecordList.DISC_5.getRegistryName()));
		disc_6 = new ItemRecordDisc(Ref.RecordList.DISC_6.getRegistryName(), DiscSound.register("record." + Ref.RecordList.DISC_6.getRegistryName()));
	}
	
	public static void register() {
		GameRegistry.register(disc_1);
		GameRegistry.register(disc_2);
		GameRegistry.register(disc_3);
		GameRegistry.register(disc_4);
		GameRegistry.register(disc_5);
		GameRegistry.register(disc_6);
	}
	
	public static void registerRenders() {
		registerRender(disc_1);
		registerRender(disc_2);
		registerRender(disc_3);
		registerRender(disc_4);
		registerRender(disc_5);
		registerRender(disc_6);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}

package lethosos.minidisc.init;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import lethosos.minidisc.items.ItemBase;
import lethosos.minidisc.items.ItemRecordDisc;
import lethosos.minidisc.json.DiscJSONWriter;
import lethosos.minidisc.utils.Label;
import lethosos.minidisc.utils.Reference;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class DiscItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item DISC_1 = buildList(new Label("seer", "The Seer and the Tribesmen", "Land of Fans and Music 2"));
	public static final Item DISC_2 = buildList(new Label("alchemy", "Ultimate Alchemy", "Land of Fans and Music 4"));
	public static final Item DISC_3 = buildList(new Label("cleoparty", "Cleopatra's Cocktail Party", "Land of Fans and Music 4"));
	public static final Item DISC_4 = buildList(new Label("gemoni", "Gemoni Mustard Blood", "Land of Fans and Music 4"));
	public static final Item DISC_5 = buildList(new Label("lomax", "Highland Thunder (LoMaX)", "Land of Fans and Music 4"));
	public static final Item DISC_6 = buildList(new Label("lotak", "Tragic Heights (LoTaK)", "Land of Fans and Music 4"));
	
	public static Item buildList(Label label)
	{
		Item blank  = new ItemRecordDisc(label, DiscSound.registerSound(label.smallName));	
		System.out.println("Record added: " + label.fullName + " - " + label.album);
		return blank;
	}
}

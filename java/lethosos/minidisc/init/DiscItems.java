package lethosos.minidisc.init;

import java.util.ArrayList;
import java.util.List;

import lethosos.minidisc.items.ItemBase;
import lethosos.minidisc.items.ItemRecordDisc;
import lethosos.minidisc.utils.Label;
import lethosos.minidisc.utils.Reference;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class DiscItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item DISC_1 = new ItemRecordDisc(new Label("seer", "The Seer and the Tribesmen", "Land of Fans and Music 2"), DiscSound.registerSound("seer"));
	public static final Item DISC_2 = new ItemRecordDisc(new Label("alchemy", "Ultimate Alchemy", "Land of Fans and Music 4"), DiscSound.registerSound("alchemy"));
	public static final Item DISC_3 = new ItemRecordDisc(new Label("cleoparty", "Cleopatra's Cocktail Party", "Land of Fans and Music 4"), DiscSound.registerSound("cleoparty"));
	public static final Item DISC_4 = new ItemRecordDisc(new Label("gemoni", "Gemoni Mustard Blood", "Land of Fans and Music 4"), DiscSound.registerSound("gemoni"));
	public static final Item DISC_5 = new ItemRecordDisc(new Label("lomax", "Highland Thunder (LoMaX)", "Land of Fans and Music 4"), DiscSound.registerSound("lomax"));
	public static final Item DISC_6 = new ItemRecordDisc(new Label("lotak", "Tragic Heights (LoTaK)", "Land of Fans and Music 4"), DiscSound.registerSound("lotak"));
}

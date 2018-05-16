package lethosos.minidisc.init;

import java.util.ArrayList;
import java.util.List;

import lethosos.minidisc.utils.Reference;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class DiscSound {
	
	//public static final List<SoundEvent> SOUNDS = new ArrayList<SoundEvent>();
	//private static int size = 0;
	
	public static SoundEvent registerSound(String name)
	{
		final ResourceLocation sound = new ResourceLocation(Reference.MOD_ID, name);
		return new SoundEvent(sound).setRegistryName(name);
	}
}
	/*private static int size = 0;
	
	public static void init() {
		size = SoundEvent.REGISTRY.getKeys().size();
		
		//add jukebox events here
		//DISC_1_PLAY = register("seer.play");
	}
	
	public static SoundEvent register(String name) {
		ResourceLocation location = new ResourceLocation(Reference.MOD_ID, name);
		SoundEvent e = new SoundEvent(location);
		
		SoundEvent.REGISTRY.register(size, location, e);
		size++;

		// Testing
		System.out.println("Sound registered: " + name);
		
		return e;
	}
	

}*/

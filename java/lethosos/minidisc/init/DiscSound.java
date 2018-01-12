package lethosos.minidisc.init;

import lethosos.minidisc.main.Ref;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class DiscSound {
	
	//public static SoundEvent DISC_1_PLAY;
	
	private static int size = 0;
	
	public static void init() {
		size = SoundEvent.REGISTRY.getKeys().size();
		
		//add jukebox events here
		//DISC_1_PLAY = register("seer.play");
	}
	
	public static SoundEvent register(String name) {
		ResourceLocation location = new ResourceLocation(Ref.MOD_ID, name);
		SoundEvent e = new SoundEvent(location);
		
		SoundEvent.REGISTRY.register(size, location, e);
		size++;

		// Testing
		System.out.println("Sound registered: " + name);
		
		return e;
	}
	

}

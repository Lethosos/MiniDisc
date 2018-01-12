package lethosos.minidisc.proxy;

import lethosos.minidisc.init.DiscBlocks;
import lethosos.minidisc.init.DiscItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		DiscItems.registerRenders();
		DiscBlocks.registerRenders();
	}

}

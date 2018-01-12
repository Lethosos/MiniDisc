package lethosos.minidisc.init;

import lethosos.minidisc.blocks.BlockScriber;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class DiscBlocks {
	
	public static Block scriber;
	
	public static void init() {
		scriber = new BlockScriber();
	}
	
	public static void register() {
		registerBlock(scriber);
	}
	
	private static void registerBlock(Block block)
	{
		GameRegistry.register(scriber);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders() {
		registerRender(scriber);
	}
	
	private static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}

}

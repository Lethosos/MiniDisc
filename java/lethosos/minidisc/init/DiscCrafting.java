package lethosos.minidisc.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class DiscCrafting {

	public static void register() {
		GameRegistry.addShapedRecipe(new ItemStack(DiscBlocks.scriber), "wdw","iri","wiw",'r', DiscItems.disc_1, 'w', new ItemStack(Blocks.PLANKS, 1, 0), 'd', Items.DIAMOND, 'i', Items.IRON_INGOT);
		GameRegistry.addShapelessRecipe(new ItemStack(DiscItems.disc_1), Items.CLAY_BALL, Items.CLAY_BALL, new ItemStack(Items.DYE, 1, 0));
	}
}

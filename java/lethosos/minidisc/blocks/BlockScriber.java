package lethosos.minidisc.blocks;

import lethosos.minidisc.main.Main;
import lethosos.minidisc.main.Ref;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockScriber extends Block {

	public BlockScriber() {
		super(Material.WOOD);
		setUnlocalizedName(Ref.BlockList.SCRIBER.getUnlocalizedName());
		setRegistryName(Ref.BlockList.SCRIBER.getRegistryName());
		setHardness(3.0f);
		setCreativeTab(Main.tabMinidisc);
	}

}

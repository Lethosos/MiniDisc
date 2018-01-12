package lethosos.minidisc.tileentity;

import lethosos.minidisc.main.Ref;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityDiscStamper extends TileEntity implements ITickable {

	private int cooldown = 500;
	
	public TileEntityDiscStamper() {
		cooldown = 0;
	}
	
	public void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntityDiscStamper.class, Ref.MOD_ID + ":disc_stamper");
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		this.cooldown = nbt.getInteger("Cooldown");
		super.readFromNBT(nbt);
	}
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbt) {
		nbt.setInteger("Cooldown", this.cooldown);
		return super.writeToNBT(nbt);
	}

	@Override
	public void update() {
		this.cooldown++;
		this.cooldown %= 100;
	}
}

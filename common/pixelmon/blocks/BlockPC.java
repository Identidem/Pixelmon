package pixelmon.blocks;

import java.util.Random;

import pixelmon.Pixelmon;
import pixelmon.enums.EnumGui;
import net.minecraft.src.Block;
import net.minecraft.src.BlockContainer;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.Material;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModLoader;
import net.minecraft.src.TileEntity;
import net.minecraft.src.World;

public class BlockPC extends BlockContainer {
	
	public BlockPC(int i, int j){
		super(i, Material.rock);
		setHardness(2.5f);
	}
	@Override
	public int idDropped(int par1, Random par2Random, int par3)
	{
	return -1;
	}
	@Override
	public int quantityDropped(Random random) {
	  return 0;
	}
	@Override
	public boolean isOpaqueCube() {
	  return false;
	}
	@Override
	public boolean renderAsNormalBlock() {
	  return false;
	}
	@Override
	public int getRenderType() {
	  return -1;
	}
	
	public void onBlockDestroyedByPlayer(World var1, int var2, int var3, int var4, int var5)
	{
		if(var1.getBlockId(var2, var3 + 1, var4) == blockID)
		{
			var1.setBlockAndMetadataWithNotify(var2, var3 + 1, var4, 0, 0);
		}
		if(var1.getBlockId(var2, var3 - 1, var4) == blockID)
		{
			var1.setBlockAndMetadataWithNotify(var2, var3 - 1, var4, 0, 0);
		}
	}
	
	@Override
	public boolean onBlockActivated(World world, int par2, int par3, int par4, EntityPlayer player, int par6, float par7, float par8, float par9) {
		if(!world.isRemote)
		{
			player.openGui(Pixelmon.instance, EnumGui.PC.getIndex(), world, 0, 0, 0);
		}
		return true;
	}
    
	@Override
	public TileEntity createNewTileEntity(World var1) {
		return new TileEntityPC();
	}
}

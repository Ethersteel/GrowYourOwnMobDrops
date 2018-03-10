package ethersteel.gyomd.block;

import ethersteel.gyomd.GYOMobDrops;
import ethersteel.gyomd.ModItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

public class BlockEnderWheat extends BlockCrops {

    private static final AxisAlignedBB[] ENDER_WHEAT_AABB = new AxisAlignedBB[] {new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.375D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.625D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.75D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.875D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D)};

    public BlockEnderWheat() {
        setUnlocalizedName("ender_wheat");
        setRegistryName("ender_wheat");
    }

    protected Item getSeed()
    {
        return ModItems.ENDER_WHEAT_SEEDS;
    }

    protected Item getCrop()
    {
        return Items.ENDER_PEARL;
    }

    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return ENDER_WHEAT_AABB[((Integer)state.getValue(this.getAgeProperty())).intValue()];
    }

    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(IBlockState state, World world, BlockPos pos, Random rand)
    {
        //if (ConfigHandler.MakeAshenwheatFlame == true)
        if (getAge(state)==getMaxAge())
        {
            float f1 = (float)pos.getX() + 0.5F;
            float f2 = (float)pos.getY() + 0.3F;
            float f3 = (float)pos.getZ() + 0.5F;
            float f4 = rand.nextFloat() * 0.6F - 0.3F;
            float f5 = rand.nextFloat() * -0.6F - -0.3F;
            world.spawnParticle(EnumParticleTypes.PORTAL,
                    (double)(f1 + f4), (double)(f2 + f4 + f5) , (double)(f3 + f5),
                    0.0D, 0.0D, 0.0D, new int[0]);
        }
        else
        {
            return;
        }
    }

    public void registerItemModel(Item itemBlock) {
        GYOMobDrops.proxy.registerItemRenderer(itemBlock, 0, "ender_wheat");
    }
}

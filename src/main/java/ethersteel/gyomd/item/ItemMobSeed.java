package ethersteel.gyomd.item;

import ethersteel.gyomd.GYOMobDrops;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;

public class ItemMobSeed extends ItemSeeds{

    protected String name;

    public ItemMobSeed(String name, Block crops) {
        super(crops, Blocks.FARMLAND);
        this.name = name;
        setUnlocalizedName(GYOMobDrops.MODID + ":" + name);
        setRegistryName(name);
    }

    public void registerItemModel() {
        GYOMobDrops.proxy.registerItemRenderer(this, 0, name);
    }

}

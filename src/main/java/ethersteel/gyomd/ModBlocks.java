package ethersteel.gyomd;

import ethersteel.gyomd.block.BlockEnderWheat;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

    public static BlockEnderWheat ENDER_WHEAT = new BlockEnderWheat();

    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                // ...
                ENDER_WHEAT
        );
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {

    }

    public static void registerModels() {

    }
}

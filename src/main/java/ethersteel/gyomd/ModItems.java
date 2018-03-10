package ethersteel.gyomd;

import ethersteel.gyomd.item.ItemMobSeed;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

    public static ItemMobSeed ENDER_WHEAT_SEEDS = new ItemMobSeed("ender_wheat_seeds", ModBlocks.ENDER_WHEAT);

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                // ...
                ENDER_WHEAT_SEEDS
        );
    }

    public static void registerModels() {
        ENDER_WHEAT_SEEDS.registerItemModel();
    }
}

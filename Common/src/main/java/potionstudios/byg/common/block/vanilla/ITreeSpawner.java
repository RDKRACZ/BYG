package potionstudios.byg.common.block.vanilla;

import it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap;
import net.minecraft.Util;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import potionstudios.byg.common.world.feature.overworld.trees.TreeSpawners;
import potionstudios.byg.common.world.feature.overworld.trees.util.TreeSpawner;

public interface ITreeSpawner {

    Reference2ReferenceOpenHashMap<Block, TreeSpawner> VANILLA_SAPLING_BYG_TREE_SPAWNERS = Util.make(new Reference2ReferenceOpenHashMap<>(), (map) -> {
        map.put(Blocks.SPRUCE_SAPLING, TreeSpawners.SPRUCE);
        map.put(Blocks.BIRCH_SAPLING, TreeSpawners.BIRCH);
        map.put(Blocks.OAK_SAPLING, TreeSpawners.OAK);
    });


    void setTreeSpawner(TreeSpawner treeSpawner);
}
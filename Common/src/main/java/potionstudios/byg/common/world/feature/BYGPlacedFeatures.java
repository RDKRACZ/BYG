package potionstudios.byg.common.world.feature;

import com.google.common.collect.ImmutableList;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import potionstudios.byg.BYG;
import potionstudios.byg.common.block.BYGBlocks;
import potionstudios.byg.mixin.access.VegetationPlacementsAccess;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

import static net.minecraft.data.worldgen.placement.VegetationPlacements.treePlacement;
import static net.minecraft.data.worldgen.placement.VegetationPlacements.worldSurfaceSquaredWithCount;

public class BYGPlacedFeatures {

    public static final PlacedFeature ALLIUM_FIELD_FLOWERS = createPlacedFeature("allium_field_flowers", BYGConfiguredFeatures.ALLIUM_FIELD_FLOWERS.placed(worldSurfaceSquaredWithCount(20)));
    public static final PlacedFeature AMARANTH_FIELD_FLOWERS = createPlacedFeature("amaranth_field_flowers", BYGConfiguredFeatures.AMARANTH_FIELD_FLOWERS.placed(worldSurfaceSquaredWithCount(20)));

    public static final PlacedFeature FIRECRACKER_BUSH = createPlacedFeature("firecracker_bush", BYGConfiguredFeatures.FIRECRACKER_BUSH.placed(worldSurfaceSquaredWithCount(3)));
    public static final PlacedFeature BLUE_BERRY_BUSH = createPlacedFeature("blue_berry_bush", BYGConfiguredFeatures.BYG_GRASS_EXTRA.placed(worldSurfaceSquaredWithCount(2)));
    public static final PlacedFeature BLUE_BERRY_BUSH_LUSH = createPlacedFeature("blue_berry_bush_lush", BYGConfiguredFeatures.BYG_GRASS_EXTRA.placed(worldSurfaceSquaredWithCount(5)));

    public static final PlacedFeature CATTAIL = createPlacedFeature("cattails", BYGConfiguredFeatures.CATTAIL.placed(oceanFloorSquaredWithCountAndMaxDepth(25, OptionalInt.of(2))));
    public static final PlacedFeature LEATHER_FLOWERS = createPlacedFeature("leather_flowers", BYGConfiguredFeatures.LEATHER_FLOWERS.placed(worldSurfaceSquaredWithCount(2)));
    public static final PlacedFeature LEAF_PILES = createPlacedFeature("leaf_piles", BYGConfiguredFeatures.LEAF_PILE.placed(worldSurfaceSquaredWithCount(2)));
    public static final PlacedFeature CLOVER_FLOWERS = createPlacedFeature("clover_flower_patch", BYGConfiguredFeatures.CLOVER_PATCH.placed(worldSurfaceSquaredWithCount(2)));
    public static final PlacedFeature CROCUS = createPlacedFeature("crocus", BYGConfiguredFeatures.CROCUS.placed(worldSurfaceSquaredWithCount(2)));
    public static final PlacedFeature ANEMONES = createPlacedFeature("anemones", BYGConfiguredFeatures.ANEMONES.placed(worldSurfaceSquaredWithCount(2)));
    public static final PlacedFeature ROSES = createPlacedFeature("rose", BYGConfiguredFeatures.ROSE.placed(worldSurfaceSquaredWithCount(2)));
    public static final PlacedFeature BLACK_ROSE = createPlacedFeature("black_rose", BYGConfiguredFeatures.BLACK_ROSE.placed(worldSurfaceSquaredWithCount(2)));
    public static final PlacedFeature CYAN_ROSE = createPlacedFeature("cyan_rose", BYGConfiguredFeatures.CYAN_ROSE.placed(worldSurfaceSquaredWithCount(2)));
    public static final PlacedFeature DAISY_ORANGE = createPlacedFeature("orange_daisy", BYGConfiguredFeatures.DAISY_ORANGE.placed(worldSurfaceSquaredWithCount(2)));
    public static final PlacedFeature JAPANESE_ORCHID = createPlacedFeature("japanese_orchid", BYGConfiguredFeatures.JAPANESE_ORCHID.placed(worldSurfaceSquaredWithCount(2)));
    public static final PlacedFeature FAIRY_SLIPPER = createPlacedFeature("fairy_slipper", BYGConfiguredFeatures.FAIRY_SLIPPER.placed(worldSurfaceSquaredWithCount(2)));
    public static final PlacedFeature CHERRY_FOLIAGE = createPlacedFeature("cherry_foliage", BYGConfiguredFeatures.CHERRY_FOLIAGE.placed(worldSurfaceSquaredWithCount(6)));
    public static final PlacedFeature HORSEWEED = createPlacedFeature("horseweed", BYGConfiguredFeatures.HORSEWEED.placed(worldSurfaceSquaredWithCount(2)));
    public static final PlacedFeature IRIS = createPlacedFeature("iris", BYGConfiguredFeatures.IRIS.placed(worldSurfaceSquaredWithCount(2)));
    public static final PlacedFeature TULIPS = createPlacedFeature("tulips", BYGConfiguredFeatures.TULIPS.placed(worldSurfaceSquaredWithCount(2)));
    public static final PlacedFeature WHITE_PUFFBALL = createPlacedFeature("white_puffball", BYGConfiguredFeatures.WHITE_PUFFBALL.placed(worldSurfaceSquaredWithCount(2)));
    public static final PlacedFeature SAGES = createPlacedFeature("sages", BYGConfiguredFeatures.SAGES.placed(worldSurfaceSquaredWithCount(2)));
    public static final PlacedFeature WINTER_SUCCULENT = createPlacedFeature("winter_succulent", BYGConfiguredFeatures.WINTER_SUCCULENT.placed(worldSurfaceSquaredWithCount(2)));
    public static final PlacedFeature DAFFODIL_YELLOW = createPlacedFeature("yellow_daffodil", BYGConfiguredFeatures.DAFFODIL_YELLOW.placed(worldSurfaceSquaredWithCount(2)));
    public static final PlacedFeature JUNGLE_FLOWERS = createPlacedFeature("jungle_flowers", BYGConfiguredFeatures.JUNGLE_FLOWERS.placed(worldSurfaceSquaredWithCount(2)));
    public static final PlacedFeature LARGE_PUMPKINS = createPlacedFeature("large_pumpkins", BYGConfiguredFeatures.LARGE_PUMPKINS.placed(treePlacement(PlacementUtils.countExtra(1, 0.25F, 1))));
    public static final PlacedFeature SWAMP_WATER_VEGETATION = createPlacedFeature("swamp_water_vegetation", BYGConfiguredFeatures.SWAMP_WATER_VEGETATION.placed(worldSurfaceSquaredWithCount(25)));

    public static final PlacedFeature MUSHROOMS = createPlacedFeature("mushrooms", BYGConfiguredFeatures.MUSHROOMS.placed(VegetationPlacementsAccess.invokeGetMushroomPlacement(512, null)));
    public static final PlacedFeature ARAUCARIA_TREES = createPlacedFeature("araucaria_trees", BYGConfiguredFeatures.ARAUCARIA_TREES.placed(treePlacement(PlacementUtils.countExtra(1, 0.25F, 2))));
    public static final PlacedFeature ASPEN_SHRUBS = createPlacedFeature("aspen_shrubs", BYGConfiguredFeatures.ASPEN_SHRUBS.placed(treePlacement(PlacementUtils.countExtra(0, 0.25F, 2))));
    public static final PlacedFeature ASPEN_TREES = createPlacedFeature("aspen_trees", BYGConfiguredFeatures.ASPEN_TREES.placed(treePlacement(PlacementUtils.countExtra(6, 0.25F, 3))));
    public static final PlacedFeature ASPEN_TREES_SPARSE = createPlacedFeature("aspen_trees_sparse", BYGConfiguredFeatures.ASPEN_TREES.placed(treePlacement(PlacementUtils.countExtra(0, 0.25F, 1))));
    public static final PlacedFeature BAOBAB_TREES = createPlacedFeature("baobab_trees", BYGConfiguredFeatures.BAOBAB_TREES.placed(treePlacement(PlacementUtils.countExtra(0, 0.25F, 1))));
    public static final PlacedFeature BOREAL_TREES = createPlacedFeature("boreal_trees", BYGConfiguredFeatures.BOREAL_TREES.placed(treePlacement(PlacementUtils.countExtra(4, 0.2F, 2))));
    public static final PlacedFeature BAYOU_TREES = createPlacedFeature("bayou_trees", BYGConfiguredFeatures.BAYOU_TREES.placed(treePlacementBaseOceanFloor(PlacementUtils.countExtra(4, 0.2F, 2))));
    public static final PlacedFeature BLACK_FOREST_TREES = createPlacedFeature("black_forest_trees", BYGConfiguredFeatures.BLACK_FOREST_TREES.placed(treePlacement(PlacementUtils.countExtra(8, 0.2F, 2))));
    public static final PlacedFeature CANADIAN_SHIELD_TREES = createPlacedFeature("canadian_shield_trees", BYGConfiguredFeatures.CANADIAN_SHIELD_TREES.placed(treePlacement(PlacementUtils.countExtra(4, 0.25F, 2))));
    public static final PlacedFeature CHERRY_TREES = createPlacedFeature("cherry_trees", BYGConfiguredFeatures.CHERRY_TREES.placed(treePlacement(PlacementUtils.countExtra(6, 0.25F, 2))));
    public static final PlacedFeature CIKA_TREES = createPlacedFeature("cika_trees", BYGConfiguredFeatures.CIKA_TREES.placed(treePlacement(PlacementUtils.countExtra(2, 0.25F, 2))));
    public static final PlacedFeature CONIFER_TREES = createPlacedFeature("conifer_trees", BYGConfiguredFeatures.CONIFER_TREES.placed(treePlacement(PlacementUtils.countExtra(7, 0.25F, 3))));
    public static final PlacedFeature CYPRESS_TREES = createPlacedFeature("cypress_trees", BYGConfiguredFeatures.CYPRESS_TREES.placed(treePlacementBaseOceanFloor(PlacementUtils.countExtra(4, 0.25F, 1))));
    public static final PlacedFeature DACITE_RIDGE_TREES = createPlacedFeature("dacite_ridge_trees", BYGConfiguredFeatures.DACITE_RIDGE_TREES.placed(treePlacement(PlacementUtils.countExtra(1, 0.25F, 2))));
    public static final PlacedFeature DECIDUOUS_TREES = createPlacedFeature("deciduous_trees", BYGConfiguredFeatures.DECIDUOUS_TREES.placed(treePlacement(PlacementUtils.countExtra(3, 0.25F, 2))));
    public static final PlacedFeature EBONY_TREES = createPlacedFeature("ebony_trees", BYGConfiguredFeatures.EBONY_TREES.placed(treePlacement(PlacementUtils.countExtra(4, 0.25F, 4))));
    public static final PlacedFeature ENCHANTED_TREES = createPlacedFeature("enchanted_trees", BYGConfiguredFeatures.ENCHANTED_TREES.placed(treePlacement(PlacementUtils.countExtra(5, 0.2F, 2))));
    public static final PlacedFeature TEMPERATE_GROVE_TREES = createPlacedFeature("temperate_grove_trees", BYGConfiguredFeatures.TEMPERATE_GROVE_TREES.placed(treePlacement(PlacementUtils.countExtra(1, 0.25F, 2))));
    public static final PlacedFeature JACARANDA_TREES = createPlacedFeature("jacaranda_trees", BYGConfiguredFeatures.JACARANDA_TREES.placed(treePlacement(PlacementUtils.countExtra(4, 0.2F, 2))));
    public static final PlacedFeature JACARANDA_BUSHES = createPlacedFeature("jacaranda_bushes", BYGConfiguredFeatures.JACARANDA_BUSHES.placed(treePlacement(PlacementUtils.countExtra(1, 0.2F, 1))));
    public static final PlacedFeature MANGROVE_TREES = createPlacedFeature("mangrove_trees", BYGConfiguredFeatures.MANGROVE_TREES.placed(treePlacementBaseOceanFloor(PlacementUtils.countExtra(6, 0.25F, 2))));
    public static final PlacedFeature MAPLE_TREES = createPlacedFeature("maple_trees", BYGConfiguredFeatures.MAPLE_TREES.placed(treePlacement(PlacementUtils.countExtra(4, 0.25F, 2))));
    public static final PlacedFeature STRUCTURE_TREES = createPlacedFeature("structure_trees", BYGConfiguredFeatures.STRUCTURE_TREE_TEST.placed(treePlacement(PlacementUtils.countExtra(4, 0.25F, 2), BYGBlocks.JACARANDA_SAPLING)));
    public static final PlacedFeature HOLLY_TREES = createPlacedFeature("holly_trees", BYGConfiguredFeatures.HOLLY_TREES.placed(treePlacement(PlacementUtils.countExtra(4, 0.25F, 4))));
    public static final PlacedFeature PRAIRIE_SHRUBS = createPlacedFeature("prairie_shrubs", BYGConfiguredFeatures.DECIDUOUS_TREES.placed(treePlacement(PlacementUtils.countExtra(0, 0.25F, 2))));
    public static final PlacedFeature RAINFOREST_TREES = createPlacedFeature("rainforest_trees", BYGConfiguredFeatures.RAINFOREST_TREES.placed(treePlacement(PlacementUtils.countExtra(15, 0.25F, 1))));
    public static final PlacedFeature SPRUCE_TREES_SPARSE = createPlacedFeature("spruce_trees_sparse", BYGConfiguredFeatures.SPRUCE_TREES.placed(treePlacement(PlacementUtils.countExtra(1, 0.2F, 1))));

    public static final PlacedFeature HUGE_MUSHROOMS = createPlacedFeature("huge_mushrooms", BYGConfiguredFeatures.HUGE_MUSHROOMS.placed(treePlacement(PlacementUtils.countExtra(0, 0.25F, 2))));

    public static final PlacedFeature MEADOW_SHRUBS = createPlacedFeature("meadow_shrubs", BYGConfiguredFeatures.MEADOW_SHRUBS.placed(treePlacement(PlacementUtils.countExtra(0, 0.25F, 2))));

    public static final PlacedFeature SPARSE_RED_OAK_TREES = createPlacedFeature("sparse_red_oak_trees", BYGConfiguredFeatures.RED_OAK_TREES.placed(treePlacement(PlacementUtils.countExtra(0, 0.2F, 1))));

    public static final PlacedFeature SPARSE_JACARANDA_TREES = createPlacedFeature("sparse_jacaranda_trees", BYGConfiguredFeatures.JACARANDA_TREES.placed(treePlacement(PlacementUtils.countExtra(0, 0.2F, 2))));
    public static final PlacedFeature SPARSE_ARAUCARIA_TREES = createPlacedFeature("sparse_araucaria_trees", BYGConfiguredFeatures.ARAUCARIA_TREES.placed(treePlacement(PlacementUtils.countExtra(0, 0.2F, 3))));

    public static final PlacedFeature DISK_MUD = createPlacedFeature("disk_mud", BYGConfiguredFeatures.DISK_MUD.placed(InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, BiomeFilter.biome()));

    public static final PlacedFeature MOSSY_STONE_BOULDER = createPlacedFeature("mossy_stone_boulder", BYGConfiguredFeatures.MOSSY_STONE_BOULDER.placed(CountPlacement.of(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
    public static final PlacedFeature ROCKY_STONE_BOULDER = createPlacedFeature("rocky_stone_boulder", BYGConfiguredFeatures.ROCKY_STONE_BOULDER.placed(CountPlacement.of(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
    public static final PlacedFeature BLACKSTONE_BOULDER = createPlacedFeature("blackstone_boulder", BYGConfiguredFeatures.BLACKSTONE_BOULDER.placed(CountPlacement.of(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
    public static final PlacedFeature ORANGE_TERRACOTTA_BOULDER = createPlacedFeature("orange_terracotta_boulder", BYGConfiguredFeatures.ORANGE_TERRACOTTA_BOULDER.placed(CountPlacement.of(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

    public static final PlacedFeature DEAD_SEA_SPIKES = createPlacedFeature("dead_sea_spikes", BYGConfiguredFeatures.DEAD_SEA_SPIKES.placed(oceanFloorSquaredWithCount(3)));

    public static PlacedFeature createPlacedGroundVegetationFeature(String id, ConfiguredFeature<?, ?> flowerConfiguredFeature, PlacementModifier... additionalModifiers) {
        List<PlacementModifier> spread = new ArrayList<>(List.of(InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        spread.addAll(List.of(additionalModifiers));
        return createPlacedFeature(id, flowerConfiguredFeature.placed(spread));
    }

    private static List<PlacementModifier> treePlacementBaseOceanFloor(PlacementModifier $$0) {
        return ImmutableList.<PlacementModifier>builder().add($$0).add(InSquarePlacement.spread()).add(PlacementUtils.HEIGHTMAP_OCEAN_FLOOR).add(BiomeFilter.biome()).build();
    }

    public static List<PlacementModifier> oceanFloorSquaredWithCount(int $$0) {
        return oceanFloorSquaredWithCountAndMaxDepth($$0, OptionalInt.empty());
    }

    public static List<PlacementModifier> oceanFloorSquaredWithCountAndMaxDepth(int $$0, OptionalInt maxDepth) {
        ArrayList<PlacementModifier> placementModifiers = new ArrayList<>(List.of(CountPlacement.of($$0), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BiomeFilter.biome()));
        if (maxDepth.isPresent()) {
            placementModifiers.add(SurfaceWaterDepthFilter.forMaxDepth(maxDepth.getAsInt()));
        }
        return placementModifiers;
    }


    public static <PF extends PlacedFeature> PF createPlacedFeature(String id, PF placedFeature) {
        ResourceLocation bygID = new ResourceLocation(BYG.MOD_ID, id);
        if (BuiltinRegistries.PLACED_FEATURE.keySet().contains(bygID))
            throw new IllegalStateException("Placed Feature ID: \"" + bygID.toString() + "\" already exists in the Placed Features registry!");

        Registry.register(BuiltinRegistries.PLACED_FEATURE, bygID, placedFeature);
        return placedFeature;
    }

    public static void bootStrap() {
    }
}

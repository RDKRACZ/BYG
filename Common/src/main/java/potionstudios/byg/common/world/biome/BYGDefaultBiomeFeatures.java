package potionstudios.byg.common.world.biome;

import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import potionstudios.byg.common.world.feature.BYGPlacedFeatures;

public class BYGDefaultBiomeFeatures {
    public static void addAlliumFieldFlowers(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.ALLIUM_FIELD_FLOWERS);
    }

    public static void addBasaltFeatures(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.RAW_GENERATION, BYGConfiguredFeatures.LARGE_BASALT_COLUMN);
        //gen.addFeature(GenerationStep.Decoration.RAW_GENERATION, BYGConfiguredFeatures.SMALL_BASALT_COLUMN);
        //gen.addFeature(GenerationStep.Decoration.RAW_GENERATION, BYGConfiguredFeatures.BASALT_DELTA);
    }

    public static void addBeeHive(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.BEEHIVES);
    }


    public static void addAmaranthFieldFlowers(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.AMARANTH_FIELD_FLOWERS);
    }

    public static void addRoseFieldFlowers(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_ROSE_FIELD_FLOWER);
    }

    public static void addGrasslandBoulders(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.RAW_GENERATION, BYGConfiguredFeatures.GRASSLAND_BOULDER);
    }

    public static void addGraniteBoulder(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.RAW_GENERATION, BYGConfiguredFeatures.GRANITE_BOULDER);
    }

    public static void addWindsweptBoulders(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.RAW_GENERATION, BYGConfiguredFeatures.WINDSWEPT_BOULDER);
    }

    public static void addBYGDesertPlants(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_DESERT_PLANTS);
    }

    public static void addFirecracker(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.FIRECRACKER_BUSH);
    }

    public static void addPrairieGrass(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_PRAIRIE_GRASS);
    }

    public static void addPumpkinPatch(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.PUMPKINS);
    }

    public static void addBlueberries(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.BLUE_BERRY_BUSH);
    }

    public static void addLushBlueberries(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.BLUE_BERRY_BUSH_LUSH);
    }

    public static void addBeachGrass(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_BEACH_GRASS);
    }

    public static void addLargeLake(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.RAW_GENERATION, BYGConfiguredFeatures.WIDE_WATER_LAKE);
    }

    public static void addEndLake(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.RAW_GENERATION, BYGConfiguredFeatures.END_LAKE);
    }

    public static void addOverworldLake(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.RAW_GENERATION, BYGConfiguredFeatures.OVERWORLD_LAKE);
    }

    public static void addDenseOverworldLake(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.RAW_GENERATION, BYGConfiguredFeatures.DENSE_OVERWORLD_LAKE);
    }

    public static void addBulbisLake(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.RAW_GENERATION, BYGConfiguredFeatures.BULBIS_WATER_LAKE);
    }

    public static void addCrimsonGardensVegetation(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_FUNGUS);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_CRIMSON_GARDEN_VEGETATION);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.WEEPING_VINES);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.BLACKSTONE_BOULDERS);

    }

    public static void addEmburBogVegetation(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_EMBUR_MUSHROOM);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_EMBUR_BOG_PLANT);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.EMBUR_LILY);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.EMBUR_SPROUTS);
    }

    public static void addBlueNetherOres(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, BYGConfiguredFeatures.ORE_BLUE_NETHER_GOLD);
        //gen.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, BYGConfiguredFeatures.ORE_BLUE_NETHER_QUARTZ);
    }

    public static void addVanillaSunFlowers(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.PATCH_SUNFLOWER);
    }

    public static void addDelphinium(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.DELPHINIUMS);
    }

    public static void addJapaneseOrchid(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.JAPANESE_ORCHID);
    }

    public static void addWiltedGrass(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.WILTED_GRASS);
    }

    public static void addWinterGrass(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.WINTER_GRASS);
    }

    public static void addLeafPile(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.LEAF_PILES);
    }

    public static void addCloverFlowerPatch(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.CLOVER_FLOWERS);
    }

    public static void addCherryFoliage(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.CHERRY_FOLIAGE);
    }

    public static void addBYGSwampVegetation(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.SWAMP_WATER_VEGETATION);
    }

    public static void addBYGLilyPad(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_LILY_PADS);
    }

    public static void addDefaultLilyPad(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.DEFAULT_LILY_PAD);

    }

    public static void addHorseweed(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.HORSEWEED);
    }

    public static void addWinterSucculent(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.WINTER_SUCCULENT);
    }

    public static void addShortGrass(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.SHORT_GRASSES);
    }

    public static void addIris(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.IRIS);
    }

    public static void addTulips(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.TULIPS);
    }

    public static void addCaliforniaPoppy(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.CALIFORNIA_POPPIES);
    }

    public static void addCrocus(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.CROCUS);
    }

    public static void addAlpineBellflower(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.ALPINE_BELLFLOWERS);
    }

    public static void addWinterScilla(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.WINTER_SCILLAS);
    }

    public static void addYellowDaffodil(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.DAFFODIL_YELLOW);
    }

    public static void addDaffodil(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_DAFFODILS);
    }

    public static void addPinkDaffodil(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_DAFFODILS);
    }

    public static void addLolliPop(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.LOLIPOP_FLOWERS);
    }

    public static void addRose(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.ROSES);
    }

    public static void addBlackRose(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.BLACK_ROSE);
    }

    public static void addOsiria(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.OSIRIA_ROSES);
    }

    public static void addWinterRose(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.WINTER_ROSES);
    }

    public static void addSnowdrops(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.SNOWDROPS);
    }

    public static void addMudDisks(BiomeGenerationSettings.Builder biomeIn) {
        biomeIn.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, BYGPlacedFeatures.DISK_MUD);
    }

    public static void addBYGMushrooms(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.MUSHROOMS);
    }

    public static void addWhitePuffball(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.WHITE_PUFFBALL);
    }

    public static void addMGCoral(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_CORAL_MANGROVE);
    }

    public static void addAnemones(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.ANEMONES);
    }

    public static void addFoxgloves(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.FOXGLOVES);
    }

    public static void addCattails(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.CATTAIL);
    }

    public static void addReeds(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.REEDS);

    }

    public static void addFairyslipper(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.FAIRY_SLIPPER);
    }

    public static void addCyanRose(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.CYAN_ROSE);
    }

    public static void addLeatherFlowers(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.LEATHER_FLOWERS);
    }

    public static void addKovanFlower(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.KOVAN_FLOWERS);
    }

    public static void addShrub(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_BYG_SHRUB);
    }

    public static void addMarshGrass(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, Features.PATCH_TALL_GRASS_2);
    }

    public static void addTallGrass(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, Features.PATCH_TALL_GRASS);
    }


    public static void addSages(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.SAGES);
    }

    public static void addOrangeDaisy(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.DAISY_ORANGE);
    }

    public static void addPinkAllium(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.PINK_ALLIUMS);
    }

    public static void addJacarandaBushes(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.JACARANDA_BUSHES);
    }

    public static void addBYGTropicFlowers(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.JUNGLE_FLOWERS);
    }

    public static void addMiniCactus(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_DESERT_PLANTS);
    }

    public static void addRockyStoneBoulder(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.RAW_GENERATION, BYGPlacedFeatures.ROCKY_STONE_BOULDER);
    }

    public static void addGiantLunaRocks(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.WHITE_SANDSTONE_BOULDER);
//        //gen.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.VALLE_DE_LUNA_POINTY_ROCK);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.VALLE_DE_LUNA_POINTY_ROCK_LARGE);
    }

    public static void addTerracottaBoulder(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.RAW_GENERATION, BYGConfiguredFeatures.ORANGE_TERRACOTTA_BOULDERS);
    }

    public static void addMossyStoneBoulder(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.RAW_GENERATION, BYGPlacedFeatures.MOSSY_STONE_BOULDER);
    }

    public static void addFrostMagmaLakes(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, BYGConfiguredFeatures.FROST_MAGMA_LAKE);
    }

    public static void addWarpedVegetation(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.HANGING_SOUL_SHROOM_SPORES);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.WARPED_CORAL_PLANT);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_WARPED_DESERT_VEGETATION);
        //gen.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, BYGConfiguredFeatures.SOUL_SOIL_PILLARS);
    }

    public static void addSoulFireWarped(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, BYGConfiguredFeatures.NYLIUM_SOUL_FIRE);
    }

    public static void addFrostMagmaPillars(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, BYGConfiguredFeatures.FROST_MAGMA_PILLARS);
    }

    public static void addMagmaPillars(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, BYGConfiguredFeatures.MAGMA_PILLARS);
    }

    public static void addBrimstoneOres(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, BYGConfiguredFeatures.ORE_ANTHRACITE);
        //gen.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, BYGConfiguredFeatures.ORE_BRIMSTONE_NETHER_GOLD);
        //gen.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, BYGConfiguredFeatures.ORE_BRIMSTONE_NETHER_QUARTZ);
    }

    public static void addBrimstonePillars(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, BYGConfiguredFeatures.BRIMSTONE_PILLARS);
    }

    public static void addBrimstoneVents(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, BYGConfiguredFeatures.BRIMSTONE_VENTS);
    }

    public static void addBoricFire(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, BYGConfiguredFeatures.BORIC_FIRE);
    }

    public static void addCrypticFire(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, BYGConfiguredFeatures.CRYPTIC_FIRE);
    }

    public static void addCrypticVents(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_CRYPTIC_VENT);
    }

    public static void addCrypticBramble(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.CRYPTIC_BRAMBLES);
    }

    public static void addMagmaFire(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, BYGConfiguredFeatures.MAGMA_FIRE);
    }

    public static void addSubzeroAsh(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, BYGConfiguredFeatures.RANDOM_SUBZERO_ASH_PATCH);
    }

    public static void addScorchedPlants(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_SCORCHED_PLANT);
    }

    public static void addWailingVegetation(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_WAILING_VEGETATION);
//        //gen.withFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, BYGConfiguredFeatures.RANDOM_WAILING_VINES);
        //gen.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, BYGConfiguredFeatures.CHAINS);
    }

    public static void addWeepigMireVegetation(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_LAMENT_VEGETATION);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.LAMENT_VINE_FEATURE);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.EMBUR_LILY);
    }

    public static void addSythianVegetation(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_SYTHIAN_FUNGUS);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.SYTHIAN_STALK);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_SYTHIAN_PLANT);
        //gen.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, BYGConfiguredFeatures.SYTHIAN_FUNGUS_PILLARS);
        //gen.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, BYGConfiguredFeatures.MOSSY_NETHERRACK_PILLARS);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.HANGING_SYTHIAN_ROOTS);
    }

    public static void addQuartzDesertVegetations(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.QUARTZ_CRYSTALS);
        //gen.addFeature(GenerationStep.Decoration.SURFACE_STRUCTURES, BYGConfiguredFeatures.QUARTZ_COLUMNS);
        //gen.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, BYGConfiguredFeatures.QUARTZ_SPIKE);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.HANGING_BONE_FEATURE);
    }


    public static void addGlowstoneGardenVegetation(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, BYGConfiguredFeatures.RANDOM_GLOWSTONE_GARDEN_VEGETATION);
//        //gen.withFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, BYGConfiguredFeatures.RANDOM_WEEPING_ROOTS);
        //gen.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, BYGConfiguredFeatures.WEEPING_ROOTS);
    }

    public static void addDeadSeaSpires(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.RAW_GENERATION, BYGPlacedFeatures.DEAD_SEA_SPIKES);
    }

    public static void addHugeNetherMushrooms(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, BYGConfiguredFeatures.RANDOM_SOUL_SHROOM_TREES);
        //gen.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, BYGConfiguredFeatures.RANDOM_DEATH_CAP_TREES);
    }

    public static void addMiniNetherMushrooms(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, BYGConfiguredFeatures.RANDOM_MINI_MUSHROOMS);
    }

    public static void addTropFungalMushrooms(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_HUGE_MUSHROOM);
    }

    public static void addIvisPlants(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_IVIS_PLANTS);
    }

    public static void addBulbisOddity(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_BULBIS_ODDITY);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.BULBIS_SPROUT_PLANT);
    }

    public static void addBulbisAnomaly(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_BULBIS_ANOMALY);
    }

    public static void addEnderLily(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.ENDER_LILY);
    }

    public static void addEtherPlants(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_ETHER_PLANT);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.THEREAL_BELLFLOWERS);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.ETHER_BULBS);
        //gen.addFeature(GenerationStep.Decoration.RAW_GENERATION, BYGConfiguredFeatures.ETHER_STONE_BOULDER);
    }

    public static void addTheriumDeposit(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.THERIUM_CRYSTAL_DEPOSIT);
        //gen.addFeature(GenerationStep.Decoration.TOP_LAYER_MODIFICATION, BYGConfiguredFeatures.THERIUM_CRYSTALS);
    }

    public static void addEtherFoliage(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.ETHER_FOLIAGES);
    }

    public static void addNightshadePlants(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_NIGHTSHADE_PLANT);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.NIGHTSHADE_BERRY_BUSHES);
    }

    public static void addShulkrenPlants(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.SHULKREN_FUNGI);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.SHULKREN_MOSS);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.HANGING_SHULKREN_VINE);
    }

    public static void addImpariusPlants(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.IMPARIUS_MUSHROOMS);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.FUNGI_IMPARIUS);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.IMPARIUS_BUSHES);

    }

    public static void addShatteredDesertPlants(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_ODDITY_PLANT);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.END_STONE_BOULDER);
//        //gen.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.WHITE_SANDSTONE_BOULDER);
    }

    public static void addVermilionSculkGrowth(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.VERMILION_SCULK_GROWTHS);
    }

    public static void addVermilionSculkTendrils(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.VERMILION_SCULK_TENDRIL);
    }

    public static void addHangingTheriumLanterns(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.HANGING_THERIUM_LANTERNS);
    }

    public static void addHangingChains(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.HANGING_CHAINS);
    }

    public static void addHangingLanterns(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.HANGING_LANTERNS);
    }

    public static void addGiantFlowerFeatures(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_GIANT_FLOWER);
    }


    /*****Trees*****/
    public static void addAncientTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_ANCIENT_TREE);
    }

    public static void addBlueTaigaTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_SPRUCE_TREE);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_SPRUCE_BLUE_TREE);
    }

    public static void addBlackForestTrees(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.BLACK_FOREST_TREES);
    }

    public static void addSparseBlackForestTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_BLACK_FOREST_SPARSE_TREE);
    }

    public static void addBorealTrees(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.BOREAL_TREES);
    }

    public static void addBorealSparseTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_BOREAL_SPARSE_TREE);
    }

    public static void addConiferousTrees(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.CONIFER_TREES);
    }

    public static void addConiferousSparseTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_CONIFER_SPARSE_TREE);
    }

    public static void addCypressTrees(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.CYPRESS_TREES);
    }

    public static void addDeciduousForestTrees(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.DECIDUOUS_TREES);
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.PRAIRIE_SHRUBS);
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.ASPEN_TREES_SPARSE);
    }

    public static void addDeciduousSparseTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_DECIDUOUS_SPARSE_TREE);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_SHRUB);
    }

    //TODO: Reconfigure
    public static void addRedwoodSparseTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_REDWOOD_SPARSE_TREE);
    }

    public static void addMapleTrees(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.MAPLE_TREES);
    }

    public static void addMapleSparseTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_MAPLE_SPARSE_TREE);
    }

    public static void addGiantBlueTaigaTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_SPRUCE_BLUE_TREE_GIANT);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_SPRUCE_BLUE_TREE);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_SPRUCE_TREE);
    }

    public static void addGiantSeasonalTaigaTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_SPRUCE_TREE);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_SPRUCE_RED_TREE);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_SPRUCE_YELLOW_TREE);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_SPRUCE_ORANGE_TREE);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_SPRUCE_SEASONAL_TREE_GIANT);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_SEASONAL_TAIGA_MISC_TREE);
    }

    public static void addRedOakForestTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_OAK_TREE);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_RED_OAK_TREE);
    }

    public static void addOakForestTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_OAK_TREE);
    }

    public static void addJacarandaTrees(BiomeGenerationSettings.Builder gen) {
//        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.JACARANDA_TREES);
    }

    public static void addSparseJacarandaTrees(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.SPARSE_JACARANDA_TREES);
    }

    public static void addSparseRedOakForestTrees(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.SPARSE_RED_OAK_TREES);
    }

    public static void addSparseOakForestTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_SPARSE_OAK_TREE);
    }

    public static void addSeasonalForestTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_OAK_TREE);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_RED_OAK_TREE);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_ORANGE_OAK_TREE);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_BROWN_OAK_TREE);
    }

    public static void addSeasonalTaigaTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_SPRUCE_TREE);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_SPRUCE_RED_TREE);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_SPRUCE_YELLOW_TREE);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_SPRUCE_ORANGE_TREE);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_SEASONAL_TAIGA_MISC_TREE);
    }

    public static void addFirecrackerShrubs(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.FIRECRACKER_SHRUBS);
    }

    public static void addRainForestTrees(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.RAINFOREST_TREES);
    }

    public static void addStoneForestTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_STONE_FOREST_TREE);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, Features.VINES);
    }

    public static void addFungalRainForestTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_RAINFOREST_FUNGAL_TREE);
    }

    public static void addSparseRainforestTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_RAINFOREST_SPARSE_TREE);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, Features.VINES);
    }

    public static void addRainbowTrees(BiomeGenerationSettings.Builder gen) {
        ////gen.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGDefaultBiomeFeatures.RAINBOW_TREE1.configure(DecoratedFeatureConfig.DEFAULT).decorate(Decorator.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(5, 0.5F, -4))));
    }

    public static void addCragRainbowTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_CRAG_GARDEN_TREE);
    }

    public static void addCikaTrees(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.CIKA_TREES);
    }

    public static void addPrairieTree(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_PRAIRIE_TREE);
    }

    public static void addScarceSpruceTrees(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.SPRUCE_TREES_SPARSE);
    }

    public static void addRedSpruceTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_SPRUCE_RED_TREE);
    }

    public static void addSmallSpruceTrees(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.SPRUCE_TREES_SPARSE);
    }

    public static void addCanadianShieldTrees(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.CANADIAN_SHIELD_TREES);
    }

    public static void addDaciteRidgeTrees(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.DACITE_RIDGE_TREES);
    }

    public static void addNorthernForestTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_NORTHERN_FOREST_TREE);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_SPRUCE_TREE);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_DOVER_TREE);
    }

    public static void addSkyrisTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_SKYRIS_TREE);
    }

    public static void addSparseSkyrisTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_SPARSE_SKYRIS_TREE);
    }

    public static void addAraucariaTrees(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.ARAUCARIA_TREES);
    }

    public static void addSparseAraucariaTrees(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.SPARSE_ARAUCARIA_TREES);
    }

    public static void addBrownZelkovaTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_BROWN_ZELKOVA_TREE);
    }

    public static void addBaobabTrees(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.BAOBAB_TREES);
    }

    public static void addSavannaCanopyTrees(BiomeGenerationSettings.Builder gen) {
    }

    public static void addRedwoodTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_REDWOOD_TREE);
    }

    public static void addMeadowShrubs(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.MEADOW_SHRUBS);
    }

    public static void addMeadowTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_MEADOW_TREE);
    }

    public static void addGroveTrees(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.TEMPERATE_GROVE_TREES);
    }

    public static void addEnchantedGroveTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_ENCHANTED_GROVE_TREE);
    }

    public static void addEnchantedTrees(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.ENCHANTED_TREES);
    }

    public static void addLargePumpkins(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.LARGE_PUMPKINS);
    }

    //TODO: Configured Pumpkin Random Selector
    public static void addWitchPumpkins(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_PUMPKIN_PATCH);
    }

    public static void addBayouVegetation(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.BAYOU_TREES);
    }

    public static void addSparseWillowTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_SPARSE_BAYOU_TREE);
    }

    public static void addAspenTrees(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.ASPEN_TREES);
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.ASPEN_SHRUBS);

    }

    public static void addSparseClearingAspenTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_SPARSE_ASPEN_TREE);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_ASPEN_SHRUB);
    }

    public static void addSparseAspenTrees(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.ASPEN_TREES_SPARSE);
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.ASPEN_SHRUBS);
    }

    public static void addZelkovaTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_ZELKOVA_TREE);
    }

    public static void addSparseZelkovaTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_SPARSE_ZELKOVA_TREE);
    }

    public static void addPaloVerdeTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_PALO_VERDE_TREE);
    }

    public static void addJoshuaTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_JOSHUA_TREE);
    }

    //TODO: Random Selector Mojave Shrubs
    public static void addBushes(BiomeGenerationSettings.Builder gen) {
        ////gen.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGDefaultBiomeFeatures.SHRUB_PRAIRIE1.configure(DecoratedFeatureConfig.DEFAULT).decorate(Decorator.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.8F, 2))));
        ////gen.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGDefaultBiomeFeatures.SHRUB_PRAIRIE2.configure(DecoratedFeatureConfig.DEFAULT).decorate(Decorator.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.8F, 2))));
    }

    public static void addPalmTree(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_DUNE_PALM_TREE);
    }

    public static void addCherryTrees(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.CHERRY_TREES);
    }

    public static void addSparseCherryTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_SPARSE_CHERRY_TREE);
    }

    public static void addDeadHazelTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_WITCH_HAZEL_TREE);
    }

    public static void addSparseDeadHazelTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_SPARSE_WITCH_HAZEL_TREE);
    }

    public static void addEbonyTrees(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.EBONY_TREES);
    }

    public static void addHollyTrees(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.HOLLY_TREES);
    }


    public static void addSparseHollyTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_SPARSE_HOLLY_TREE);
    }

    public static void addMangroveTrees(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.MANGROVE_TREES);
    }

    public static void addSparseMangroveMarshes(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_MANGROVE_SPARSE_TREE);
    }

    public static void addOrchardTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_ORCHARD_TREE);
    }

    public static void addHugeMushrooms(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGPlacedFeatures.HUGE_MUSHROOMS);
    }

    public static void addWoodlandTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_WOODLAND_TREE);
    }

    public static void addDummyTree(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.DUMMY_TREE);
    }

    public static void addLamentTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_TWISTY_LAMENT_TREE);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_WEEPING_LAMENT_TREE);
    }

    public static void addWailingPillars(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_WAILING_PILLAR);
    }

    public static void addWitheringOakTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_WITHERING_OAK_TREE);
    }

    public static void addSparseWitheringOakTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_SPARSE_WITHERING_OAK_TREE);
    }

    public static void addBulbisTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_BULBIS_TREE);
    }

    public static void addPurpleBulbisTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_PURPLE_BULBIS_TREE);
    }

    public static void addSparseBulbisTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_SPARSE_BULBIS_TREE);
    }

    public static void addSparsePurpleBulbisTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_SPARSE_PURPLE_BULBIS_TREE);
    }

    public static void addEtherTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_ETHER_TREE);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_ETHER_BUSH);
    }

    public static void addEtherBushes(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_ETHER_BUSH);
    }

    public static void addSparseEtherTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_SPARSE_ETHER_TREE);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_ETHER_BUSH);
    }

    public static void addShulkrenTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_SHULKREN_TREE);
    }

    public static void addImpariusMushrooms(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_IMPARIUS_MUSHROOM);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_IMPARIUS_MUSHROOM_SHRUBS);
    }

    public static void addFungalImparius(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_FUNGAL_IMPARIUS);
    }

    public static void addImpariusMushroomShrubs(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_IMPARIUS_MUSHROOM_SHRUBS);
    }

    public static void addDeadEtherTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_DEAD_ETHER_TREE);
    }

    public static void addNightShadeTrees(BiomeGenerationSettings.Builder gen) {
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_NIGHTSHADE_TREE);
        //gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BYGConfiguredFeatures.RANDOM_NIGHTSHADE_BUSH);
    }
}

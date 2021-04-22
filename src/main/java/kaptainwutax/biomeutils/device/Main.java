package kaptainwutax.biomeutils.device;

import kaptainwutax.biomeutils.biome.Biome;
import kaptainwutax.biomeutils.biome.Biomes;
import kaptainwutax.biomeutils.layer.IntBiomeLayer;
import kaptainwutax.biomeutils.layer.temperature.ClimateLayer;
import kaptainwutax.biomeutils.source.LayeredBiomeSource;
import kaptainwutax.biomeutils.source.OverworldBiomeSource;
import kaptainwutax.mcutils.util.pos.BPos;
import kaptainwutax.mcutils.version.MCVersion;

public class Main {

	//1024:1
	public static final Restriction.Factory<Restriction> CLIMATE_PLAINS = (version, x, z) -> {
		return new Restriction("CLIMATE_PLAINS", x, z) {
			private final int ID = getLayerId(version, ClimateLayer.Temperate.class);

			@Override
			public boolean testSeed(long seed, long bits) {
				return true;
			}

			@Override
			public boolean testSource(LayeredBiomeSource<IntBiomeLayer> source) {
				return (source.getLayer(this.ID).get(this.getX(), 0, this.getZ()) & ~0xF00) == Biomes.PLAINS.getId();
			}
		};
	};

	public static final Restriction.Factory<Restriction> CLIMATE_MOUNTAIN = (version, x, z) -> {
		return new Restriction("CLIMATE_MOUNTAIN", x, z) {
			private final int ID = getLayerId(version, ClimateLayer.Temperate.class);

			@Override
			public boolean testSeed(long seed, long bits) {
				return true;
			}

			@Override
			public boolean testSource(LayeredBiomeSource<IntBiomeLayer> source) {
				return (source.getLayer(this.ID).get(this.getX(), 0, this.getZ()) & ~0xF00) == Biomes.MOUNTAINS.getId();
			}
		};
	};


	//1024:1
	public static final Restriction.Factory<Restriction> CLIMATE_DESERT = (version, x, z) -> {
		return new Restriction("CLIMATE_DESERT", x, z) {
			private final int ID = getLayerId(version, ClimateLayer.Temperate.class);

			@Override
			public boolean testSeed(long seed, long bits) {
				return true;
			}

			@Override
			public boolean testSource(LayeredBiomeSource<IntBiomeLayer> source) {
				return (source.getLayer(this.ID).get(this.getX(), 0, this.getZ()) & ~0xF00) == Biomes.DESERT.getId();
			}
		};
	};

	//1024:1
	public static final Restriction.Factory<Restriction> NO_PLAINS = (version, x, z) -> {
		return new Restriction("NO_PLAINS", x, z) {
			private final int ID = getLayerId(version, ClimateLayer.Cold.class);

			@Override
			public boolean testSeed(long seed, long bits) {
				return true;
			}

			@Override
			public boolean testSource(LayeredBiomeSource<IntBiomeLayer> source) {
				return source.getLayer(this.ID).get(this.getX(), 0, this.getZ()) != Biomes.PLAINS.getId();
			}
		};
	};

	public static final int[][] MAP = new int[][] {
			{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
			{1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 2, 2},
			{1, 0, 1, 0, 1, 0, 1, 0, 0, 2, 0, 2},
			{1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 2, 2}
	};

	public static final int[][] MAP_2 = new int[][] {
			{2, 1, 1, 2, 1, 1, 2},
			{1, 2, 2, 2, 2, 2, 1},
			{1, 2, 2, 2, 2, 2, 1},
			{2, 1, 2, 2, 2, 1, 2},
			{2, 2, 1, 2, 1, 2, 2},
			{2, 2, 2, 1, 2, 2, 2}
	};

	public static void main3(String[] args) {
		BiomeDevice device = new BiomeDevice(MCVersion.v1_16_2);

		for (int i = 0; i < MAP_2.length; i++) {
			for (int j = 0; j < MAP_2[i].length; j++) {
				int v = MAP_2[i][j];
				if (v == 2) continue;

				if (v == 1) {
					device.add(Restrictions.CONTINENT, j - 3, i - 1);
				} else {
					// device.add(NO_PLAINS, j, i);
				}
			}
		}

		device.findSeeds(System.out::println);
	}

	public static void main2(String[] args) {
		BiomeDevice device = new BiomeDevice(MCVersion.v1_16_2);

        /*
        device.add(Restrictions.COLD_PLAINS, 0, 0);
        device.add(Restrictions.COLD_PLAINS, -1, -1);
        device.add(Restrictions.COLD_PLAINS, 1, -1);
        device.add(Restrictions.COLD_PLAINS, -1, 1);
        device.add(Restrictions.COLD_PLAINS, 1, 1);

        device.add(Restrictions.SPECIAL, 0, 0);
        device.add(Restrictions.SPECIAL, -1, -1);
        device.add(Restrictions.SPECIAL, 1, -1);
        device.add(Restrictions.SPECIAL, -1, 1);
        device.add(Restrictions.SPECIAL, 1, 1);

        device.add(CLIMATE_DESERT, 0, 0);
        device.add(CLIMATE_DESERT, -1, -1);
        device.add(CLIMATE_DESERT, 1, -1);
        device.add(CLIMATE_DESERT, -1, 1);
        device.add(CLIMATE_DESERT, 1, 1);*/

		for (int x = 0; x < 3; x++) {
			for (int z = 0; z < 2; z++) {
				device.add(Restrictions.MUSHROOM, x, z);
			}
		}

		device.findSeeds(System.out::println);
	}

	public static void main(String[] args) {
		BiomeDevice device = new BiomeDevice(MCVersion.v1_16_2);

		int bound = 1;
//        for (int x = -bound; x <= bound; x++) {
//            for (int z = -bound; z <= bound; z++) {
//                if (x!=0 && z!=0){
//                    device.add(Restrictions.SAVANNAH_BIOME,x,z);
//                }
//            }
//        }
		device.add(Restrictions.SAVANNAH_BIOME, 0, 0);
		device.add(Restrictions.HILLS_PLATEAU, 0, 0);
		device.add(Restrictions.MUTATED_SECOND, 0, 0);

		device.findSeeds(seed -> {
			OverworldBiomeSource biomeSource = new OverworldBiomeSource(MCVersion.v1_16_2, seed);
			BPos bpos = biomeSource.getSpawnPoint();
			Biome biome = biomeSource.getBiome(bpos);
			if (biome.getCategory() == Biome.Category.SAVANNA) {
				System.out.println(seed);
			}
		});
	}

}

package com.seedfinding.mcbiome.biome.surface.builder;

import com.seedfinding.mcbiome.biome.Biome;
import com.seedfinding.mcbiome.biome.surface.SurfaceConfig;
import com.seedfinding.mcbiome.source.BiomeSource;
import com.seedfinding.mcbiome.source.StaticNoiseSource;
import com.seedfinding.mccore.block.Block;
import com.seedfinding.mccore.rand.ChunkRand;

public class SwampSurfaceBuilder extends DefaultSurfaceBuilder {
	public SwampSurfaceBuilder(SurfaceConfig surfaceConfig) {
		super(surfaceConfig);
	}
	@Override
	public Block[] applyToColumn(BiomeSource source, ChunkRand rand, Block[] column, Biome biome, int x, int z, int maxY, int minY, double noise, int seaLevel, Block defaultBlock, Block defaultFluid) {
		double d0 = StaticNoiseSource.BIOME_INFO_NOISE.sample((double) x * 0.25D, (double) z * 0.25D, false);
		if (d0 > 0.0D) {
			for(int y = maxY; y >= minY; --y) {
				if (!Block.IS_AIR.test(source.getVersion(),column[y])) {
					if (y == 62 && column[y]!=defaultFluid) {
						column[y]=defaultFluid;
					}
					break;
				}
			}
		}
		return super.applyToColumn(source, rand, column, biome, x, z, maxY, minY, noise, seaLevel, defaultBlock, defaultFluid);
	}
}

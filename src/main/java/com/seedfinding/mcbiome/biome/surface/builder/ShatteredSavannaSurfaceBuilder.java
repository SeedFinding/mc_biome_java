package com.seedfinding.mcbiome.biome.surface.builder;

import com.seedfinding.mcbiome.biome.Biome;
import com.seedfinding.mcbiome.biome.surface.SurfaceConfig;
import com.seedfinding.mcbiome.source.BiomeSource;
import com.seedfinding.mccore.block.Block;
import com.seedfinding.mccore.rand.ChunkRand;

public class ShatteredSavannaSurfaceBuilder extends DefaultSurfaceBuilder {
	public ShatteredSavannaSurfaceBuilder(SurfaceConfig surfaceConfig) {
		super(surfaceConfig);
	}

	@Override
	public Block[] applyToColumn(BiomeSource source, ChunkRand rand, Block[] column, Biome biome, int x, int z, int maxY, int minY, double noise, int seaLevel, Block defaultBlock, Block defaultFluid) {
		if(noise > 1.75D) {
			setSurfaceConfig(SurfaceConfig.CONFIG_STONE);
		} else if(noise > -0.5D) {
			setSurfaceConfig(SurfaceConfig.CONFIG_COARSE_DIRT);
		} else {
			setSurfaceConfig(SurfaceConfig.CONFIG_GRASS);
		}

		return super.applyToColumn(source, rand, column, biome, x, z, maxY, minY, noise, seaLevel, defaultBlock, defaultFluid);
	}
}

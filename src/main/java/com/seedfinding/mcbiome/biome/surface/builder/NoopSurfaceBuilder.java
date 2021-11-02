package com.seedfinding.mcbiome.biome.surface.builder;

import com.seedfinding.mcbiome.biome.Biome;
import com.seedfinding.mcbiome.biome.surface.SurfaceConfig;
import com.seedfinding.mcbiome.source.BiomeSource;
import kaptainwutax.mcutils.block.Block;
import kaptainwutax.mcutils.rand.ChunkRand;

public class NoopSurfaceBuilder extends SurfaceBuilder {
	public NoopSurfaceBuilder(SurfaceConfig surfaceConfig) {
		super(surfaceConfig);
	}
	@Override
	public Block[] applyToColumn(BiomeSource source, ChunkRand rand, Block[] column, Biome biome, int x, int z, int maxY, int minY, double noise, int seaLevel, Block defaultBlock, Block defaultFluid) {
		return null;
	}
}

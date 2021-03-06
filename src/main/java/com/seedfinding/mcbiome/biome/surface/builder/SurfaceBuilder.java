package com.seedfinding.mcbiome.biome.surface.builder;

import com.seedfinding.mcbiome.biome.Biome;
import com.seedfinding.mcbiome.biome.surface.SurfaceConfig;
import com.seedfinding.mcbiome.source.BiomeSource;
import com.seedfinding.mccore.block.Block;
import com.seedfinding.mccore.rand.ChunkRand;

public abstract class SurfaceBuilder {
	private SurfaceConfig surfaceConfig;

	public SurfaceBuilder(SurfaceConfig surfaceConfig) {
		this.surfaceConfig = surfaceConfig;
	}

	public SurfaceConfig getSurfaceConfig() {
		return surfaceConfig;
	}

	public void setSurfaceConfig(SurfaceConfig surfaceConfig) {
		this.surfaceConfig = surfaceConfig;
	}

	public SurfaceBuilder getNoiseSurfaceBuilder(BiomeSource source, double noise) {
		return this;
	}

	public abstract Block[] applyToColumn(BiomeSource source, ChunkRand rand, Block[] column, Biome biome, int x, int z, int maxY, int minY, double noise, int seaLevel, Block defaultBlock, Block defaultFluid);

	public Block[] applyToColumn(BiomeSource source, ChunkRand rand, Block[] column, Biome biome, int x, int z, int maxY, double noise, int seaLevel, Block defaultBlock, Block defaultFluid){
		return this.applyToColumn(source,rand,column,biome,x,z,maxY,0,noise,seaLevel,defaultBlock,defaultFluid);
	}

}

package com.seedfinding.mcbiome.source;

import com.seedfinding.mcbiome.biome.Biome;
import com.seedfinding.mcbiome.biome.BiomePoint;
import com.seedfinding.mcbiome.biome.Biomes;
import com.seedfinding.mcbiome.layer.IntBiomeLayer;
import com.seedfinding.mcbiome.layer.composite.VoronoiLayer;
import com.seedfinding.mcbiome.layer.noise.MultiNoiseLayer17;
import kaptainwutax.mcutils.state.Dimension;
import kaptainwutax.mcutils.util.pos.BPos;
import kaptainwutax.mcutils.version.MCVersion;

public abstract class MultiNoiseBiomeSource extends LayeredBiomeSource<IntBiomeLayer> {
	protected final BiomePoint[] biomePoints;
	public MultiNoiseLayer17 full;
	public VoronoiLayer voronoi;
	protected boolean threeDimensional;

	public MultiNoiseBiomeSource(MCVersion version, long worldSeed, BiomePoint... biomePoints) {
		super(version, worldSeed);
		this.biomePoints = biomePoints;
		this.build();
	}

	@Override
	public abstract Dimension getDimension();

	// I have no idea what this function is supposed to represent...
	public MultiNoiseBiomeSource addDimension() {
		this.threeDimensional = true;
		this.full = null;
		this.layers.clear();
		this.build();
		return this;
	}

	protected abstract void build();

	public boolean is3D() {
		return threeDimensional;
	}

	public BiomePoint[] getBiomePoints() {
		return biomePoints;
	}

	@Override
	public Biome getBiome(BPos bpos) {
		return Biomes.REGISTRY.get(this.voronoi.get(bpos.getX(), bpos.getY(), bpos.getZ()));
	}

	@Override
	public Biome getBiome(int x, int y, int z) {
		return Biomes.REGISTRY.get(this.voronoi.get(x, y, z));
	}

	@Override
	public Biome getBiomeForNoiseGen(int x, int y, int z) {
		return Biomes.REGISTRY.get(this.full.get(x, y, z));
	}

}

package com.seedfinding.mcbiome.source;

import com.seedfinding.mcbiome.biome.Biome;
import com.seedfinding.mcbiome.biome.Biomes;
import com.seedfinding.mcbiome.layer.BiomeLayer;
import com.seedfinding.mcbiome.layer.composite.VoronoiLayer;
import com.seedfinding.mcbiome.layer.end.EndBiomeLayer;
import com.seedfinding.mcbiome.layer.end.EndHeightLayer;
import com.seedfinding.mcbiome.layer.end.EndSimplexLayer;
import com.seedfinding.mccore.state.Dimension;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.version.MCVersion;

public class EndBiomeSource extends LayeredBiomeSource<BiomeLayer> {

	public EndSimplexLayer simplex;
	public EndHeightLayer height;
	public EndBiomeLayer full;
	public VoronoiLayer voronoi;

	public EndBiomeSource(MCVersion version, long worldSeed) {
		super(version, worldSeed);
		this.build();
	}

	@Override
	public Dimension getDimension() {
		return Dimension.END;
	}

	protected void build() {
		this.layers.add(this.simplex = new EndSimplexLayer(this.getVersion(), this.getWorldSeed()));
		this.layers.add(this.height = new EndHeightLayer(this.getVersion(), this.simplex));
		this.layers.add(this.full = new EndBiomeLayer(this.getVersion(), this.height));
		this.layers.add(this.voronoi = new VoronoiLayer(this.getVersion(), this.getWorldSeed(), false, this.full) {
			@Override
			public int sample(int x, int y, int z) {
				return this.getVersion().isOlderThan(MCVersion.v1_13) ? Biomes.THE_END.getId() : super.sample(x, y, z);
			}
		});
		this.layers.setScales();
	}

	@Override
	public Biome getBiome(BPos bpos) {
		return Biomes.REGISTRY.get(this.voronoi.get(bpos.getX(), 0, bpos.getZ()));
	}

	@Override
	public Biome getBiome(int x, int y, int z) {
		return Biomes.REGISTRY.get(this.voronoi.get(x, 0, z));
	}

	// warning end biomes displayed on f3 are actually the sampled 2d map with voronoi on all the different y
	public Biome getBiome3D(int x, int y, int z) {
		return Biomes.REGISTRY.get(this.voronoi.get(x, y, z));
	}

	@Override
	public Biome getBiomeForNoiseGen(int x, int y, int z) {
		return Biomes.REGISTRY.get(this.full.get(x, 0, z));
	}

}

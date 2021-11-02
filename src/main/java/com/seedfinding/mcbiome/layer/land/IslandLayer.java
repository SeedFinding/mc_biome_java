package com.seedfinding.mcbiome.layer.land;

import com.seedfinding.mcbiome.biome.Biome;
import com.seedfinding.mcbiome.biome.Biomes;
import com.seedfinding.mcbiome.layer.composite.CrossLayer;
import com.seedfinding.mcbiome.layer.IntBiomeLayer;
import com.seedfinding.mccore.version.MCVersion;

public class IslandLayer extends CrossLayer {

	public IslandLayer(MCVersion version, long worldSeed, long salt, IntBiomeLayer parent) {
		super(version, worldSeed, salt, parent);
	}

	@Override
	public int sample(int n, int e, int s, int w, int center) {
		return Biome.applyAll(v -> Biome.isShallowOcean(v, this.getVersion()), center, n, e, s, w)
			&& this.nextInt(2) == 0 ? Biomes.PLAINS.getId() : center;
	}

}

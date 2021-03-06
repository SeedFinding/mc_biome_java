package com.seedfinding.mcbiome.layer.noise;

import com.seedfinding.mcbiome.biome.Biome;
import com.seedfinding.mcbiome.layer.IntBiomeLayer;
import com.seedfinding.mccore.version.MCVersion;

public class NoiseLayer extends IntBiomeLayer {

	public NoiseLayer(MCVersion version, long worldSeed, long salt, IntBiomeLayer parent) {
		super(version, worldSeed, salt, parent);
	}

	@Override
	public int sample(int x, int y, int z) {
		this.setSeed(x, z);
		int i = this.getParent(IntBiomeLayer.class).get(x, y, z);
		return Biome.isShallowOcean(i, this.getVersion()) ? i : this.nextInt(this.getVersion().isOlderOrEqualTo(MCVersion.v1_6_4) ? 2 : 299999) + 2;
	}

}

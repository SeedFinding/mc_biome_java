package com.seedfinding.mcbiome.layer.composite;

import com.seedfinding.mcbiome.layer.IntBiomeLayer;
import com.seedfinding.mccore.version.MCVersion;

public abstract class CrossLayer extends IntBiomeLayer {

	public CrossLayer(MCVersion version, long worldSeed, long salt, IntBiomeLayer parent) {
		super(version, worldSeed, salt, parent);
	}

	@Override
	public int sample(int x, int y, int z) {
		this.setSeed(x, z);

		return this.sample(
			this.getParent(IntBiomeLayer.class).get(x, y, z - 1),
			this.getParent(IntBiomeLayer.class).get(x + 1, y, z),
			this.getParent(IntBiomeLayer.class).get(x, y, z + 1),
			this.getParent(IntBiomeLayer.class).get(x - 1, y, z),
			this.getParent(IntBiomeLayer.class).get(x, y, z)
		);
	}

	public abstract int sample(int n, int e, int s, int w, int center);

}

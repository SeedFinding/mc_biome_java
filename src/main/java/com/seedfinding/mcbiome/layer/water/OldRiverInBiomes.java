package com.seedfinding.mcbiome.layer.water;

import com.seedfinding.mcbiome.biome.Biomes;
import com.seedfinding.mcbiome.layer.IntBiomeLayer;
import com.seedfinding.mccore.version.MCVersion;

public class OldRiverInBiomes extends IntBiomeLayer {
	// before the introduction of noise based rivers, river were based on the rare biomes
	public OldRiverInBiomes(MCVersion version, long worldSeed, long salt, IntBiomeLayer parent) {
		super(version, worldSeed, salt, parent);
	}

	@Override
	public int sample(int x, int y, int z) {
		this.setSeed(x, z);
		int center = this.getParent(IntBiomeLayer.class).get(x, y, z);
		if((center != Biomes.SWAMP.getId() || this.nextInt(6) != 0)
			&& (center != Biomes.JUNGLE.getId() && center != Biomes.JUNGLE_HILLS.getId() || this.nextInt(8) != 0)) {
			return center;
		}
		return Biomes.RIVER.getId();
	}
}

package com.seedfinding.mcbiome.layer.land;

import com.seedfinding.mcbiome.biome.Biomes;
import com.seedfinding.mcbiome.layer.IntBiomeLayer;
import com.seedfinding.mccore.version.MCVersion;

public class BambooJungleLayer extends IntBiomeLayer {

	public BambooJungleLayer(MCVersion version, long worldSeed, long salt, IntBiomeLayer parent) {
		super(version, worldSeed, salt, parent);
	}

	@Override
	public int sample(int x, int y, int z) {
		this.setSeed(x, z);
		int value = this.getParent(IntBiomeLayer.class).get(x, y, z);
		return value == Biomes.JUNGLE.getId() && this.nextInt(10) == 0 ? Biomes.BAMBOO_JUNGLE.getId() : value;
	}

}

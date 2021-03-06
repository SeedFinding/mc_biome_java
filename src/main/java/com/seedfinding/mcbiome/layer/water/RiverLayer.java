package com.seedfinding.mcbiome.layer.water;

import com.seedfinding.mcbiome.biome.Biome;
import com.seedfinding.mcbiome.biome.Biomes;
import com.seedfinding.mcbiome.layer.IntBiomeLayer;
import com.seedfinding.mccore.version.MCVersion;

public class RiverLayer extends IntBiomeLayer {

	public RiverLayer(MCVersion version, long worldSeed, long salt, IntBiomeLayer... parents) {
		super(version, worldSeed, salt, parents);
	}

	@Override
	public int sample(int x, int y, int z) {
		int landStackCenter = this.getParent(0, IntBiomeLayer.class).get(x, y, z);
		int riverStackCenter = this.getParent(1, IntBiomeLayer.class).get(x, y, z);

		if(this.getVersion().isOlderOrEqualTo(MCVersion.v1_6_4)) {
			// Warning this is the only case like so because isOcean have Frozen ocean which is bypassed everywhere except here
			// thus we make this weird case, sorry about the confusion.
			if(landStackCenter == Biomes.OCEAN.getId()) return landStackCenter;
		} else if(Biome.isOcean(landStackCenter)) return landStackCenter;

		if(riverStackCenter == Biomes.RIVER.getId()) {
			if(this.getVersion().isOlderOrEqualTo(MCVersion.vb1_8_1)) {
				// FROZEN RIVER didn't exists back then nor SNOWY_TAIGA but let's not play with fire (98%)
				return riverStackCenter;
			}
			if(landStackCenter == Biomes.SNOWY_TUNDRA.getId()) {
				return Biomes.FROZEN_RIVER.getId();
			} else {
				return landStackCenter != Biomes.MUSHROOM_FIELDS.getId() && landStackCenter != Biomes.MUSHROOM_FIELD_SHORE.getId() ? riverStackCenter & 255 : Biomes.MUSHROOM_FIELD_SHORE.getId();
			}
		}

		return landStackCenter;
	}

}

package com.seedfinding.mcbiome.layer.shore;

import com.seedfinding.mcbiome.biome.Biome;
import com.seedfinding.mcbiome.biome.Biomes;
import com.seedfinding.mcbiome.layer.composite.CrossLayer;
import com.seedfinding.mcbiome.layer.IntBiomeLayer;
import com.seedfinding.mccore.version.MCVersion;

public class EaseEdgeLayer extends CrossLayer {

	public EaseEdgeLayer(MCVersion version, long worldSeed, long salt, IntBiomeLayer parent) {
		super(version, worldSeed, salt, parent);
	}

	@Override
	public int sample(int n, int e, int s, int w, int center) {
		int[] is = new int[1];
		if(!this.replaceEdgeIfNeeded(is, n, e, s, w, center, Biomes.MOUNTAINS, Biomes.MOUNTAIN_EDGE) &&
			this.replaceEdge(is, n, e, s, w, center, Biomes.WOODED_BADLANDS_PLATEAU, Biomes.BADLANDS) &&
			this.replaceEdge(is, n, e, s, w, center, Biomes.BADLANDS_PLATEAU, Biomes.BADLANDS) &&
			this.replaceEdge(is, n, e, s, w, center, Biomes.GIANT_TREE_TAIGA, Biomes.TAIGA)) {

			if(center == Biomes.DESERT.getId() && anyMatch(Biomes.SNOWY_TUNDRA, n, e, w, s)) {
				return Biomes.WOODED_MOUNTAINS.getId();
			} else {
				if(center == Biomes.SWAMP.getId()) {
					if(anyMatch(Biomes.DESERT, n, e, w, s) || anyMatch(Biomes.SNOWY_TUNDRA, n, e, w, s) || anyMatch(Biomes.SNOWY_TAIGA, n, e, w, s)) {
						return Biomes.PLAINS.getId();
					}

					if(anyMatch(Biomes.JUNGLE, n, e, w, s) || anyMatch(Biomes.BAMBOO_JUNGLE, n, e, w, s)) {
						return Biomes.JUNGLE_EDGE.getId();
					}
				}

				return center;
			}
		}

		return is[0];
	}

	public static boolean anyMatch(Biome biome, int... values) {
		for(int value : values) {
			if(value == biome.getId()) return true;
		}
		return false;
	}

	private boolean replaceEdgeIfNeeded(int[] is, int n, int e, int s, int w, int center, Biome biome1, Biome biome2) {
		if(this.getVersion().isNewerOrEqualTo(MCVersion.v1_16_2)) {
			if(!Biome.areSimilar(center, Biomes.MOUNTAINS, this.getVersion())) {
				return false;
			}

			is[0] = center;
			return true;
		}

		if(!Biome.areSimilar(center, biome1, this.getVersion())) return false;

		if(this.canBeNeighbors(n, biome1) && this.canBeNeighbors(e, biome1) && this.canBeNeighbors(w, biome1) && this.canBeNeighbors(s, biome1)) {
			is[0] = center;
		} else {
			is[0] = biome2.getId();
		}

		return true;
	}

	private boolean replaceEdge(int[] is, int i, int j, int k, int l, int m, Biome n, Biome o) {
		if(m != n.getId()) return true;

		if(Biome.areSimilar(i, n, this.getVersion()) && Biome.areSimilar(j, n, this.getVersion())
			&& Biome.areSimilar(l, n, this.getVersion()) && Biome.areSimilar(k, n, this.getVersion())) {
			is[0] = m;
		} else {
			is[0] = o.getId();
		}

		return false;
	}

	private boolean canBeNeighbors(int id, Biome b2) {
		if(Biome.areSimilar(id, b2, this.getVersion())) return true;

		Biome biome = Biomes.REGISTRY.get(id);

		if(biome != null && b2 != null) {
			Biome.Temperature t = biome.getTemperatureGroup();
			Biome.Temperature t2 = b2.getTemperatureGroup();
			return t == t2 || t == Biome.Temperature.MEDIUM || t2 == Biome.Temperature.MEDIUM;
		}

		return false;
	}

}


package com.seedfinding.mcbiome.biome.surface.builder;

import com.seedfinding.mcbiome.biome.surface.SurfaceConfig;
import com.seedfinding.mcbiome.source.BiomeSource;
import com.seedfinding.mccore.block.Block;
import com.seedfinding.mccore.block.Blocks;
import com.seedfinding.mccore.util.data.Triplet;
import com.seedfinding.mcnoise.perlin.OctavePerlinNoiseSampler;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BasaltDeltasSurfaceBuilder extends ValleySurfaceBuilder {
	public static final List<Block> FLOOR_BLOCK_STATES = Arrays.asList(Blocks.BASALT, Blocks.BLACKSTONE);
	public static final List<Block> CEILING_BLOCK_STATES = Collections.singletonList(Blocks.BASALT);

	public BasaltDeltasSurfaceBuilder(SurfaceConfig surfaceConfig) {
		super(surfaceConfig);
	}

	@Override
	public Triplet<List<OctavePerlinNoiseSampler>,List<OctavePerlinNoiseSampler>, OctavePerlinNoiseSampler> getNoises(BiomeSource source) {
		return source.getStaticNoiseSource().getBasaltDeltasNoise();
	}

	@Override
	protected List<Block> getFloorBlockStates() {
		return FLOOR_BLOCK_STATES;
	}

	@Override
	protected List<Block> getCeilingBlockStates() {
		return CEILING_BLOCK_STATES;
	}

	@Override
	protected Block getPatchBlock() {
		return Blocks.GRAVEL;
	}
}

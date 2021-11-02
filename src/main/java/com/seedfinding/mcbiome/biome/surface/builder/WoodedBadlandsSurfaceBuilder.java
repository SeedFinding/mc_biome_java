package com.seedfinding.mcbiome.biome.surface.builder;

import com.seedfinding.mcbiome.biome.surface.SurfaceConfig;

public class WoodedBadlandsSurfaceBuilder extends BadlandsSurfaceBuilder {
	public WoodedBadlandsSurfaceBuilder(SurfaceConfig surfaceConfig) {
		super(surfaceConfig);
	}

	@Override
	protected boolean highContion(int y, int elevation) {
		return y > 86 + elevation * 2;
	}
}

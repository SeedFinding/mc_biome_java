package com.seedfinding.mcbiome.biome.surface;

import com.seedfinding.mcbiome.biome.surface.builder.BadlandsSurfaceBuilder;
import com.seedfinding.mcbiome.biome.surface.builder.BasaltDeltasSurfaceBuilder;
import com.seedfinding.mcbiome.biome.surface.builder.DefaultSurfaceBuilder;
import com.seedfinding.mcbiome.biome.surface.builder.ErodedBadlandsSurfaceBuilder;
import com.seedfinding.mcbiome.biome.surface.builder.FrozenOceanSurfaceBuilder;
import com.seedfinding.mcbiome.biome.surface.builder.GiantTreeTaigaSurfaceBuilder;
import com.seedfinding.mcbiome.biome.surface.builder.GravellyMountainSurfaceBuilder;
import com.seedfinding.mcbiome.biome.surface.builder.MountainSurfaceBuilder;
import com.seedfinding.mcbiome.biome.surface.builder.NetherForestsSurfaceBuilder;
import com.seedfinding.mcbiome.biome.surface.builder.NetherSurfaceBuilder;
import com.seedfinding.mcbiome.biome.surface.builder.NoopSurfaceBuilder;
import com.seedfinding.mcbiome.biome.surface.builder.ShatteredSavannaSurfaceBuilder;
import com.seedfinding.mcbiome.biome.surface.builder.SoulSandValleySurfaceBuilder;
import com.seedfinding.mcbiome.biome.surface.builder.SurfaceBuilder;
import com.seedfinding.mcbiome.biome.surface.builder.SwampSurfaceBuilder;
import com.seedfinding.mcbiome.biome.surface.builder.WoodedBadlandsSurfaceBuilder;

import java.util.HashMap;
import java.util.function.Function;

public class SurfaceBuilders {
	public static final HashMap<String, Function<SurfaceConfig, SurfaceBuilder>> SURFACE_BUILDERS = new HashMap<>();
	public static final Function<SurfaceConfig, SurfaceBuilder> DEFAULT = register("default", DefaultSurfaceBuilder::new);
	public static final Function<SurfaceConfig, SurfaceBuilder> MOUNTAIN = register("mountain", MountainSurfaceBuilder::new);
	public static final Function<SurfaceConfig, SurfaceBuilder> SHATTERED_SAVANNA = register("shattered_savanna", ShatteredSavannaSurfaceBuilder::new);
	public static final Function<SurfaceConfig, SurfaceBuilder> GRAVELLY_MOUNTAIN = register("gravelly_mountain", GravellyMountainSurfaceBuilder::new);
	public static final Function<SurfaceConfig, SurfaceBuilder> GIANT_TREE_TAIGA = register("giant_tree_taiga", GiantTreeTaigaSurfaceBuilder::new);
	public static final Function<SurfaceConfig, SurfaceBuilder> SWAMP = register("swamp", SwampSurfaceBuilder::new);
	public static final Function<SurfaceConfig, SurfaceBuilder> BADLANDS = register("badlands", BadlandsSurfaceBuilder::new);
	public static final Function<SurfaceConfig, SurfaceBuilder> WOODED_BADLANDS = register("wooded_badlands", WoodedBadlandsSurfaceBuilder::new);
	public static final Function<SurfaceConfig, SurfaceBuilder> ERODED_BADLANDS = register("eroded_badlands", ErodedBadlandsSurfaceBuilder::new);
	public static final Function<SurfaceConfig, SurfaceBuilder> FROZEN_OCEAN = register("frozen_ocean", FrozenOceanSurfaceBuilder::new);
	public static final Function<SurfaceConfig, SurfaceBuilder> NETHER = register("nether", NetherSurfaceBuilder::new);
	public static final Function<SurfaceConfig, SurfaceBuilder> NETHER_FOREST = register("nether_forest", NetherForestsSurfaceBuilder::new);
	public static final Function<SurfaceConfig, SurfaceBuilder> SOUL_SAND_VALLEY = register("soul_sand_valley", SoulSandValleySurfaceBuilder::new);
	public static final Function<SurfaceConfig, SurfaceBuilder> BASALT_DELTAS = register("basalt_deltas", BasaltDeltasSurfaceBuilder::new);
	public static final Function<SurfaceConfig, SurfaceBuilder> NOPE = register("nope", NoopSurfaceBuilder::new);

	public static Function<SurfaceConfig, SurfaceBuilder> register(String name, Function<SurfaceConfig, SurfaceBuilder> surfaceBuilder) {
		SURFACE_BUILDERS.put(name, surfaceBuilder);
		return surfaceBuilder;
	}


}

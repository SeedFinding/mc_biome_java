package com.seedfinding.mcbiome;

import com.seedfinding.mcbiome.layer.BiomeLayer;
import com.seedfinding.mcbiome.source.OverworldBiomeSource;
import com.seedfinding.mccore.version.MCVersion;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestScales {

	private static final String scales_1_14 = "50 1 com.seedfinding.mcbiome.layer.composite.VoronoiLayer\n" +
		"49 4 com.seedfinding.mcbiome.layer.water.OceanTemperatureLayer$Apply\n" +
		"41 4 com.seedfinding.mcbiome.layer.water.RiverLayer\n" +
		"34 4 com.seedfinding.mcbiome.layer.scale.SmoothScaleLayer\n" +
		"33 4 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"32 8 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"31 16 com.seedfinding.mcbiome.layer.shore.EdgeBiomesLayer\n" +
		"30 16 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"29 32 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"28 32 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"27 64 com.seedfinding.mcbiome.layer.land.SunflowerPlainsLayer\n" +
		"26 64 com.seedfinding.mcbiome.layer.land.HillsLayer\n" +
		"22 64 com.seedfinding.mcbiome.layer.shore.EaseEdgeLayer\n" +
		"21 64 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"20 128 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"19 256 com.seedfinding.mcbiome.layer.land.BambooJungleLayer\n" +
		"18 256 com.seedfinding.mcbiome.layer.land.BaseBiomesLayer\n" +
		"17 256 com.seedfinding.mcbiome.layer.water.DeepOceanLayer\n" +
		"16 256 com.seedfinding.mcbiome.layer.land.MushroomLayer\n" +
		"15 256 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"14 256 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"13 512 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"12 1024 com.seedfinding.mcbiome.layer.temperature.ClimateLayer$Special\n" +
		"11 1024 com.seedfinding.mcbiome.layer.temperature.ClimateLayer$Cool\n" +
		"10 1024 com.seedfinding.mcbiome.layer.temperature.ClimateLayer$Temperate\n" +
		"9 1024 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"8 1024 com.seedfinding.mcbiome.layer.temperature.ClimateLayer$Cold\n" +
		"7 1024 com.seedfinding.mcbiome.layer.land.IslandLayer\n" +
		"6 1024 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"5 1024 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"4 1024 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"3 1024 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"2 2048 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"1 2048 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"0 4096 com.seedfinding.mcbiome.layer.land.ContinentLayer\n" +
		"25 64 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"24 128 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"23 256 com.seedfinding.mcbiome.layer.noise.NoiseLayer\n" +
		"17 256 com.seedfinding.mcbiome.layer.water.DeepOceanLayer\n" +
		"16 256 com.seedfinding.mcbiome.layer.land.MushroomLayer\n" +
		"15 256 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"14 256 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"13 512 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"12 1024 com.seedfinding.mcbiome.layer.temperature.ClimateLayer$Special\n" +
		"11 1024 com.seedfinding.mcbiome.layer.temperature.ClimateLayer$Cool\n" +
		"10 1024 com.seedfinding.mcbiome.layer.temperature.ClimateLayer$Temperate\n" +
		"9 1024 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"8 1024 com.seedfinding.mcbiome.layer.temperature.ClimateLayer$Cold\n" +
		"7 1024 com.seedfinding.mcbiome.layer.land.IslandLayer\n" +
		"6 1024 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"5 1024 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"4 1024 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"3 1024 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"2 2048 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"1 2048 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"0 4096 com.seedfinding.mcbiome.layer.land.ContinentLayer\n" +
		"40 4 com.seedfinding.mcbiome.layer.scale.SmoothScaleLayer\n" +
		"39 4 com.seedfinding.mcbiome.layer.water.NoiseToRiverLayer\n" +
		"38 4 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"37 8 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"36 16 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"35 32 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"25 64 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"24 128 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"23 256 com.seedfinding.mcbiome.layer.noise.NoiseLayer\n" +
		"17 256 com.seedfinding.mcbiome.layer.water.DeepOceanLayer\n" +
		"16 256 com.seedfinding.mcbiome.layer.land.MushroomLayer\n" +
		"15 256 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"14 256 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"13 512 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"12 1024 com.seedfinding.mcbiome.layer.temperature.ClimateLayer$Special\n" +
		"11 1024 com.seedfinding.mcbiome.layer.temperature.ClimateLayer$Cool\n" +
		"10 1024 com.seedfinding.mcbiome.layer.temperature.ClimateLayer$Temperate\n" +
		"9 1024 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"8 1024 com.seedfinding.mcbiome.layer.temperature.ClimateLayer$Cold\n" +
		"7 1024 com.seedfinding.mcbiome.layer.land.IslandLayer\n" +
		"6 1024 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"5 1024 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"4 1024 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"3 1024 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"2 2048 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"1 2048 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"0 4096 com.seedfinding.mcbiome.layer.land.ContinentLayer\n" +
		"48 4 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"47 8 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"46 16 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"45 32 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"44 64 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"43 128 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"42 256 com.seedfinding.mcbiome.layer.water.OceanTemperatureLayer\n";
	private static final String scales_1_13 = "49 1 com.seedfinding.mcbiome.layer.composite.VoronoiLayer\n" +
		"48 4 com.seedfinding.mcbiome.layer.water.OceanTemperatureLayer$Apply\n" +
		"40 4 com.seedfinding.mcbiome.layer.water.RiverLayer\n" +
		"33 4 com.seedfinding.mcbiome.layer.scale.SmoothScaleLayer\n" +
		"32 4 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"31 8 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"30 16 com.seedfinding.mcbiome.layer.shore.EdgeBiomesLayer\n" +
		"29 16 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"28 32 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"27 32 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"26 64 com.seedfinding.mcbiome.layer.land.SunflowerPlainsLayer\n" +
		"25 64 com.seedfinding.mcbiome.layer.land.HillsLayer\n" +
		"21 64 com.seedfinding.mcbiome.layer.shore.EaseEdgeLayer\n" +
		"20 64 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"19 128 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"18 256 com.seedfinding.mcbiome.layer.land.BaseBiomesLayer\n" +
		"17 256 com.seedfinding.mcbiome.layer.water.DeepOceanLayer\n" +
		"16 256 com.seedfinding.mcbiome.layer.land.MushroomLayer\n" +
		"15 256 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"14 256 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"13 512 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"12 1024 com.seedfinding.mcbiome.layer.temperature.ClimateLayer$Special\n" +
		"11 1024 com.seedfinding.mcbiome.layer.temperature.ClimateLayer$Cool\n" +
		"10 1024 com.seedfinding.mcbiome.layer.temperature.ClimateLayer$Temperate\n" +
		"9 1024 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"8 1024 com.seedfinding.mcbiome.layer.temperature.ClimateLayer$Cold\n" +
		"7 1024 com.seedfinding.mcbiome.layer.land.IslandLayer\n" +
		"6 1024 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"5 1024 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"4 1024 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"3 1024 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"2 2048 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"1 2048 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"0 4096 com.seedfinding.mcbiome.layer.land.ContinentLayer\n" +
		"24 64 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"23 128 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"22 256 com.seedfinding.mcbiome.layer.noise.NoiseLayer\n" +
		"17 256 com.seedfinding.mcbiome.layer.water.DeepOceanLayer\n" +
		"16 256 com.seedfinding.mcbiome.layer.land.MushroomLayer\n" +
		"15 256 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"14 256 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"13 512 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"12 1024 com.seedfinding.mcbiome.layer.temperature.ClimateLayer$Special\n" +
		"11 1024 com.seedfinding.mcbiome.layer.temperature.ClimateLayer$Cool\n" +
		"10 1024 com.seedfinding.mcbiome.layer.temperature.ClimateLayer$Temperate\n" +
		"9 1024 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"8 1024 com.seedfinding.mcbiome.layer.temperature.ClimateLayer$Cold\n" +
		"7 1024 com.seedfinding.mcbiome.layer.land.IslandLayer\n" +
		"6 1024 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"5 1024 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"4 1024 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"3 1024 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"2 2048 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"1 2048 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"0 4096 com.seedfinding.mcbiome.layer.land.ContinentLayer\n" +
		"39 4 com.seedfinding.mcbiome.layer.scale.SmoothScaleLayer\n" +
		"38 4 com.seedfinding.mcbiome.layer.water.NoiseToRiverLayer\n" +
		"37 4 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"36 8 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"35 16 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"34 32 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"24 64 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"23 128 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"22 256 com.seedfinding.mcbiome.layer.noise.NoiseLayer\n" +
		"17 256 com.seedfinding.mcbiome.layer.water.DeepOceanLayer\n" +
		"16 256 com.seedfinding.mcbiome.layer.land.MushroomLayer\n" +
		"15 256 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"14 256 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"13 512 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"12 1024 com.seedfinding.mcbiome.layer.temperature.ClimateLayer$Special\n" +
		"11 1024 com.seedfinding.mcbiome.layer.temperature.ClimateLayer$Cool\n" +
		"10 1024 com.seedfinding.mcbiome.layer.temperature.ClimateLayer$Temperate\n" +
		"9 1024 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"8 1024 com.seedfinding.mcbiome.layer.temperature.ClimateLayer$Cold\n" +
		"7 1024 com.seedfinding.mcbiome.layer.land.IslandLayer\n" +
		"6 1024 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"5 1024 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"4 1024 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"3 1024 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"2 2048 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"1 2048 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"0 4096 com.seedfinding.mcbiome.layer.land.ContinentLayer\n" +
		"47 4 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"46 8 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"45 16 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"44 32 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"43 64 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"42 128 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"41 256 com.seedfinding.mcbiome.layer.water.OceanTemperatureLayer\n";

	private static final String scales_1_12 = "43 1 com.seedfinding.mcbiome.layer.composite.VoronoiLayer\n" +
		"42 4 com.seedfinding.mcbiome.layer.water.RiverLayer\n" +
		"35 4 com.seedfinding.mcbiome.layer.scale.SmoothScaleLayer\n" +
		"34 4 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"33 8 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"32 16 com.seedfinding.mcbiome.layer.shore.EdgeBiomesLayer\n" +
		"31 16 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"30 32 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"29 32 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"28 64 com.seedfinding.mcbiome.layer.land.SunflowerPlainsLayer\n" +
		"27 64 com.seedfinding.mcbiome.layer.land.HillsLayer\n" +
		"21 64 com.seedfinding.mcbiome.layer.shore.EaseEdgeLayer\n" +
		"20 64 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"19 128 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"18 256 com.seedfinding.mcbiome.layer.land.BaseBiomesLayer\n" +
		"17 256 com.seedfinding.mcbiome.layer.water.DeepOceanLayer\n" +
		"16 256 com.seedfinding.mcbiome.layer.land.MushroomLayer\n" +
		"15 256 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"14 256 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"13 512 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"12 1024 com.seedfinding.mcbiome.layer.temperature.ClimateLayer$Special\n" +
		"11 1024 com.seedfinding.mcbiome.layer.temperature.ClimateLayer$Cool\n" +
		"10 1024 com.seedfinding.mcbiome.layer.temperature.ClimateLayer$Temperate\n" +
		"9 1024 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"8 1024 com.seedfinding.mcbiome.layer.temperature.ClimateLayer$Cold\n" +
		"7 1024 com.seedfinding.mcbiome.layer.land.IslandLayer\n" +
		"6 1024 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"5 1024 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"4 1024 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"3 1024 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"2 2048 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"1 2048 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"0 4096 com.seedfinding.mcbiome.layer.land.ContinentLayer\n" +
		"26 64 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"25 128 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"22 256 com.seedfinding.mcbiome.layer.noise.NoiseLayer\n" +
		"17 256 com.seedfinding.mcbiome.layer.water.DeepOceanLayer\n" +
		"16 256 com.seedfinding.mcbiome.layer.land.MushroomLayer\n" +
		"15 256 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"14 256 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"13 512 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"12 1024 com.seedfinding.mcbiome.layer.temperature.ClimateLayer$Special\n" +
		"11 1024 com.seedfinding.mcbiome.layer.temperature.ClimateLayer$Cool\n" +
		"10 1024 com.seedfinding.mcbiome.layer.temperature.ClimateLayer$Temperate\n" +
		"9 1024 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"8 1024 com.seedfinding.mcbiome.layer.temperature.ClimateLayer$Cold\n" +
		"7 1024 com.seedfinding.mcbiome.layer.land.IslandLayer\n" +
		"6 1024 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"5 1024 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"4 1024 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"3 1024 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"2 2048 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"1 2048 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"0 4096 com.seedfinding.mcbiome.layer.land.ContinentLayer\n" +
		"41 4 com.seedfinding.mcbiome.layer.scale.SmoothScaleLayer\n" +
		"40 4 com.seedfinding.mcbiome.layer.water.NoiseToRiverLayer\n" +
		"39 4 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"38 8 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"37 16 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"36 32 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"24 64 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"23 128 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"22 256 com.seedfinding.mcbiome.layer.noise.NoiseLayer\n" +
		"17 256 com.seedfinding.mcbiome.layer.water.DeepOceanLayer\n" +
		"16 256 com.seedfinding.mcbiome.layer.land.MushroomLayer\n" +
		"15 256 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"14 256 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"13 512 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"12 1024 com.seedfinding.mcbiome.layer.temperature.ClimateLayer$Special\n" +
		"11 1024 com.seedfinding.mcbiome.layer.temperature.ClimateLayer$Cool\n" +
		"10 1024 com.seedfinding.mcbiome.layer.temperature.ClimateLayer$Temperate\n" +
		"9 1024 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"8 1024 com.seedfinding.mcbiome.layer.temperature.ClimateLayer$Cold\n" +
		"7 1024 com.seedfinding.mcbiome.layer.land.IslandLayer\n" +
		"6 1024 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"5 1024 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"4 1024 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"3 1024 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"2 2048 com.seedfinding.mcbiome.layer.land.LandLayer\n" +
		"1 2048 com.seedfinding.mcbiome.layer.scale.ScaleLayer\n" +
		"0 4096 com.seedfinding.mcbiome.layer.land.ContinentLayer\n";

	public static String printFunc(BiomeLayer last, String str) {
		if(last == null) {
			return str;
		}
		str += (String.format("%d %d %s\n", last.getLayerId(), last.getScale(), last.getClass().getName()));
		if(last.getParents() != null) {
			for(BiomeLayer biomeLayer : last.getParents()) {
				str = printFunc(biomeLayer, str);
			}
		}
		return str;
	}

	@Test
	@DisplayName("Test 1.12 scale and names")
	public void testScale1_12() {
		OverworldBiomeSource source = new OverworldBiomeSource(MCVersion.v1_12, 12228782782872L);
		assertEquals(scales_1_12, printFunc(source.voronoi, ""));
	}

	@Test
	@DisplayName("Test 1.13 scale and names")
	public void testScale1_13() {
		OverworldBiomeSource source = new OverworldBiomeSource(MCVersion.v1_13, 12228782782872L);
		assertEquals(scales_1_13, printFunc(source.voronoi, ""));
	}

	@Test
	@DisplayName("Test 1.14+ scale and names")
	public void testScale1_14() {
		OverworldBiomeSource source = new OverworldBiomeSource(MCVersion.v1_14, 12228782782872L);
		assertEquals(scales_1_14, printFunc(source.voronoi, ""));
	}
}

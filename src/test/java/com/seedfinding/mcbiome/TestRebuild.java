package com.seedfinding.mcbiome;

import com.seedfinding.mcbiome.source.BiomeSource;
import com.seedfinding.mcbiome.source.OverworldBiomeSource;
import com.seedfinding.mccore.state.Dimension;
import com.seedfinding.mccore.version.MCVersion;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRebuild {
	@Test
	@DisplayName("Test change biome size")
	public void testChangeBiomeSize() {
		OverworldBiomeSource overworldBiomeSource = (OverworldBiomeSource)BiomeSource.of(Dimension.OVERWORLD, MCVersion.v1_12, 1L);
		assert overworldBiomeSource != null;
		long normal = TestFramework.getHash(overworldBiomeSource.voronoi, 0, 0, 1000);
		overworldBiomeSource.setBiomeSize(6);
		long modified = TestFramework.getHash(overworldBiomeSource.voronoi, 0, 0, 1000);
		overworldBiomeSource.setBiomeSize(4);
		long reNormal = TestFramework.getHash(overworldBiomeSource.voronoi, 0, 0, 1000);
		assertEquals(normal, 11466379);
		assertEquals(reNormal, 11466379);
		assertEquals(modified, 11573889);
	}

	@Test
	@DisplayName("Test change river size")
	public void testChangeRiverSize() {
		OverworldBiomeSource overworldBiomeSource = (OverworldBiomeSource)BiomeSource.of(Dimension.OVERWORLD, MCVersion.v1_12, 1L);
		assert overworldBiomeSource != null;
		long normal = TestFramework.getHash(overworldBiomeSource.voronoi, 0, 0, 1000);
		overworldBiomeSource.setRiverSize(6);
		long modified = TestFramework.getHash(overworldBiomeSource.voronoi, 0, 0, 1000);
		overworldBiomeSource.setRiverSize(4);
		long reNormal = TestFramework.getHash(overworldBiomeSource.voronoi, 0, 0, 1000);
		assertEquals(normal, 11466379);
		assertEquals(reNormal, 11466379);
		assertEquals(modified, 11495548);
	}

	@Test
	@DisplayName("Test change default 1_1")
	public void testDefault1_1() {
		OverworldBiomeSource overworldBiomeSource = (OverworldBiomeSource)BiomeSource.of(Dimension.OVERWORLD, MCVersion.v1_12, 4);
		assert overworldBiomeSource != null;
		long normal = TestFramework.getHash(overworldBiomeSource.voronoi, 0, 0, 1000);
		overworldBiomeSource.setUseDefault1_1(true);
		long modified = TestFramework.getHash(overworldBiomeSource.voronoi, 0, 0, 1000);
		overworldBiomeSource.setUseDefault1_1(false);
		long reNormal = TestFramework.getHash(overworldBiomeSource.voronoi, 0, 0, 1000);
		assertEquals(normal, 12952658);
		assertEquals(reNormal, 12952658);
		assertEquals(modified, 8908395);
	}
}

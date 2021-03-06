package com.seedfinding.mcbiome.v1_16_5;

import com.seedfinding.mcbiome.TestFramework;
import com.seedfinding.mcbiome.biome.Biomes;
import com.seedfinding.mcbiome.source.EndBiomeSource;
import com.seedfinding.mccore.version.MCVersion;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


@DisplayName("Minecraft v1.16.5 End")
@Tag("v1.16.5")
@TestFramework.Nether
public class End {
	@Test
	@DisplayName("Test End layers 3D")
	public void testEnd3D() {
		EndBiomeSource source = new EndBiomeSource(MCVersion.v1_16, 1551515151585454L);
		assertEquals(Biomes.SMALL_END_ISLANDS, source.getBiome3D(10000, 251, 10000));
		int sum = 0;
		for(int y = 0; y < 256; y++) {
			sum += source.getBiome3D(10000, y, 10000).getId();
		}
		assertEquals(10689, sum);
	}

	@Test
	@DisplayName("Test End layers 2D")
	public void testEnd2D() {
		EndBiomeSource source = new EndBiomeSource(MCVersion.v1_16, 1551515151585454L);
		int sum = 0;
		for(int x = 0; x < 1000; x++) {
			for(int z = 0; z < 1000; z++) {
				sum += source.getBiome(10000 + x, 0, 10000 + z).getId();
			}
		}
		assertEquals(41033489, sum);
	}
}

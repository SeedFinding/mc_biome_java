package com.seedfinding.mcbiome.source;

import com.seedfinding.mcbiome.layer.BiomeLayer;
import com.seedfinding.mcbiome.layer.LayerStack;
import com.seedfinding.mccore.version.MCVersion;

import java.util.List;

public abstract class LayeredBiomeSource<T extends BiomeLayer> extends BiomeSource {

	protected final LayerStack<T> layers = new LayerStack<>();

	public LayeredBiomeSource(MCVersion version, long worldSeed) {
		super(version, worldSeed);
	}

	public List<T> getLayers() {
		return this.layers;
	}

	public T getLayer(int index) {
		return this.getLayers().get(index);
	}

	public T getLayer(Class<? extends BiomeLayer> layerClass) {
		for(T layer : getLayers()) {
			if(layer.getClass() == layerClass) {
				return layer;
			}
		}
		return null;
	}

	public int getLayerCount() {
		return this.getLayers().size();
	}

}

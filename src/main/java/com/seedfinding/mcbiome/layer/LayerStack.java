package com.seedfinding.mcbiome.layer;

import com.seedfinding.mcbiome.layer.composite.VoronoiLayer;
import com.seedfinding.mcbiome.layer.scale.ScaleLayer;

import java.util.ArrayList;

public class LayerStack<T extends BiomeLayer> extends ArrayList<T> {

	protected int layerIdCounter = 0;

	@Override
	public boolean add(T layer) {
		layer.setLayerId(this.layerIdCounter++);
		return super.add(layer);
	}

	public void setScales() {
		this.setRecursiveScale(this.get(this.size() - 1), 1);
		// by default we have a hintsize of 1
		this.get(this.size() - 1).setHintSize(1);
	}

	public void setRecursiveScale(BiomeLayer last, int scale) {
		if(last == null) return;
		int max = 0;

		for(BiomeLayer biomeLayer : last.getParents()) {
			int shift = 0;
			if(last instanceof ScaleLayer) shift = 1;
			else if(last instanceof VoronoiLayer) shift = 2;

			this.setRecursiveScale(biomeLayer, scale << shift);
			max = Math.max(max, scale);
		}

		last.setScale(max);
	}

}

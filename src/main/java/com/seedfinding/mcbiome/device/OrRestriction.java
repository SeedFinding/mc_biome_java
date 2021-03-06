package com.seedfinding.mcbiome.device;

import com.seedfinding.mcbiome.source.LayeredBiomeSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SuppressWarnings("unused")
public class OrRestriction extends Restriction {

	private final Restriction[] restrictions;

	protected OrRestriction(int x, int z, Restriction... restrictions) {
		super("OR", x, z);
		this.restrictions = restrictions;
	}

	public static Restriction.Factory<OrRestriction> of(Restriction.Factory<?>... restrictions) {
		return (version, x, z) -> new OrRestriction(x, z, Arrays.stream(restrictions).map(f -> f.create(version, x, z)).toArray(Restriction[]::new));
	}

	@Override
	public List<Integer> getBitPoints() {
		Set<Integer> points = new HashSet<>();

		for(Restriction restriction : this.restrictions) {
			points.addAll(restriction.getBitPoints());
		}

		return new ArrayList<>(points);
	}

	@Override
	public boolean testSeed(long seed, long bits) {
		for(Restriction restriction : this.restrictions) {
			if(restriction.testSeed(seed, bits)) return true;
		}

		return false;
	}

	@SuppressWarnings({"unchecked", "rawtypes"})
	@Override
	public boolean testSource(LayeredBiomeSource source) {
		for(Restriction restriction : this.restrictions) {
			if(restriction.testSource(source)) return true;
		}

		return false;
	}

}

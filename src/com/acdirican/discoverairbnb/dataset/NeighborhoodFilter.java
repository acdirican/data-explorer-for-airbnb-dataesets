package com.acdirican.discoverairbnb.dataset;

import java.util.ArrayList;
import java.util.List;

import com.acdirican.discoverairbnb.dataset.entities.Dataset;
import com.acdirican.discoverairbnb.dataset.entities.FilterDecorator;
import com.acdirican.discoverairbnb.dataset.entities.Property;

class NeighborhoodFilter extends FilterDecorator{
	
	private String neighborhood;

	public NeighborhoodFilter(Dataset dataset, String neighborhood) {
		super(dataset.properties());
		this.neighborhood = neighborhood;
		execute();
	}

	@Override
	public void execute() {
		List<Property> filtered =  new ArrayList<>();
		for (Property property : properties) {
			if (property.getNeighbourhood().equals(neighborhood)) {
				filtered.add(property);
			}
		 }
		this.properties = filtered;
	}



}

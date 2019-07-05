package com.bawarchi.comparators;

import java.util.Comparator;

import com.bawarchi.model.Dish;

public class PriceGTComparator implements Comparator<Dish>{
	
	@Override
	public int compare(Dish one, Dish two) {
		return (int)(two.getPrice() - one.getPrice());
	}
}

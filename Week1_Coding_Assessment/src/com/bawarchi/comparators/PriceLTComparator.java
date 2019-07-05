package com.bawarchi.comparators;

import java.util.Comparator;

import com.bawarchi.model.Dish;

public class PriceLTComparator implements Comparator<Dish>{
	
	@Override
	public int compare(Dish one, Dish two) {
		return (int)(one.getPrice() - two.getPrice());
	}
}

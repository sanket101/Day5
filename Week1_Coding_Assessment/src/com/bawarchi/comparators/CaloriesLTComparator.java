package com.bawarchi.comparators;

import java.util.Comparator;

import com.bawarchi.model.Dish;

public class CaloriesLTComparator implements Comparator<Dish>{
	
	@Override
	public int compare(Dish one, Dish two) {
		return (int)(one.getCalories() - two.getCalories());
	}
}

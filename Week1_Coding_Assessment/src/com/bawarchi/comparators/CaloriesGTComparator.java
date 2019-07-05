package com.bawarchi.comparators;

import java.util.Comparator;
import com.bawarchi.model.*;

public class CaloriesGTComparator implements Comparator<Dish>{
	
	@Override
	public int compare(Dish one, Dish two) {
		return (int)(two.getCalories() - one.getCalories());
	}
}

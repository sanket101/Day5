package com.bawarchi.model;

import java.util.Objects;

public class Dish implements Comparable<Dish>{
	
	private final int id;
	private String name;
	private double price;
	private double calories;
	
	public Dish(int id, String name, double price, double calories) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.calories = calories;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getCalories() {
		return calories;
	}

	public void setCalories(double calories) {
		this.calories = calories;
	}

	public int getId() {
		return id;
	}
	
	@Override
	public int compareTo(Dish d) {
		if(this.id > d.getId()) {
			return 1;
		}
		else if(this.id < d.getId()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	@Override
	public String toString() {
		return "Dish Id : " + this.id + " Name : " + this.name + " Price : " + this.price + " Calories : " + this.calories;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.id);
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null) {
			return false;
		}
		
		if(o.getClass() != Dish.class) {
			return false;
		}
		Dish other = (Dish) o;
		
		return Objects.equals(this.id, other.id) && Objects.equals(this.name, other.name) && Objects.equals(this.price, other.price) && Objects.equals(this.calories, other.calories);
	}
}

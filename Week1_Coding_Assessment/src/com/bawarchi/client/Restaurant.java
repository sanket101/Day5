package com.bawarchi.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import com.bawarchi.model.Dish;
import com.bawarchi.comparators.*;

public class Restaurant {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Dish> list = new ArrayList<Dish>();
		
		Dish one = new Dish(5, "Neer-Dosa", 50, 100);
		Dish two = new Dish(2, "Idli-Vada", 40, 200);
		Dish three = new Dish(4, "Roti-Curry", 100, 250);
		Dish four = new Dish(1, "Dosa", 50, 300);
		Dish five = new Dish(3, "Pulav", 80, 330);
		
		list.add(one);
		list.add(two);
		list.add(three);
		list.add(four);
		list.add(five);
		
		System.out.println("=================Welcome=====================");
		System.out.println("Please choose from the below options");
		System.out.println();
		System.out.println("1 => To sort the dishes in the increasing order of calories");
		System.out.println("2 => To sort the dishes in the decreasing order of calories");
		System.out.println("3 => To sort the dishes in the increasing order of price");
		System.out.println("4 => To sort the dishes in the decreasing order of price");
		System.out.println("===============================================");
		
		int user_option = sc.nextInt();
		
		switch(user_option) {
			case 1 :
				Collections.sort(list, new CaloriesLTComparator());
				break;
			case 2 :
				Collections.sort(list, new CaloriesGTComparator());
				break;
			case 3 :
				Collections.sort(list, new PriceLTComparator());
				break;
			case 4 :
				Collections.sort(list, new PriceGTComparator());
				break;
		}
		
		System.out.println("=================Please select the Dish Id and hit enter===============================");
		
		for(Dish d : list) {
			System.out.println(d);
		}
		
		System.out.println("============================================================");
		
		int dish_id = sc.nextInt();
		int index = -1;
				
		for(int itr = 0; itr < list.size(); itr++) {
			if(list.get(itr).getId() == dish_id) {
				index = itr;
				break;
			}
		}
		
		if(index != -1) {
			System.out.println("==========You have selected " + list.get(index).getName() + "=====================");
			System.out.println("Please enter your name : ");
			
			String name = sc.nextLine();
			sc.nextLine();
			
			System.out.println("Please pay the bill of Rs " + list.get(index).getPrice());
			
			double money_paid = sc.nextDouble();
			
			if(money_paid > list.get(index).getPrice()) {
				double change = money_paid-list.get(index).getPrice();
				System.out.println("========Thanks for your order. Please collect the change = Rs " + change  + "================");
			}
			else if(money_paid < list.get(index).getPrice()) {
				System.out.println("========Amount paid is less than Bill Amount ================");
			}
			else {
				System.out.println("========Thanks for your order. ================");
			}
			
		}
		else {
			System.out.println("No such Dish Id exists!!!");
		}
		
		
		sc.close();
	}

}

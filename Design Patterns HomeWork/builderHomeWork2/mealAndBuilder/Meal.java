package mealAndBuilder;

import java.util.ArrayList;


i
public class Meal {
	
	private ArrayList<Item> items;
	
	private Meal (){}
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public float getCost() {
		float totalPrice=0;
		for (int i = 0; i < items.size(); i++){
			totalPrice+=items.get(i).price();
		}
			return totalPrice;
		
	}
	
	public void showItems() {
		for (int i = 0; i < items.size(); i++){
			System.out.println(items.get(i).name()); 
		}
	}

}

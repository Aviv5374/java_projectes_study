package mealAndBuilder;

import java.util.ArrayList;

public class Meal {
	
	private ArrayList<Item> items;
	
	
	public class MealBuilder{
		
		public Meal prepareVegMeal() {
			return new Meal(this);
		}
		
		public Meal prepareNotVegMeal() {
			return new Meal(this);
		}
	}
	
	
	
	public void addItem(Item item) {
		
	}
	
	public float getCost() {
		//?
		return items[0].prise();
	}
	
	public void showItems() {
		
	}

}

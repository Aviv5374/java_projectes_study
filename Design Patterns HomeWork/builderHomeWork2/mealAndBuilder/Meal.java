package mealAndBuilder;

import java.util.ArrayList;

public class Meal {
	
	private ArrayList<Item> items;
	
	private Meal (MealBuilder bilder){
		
	}
	
	public class MealBuilder{
		
		private ArrayList<Item> items;
		//or
		private Item item;
		
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

package mealAndBuilder;

import java.util.ArrayList;

import burgers.Burger;
import burgers.ChickenBurger;
import burgers.VegBurger;

public class Meal {
	
	private ArrayList<Item> items;
	
	private Meal (Builder bilder){
		
	}
	
	public class Builder{
		
		private ArrayList<Item> items;
		//or
		private Item item;
		
		public Meal prepareVegMeal() {
			Burger chickenBurger= new ChickenBurger();
			for (int i = 0; i < items.size(); i++) {
				if(chickenBurger.equals(items.get(i))){
					System.out.println("shecker");
					return null;
				}
			}
			return new Meal(this);
		}
		
		public Meal prepareNotVegMeal() {
			return new Meal(this);
		}
		
		public Builder vegBurger()
		{
			Burger vegBurger;
			items.add(vegBurger = new VegBurger());
			return this;			
		}
		
		public Builder chickenBurger()
		{
			Burger chickenBurger;
			items.add(chickenBurger = new ChickenBurger());
			return this;			
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

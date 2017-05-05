package mealAndBuilder;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import burgers.Burger;
import burgers.ChickenBurger;
import burgers.VegBurger;
import coldDrinks.Coke;
import coldDrinks.ColdDrink;
import coldDrinks.Pepsi;

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
		
		public Builder coke()
		{
			ColdDrink coke;
			items.add(coke = new Coke());
			return this;			
		}
		
		public Builder pepsi()
		{
			ColdDrink pepsi;
			items.add(pepsi = new Pepsi());
			return this;			
		}
	}
	
	
	
	public void addItem(Item item) {
		
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

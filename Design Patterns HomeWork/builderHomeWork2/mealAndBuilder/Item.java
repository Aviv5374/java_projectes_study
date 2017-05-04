package mealAndBuilder;

import burgers.Burger;
import coldDrinks.ColdDrink;
import packs.Packing;

public class Item implements Burger,ColdDrink {
     
	private String name;
	private Packing pack;
	private float price;
	
	public String name() {
		return this.name;
	}
	
	public Packing packing() {
		return this.pack;
	}
	
	public float price() {
		return this.price;
	}
}

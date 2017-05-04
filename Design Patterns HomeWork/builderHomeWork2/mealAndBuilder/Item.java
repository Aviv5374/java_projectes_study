package mealAndBuilder;

import packs.Packing;

public interface Item  {
     
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

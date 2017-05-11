package mealFactory;

import food.ChickenBurger;
import drinks.Pepsi;

public class NonVegMeal extends Meal {

	public NonVegMeal(){
		super();
		super.addItem(new ChickenBurger());
		super.addItem(new Pepsi());
	}
}

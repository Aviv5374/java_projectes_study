package mealFactory;

import drinks.Coke;
import food.VegBurger;

public class VegMeal extends Meal {
	
	public VegMeal(){
		super();
		super.addItem(new VegBurger());
		super.addItem(new Coke());
	}

}

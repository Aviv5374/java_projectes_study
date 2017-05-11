package mealFactory;

import drinks.Coke;
import drinks.Pepsi;
import food.ChickenBurger;
import food.VegBurger;

public class MealFactory {

	public Meal prepareMeal(String mealType) {
		Meal meal = null;
		if (mealType.equals("v") || mealType.equals("V")) {
			return new VegMeal();
		} else if (mealType.equals("c")|| mealType.equals("C")) {
			return new NonVegMeal();
		} else
			return null;
	}

}
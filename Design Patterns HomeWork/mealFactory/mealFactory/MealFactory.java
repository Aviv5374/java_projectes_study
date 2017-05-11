package mealFactory;

import drinks.Coke;
import drinks.Pepsi;
import food.ChickenBurger;
import food.VegBurger;

public class MealFactory {

	public Meal prepareMeal(String mealType) {

		if (mealType == "v" || mealType == "V") {
			Meal meal = new Meal();
			meal.addItem(new VegBurger());
			meal.addItem(new Coke());
			return meal;
		} else if (mealType == "c" || mealType == "C") {
			Meal meal = new Meal();
			meal.addItem(new ChickenBurger());
			meal.addItem(new Pepsi());
			return meal;
		} else
			return null;
	}

}
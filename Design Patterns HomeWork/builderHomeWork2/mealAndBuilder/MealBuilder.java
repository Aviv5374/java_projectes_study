package mealAndBuilder;

import burgers.Burger;
import burgers.ChickenBurger;
import burgers.VegBurger;
import coldDrinks.Coke;
import coldDrinks.ColdDrink;
import coldDrinks.Pepsi;

public class MealBuilder {
 
	public Meal prepareVegMeal (){
	      Meal meal = new Meal();	
	      meal.addItem(new VegBurger());
	      return meal;
	   }   

	   public Meal prepareNonVegMeal (){
	      Meal meal = new Meal();
	      meal.addItem(new ChickenBurger());	     
	      return meal;
	   }
}

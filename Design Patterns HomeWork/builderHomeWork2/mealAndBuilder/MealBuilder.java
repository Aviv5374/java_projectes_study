package mealAndBuilder;

import burgers.ChickenBurger;
import burgers.VegBurger;

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

package mealFactory;

import java.util.Scanner;

public class FactoryPatternDemo {
	   public static void main(String[] args) {
	   
	      MealFactory mealFctory = new MealFactory();
	      
	      Meal meal = null;
	      
	      Scanner userInput = new Scanner(System.in);
			
			System.out.print("What type of ship? (V / C)");
			
			if (userInput.hasNextLine()){
				
				String mealType = userInput.nextLine();
			
				meal = mealFctory.prepareMeal(mealType);
				
				if(meal != null){
					
					meal.showItems();
					
				} else System.out.print("Please enter V vor C next time");
			
			}

	      
	   }
	}
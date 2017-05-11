package drinks;

import interfaces.Packing;

public class Bottle implements Packing {

	   @Override
	   public String pack() {
	      return "Bottle";
	   }
	}
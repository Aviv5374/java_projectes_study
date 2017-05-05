package burgers;

import packs.Packing;

public class ChickenBurger extends Burger {
	private String name = "chickenBurger";
	private float prise = 42;
	
	@Override
	public String name() {
		return name;
	}

	@Override
	public Packing packing() {
		return wrapper;
	}

	@Override
	public float price() {
		return prise;
	}

}

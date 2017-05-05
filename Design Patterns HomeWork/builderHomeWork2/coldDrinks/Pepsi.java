package coldDrinks;

import packs.Packing;

public class Pepsi extends ColdDrink {
	private String name = "pepsi";
	private float prise = 11;
	@Override
	public String name() {
		return name;
	}

	@Override
	public Packing packing() {
		return bottle;
	}

	@Override
	public float price() {
		return prise;
	}
}

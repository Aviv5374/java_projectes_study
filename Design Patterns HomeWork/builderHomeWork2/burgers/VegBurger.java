package burgers;

import packs.Packing;

public class VegBurger extends Burger {
    private String name = "vegBurger";
	private float prise = 29;
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

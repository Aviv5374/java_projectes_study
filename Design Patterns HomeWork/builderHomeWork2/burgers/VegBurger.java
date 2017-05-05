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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(prise);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		VegBurger other = (VegBurger) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(prise) != Float.floatToIntBits(other.prise))
			return false;
		return true;
	}

}

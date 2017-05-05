package burgers;

import mealAndBuilder.Item;
import packs.Wrapper;

public abstract class Burger implements Item{
	
   protected Wrapper wrapper = new Wrapper();

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((wrapper == null) ? 0 : wrapper.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Burger other = (Burger) obj;
	if (wrapper == null) {
		if (other.wrapper != null)
			return false;
	} else if (!wrapper.equals(other.wrapper))
		return false;
	return true;
}

}

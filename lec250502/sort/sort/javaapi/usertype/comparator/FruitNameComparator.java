package sort.javaapi.usertype.comparator;

import java.util.Comparator;

public class FruitNameComparator implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o1.name.compareTo(o2.name);
	}

}

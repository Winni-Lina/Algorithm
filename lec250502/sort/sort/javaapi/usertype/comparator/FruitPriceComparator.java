package sort.javaapi.usertype.comparator;

import java.util.Comparator;

public class FruitPriceComparator implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {
		return Integer.compare(o1.price, o2.price); 
		
	}

}

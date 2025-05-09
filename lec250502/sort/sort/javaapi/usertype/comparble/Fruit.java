package sort.javaapi.usertype.comparble;

public class Fruit implements Comparable<Fruit> {

	private String name;
	private int price;
	
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return name +  ":" + price;
	}

	@Override
	public int compareTo(Fruit o) {
		return Integer.compare(this.price, o.price);
		//if (this.price > o.price) return 1;
		//if (this.price == o.price) return 0;
		//return -1;
	}
}

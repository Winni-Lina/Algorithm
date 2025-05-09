package sort.javaapi.usertype.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortTest {

	public static void main(String[] args) {
		System.out.println("===== Sort Fruit (Collections) Comparator =====");
		List<Fruit> dataList = new ArrayList<>(
				Arrays.asList(
					new Fruit( "apple", 7000),
					new Fruit("tomato", 3000), 
					new Fruit("banana", 4000)
					)
				);
		
		System.out.println("원본 : " + dataList);
		
		Collections.sort(dataList, new FruitPriceComparator());
		System.out.println("가격 오름차순 : " + dataList);
		
		Collections.sort(dataList, new FruitPriceComparator().reversed());
		System.out.println("가격 내림차순 :" + dataList);
		
		Collections.sort(dataList, new FruitNameComparator());
		System.out.println("이름 오른차순 : " + dataList);
		
		Collections.sort(dataList, new FruitNameComparator().reversed());
		System.out.println("이름 내림차순 : " + dataList);
		
		
		
		System.out.println("=== Sort Fruit (Arrays) Comparator =====");
		Fruit[] dataArr = {
				new Fruit ("apple", 7000), 
				new Fruit("tomato", 3000),
				new Fruit ("banana", 4000)
				};
		System.out.println("원본 : " + Arrays.toString(dataArr));
		
		Arrays.sort(dataArr, new FruitPriceComparator());
		System.out.println("가격 오름차순 : " + Arrays.toString(dataArr));
		
		Arrays.sort(dataArr, new FruitPriceComparator().reversed());
		System.out.println("가격 내림차순 : " + Arrays.toString(dataArr));
		
		Arrays.sort(dataArr, new FruitNameComparator());
		System.out.println("이름 올림차순 : " + Arrays.toString(dataArr));
		
		Arrays.sort(dataArr, new FruitNameComparator().reversed());
		System.out.println("이름 내림차순 : " + Arrays.toString(dataArr));
		}
	
	
}


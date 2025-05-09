package sort.javaapi.usertype.comparble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortTest {

	public static void main(String[] args) {
		System.out.println("===== Sort Comparable Fruit (Arrays) =====");
		Fruit[] dataArr = {
				new Fruit("apple", 7000), 
				new Fruit("tomato", 3000), 
				new Fruit("banana", 4000)
				};
		
		Arrays.sort(dataArr);
		System.out.println("오름차순 : " + Arrays.toString(dataArr));
		
		Arrays.sort(dataArr, Comparator.reverseOrder());
		System.out.println("내림차순 : " + Arrays.toString(dataArr));
		
		
		System.out.println("===== Sort Comparable Fruit (Collections) =====");
		List<Fruit> dataList = new ArrayList<>(
				Arrays.asList(
						new Fruit("apple", 7000),
						new Fruit("tomato", 3000), 
						new Fruit("banana", 4000)
						)
				);
		System.out.println("원본 : " + dataList);
		Collections.sort(dataList);
		System.out.println("오름차순 : " + dataList);
		Collections.sort(dataList, Comparator.reverseOrder());
		System.out.println("내림차순 : " + dataList);
		
		
		System.out.println("===== Sort Comparable Fruit List =====");
		dataList = new ArrayList<>(
				Arrays.asList(
						new Fruit("apple", 7000), 
						new Fruit("tomato", 3000), 
						new Fruit("banana", 4000)
						)
				);
		System.out.println("원본 : " + dataList);
		dataList.sort(Comparator.naturalOrder());
		System.out.println("오름차순 : " + dataList);
		dataList.sort(Comparator.reverseOrder());
		System.out.println("내림차순 : " + dataList);
	}
}

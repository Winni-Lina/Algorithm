package sort.mysort;

public class BubbleSort extends Sort{

	@Override
	public void sort() {
		for (int last = sortedData.length - 1; last >= 1; last-- ) {
			for (int i = 0; i <last; i++) {
				if (sortedData[i] > sortedData[i+1])
					swap(i, i+1);
			}
		}
		
	}

}

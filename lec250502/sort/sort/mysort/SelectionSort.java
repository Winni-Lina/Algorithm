package sort.mysort;

public class SelectionSort extends Sort {

	@Override
	public void sort() {
		
		for (int last = sortedData.length - 1; last >= 1; last--) {
			int maxIndex = selectMax(last);
			if (maxIndex != last)
				swap(maxIndex, last);
			
		}
	}

	private int selectMax(int last) {
		int max = sortedData[0];
		int maxIndex = 0;
		
		for (int i = 1; i <= last; i++) {
			if (sortedData[i] > max) {
				 max = sortedData[i];
				maxIndex = i;
				
			}
		}
		
		return maxIndex;
	}
	
}

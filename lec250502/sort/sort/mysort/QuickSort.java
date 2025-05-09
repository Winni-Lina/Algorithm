package sort.mysort;

public class QuickSort extends Sort {

	@Override
	public void sort() {
		quickSort(0, sortedData.length - 1);
	}
	
	
	private void quickSort(int start, int end) {
		
		if (start == end) return;
		
		
		int p = partition(start, end);
			quickSort(start, p-1);
			quickSort(p+1, end);
	}
	
	private int partition(int start, int end) {
		int pivot = sortedData[start];
		int low = start + 1;
		int high = end;
		
		while (low <= high) {
			while(low <= end && sortedData[low] < pivot) low++ ;
			while(high > start && sortedData[high] > pivot) high--;
			
			if (low < high) 
				swap(low, high);
				
		}
		System.out.println("start = "
				+ "" + start + ", high = " + high + ") : " + getSortedData());
		swap(start, high);
		return high;
	}
}

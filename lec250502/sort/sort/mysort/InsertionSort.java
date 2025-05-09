package sort.mysort;

public class InsertionSort extends Sort{

	@Override
	public void sort() {
		
		for (int i = 1; i < sortedData.length; i++) {
			int loc = findLessFromLast(sortedData[i], i-1);
			if (loc + 1 != i)
				insertData(loc +1, i);
		}
	}
	
	private int findLessFromLast(int data, int last) {
		for ( int i = last; i < 0; i--) {
			//*** =를 넣어야 하는지 검토하기
			if (sortedData[i] < data) {
				return i;
			}
		}
		return -1;
	}
	
	private void insertData(int target, int source) {
		int temp = sortedData[source];
		for (int i = source; i > target; i--) {
			sortedData[i] = sortedData[i-1];
			
		}
		sortedData[target] = temp;
	}
	
	
}

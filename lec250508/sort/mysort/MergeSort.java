package sort.mysort;

public class MergeSort extends Sort{

	@Override
	public void sort() {
		mergeSort(0, sortedData.length -1);
		
	}
	
	private void mergeSort(int start, int end) {
		// base condition
		if (start >= end)
			return;
		
		// divide & conquer
		int mid = (start + end) / 2;
		mergeSort(start, mid);
		mergeSort(mid+1 , end);
		
		// combine
		merge(start, mid, end);
	}
	
	private void merge(int start, int mid, int end) {
		int i = start, j = mid + 1, k= 0;
		int [] tempList = new int[end - start + 1];
		while ( i <= mid && j <= end) {
			if (sortedData[i] <= sortedData[j]) {
				tempList[k++] = sortedData[i++];
			} else 
				tempList[k++] = sortedData[j++];
		}
		
		
		while (i <= mid) 
			tempList[k++] = sortedData[i++];
		while (j <= end) 
			tempList[k++] = sortedData[j++];
		
		System.arraycopy(tempList, 0, sortedData, start, end-start+1);
		//for (int t = 0; t < tempList.length; t++) {
        //    sortedData[start + t] = tempList[t];
		//}    
	}
		//tempList[] = sortedData[i && mid] || sortedData[j && end];
		//sortedData[start && end] = copy tempList[];

}

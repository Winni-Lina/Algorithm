package sort.mysort;

import java.util.Arrays;

// sort 추상 클래스  (정렬 알고리즘)
public abstract class Sort {
	int[] orgData;
	int[] sortedData;
	
	
	public abstract void sort();
	
	
	
	public void swap(int i, int j) {
		int temp = sortedData[i];
		sortedData[i] = sortedData[j];
		sortedData[j] = temp;
		
	}
	
	// setData 를 입력받아서 orgData로 넣는 역할
	public void setData(int[] datalist) {
		this.orgData = datalist;
		this.sortedData = datalist.clone();  // shallow copy(얇은 복사) / deep copy(깊은 복사)
											 //	-> .clone();
	}
	
	public String getOrgData() {
		return Arrays.toString(orgData);
	}
	
	public String getSortedData() {
		return Arrays.toString(sortedData);
	}
	
	
}

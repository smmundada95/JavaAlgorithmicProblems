package sortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {

	public static int[] insertionSort(int arr[]) {
		
		for(int i = 0; i < arr.length; i++) {
			int current = arr[i];
			int j = i -1;
			while(j >= 0 && arr[j] > current) {
				arr[j+1] = arr[j];
				j = j - 1;
			}
			arr[j+1] = current;
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 8, 7, 6, 3, 2};
		arr = insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}

package sortingAlgorithms;

import java.util.Arrays;

public class MergeSort {
	
	public static void merge(int[] arr, int start, int mid, int end) {
		int sizeOfLeft = mid-start+1;
		int sizeOfRight = end - mid;
		int[] left = new int[sizeOfLeft];
		int[] right = new int[sizeOfRight];
		for (int i = 0; i < sizeOfLeft; i++) {
			left[i] = arr[start + i]; 
		}
		for (int j = 0; j < sizeOfRight; j++) {
			right[j] = arr[mid + 1 + j]; 
		}
		int i = 0, j = 0;
		for (int k = start; k <= end; k++) {
			if ((j >= sizeOfRight) || (i < sizeOfLeft && left[i] <= right[j])) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
		}
	}
	
	public static void mergeSort(int[] arr, int start, int end) {
		if(start < end) {
			int mid = (int) Math.floor((start+end)/2);
			mergeSort(arr, start, mid);
			mergeSort(arr, mid+1, end);
			merge(arr, start, mid, end);

		}
		
	}
	public static void main(String[] args) {
		int[] array = {8, 7, 6, 5, 4, 3, 2, 1};
		mergeSort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));
	}

}

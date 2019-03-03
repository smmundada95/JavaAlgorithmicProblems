package sortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {

	public static int[] bubbleSort(int arr[]) {
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j+1] < arr[j]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 8, 7, 6, 3, 2};
		arr = bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}

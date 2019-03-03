package sortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
	
	//i = 0
	//{10, 8, 7, 6, 3, 2}
	//minIndex = 5 (element 2)
	//swap 2 with 10 (i = 0 )
	
	//i = 1
	//{2, 8, 7, 6, 3, 10}
	//...sorted till here
	//minIndex = 4 (element 3)
	//swap 3 with 8
	
	//i = 2
	//{2, 3, 7, 6, 8, 10}
	//......sorted till here
	//minIndex = 3 (element 6)
	//swap 6 with 7
	
	//i = 3
	//{2, 3, 6, 7, 8, 10}
	//.........sorted till here
	//minIndex = 3 (element 7)
	//no swap
	
	//i = 4
	//{2, 3, 6, 7, 8, 10}
	//............sorted till here
	//minIndex = 4 (element 8)
	//no swap
	
	public static int[] selectionSort(int arr[]) {
		for(int i = 0; i < arr.length - 1; i ++) {
			int minIndex = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[minIndex])
					minIndex = j;
			}
			if(minIndex != i) {
				//swap
				int tmp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = tmp;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 8, 7, 6, 3, 2};
		arr = selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}

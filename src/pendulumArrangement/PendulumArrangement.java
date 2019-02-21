package pendulumArrangement;

import java.util.Arrays;
import java.util.Scanner;

	/*Write a program to input a list of n integers in an array and arrange them in a way similar to the to-and-fro movement of a Pendulum.
	
	The minimum element out of the list of integers, must come in center position of array. If there are even elements, then minimum element should be moved to (n-1)/2 index (considering that indexes start from 0)
	The next number (next to minimum) in the ascending order, goes to the right, the next to next number goes to the left of minimum number and it continues like a Pendulum.
	
	Input:
	The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains an integer n denoting the size of the array. Then next line contains N space separated integers forming the array.
	
	Output:
	Output the array in Pendulum Arrangement.
	
	Constraints:
	1<=T<=500
	1<=N<=100
	1<=a[i]<=1000
	
	Example:
	Input:
	2
	5
	1 3 2 5 4
	5
	11 12 31 14 5
	
	Output:
	5 3 1 2 4
	31 12 5 11 14*/
public class PendulumArrangement {

	public static void main (String[] args) {
		//code
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int numArray[];
	    int resultArray[];
	    
	    for(int i = 0; i < n; i ++){
	        int len = in.nextInt();
	        numArray = new int[len];
	        for(int j = 0; j < len; j ++){
	            numArray[j] = in.nextInt();
	        }
	        
	        resultArray = new int[len];
	        
	        Arrays.sort(numArray);
	        
	        int mid = (len - 1)/2;
	        int j = 1,x;
	        resultArray[mid] = numArray[0];
	        for(x = 1; x <= mid; x ++){
	            resultArray[mid + x] = numArray[j++];
	            resultArray[mid - x] = numArray[j++];
	        }
	        
	        if(len % 2 == 0){
	            resultArray[mid + x] = numArray[j];
	        }
	        
	        for(int num : resultArray){
	            System.out.print(num + " ");
	        }
	        System.out.println();
	        
	    }
	    in.close();
	}

}

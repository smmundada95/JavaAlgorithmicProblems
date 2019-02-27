package findNonRepeatingElement;

import java.util.HashMap;

public class FindNonRepeatingElement {
	
	/**
	 * This function finds out the single non repeating element in an array where all but one elements are repeating twice.
	 * @param arr
	 * @return int
	 */
	public static int findNonRepeatingElement(int[] arr) {
		int size = arr.length;
	    HashMap<Integer, Integer> hm = new HashMap<>();
	    for(int j = 0; j < size; j++){
	        if(hm.containsKey(arr[j])){
	            hm.put(arr[j], hm.get(arr[j]) + 1);
	        }
	        else{
	            hm.put(arr[j], 1);
	        }
	    }
	    int value;
	    for(int key: hm.keySet()){
	        value = hm.get(key);
	        if(value == 1){
	            return key;
	        }
	    }
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,4,3,3,2,5,6,1,6,5};
		int result = findNonRepeatingElement(arr);
		System.out.println(result);
	}

}

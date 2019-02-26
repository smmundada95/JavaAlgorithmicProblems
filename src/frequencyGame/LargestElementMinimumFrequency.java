package frequencyGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class LargestElementMinimumFrequency {
	
	public static int LargButMinFreq(int arr[], int n)
    {
        // Your code here
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int key;
        int min = 999999;
        for(int i = 0; i < n; i ++){
            key = arr[i];
            if(hm.containsKey(key)){
                hm.put(key, hm.get(key) + 1);
                if(hm.get(key) < min){
                    min = hm.get(key);
                }
            }
            else{
                hm.put(key, 1);
                if(hm.get(key) < min){
                    min = hm.get(key);
                }
            }
        }
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int k : hm.keySet()){
            if(hm.get(k) == min){
                a.add(k);
            }
        }
        Collections.sort(a, Collections.reverseOrder());
        return a.get(0);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 2, 5, 50, 1};
		int size = 5;
		System.out.println(LargButMinFreq(arr, size));
	}

}

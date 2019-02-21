package findSubstring;

import java.util.Scanner;

	/*Given a string S and two integers L and R. Print the characters in the range L to R of the string.
		
	Input: 
	First line of input contains a single integer T, which denotes the number of testcases. T testcases follows, first line of each testcase contains a string S. Second line consists of two integers L and R.
	
	Output: 
	Corresponding to each testcase in new line, print the required output.
	
	Constraints:
	1 <= T <= 100
	1 <= length(S) <= 103
	1 <= L <= 800
	1 <= R <= 900
	
	Example:
	Input:
	2
	cdbkdub
	0 5
	sdiblcsdbud
	3 7
	
	Output:
	cdbkdu
	blcsd*/

public class FindSubstring {
    static void mySubstring(char str[], int min, int max){
        if(min <= max){
            System.out.print(str[min]);
            min = min + 1;
            mySubstring(str, min, max);
        }
        
    }
	public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in); 
		int n = in.nextInt();
		
		String str;
		int index1, index2;
		
		for(int i = 0; i < n; i ++){
		    in.nextLine();
		    str = in.nextLine();
		    index1 = in.nextInt();
		    index2 = in.nextInt();
		    
		    mySubstring(str.toCharArray(), index1, index2);
		    System.out.println();
		    //result[i] = str.substring(index1, index2 + 1);
		    //System.out.println(result[i]);
		}
		
		in.close();
		
		
	}
}
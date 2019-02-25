package countCamelCase;

public class CountCamelCase {
	
	public static int countWordsInCamelCase(String s) {
		if(s.trim().isEmpty() ) {
			return 0;
		}
		int count = 1;
		for(char ch : s.toCharArray()) {
			if(Character.isUpperCase(ch)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countWordsInCamelCase("myNameIsShubhamMundada."));
		System.out.println(countWordsInCamelCase(" "));
	}

}

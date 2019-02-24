package mostRepeatedWord;

import java.util.HashMap;

public class MostRepeatedWord {
	
	private HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
	
	public void generateHashMap(String text) {
		String lowercased = text.toLowerCase().trim();
		String words[] = lowercased.split("[ \\n\\t\\r.,;:!?()]");
		
		for (String word : words) {
			if(word.length() > 0) {
				if (wordCount.containsKey(word)) {
					wordCount.put(word, (wordCount.get(word) + 1));
				}
				else {
					wordCount.put(word, 1);
				}
			}
		}
	}
	
	public void findMostRepeatedWord(String text) {
		generateHashMap(text);
		String maxWord = "";
		int maxCount = 0;
		for(String key : wordCount.keySet()) {
			if(wordCount.get(key) > maxCount) {
				maxCount = wordCount.get(key);
				maxWord = key;
			}
		}
		
		System.out.println("The word " + maxWord + " repeats the most - " + maxCount + " times.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MostRepeatedWord mostRepeatedWord = new MostRepeatedWord();
		mostRepeatedWord.findMostRepeatedWord("Shubham Shubham shubham ravisha ravisha.");
		
		String testString = "Lorem Ipsum is simply dummy text of the " +
        		"printing and typesetting industry. Lorem Ipsum has been " +
        		"the industry's standard dummy text ever since the 1500s, " +
        		"when an unknown printer took a galley of type and scrambled " +
        		"it to make a type specimen book. It has survived not only " +
        		"five centuries, but also the leap into electronic typesetting, " +
        		"remaining essentially unchanged. It was popularised in the " +
        		"1960s with the release of Letraset sheets containing " +
        		"Lorem Ipsum passages, and more recently with desktop " +
        		"publishing software like Aldus PageMaker including " +
        		"versions of Lorem Ipsum.";
		
		mostRepeatedWord.findMostRepeatedWord(testString);
	}

}

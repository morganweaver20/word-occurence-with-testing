package testing;

import java.util.HashMap;
import java.util.Map;


public class JunitTests {
	
	public String firstWord(String[] poem)     {
		String firstWord = poem[0];		
		return firstWord;
	}
	
	public String lastWord(String[] poem) {
		String lastWord = poem[poem.length - 1];
		return lastWord;
	}
	
	public int wordCount(String[] poem) {
		
		Map<String, Integer> hashmap = new HashMap<String, Integer>();
		
		for (String word : poem) {
			if (!hashmap.containsKey(word))
				hashmap.put(word, 1);
			else
				hashmap.put(word, hashmap.get(word) + 1);
		}
		return hashmap.get("ate");
	}
	
	
}

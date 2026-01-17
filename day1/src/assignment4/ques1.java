package assignment4;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ques1 {
	public static void main(String[] args) {
		File story = new File("/assignment2/src/assignment4/story.txt");
		Map<String, Integer> wordCount = new HashMap<>();
		try (BufferedReader br = new BufferedReader(new FileReader(story))) {
            String line;
            while ((line = br.readLine()) != null) {
                // split line into words using non-word characters as delimiters
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.isEmpty()) continue; // skip empty strings
                    word = word.toLowerCase(); // optional: make counting case-insensitive
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // print word frequencies
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
	}
}

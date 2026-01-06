package week3.day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class FileAnalyzer {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("src/week3/day2/sample.txt"));

        HashSet<String> uniqueWords = new HashSet<>();
        String longestWord = "";
        String shortestWord = null;

        String line;
        while ((line = br.readLine()) != null) {
            String[] words = line.split(" ");

            for (String word : words) {
                word = word.toLowerCase();
                uniqueWords.add(word);

                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }

                if (shortestWord == null || word.length() < shortestWord.length()) {
                    shortestWord = word;
                }
            }
        }

        br.close();

        System.out.println("Longest Word: " + longestWord);
        System.out.println("Shortest Word: " + shortestWord);
        System.out.println("Unique Words Count: " + uniqueWords.size());
    }
}

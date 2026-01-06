package week3.day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileCount {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("src/week3/day2/sample.txt"));

        int lines = 0;
        int words = 0;
        int characters = 0;

        String line;
        while ((line = br.readLine()) != null) {
            lines++;
            characters += line.length();

            String[] wordArray = line.split(" ");
            words += wordArray.length;
        }

        br.close();

        System.out.println("Lines: " + lines);
        System.out.println("Words: " + words);
        System.out.println("Characters: " + characters);
    }
}

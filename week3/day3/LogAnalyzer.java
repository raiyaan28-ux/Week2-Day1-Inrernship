package week3.day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LogAnalyzer {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("src/week3/day3/log.txt"));

        int total = 0, info = 0, warn = 0, error = 0;
        String longest = "";
        String firstTime = null, lastTime = null;

        String line;
        while ((line = br.readLine()) != null) {
            total++;

            if (line.contains("INFO")) info++;
            if (line.contains("WARN")) warn++;
            if (line.contains("ERROR")) error++;

            if (line.length() > longest.length()) {
                longest = line;
            }

            String time = line.split(" ")[0];
            if (firstTime == null) firstTime = time;
            lastTime = time;
        }

        br.close();

        System.out.println("Total Logs: " + total);
        System.out.println("INFO Logs: " + info);
        System.out.println("WARN Logs: " + warn);
        System.out.println("ERROR Logs: " + error);
        System.out.println("Longest Log: " + longest);
        System.out.println("First Timestamp: " + firstTime);
        System.out.println("Last Timestamp: " + lastTime);
    }
}

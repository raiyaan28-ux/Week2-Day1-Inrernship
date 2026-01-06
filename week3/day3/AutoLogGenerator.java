package week3.day3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class AutoLogGenerator {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("src/week3/day3/log.txt", true));

        for (int i = 1; i <= 25; i++) {
            bw.write(LocalDateTime.now() + " INFO Info log " + i);
            bw.newLine();
        }

        for (int i = 1; i <= 15; i++) {
            bw.write(LocalDateTime.now() + " WARN Warning log " + i);
            bw.newLine();
        }

        for (int i = 1; i <= 10; i++) {
            bw.write(LocalDateTime.now() + " ERROR Error log " + i);
            bw.newLine();
        }

        bw.close();
        System.out.println("50 logs generated");
    }
}

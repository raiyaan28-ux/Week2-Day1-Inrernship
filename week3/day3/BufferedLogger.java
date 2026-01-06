package week3.day3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class BufferedLogger {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter log message: ");
        String message = sc.nextLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter("src/week3/day3/log.txt", true));
        bw.write(LocalDateTime.now() + " INFO " + message);
        bw.newLine();
        bw.close();

        System.out.println("Timestamp log written");
    }
}

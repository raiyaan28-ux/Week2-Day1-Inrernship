package week3.day3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SimpleLogger {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter log message: ");
        String message = sc.nextLine();

        FileWriter fw = new FileWriter("src/week3/day3/log.txt", true); // append = true
        fw.write(message + "\n");
        fw.close();

        System.out.println("Log written successfully");
    }
}

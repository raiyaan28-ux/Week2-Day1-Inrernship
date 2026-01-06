package week3.day1.custom_exception_demo;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {

        super(msg);
    }
}

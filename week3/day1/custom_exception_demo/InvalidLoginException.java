package week3.day1.custom_exception_demo;

public class InvalidLoginException extends Exception {
    public InvalidLoginException(String msg) {

        super(msg);
    }
}

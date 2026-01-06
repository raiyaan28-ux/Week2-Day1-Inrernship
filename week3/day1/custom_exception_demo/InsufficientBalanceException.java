package week3.day1.custom_exception_demo;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {

        super(msg);
    }
}

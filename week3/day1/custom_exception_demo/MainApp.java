package week3.day1.custom_exception_demo;

public class MainApp {

    // Task 1: Age Check
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("You must be 18+ to register");
        }
        System.out.println("Age valid. Registration allowed.");
    }

    // Task 2: Bank Withdrawal
    static int balance = 5000;

    static void withdraw(int amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Not enough balance to withdraw!");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }

    // Task 3: Login Check
    static void login(String username, String password) throws InvalidLoginException {
        if (!username.equals("admin") || !password.equals("12345")) {
            throw new InvalidLoginException("Invalid credentials, please try again!");
        }
        System.out.println("Login successful!");
    }

    public static void main(String[] args) {

        // -------- Task 1 Test --------
        try {
            checkAge(16);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        // -------- Task 2 Test --------
        try {
            withdraw(6000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        // -------- Task 3 Test --------
        try {
            login("admin", "1234");
        } catch (InvalidLoginException e) {
            System.out.println(e.getMessage());
        }
    }
}

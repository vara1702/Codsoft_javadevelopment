import java.util.*;

public class ATMInterface {
    private static double balance = 1000.0;
    private static String accountNumber = "17654987";
    private static String Pin = "2365";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the ATM");
        System.out.println("Enter your Account Number: ");
        String inputAccountNumber = sc.nextLine();

        System.out.println("Enter your Pin: ");
        String inputPin = sc.nextLine();

        if (authenticate(inputAccountNumber, inputPin)) {
            System.out.println("Authenticate Successful.");
            while (true) {
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.println(" Enter your choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        checkBalance();
                        break;

                    case 2:
                        deposit();
                        break;

                    case 3:
                        withdraw();
                        break;

                    case 4:
                        System.out.println("Thank you for using this ATM. Bye!");
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice. Please try again");

                }
            }
        } else {
            System.out.println("Authentication failed. Please try again");

        }
    }

    private static boolean authenticate(String inputAccountNumber, String inputPin) {
        return accountNumber.equals(inputAccountNumber) && Pin.equals(inputPin);
    }

    private static void checkBalance() {
        System.out.println("Your balance is $" + balance);
    }

    private static void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the deposit amount: ");
        double amount = sc.nextDouble();
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit successful. Your new balance is $" + balance);
        } else {
            System.out.println("Invalid amount. Deposit failed");
        }
    }

    private static void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Withdraw amount: ");
        double amount = sc.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw successful. Your new balance is $" + balance);
        } else {
            System.out.println("Insufficient balance. Withdraw failed.");
        }
    }
}

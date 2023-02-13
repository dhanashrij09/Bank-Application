import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.println("Enter your name, password and initial balance");

        String name = sc.next();
        String password = sc.next();
        int balance = sc.nextInt();

        SBIAccount DhanusAcc = new SBIAccount (name, balance, password);
        System.out.println("Your account has been credited with account number: " + DhanusAcc.getAccountNo());

        //getBalance
        System.out.println("Your current balance is: " + DhanusAcc.getBalance());

        //deposit
        System.out.println(DhanusAcc.depositMoney(500));
        System.out.println("New balance is: " + DhanusAcc.getBalance());

        //withdraw
        System.out.println("Enter the amount to be withdrawn");
        int amount = sc.nextInt();
        System.out.println("Enter password");
        String enteredPassword = sc.next();
        System.out.println(DhanusAcc.withdraw(amount,enteredPassword));
        System.out.println("Current balance is: " + DhanusAcc.getBalance());
        //interest
        System.out.println("Interest for 4 years of balance: " + DhanusAcc.getBalance() + " is " + DhanusAcc.calculateInterest(4));
    }
}
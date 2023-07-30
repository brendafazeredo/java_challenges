package challenges;

import java.util.Scanner;

public class account {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the Agency number: ");
        String agency = scanner.nextLine();

        System.out.print("Please enter the Account number: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Please enter the Client's name: ");
        String clientName = scanner.nextLine();

        System.out.print("Please enter the Account balance: ");
        double balance = scanner.nextDouble();

        scanner.close();

        String message = "Hello " + clientName + ", thank you for creating an account with our bank. Your agency number is "
                + agency + ", account number " + number + ", and your balance is $" + balance + ". It is already available for withdrawal.";
        System.out.println(message);
    }
}
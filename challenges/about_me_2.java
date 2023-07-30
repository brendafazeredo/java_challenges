package challenges;

import java.util.Locale;
import java.util.Scanner;

public class about_me_2 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Enter your first name:");
            String firstName = scanner.next();

            System.out.println("Enter your last name:");
            String lastName = scanner.next();

            System.out.println("Enter your age:");
            int age = scanner.nextInt();

            System.out.println("Enter your height (in cm):");
            int height = scanner.nextInt();

            System.out.println("Hello, my name is " + firstName + " " + lastName + ".");
            System.out.println("I am " + age + " years old.");
            System.out.println("I am " + height + " cm tall.");
        }
    }
}
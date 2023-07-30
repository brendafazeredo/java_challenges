package challenges;

public class about_me {

    public static void main(String[] args) {
        String firstName = args[0];
        String lastName = args[1];
        int age = Integer.valueOf(args[2]);
        int height = Integer.valueOf(args[3]);

        System.out.println("Hello, my name is " + firstName + " " + lastName + ".");
        System.out.println("I am " + age + " years old.");
        System.out.println("I am " + height + " cm tall.");
    }
}
package U2_OBJECTS;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("Your name is: " + name);

        System.out.println("Whats your age?");
        int age = input.nextInt();

        System.out.println("your name is: " + age);

        System.out.println("whats your gpa?");
        double gpa = input.nextDouble();

        System.out.println("Your gpa is: " + gpa);
    }

    // prompt user for age

}

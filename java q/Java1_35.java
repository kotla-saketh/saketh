//Write a program to find whether a character is uppercase, lowercase, or a digit.
import java.util.Scanner;

public class Java1_35 {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Check if the character is uppercase, lowercase, or a digit
        if (Character.isUpperCase(ch)) {
            System.out.println(ch + " is an uppercase letter.");
        } else if (Character.isLowerCase(ch)) {
            System.out.println(ch + " is a lowercase letter.");
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit.");
        } else {
            System.out.println(ch + " is neither an uppercase letter, lowercase letter, nor a digit.");
        }

        // Close the scanner
        sc.close();
    }
}

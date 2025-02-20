//Write a program to calculate the absolute value of a number.
import java.util.Scanner;

public class Java1_33 {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Calculate and print the absolute value
        int absoluteValue = (num < 0) ? -num : num;
        System.out.println("The absolute value of " + num + " is: " + absoluteValue);

        // Close the scanner
        sc.close();
    }
}
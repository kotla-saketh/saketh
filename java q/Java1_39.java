//Write a program to check if a triangle is valid based on side lengths.
import java.util.Scanner;

public class Java1_39 {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the lengths of the three sides
        System.out.print("Enter side A: ");
        int a = sc.nextInt();

        System.out.print("Enter side B: ");
        int b = sc.nextInt();

        System.out.print("Enter side C: ");
        int c = sc.nextInt();

        // Check if the sides form a valid triangle
        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("The triangle is valid.");
        } else {
            System.out.println("The triangle is not valid.");
        }

        // Close the scanner
        sc.close();
    }
}

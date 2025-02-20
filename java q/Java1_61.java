/*Write a program to print a right-angled triangle pattern using stars (*).
Create a program to print a pyramid pattern using stars.
Write a program to print a diamond pattern using stars.
Implement a program to calculate the product of digits of a number.
Write a program to print all perfect numbers between 1 and 1000.*/
import java.util.Scanner;

public class Java1_61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the number of rows
        System.out.print("Enter the number of rows for the triangle: ");
        int rows = scanner.nextInt();

        // Outer loop for each row
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}

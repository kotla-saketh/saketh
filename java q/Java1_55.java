//Write a program to find the sum of squares of numbers from 1 to N.*/
import java.util.Scanner;

public class Java1_55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a positive integer (N): ");
        int N = sc.nextInt();

        int sumOfSquares = 0;

        // Loop to calculate the sum of squares
        for (int i = 1; i <= N; i++) {
            sumOfSquares += i * i; // Add the square of i to the sum
        }

        // Output the result
        System.out.println("The sum of squares from 1 to " + N + " is: " + sumOfSquares);

        sc.close();
    }
}

//Write a program to print the Fibonacci sequence up to N terms.
import java.util.Scanner;

public class Java1_53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms (N): ");
        int n = sc.nextInt();

        // Edge case: Handle invalid input
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            System.out.println("Fibonacci Sequence up to " + n + " terms:");

            int first = 0, second = 1;

            for (int i = 1; i <= n; i++) {
                System.out.print(first + " "); // Print the current term

                // Calculate the next term
                int next = first + second;
                first = second;
                second = next;
            }
        }

        sc.close();
    }
}

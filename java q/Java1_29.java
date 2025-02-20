//Write a program to categorize a number as small, medium, or large based on ranges.
import java.util.Scanner;

public class Java1_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Categorize the number based on its value
        if (num >= 1 && num <= 10) {
            System.out.println("The number is small.");
        } else if (num > 10 && num <= 100) {
            System.out.println("The number is medium.");
        } else if (num > 100) {
            System.out.println("The number is large.");
        } else {
            System.out.println("Invalid input. The number must be positive.");
        }

        sc.close();
    }
}

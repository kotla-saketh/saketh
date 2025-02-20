//Write a program to check if a number is divisible by 5 and 11.
import java.util.Scanner;

public class Java1_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check if the number is divisible by both 5 and 11
        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println(num + " is divisible by both 5 and 11.");
        } else {
            System.out.println(num + " is not divisible by both 5 and 11.");
        }

        sc.close();
    }
}

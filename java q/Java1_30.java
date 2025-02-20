//Implement a program to check if a number is a multiple of 3 or 7.
import java.util.Scanner;

public class Java1_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check if the number is divisible by 3 or 7
        if (num % 3 == 0 && num % 7 == 0) {
            System.out.println(num + " is a multiple of both 3 and 7.");
        } else if (num % 3 == 0) {
            System.out.println(num + " is a multiple of 3.");
        } else if (num % 7 == 0) {
            System.out.println(num + " is a multiple of 7.");
        } else {
            System.out.println(num + " is neither a multiple of 3 nor 7.");
        }

        sc.close();
    }
}

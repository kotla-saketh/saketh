//Write a program to print all factors of a number.
import java.util.Scanner;

public class Java1_57 {
    public static void printFactors(int num) {
        System.out.print("Factors of " + num + ": ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();
        printFactors(number);
    }
}

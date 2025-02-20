/*Implement a program to check if a number is an Armstrong number.
*/
import java.util.Scanner;

public class Java1_56 {
    public static boolean isArmstrongNumber(int num) {
        int original = num, sum = 0, digits = String.valueOf(num).length();
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int number = scanner.nextInt();
        System.out.println(number + " is an Armstrong number: " + isArmstrongNumber(number));
    }
}
